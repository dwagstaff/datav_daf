/**
 * 
 */
package com.bsquare.datav.trucksidetool.re;

/**
 * @author davew
 *
 */
public class DiagnosticJobToStep {
	private String diagnosticID;
	private String stepId;
	
	
	
	/**
	 * @param diagnosticID
	 * @param stepId
	 */
	public DiagnosticJobToStep(String diagnosticID, String stepId) {
		super();
		this.diagnosticID = diagnosticID;
		this.stepId = stepId;
	}
	/**
	 * @return the diagnosticID
	 */
	public String getDiagnosticID() {
		return diagnosticID;
	}
	/**
	 * @param diagnosticID the diagnosticID to set
	 */
	public void setDiagnosticID(String diagnosticID) {
		this.diagnosticID = diagnosticID;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DiagnosticJobToStep [");
		if (diagnosticID != null)
			builder.append("diagnosticID=").append(diagnosticID).append(", ");
		if (stepId != null)
			builder.append("stepId=").append(stepId);
		builder.append("]");
		return builder.toString();
	}
	
	
}
