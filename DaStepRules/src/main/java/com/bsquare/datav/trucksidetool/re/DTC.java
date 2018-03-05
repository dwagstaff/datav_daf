package com.bsquare.datav.trucksidetool.re;

import java.util.Date;

public class DTC implements BaseFact, FactSource { 
	/**
	 * 
	 */
	private String symptomId;
	private String title;
	private EYesNo active;
	private Integer occurrence;
	private Date firstDate;
	private Date lastDate;
	
		
	public DTC() {
		setActive(EYesNo.Yes);
		setOccurrence(1);
	}


	/**
	 * @return the classification
	 */
//	public pri getClassification() {
//		return classification;
//	}
	/**
	 * @param classification the classification to set
	 */
//	public void setClassification(pri classification) {
//		this.classification = classification;
//	}


	/**
	 * @return the active
	 */
	public EYesNo getActive() {
		return active;
	}


	/**
	 * @param active the active to set
	 */
	public void setActive(EYesNo active) {
		this.active = active;
	}


	/**
	 * @return the occurrence
	 */
	public Integer getOccurrence() {
		return occurrence;
	}


	/**
	 * @param occurrence the occurrence to set
	 */
	public void setOccurrence(Integer occurrence) {
		this.occurrence = occurrence;
	}


	/**
	 * @return the symptomId
	 */
	public String getSymptomId() {
		return symptomId;
	}


	/**
	 * @param symptomId the symptomId to set
	 */
	public void setSymptomId(String symptomId) {
		this.symptomId = symptomId;
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


	@Override
	public String getFactId() {
		return symptomId;
	}


	@Override
	public String getType() {
		return "DTC";
	}


	@Override
	public String getDescription() {
		return title;
	}


    /**
     * @return the firstDate
     */
    public Date getFirstDate() {
        return firstDate;
    }


    /**
     * @param firstDate the firstDate to set
     */
    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }


    /**
     * @return the lastDate
     */
    public Date getLastDate() {
        return lastDate;
    }


    /**
     * @param lastDate the lastDate to set
     */
    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }
}
