package com.glf.rxjavademo.utils;

import com.glf.rxjavademo.presenter.INormalPersenter;
import com.glf.rxjavademo.presenter.impl.NormalPersenterImpl;

public class PresenterManager {

    private static final PresenterManager ourInstance = new PresenterManager();
    private final INormalPersenter mINormalPersenter;

    public static PresenterManager getInstance() {
        return ourInstance;
    }

    public INormalPersenter getINormalPersenter() {
        return mINormalPersenter;
    }

    private PresenterManager() {
        mINormalPersenter = new NormalPersenterImpl();
    }
}