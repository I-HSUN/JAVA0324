package com.study.d21;

public class Master implements Runnable {
    private Cookies cookies;

    public Master(Cookies cookies) {
        this.cookies = cookies;
    }
    
    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            cookies.put(i);
        }
    }
    
}
