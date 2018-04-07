package com.hc.helper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailHelper {

    @Autowired
    private JavaMailSender sender;
    
	public void sendMail(String mailId) throws MessagingException {
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);		
		helper.setText("Your password is ");
		helper.setSubject("Your password enclosed");		
		helper.setFrom("hpyAlert@gmail.com");
		helper.setTo(mailId);		
		
		sender.send(message);
	}
}
