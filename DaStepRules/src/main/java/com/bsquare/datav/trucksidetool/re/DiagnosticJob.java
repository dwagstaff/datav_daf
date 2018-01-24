/**
 * 
 */
package com.bsquare.datav.trucksidetool.re;

/**
 * @author davew
 *
 */
public class DiagnosticJob {
	private String diagnosticId;
	private String description;
	
	
	
	/**
	 * @param diagnosticId
	 * @param stepId
	 * @param description
	 */
	public DiagnosticJob(String diagnosticId, String description) {
		super();
		this.diagnosticId = diagnosticId;
		this.description = description;
	}
	
	/**
	 * @return the diagnosticId
	 */
	public String getDiagnosticId() {
		return diagnosticId;
	}
	/**
	 * @param diagnosticId the diagnosticId to set
	 */
	public void setDiagnosticId(String diagnosticId) {
		this.diagnosticId = diagnosticId;
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
	
}
