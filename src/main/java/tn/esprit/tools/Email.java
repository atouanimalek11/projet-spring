package tn.esprit.tools;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Email {

	private static final Logger logger = LogManager.getLogger(SMS.class);

	private String username = "khalifa.jabri@esprit.tn";
	private String password = "Khelifa&123";

	private String receiver;
	private String subject = null;
	private String content;

	public Email() {
		super();
	}

	public Email(String receiver) {
		super();
		this.receiver = receiver;
	}

	public void AccepterDemandeAdheration() {
		subject = "Acceptation de la demande";
		content = "Cher client,\nVotre demande d'etre un client chez notre banque a été acceptée. Veuilliez passer, le plutot possible à votre agence pour avoir recupérer votre compte.\nje vous souhaite une excellente journée.\nCordialement.";
	}

	public void envoyerEmail() {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			// Etape 2 : Création de l'objet Message
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver));
			message.setSubject(subject);
			message.setText(content);
			// Etape 3 : Envoyer le message
			Transport.send(message);
			logger.info("INFO : Le message a été envoyé avec succès...");
		} catch (MessagingException e) {
			logger.error("ERROR : " + e.getStackTrace());
			throw new RuntimeException(e);
		}
	}

	public static Logger getLogger() {
		return logger;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
