
package Model;


import Observer.Subject;
import Observer.Observer;


import java.util.ArrayList;
import java.util.List;

public class Book implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String title;
    private boolean available;

    public Book(String title, boolean available) {
        this.title = title;
        this.available = available;
    }

 
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

  
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    
    public void notifyObservers() {
        String message = "The book \"" + title + "\" is out of stock.";
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void borrow() {
        if (!available) {
            notifyObservers();
        } else {
            available = false;
            System.out.println("Book borrowed: " + title);
        }
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }
}
