package com.javaee.email;
public class EmailSender {
	public static void main(String[] args) {
		final String fromEmail = "79e6bb7eaed7d1";
		final String password = "a7790b458fa607";
		final String toEmail = "example@gmail.com";
		
		System.out.println("Initializin email send");
		
		EmailConfig config = new EmailConfig();
		
		config.sendEmail(fromEmail, password, toEmail, "Subject", "Email body");
	}
}
