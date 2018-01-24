/**
 * 
 */
package com.bsquare.datav.da;


/**
 * @author davew
 *
 */
public class OperatingParameter extends BaseFact  {
	private String id;
	private Double value;
	
	public OperatingParameter() {
		setType(OperatingParameter.class.getSimpleName());
	}
	
	/**
	 * @return the value
	 */
	public Double getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Double value) {
		this.value = value;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
}
