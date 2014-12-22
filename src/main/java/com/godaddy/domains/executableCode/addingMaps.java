package com.godaddy.domains.executableCode;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by agupta on 12/19/2014.
 */
public class addingMaps extends BaseClass {

    //the map() operator can be used to transform one emitted item into another
    public void runCode(){
       System.out.println("***********************************************");
        System.out.println("Adding Maps");
        Observable.just("hello world ")
                .map(new Func1<String, String>() {
                    @Override
                    public String call(String s) {
                        return s+ "Abhi Rules";
                    }
                })
        .subscribe(s -> System.out.println(s));
    }
}
