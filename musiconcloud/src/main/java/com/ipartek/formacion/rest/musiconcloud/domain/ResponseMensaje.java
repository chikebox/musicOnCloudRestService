package com.ipartek.formacion.rest.musiconcloud.domain;

public class ResponseMensaje {
	String info;
	public ResponseMensaje() {
		super();
		this.info = "";
	}
	public ResponseMensaje(String info) {
		this.info=info;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
