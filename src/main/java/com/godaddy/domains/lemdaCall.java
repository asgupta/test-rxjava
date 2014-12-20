package com.godaddy.domains;


import rx.Observable;

/**
 * Created by agupta on 12/19/2014.
 */
public class lemdaCall {

    public void runCode()
    {
        Observable.just("hello world !! ").subscribe(s -> System.out.println(s));
    }
}
