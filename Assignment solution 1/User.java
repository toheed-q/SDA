/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Observer.Observer;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

 
    public void update(String message) {
        System.out.println("Notification to " + name + ": " + message);
    }
}