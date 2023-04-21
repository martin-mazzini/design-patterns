package facade.twilio;

import com.twilio.Twilio;
import com.twilio.exception.TwilioException;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender {
    private static final String ACCOUNT_SID = "your_account_sid";
    private static final String AUTH_TOKEN = "your_auth_token";
    private static final String TWILIO_PHONE_NUMBER = "your_twilio_phone_number";

    public void sendMessage(String toNumber, String messageBody) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new PhoneNumber(toNumber),
                new PhoneNumber(TWILIO_PHONE_NUMBER),
                messageBody).create();
        System.out.println("Sent message with ID: " + message.getSid());
    }
}
