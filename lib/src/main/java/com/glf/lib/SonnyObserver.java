package com.glf.lib;

public class SonnyObserver implements Observer
{
    private String name;

    public SonnyObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        System.out.println(name + "SonnyObserver:" + state);
    }

    @Override
    public String getName() {
        return name;
    }
}
