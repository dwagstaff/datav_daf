package com.bsquare.datav.trucksidetool.re;

public class DiagnosticTime {
	private String stepId;
	private Double diagTime;
	
	
	
	
	/**
	 * @param stepId
	 * @param diagTime
	 */
	public DiagnosticTime(String stepId, Double diagTime) {
		super();
		this.stepId = stepId;
		this.diagTime = diagTime;
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
	 * @return the diagTime
	 */
	public Double getDiagTime() {
		return diagTime;
	}
	/**
	 * @param diagTime the diagTime to set
	 */
	public void setDiagTime(Double diagTime) {
		this.diagTime = diagTime;
	}
}
