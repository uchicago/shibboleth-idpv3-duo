/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uchicago.identity.shibboleth.authn.duo;

import org.opensaml.messaging.context.BaseContext;

/**
 *
 * @author davel
 */
public class DuoAuthenticationContext extends BaseContext {
	
	private String username;
	
	private String duoResponse;

	public DuoAuthenticationContext() {
		super();
	}

	public DuoAuthenticationContext(String username, String duoResponse) {
		super();
		
		this.username = username;
		this.duoResponse = duoResponse;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setDuoResponse(String duoResponse) {
		this.duoResponse = duoResponse;
	}

	public String getDuoResponse() {
		return duoResponse;
	}
	
}
