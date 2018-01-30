package com.bsquare.datav.trucksidetool.re;

import java.io.Serializable;
import java.util.Date;


public class FileItem  implements BaseFact, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String data;
	private String  data_filename;
	private Date    data_date_created;
	private int     data_filesize;
	
	public FileItem() {
	}
	
	
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}


	/**
	 * @return the data_filename
	 */
	public String getData_filename() {
		return data_filename;
	}


	/**
	 * @param data_filename the data_filename to set
	 */
	public void setData_filename(String data_filename) {
		this.data_filename = data_filename;
	}


	/**
	 * @return the data_date_created
	 */
	public Date getData_date_created() {
		return data_date_created;
	}


	/**
	 * @param data_date_created the data_date_created to set
	 */
	public void setData_date_created(Date data_date_created) {
		this.data_date_created = data_date_created;
	}


	/**
	 * @return the data_filesize
	 */
	public int getData_filesize() {
		return data_filesize;
	}


	/**
	 * @param data_filesize the data_filesize to set
	 */
	public void setData_filesize(int data_filesize) {
		this.data_filesize = data_filesize;
	}


	@Override
	public String getFactId() {
		return data_filename;
	}


	@Override
	public String getType() {
		return this.getClass().getSimpleName();
	}


	@Override
	public String getDescription() {
		return data_filename;
	}
	
	
}
