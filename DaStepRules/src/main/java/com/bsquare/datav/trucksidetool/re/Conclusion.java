package com.bsquare.datav.trucksidetool.re;





public class Conclusion {
	private static int idc= 0;
	
	private String id;
	private static final long serialVersionUID = 1L;
	private String description;
	
	
	public Conclusion() {
		setId(String.valueOf(idc++));
	}
	
	public Conclusion(String value) {
		this();
		setDescription(value);
	}
	
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
