/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.eventmanagement;

public class SMSLengthCheckListener implements SMSSupportListener {
    private static final int MAX_LENGTH = 160;

    @Override
    public void onSMSReceived(SMSMessage sms) {
        if (sms.getMessage().length() > MAX_LENGTH) {
            System.out.println("Warning: Define valid default SMS (max length is " + MAX_LENGTH + " characters).");
        } else {
            System.out.println("Sending SMS to " + sms.getPhoneNumber() + ": " + sms.getMessage());
            // Here you could add the actual logic to send SMS
        }
    }
}