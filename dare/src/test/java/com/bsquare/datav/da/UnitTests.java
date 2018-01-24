package com.bsquare.datav.da;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;

public class UnitTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRules() {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieBase kBase = kContainer.getKieBase();
		KieSession kSession = kContainer.newKieSession("dadebug");
		
		// Add DTC P0046
		DTC dtc = new DTC();
		dtc.setSymptomId("P0046");
		kSession.insert(dtc);

		// Add the we performed step 1A
		StepPerformed sp= new StepPerformed("P0046/1A", EYesNo.Yes);
		kSession.insert(sp);
		
//		// Add Job Code H 1409 247202 001 000
//		String jobCode= "H 1409 247202 001 000";
//		PredictedJobCode pjc= new PredictedJobCode(jobCode, 0.80);
//		kSession.insert(pjc);

		// Fire the rules
		int i = kSession.fireAllRules();

		// Query for Adjustments
		{
			QueryResults qr = kSession.getQueryResults("Adjustments");
			for (QueryResultsRow row : qr) {
				AdjustScore adjustment = (AdjustScore) row.get("a");
				System.out.println(adjustment);
			}
		}

		// Query for Steps
		{
			QueryResults qr = kSession.getQueryResults("Steps");
			for (QueryResultsRow row : qr) {
				PossibleStep step = (PossibleStep) row.get("s");
				System.out.println(step);
			}
		}

	}

}
