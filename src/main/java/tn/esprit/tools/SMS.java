package tn.esprit.tools;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.util.MultiValueMap;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMS {

	private static final Logger logger = LogManager.getLogger(SMS.class);

	private final String ACCOUNT_SID = "AC436b368348c45909023ad6a6c589d616";

	private final String AUTH_TOKEN = "1a80a716b1e411c85bd5d2c446986289";

	private final String FROM_NUMBER = "+18727135903";

	private String to;
	private String message;

	public SMS() {
		super();
	}

	public SMS(String to, String message) {
		super();
		this.to = to;
		this.message = message;
	}

	public void sendSMS() {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Message msg = Message.creator(new PhoneNumber(to), new PhoneNumber(FROM_NUMBER), message).create();

		logger.info("here is my id:" + msg.getSid()); // Unique resource ID
														// created to manage
														// this transaction

		logger.info(this.toString()); // Unique resource ID created to manage
										// this transaction

	}

	public void receiveSMS(MultiValueMap<String, String> smscallback) {
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "***SMS [to = " + to + ", message = " + message + "]***";
	}

	public static Logger getLogger() {
		return logger;
	}

}
