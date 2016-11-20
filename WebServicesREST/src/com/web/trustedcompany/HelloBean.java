package com.web.trustedcompany;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HelloBean {
	private String msg;
	private String name;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HelloBean(String msg, String name) {
		super();
		this.msg = msg;
		this.name = name;
	}

	public HelloBean() {
		super();
	}
}