package com.bsquare.datav.trucksidetool.re;

import java.io.Serializable;

/**
 * Entity implementation class for Entity: Step
 *
 */
public class StepPerformed implements BaseStep, Serializable, FactSource {
    private String stepId;
    private String description;
	private EYesNo stepAnswer;
	
	private static final long serialVersionUID = 1L;

	
	public StepPerformed() {
		setStepAnswer(EYesNo.Yes);
	}


	public StepPerformed(String stepId, EYesNo answer) {
		super();
		setStepId(stepId);
		setStepAnswer(answer);
	}
	
	
	public String getDtc() {
		return stepId.split("/")[0];
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
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return "[" + getStepId() + "] " + description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String getFactId() {
		return getStepId();
	}


	@Override
	public String getType() {
		return getClass().getSimpleName();
	}


	/**
	 * @return the stepAnswer
	 */
	public EYesNo getStepAnswer() {
		return stepAnswer == null ? EYesNo.Yes : stepAnswer;
	}


	/**
	 * @param stepAnswer the stepAnswer to set
	 */
	public void setStepAnswer(EYesNo stepAnswer) {
		this.stepAnswer = stepAnswer;
	}
}
