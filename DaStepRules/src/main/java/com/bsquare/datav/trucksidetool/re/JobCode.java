/**
 * 
 */
package com.bsquare.datav.trucksidetool.re;

import java.io.Serializable;


/**
 * @author davew
 *
 */
public class JobCode implements BaseFact, Serializable, FactSource {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String probableCauseId;
	private String title;
	private Double probability;
	
	
	public JobCode() {
		probability= 0.5;
	}

	public JobCode(String jobCode, String description) {
		this();
		setProbableCauseId(jobCode);
		setTitle(description);
	}

    /**
     * @return the probableCauseId
     */
    public String getProbableCauseId() {
        return probableCauseId;
    }


    /**
     * @param probableCauseId the probableCauseId to set
     */
    public void setProbableCauseId(String probableCauseId) {
        this.probableCauseId = probableCauseId;
    }


    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }


    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
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


	@Override
	public String getFactId() {
		return getProbableCauseId();
	}


	@Override
	public String getType() {
		return getClass().getSimpleName();
	}


	@Override
	public String getDescription() {
		return getTitle();
	}

	

}
