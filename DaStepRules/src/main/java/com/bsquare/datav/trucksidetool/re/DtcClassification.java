package com.bsquare.datav.trucksidetool.re;

import java.io.Serializable;

/**
 * Entity implementation class for Entity: DtcClassification
 *
 */
public class DtcClassification implements Serializable {

	public enum Classification {Rationality, Plausibility, Communication, Event};

	private String dtc;
	private Classification classification;
	
	/**
	 * @param dtc
	 * @param classification
	 */
	public DtcClassification(String dtc, Classification classification) {
		super();
		this.dtc = dtc;
		this.classification = classification;
	}
	/**
	 * @return the dtc
	 */
	public String getDtc() {
		return dtc;
	}
	/**
	 * @param dtc the dtc to set
	 */
	public void setDtc(String dtc) {
		this.dtc = dtc;
	}
	/**
	 * @return the classification
	 */
	public Classification getClassification() {
		return classification;
	}
	/**
	 * @param classification the classification to set
	 */
	public void setClassification(Classification classification) {
		this.classification = classification;
	}
}
