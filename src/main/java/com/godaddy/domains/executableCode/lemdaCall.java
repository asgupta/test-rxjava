package com.godaddy.domains.executableCode;


import rx.Observable;

/**
 * Created by agupta on 12/19/2014.
 */
public class lemdaCall  extends BaseClass {

    public void runCode()
    {
        System.out.println("***********************************************");
        System.out.println("Lamda call");

        Observable.just("hello world !! ").subscribe(s -> System.out.println(s));
    }
}
