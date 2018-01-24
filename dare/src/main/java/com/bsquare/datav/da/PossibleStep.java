package com.bsquare.datav.da;

import java.io.Serializable;

import org.kie.api.definition.type.PropertyReactive;


/**
 * Entity implementation class for Entity: Step
 *
 */
@PropertyReactive
public class PossibleStep extends BaseStep implements Serializable {
	private static final long serialVersionUID = 1L;
	private double score;
	
	public PossibleStep() {
		score= 0.0f;
	}
	
	public PossibleStep(String stepId) {
		super();
		setStepId(stepId);
		setParentSymptomId(stepId.split("/")[0]);
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
	
	
}
