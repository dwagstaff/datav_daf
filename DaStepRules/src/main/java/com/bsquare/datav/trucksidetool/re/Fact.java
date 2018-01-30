package com.bsquare.datav.trucksidetool.re;

public class Fact implements BaseFact {
	
	private String factId;
	private String description;
	private String type;
	private String symptomId;
	private String title;
	private String active;
	private Integer occurrence;
	private String probableCauseId;
	private Double probability;
    private String stepId;
	private String stepAnswer;
	
	
	public Fact() {
	}

	@Override
	public String getFactId() {
		return factId;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * @param factId the factId to set
	 */
	public void setFactId(String factId) {
		this.factId = factId;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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

	/**
	 * @return the active
	 */
	public String getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(String active) {
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
	 * @return the stepAnswer
	 */
	public String getStepAnswer() {
		return stepAnswer;
	}

	/**
	 * @param stepAnswer the stepAnswer to set
	 */
	public void setStepAnswer(String stepAnswer) {
		this.stepAnswer = stepAnswer;
	}



}
