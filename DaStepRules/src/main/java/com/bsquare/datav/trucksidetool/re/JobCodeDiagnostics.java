/**
 * 
 */
package com.bsquare.datav.trucksidetool.re;

/**
 * Maps Cause Job Codes to Diagnostic Job Codes
 * @author davew
 *
 */
public class JobCodeDiagnostics {
	private String jobCode;
	private String diagnositcId;
	
	
	/**
	 * @param jobCode
	 * @param diagnositcId
	 */
	public JobCodeDiagnostics(String jobCode, String diagnositcId) {
		super();
		this.jobCode = jobCode;
		this.diagnositcId = diagnositcId;
	}
	
	
	/**
	 * @return the jobCode
	 */
	public String getJobCode() {
		return jobCode;
	}
	/**
	 * @param jobCode the jobCode to set
	 */
	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}
	/**
	 * @return the diagnositcId
	 */
	public String getDiagnositcId() {
		return diagnositcId;
	}
	/**
	 * @param diagnositcId the diagnositcId to set
	 */
	public void setDiagnositcId(String diagnositcId) {
		this.diagnositcId = diagnositcId;
	}
	
	
}
