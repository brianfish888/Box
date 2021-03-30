package com.fju;

public class Box3 extends Box{
    public Box3() {
        int length = 10;
        int width = 10;
        int height = 10;
    }

    @Override
    public String getname() {
        return "box3";
    }

    @Override
    public String getprice(){
        return "60";
    }
}
