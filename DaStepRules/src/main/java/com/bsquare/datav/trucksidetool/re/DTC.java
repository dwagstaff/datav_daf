package com.bsquare.datav.trucksidetool.re;

public class DTC implements BaseFact, FactSource { 
	/**
	 * 
	 */
	private String symptomId;
	private String title;
	private EYesNo active;
	private Integer occurrence;
		
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
}
