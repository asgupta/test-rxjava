package com.godaddy.domains.executableCode;


import rx.Observable;
import rx.functions.Action1;

/**
 * Created by agupta on 12/19/2014.
 */
public class chainedCall  extends BaseClass {
    public void runCode()
    {
               System.out.println("***********************************************");
        System.out.println("Single Chained call");
        Observable.just("HelloWorld")
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        System.out.println(s);
                    }
                });
    }
}
