/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.eventmanagement;

import java.util.ArrayList;
import java.util.List;

public class SMSManager {
    private List<SMSSupportListener> listeners = new ArrayList<>();

    public void attach(SMSSupportListener listener) {
        listeners.add(listener);
    }

    public void detach(SMSSupportListener listener) {
        listeners.remove(listener);
    }

    public void sendSMS(SMSMessage sms) {
        for (SMSSupportListener listener : listeners) {
            listener.onSMSReceived(sms);
        }
    }
}
