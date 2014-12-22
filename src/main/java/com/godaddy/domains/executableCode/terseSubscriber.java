package com.godaddy.domains.executableCode;


import rx.Observable;
import rx.functions.Action0;
import rx.functions.Action1;

/**
 * Created by agupta on 12/19/2014.
 */
public class terseSubscriber extends BaseClass  {

    public void runCode()
    {
        System.out.println("***********************************************");
        System.out.println("terse observable action as a subscriber");
        Observable<String> myObservable = Observable.just("Hellow World !!");

        //only one needed here
        Action1<String> onNextAction = new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println(s);
            }
        };

        //optional
        Action0 onCompleteAction = new Action0() {
            @Override
            public void call() {
                System.out.println("done");
            }
        };

        //optional
        Action1<Throwable> onErroAction = new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {

            }
        };
        myObservable.subscribe(onNextAction,onErroAction,onCompleteAction);
    }
}
