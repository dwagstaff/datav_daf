package com.bsquare.datav.trucksidetool.re;

import java.io.Serializable;

/**
 * Entity implementation class for Entity: Step
 *
 */
public class StepPerformed extends BaseStep implements Serializable, FactSource {
	private EYesNo answer;
	
	private static final long serialVersionUID = 1L;

	
	public StepPerformed() {
		setType(StepPerformed.class.getSimpleName());
	}


	public StepPerformed(String stepId, EYesNo answer) {
		super();
		setStepId(stepId);
		setAnswer(answer);
	}
	
	/**
	 * @return the answer
	 */
	public EYesNo getAnswer() {
		return answer;
	}


	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(EYesNo answer) {
		this.answer = answer;
	}
}
