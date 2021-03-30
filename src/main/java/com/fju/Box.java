package com.fju;

public abstract class Box {
        int length;
        int width;
        int height;
        public Box(int length,int width,int height){
            this.length=length;
            this.width=width;
            this.height=height;
        }
        public abstract String getname();
        public abstract String getprice();
}
