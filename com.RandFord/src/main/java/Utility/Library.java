package Utility;


import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
public class Library {
	public static void screenshort(String name)
	{
		try {
			Robot r=new Robot();
			BufferedImage bi=r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			ImageIO.write(bi, "png", new File("./screenshots/"+name+".png"));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void   attachment(String name) {
		screenshort(name);
		EmailAttachment email=new EmailAttachment();
		email.setPath("./screenshots/"+name+".png");
		email.setDisposition(EmailAttachment.ATTACHMENT);	
		email.setDescription("failed screenshots");
		email.setName("screenshot");
		try {
			MultiPartEmail meemail=new MultiPartEmail();
			//	Email meemail=new SimpleEmail();
			meemail.setAuthenticator(new DefaultAuthenticator("vicky6950@gmail.com", "BUNI222UTTAM@"));
			meemail.setHostName("smtp.gmail.com");
			meemail.setSmtpPort(465);
			meemail.setSSLOnConnect(true);
			meemail.setFrom("vicky6950@gmail.com");
			meemail.setSubject("test report");
			meemail.setMsg("failed");
			meemail.addTo("mahatobijan1907@gmail.com");
			meemail.attach(email);
			meemail.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}


	}


}














