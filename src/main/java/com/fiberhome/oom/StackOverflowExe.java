package com.fiberhome.oom;

public class StackOverflowExe {


    public static void inc(){
        inc();
    }

    public static void main(String[] args) {
        inc();
    }
}
