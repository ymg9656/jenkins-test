package com.lesson.web.code.result;

import java.util.List;

public class CodeResult<T> {
	private T entity;
	private List<T> entitys;
	private Long count;
	private String code;
	private String codeMessage;
	private String status;
	private String statusMessage;
	
	public CodeResult(){
		code = "OK";
		codeMessage = "success";
		status = "200";
		statusMessage = "OK";
	}
	
	public T getEntity() {
		return entity;
	}
	public void setEntity(T entity) {
		this.entity = entity;
	}
	public List<T> getEntitys() {
		return entitys;
	}
	public void setEntitys(List<T> entitys) {
		this.entitys = entitys;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodeMessage() {
		return codeMessage;
	}
	public void setCodeMessage(String codeMessage) {
		this.codeMessage = codeMessage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
}
