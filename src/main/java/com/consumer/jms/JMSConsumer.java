package com.consumer.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JMSConsumer {
	
	@JmsListener(destination = "Insert.Addr::Insert.Addr")
	public void consumeaddr(String messageaddr) {
		System.out.println(messageaddr);
	}
	
	@JmsListener(destination = "Insert.Card::Insert.Card")
	public void consumecard(String messagecard) {
		System.out.println(messagecard);
	}
	
	
}
