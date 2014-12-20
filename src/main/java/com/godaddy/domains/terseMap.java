package com.godaddy.domains;


import rx.Observable;

/**
 * Created by agupta on 12/19/2014.
 */
public class terseMap {

    public void runCode()
    {
        Observable.just("Hello World")
                .map(s -> s+ " Abhi Rules")
                .subscribe(s -> System.out.println(s));
    }
}
