package com.ms.email;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.ms.email.services.EmailSenderService;

@SpringBootApplication
public class MsEmailApplication {

	@Autowired
	private EmailSenderService service;

	
	public static void main(String[] args) {
		SpringApplication.run(MsEmailApplication.class, args);}
			
		@EventListener(ApplicationReadyEvent.class)
		public void triggerMail() {
			service.sendSimpleEmail("kayquegps2@gmail.com",
					"Isso é um teste de microservice",
					"teste");
		}
	}


