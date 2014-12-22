package com.godaddy.domains.executableCode;


import rx.Observable;

/**
 * Created by agupta on 12/19/2014.
 */
public class terseMap  extends BaseClass {

    public void runCode()
    {
        System.out.println("***********************************************");
        System.out.println("Lamda Maps");
        Observable.just("Hello World")
                .map(s -> s+ " Abhi Rules")
                .subscribe(s -> System.out.println(s));
    }
}
