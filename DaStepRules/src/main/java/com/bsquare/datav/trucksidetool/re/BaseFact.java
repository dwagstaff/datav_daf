/**
 * 
 */
package com.bsquare.datav.trucksidetool.re;


/**
 * @author davew
 *s
 */
public class BaseFact {
	private String factId;
	private String type;
	private String description;
	
	
	
	public BaseFact() {
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
	 * @return the factId
	 */
	public String getFactId() {
		return factId;
	}

	/**
	 * @param factId the factId to set
	 */
	public void setFactId(String factId) {
		this.factId = factId;
	}
}
