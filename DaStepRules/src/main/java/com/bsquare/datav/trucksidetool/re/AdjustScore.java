/**
 * 
 */
package com.bsquare.datav.trucksidetool.re;

/**
 * @author davew
 *
 */
public class AdjustScore {
	private String stepId;
	private Double adjustment;
	private String reason;
	
	
	
	/**
	 * Create an Adjustment record
	 * @param stepId
	 * @param adjustment
	 * @param reason
	 */
	public AdjustScore(String stepId, Double adjustment, String reason) {
		super();
		this.stepId = stepId;
		this.adjustment = adjustment;
		this.reason = reason;
	}
	
	public AdjustScore() {
		adjustment= 0.0;
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
	 * @return the adjustment
	 */
	public Double getAdjustment() {
		return adjustment;
	}
	/**
	 * @param adjustment the adjustment to set
	 */
	public void setAdjustment(Double adjustment) {
		this.adjustment = adjustment;
	}
	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AdjustScore [");
		if (stepId != null)
			builder.append("stepId=").append(stepId).append(", ");
		if (adjustment != null)
			builder.append("adjustment=").append(adjustment).append(", ");
		if (reason != null)
			builder.append("reason=").append(reason);
		builder.append("]");
		return builder.toString();
	}
	
	
}
