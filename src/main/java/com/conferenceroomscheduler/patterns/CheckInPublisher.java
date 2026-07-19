package com.conferenceroomscheduler.patterns;

import java.util.ArrayList;

import com.conferenceroomscheduler.model.Account;

public class CheckInPublisher {
    private ArrayList<CheckInObserver> observers =  new ArrayList<>();

    public void registerObserver(CheckInObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CheckInObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Account account) {
        for (CheckInObserver observer : observers) {
            observer.detectOccupancy(account);
        }
    }
}
