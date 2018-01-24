/**
 * 
 */
package com.bsquare.datav.da;

import java.io.Serializable;


/**
 * @author davew
 *
 */
public class JobCode extends BaseFact implements Serializable, FactSource {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String jobCode;
	private String description;
	private Double probability;
	
	
	public JobCode() {
		setType(JobCode.class.getSimpleName());
		probability= 0.0;
	}


	/**
	 * @param jobCode
	 * @param description
	 */
	public JobCode(String jobCode, String description) {
		super();
		this.jobCode = jobCode;
		this.description = description;
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
