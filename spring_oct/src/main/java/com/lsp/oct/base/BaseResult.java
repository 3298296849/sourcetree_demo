package com.lsp.oct.base;

public class BaseResult {

	private int code;
	private String msg;
	private Object data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public BaseResult(int code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	public BaseResult(int code, Object data) {
		super();
		this.code = code;
		this.data = data;
	}
	public BaseResult(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	public BaseResult() {
		super();
	}
	@Override
	public String toString() {
		return "BaseResult [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}
	
	
}
