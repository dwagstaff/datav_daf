/**
 * 
 */
package com.bsquare.datav.da;

/**
 * @author davew
 *
 */
public class PredictedJobCode extends BaseFact implements FactSource {
	private String jobCode;
	private Double probability= 0.0;
	
	
	/**
	 * @param jobCode
	 * @param probability
	 */
	public PredictedJobCode(String jobCode, Double probability) {
		super();
		this.jobCode = jobCode;
		this.probability = probability;
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
	 * @return the probability
	 */
	public Double getProbability() {
		return probability;
	}
	/**
	 * @param probability the probability to set
	 */
	public void setProbability(Double probability) {
		this.probability = probability;
	}
	
	
}
