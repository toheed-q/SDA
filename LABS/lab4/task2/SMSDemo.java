/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.eventmanagement;

public class SMSDemo {
    public static void main(String[] args) {
        SMSManager smsManager = new SMSManager();

        // Attach the SMS length check listener
        SMSLengthCheckListener lengthCheckListener = new SMSLengthCheckListener();
        smsManager.attach(lengthCheckListener);

        // Create some SMS messages
        SMSMessage validSMS = new SMSMessage("000005", "Hello, this is a check message");
        SMSMessage longSMS = new SMSMessage("0987654321", "This is a long SMS that exceeds the maximum allowed length of 160 characters. " +
                "In fact, it is so long that it needs to be truncated or handled differently to avoid issues.");

        // Send the SMS messages
        smsManager.sendSMS(validSMS);
        smsManager.sendSMS(longSMS);
    }
}