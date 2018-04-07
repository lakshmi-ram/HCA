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
		helper.setText("Dear Member, \r\n" + 
				"\r\n" + 
				"There has been an incident of dengue spotted in your constituency at the Government Hospital. \r\n" + 
				"\r\n" + 
				"This is the first case spotted and we will keep you informed as the situation develops. \r\n" + 
				"\r\n" + 
				"For more details, visit the portal for an in depth look. \r\n");
		helper.setSubject("Dengue Alert: Tamil Nadu");		
		helper.setFrom("hpyAlert@gmail.com");
		helper.setTo(mailId);		
		
		sender.send(message);
	}
}
