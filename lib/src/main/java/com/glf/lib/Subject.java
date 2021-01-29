package com.glf.lib;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> list = new ArrayList<>();

    public void attach(Observer observer) {
        list.add(observer);
        System.out.println("add observer" + observer.getName());
    }

    public void dettch(Observer observer) {
        list.remove(observer);
        System.out.println("del observer");
    }

    /**
     * 通知
     *
     * @param state
     */
    public void notifyObserver(String state) {
        for (Observer observer : list) {
            observer.update(state);
        }
    }
}
