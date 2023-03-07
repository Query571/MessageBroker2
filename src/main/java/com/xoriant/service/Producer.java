package com.xoriant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	
	@Autowired
	private JmsTemplate jmsTemplate;

//	public Producer(JmsTemplate jmsTemplate) {
//		super();
//		this.jmsTemplate = jmsTemplate;
//	}

	public void send(String message) {
		try{
	    	jmsTemplate.send("myQueue", (session -> session.createTextMessage(message)));
		}catch (Exception exception){
			exception.getMessage();
		}
	}

}
