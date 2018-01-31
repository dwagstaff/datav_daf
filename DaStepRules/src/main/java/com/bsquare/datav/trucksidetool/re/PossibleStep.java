package com.bsquare.datav.trucksidetool.re;

import java.io.Serializable;

import org.kie.api.definition.type.PropertyReactive;


/**
 * Entity implementation class for Entity: Step
 *
 */
@PropertyReactive
public class PossibleStep  implements BaseStep, Serializable {
	private static final long serialVersionUID = 1L;
    private String stepId;
    private String description;
    private Double score;
    private String stepAnswer;
    
    
	public PossibleStep() {
		score= 0.0;
		setStepAnswer(EYesNo.Yes.toString());
	}
	
	public PossibleStep(String stepId) {
		this();
		setDescription("N/A");
		setStepId(stepId);
	}
	
	public PossibleStep(String stepId, String description) {
		this(stepId);
		setDescription(description);
	}
	
	/**
	 * @return the score
	 */
	public double getScore() {
		return score;
	}
	/**
	 * NOTE: If the score is every set negitive, it will be locked and cannot be reset
	 * @param score the score to set
	 */
	public void setScore(double score) {
		if( this.score >= 0.0 )
			this.score = score;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PossibleStep [score=").append(score).append(", ");
		if (getDescription() != null)
			builder.append("getDescription()=").append(getDescription()).append(", ");
		if (getStepId() != null)
			builder.append("getStepId()=").append(getStepId());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public String getFactId() {
		return getStepId();
	}

	@Override
	public String getType() {
		return getClass().getSimpleName();
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
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
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(Double score) {
		this.score = score;
	}

	/**
	 * Return the DTC component of the StepID
	 * @return
	 */
	public String getDtc() {
		return getStepId().split("/")[0];
	}

	/**
	 * @return the stepAnswer
	 */
	public String getStepAnswer() {
		return stepAnswer;
	}

	/**
	 * @param stepAnswer the stepAnswer to set
	 */
	public void setStepAnswer(String stepAnswer) {
		this.stepAnswer = stepAnswer;
	}
	
}
