package com.bsquare.datav.trucksidetool.re;


/**
 * Entity implementation class for Entity: Step
 *
 */
public class BaseStep extends BaseFact  {
	private String stepId;
	private String description;
	private String parentSymptomId;

	
	public BaseStep() {
		super();
	}   
	


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the stepId
	 */
	public String getStepId() {
		return stepId;
	}

	/**
	 * @param stepId the stepId to set
	 */
	public void setStepId(String stepId) {
		this.stepId = stepId;
		setFactId(stepId);
	}



	/**
	 * @return the parentSymptomId
	 */
	public String getParentSymptomId() {
		return parentSymptomId;
	}



	/**
	 * @param parentSymptomId the parentSymptomId to set
	 */
	public void setParentSymptomId(String parentSymptomId) {
		this.parentSymptomId = parentSymptomId;
	}
}
