package com.IgrejaBatista.NovaVida.resources.exception;

import java.io.Serializable;
import java.util.Date;    

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer status;
	private String msg;
	private String timeStamp;
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	public StandardError(Integer status, String msg, String timeStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStamp = timeStamp;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
}
