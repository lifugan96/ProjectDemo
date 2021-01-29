package com.glf.lib;

public class MyClass {
    public static void main(String[] args) {
        Observer fbb = new SonnyObserver("FBB");
        Observer ym = new SonnyObserver("YM");

        Subject subject = new MasajiSubject();
        subject.attach(fbb);
        subject.attach(ym);

        subject.notifyObserver("masaji");
    }
}
