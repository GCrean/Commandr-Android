package com.seebye.messengerapi.api.constants;

/**
 * Created by Seebye on 11.04.2015.
 * This file is needed for the communication between Commandr and Seebye Messenger API
 */
public enum SPKey
{
	SECRET						("key")
	, WAITING_FOR_SECRET		("wait4key")
	, ENABLED					("enabled")
	, LAST_BROADCAST_ID			("lastbroadcastid")
	, SETUP						("setup")
	, SECRET_REQUEST_ID			("secret_req_id");



	private String m_strKey;

	private SPKey(String strKey)
	{
		m_strKey = strKey;
	}

	public String getKey()
	{
		return m_strKey;
	}
}
