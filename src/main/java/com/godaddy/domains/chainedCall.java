package com.godaddy.domains;


import rx.Observable;
import rx.functions.Action1;

/**
 * Created by agupta on 12/19/2014.
 */
public class chainedCall {
    public void runCode()
    {
        Observable.just("HelloWorld")
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        System.out.println(s);
                    }
                });
    }
}
