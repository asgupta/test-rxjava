package com.godaddy.domains.executableCode;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by agupta on 12/19/2014.
 */
public class firstObservable  extends BaseClass {
    public void runCode() {
        System.out.println("***********************************************");
        System.out.println("verbose observable and subscriber");
        Observable<String> myObservable = Observable.create(
                new Observable.OnSubscribe<String>() {
                    @Override
                    public void call(Subscriber<? super String> sub) {
                        sub.onNext("Hello, world!");
                        sub.onCompleted();
                    }
                }
        );

        Subscriber<String> mySubscriber = new Subscriber<String>() {
            @Override
            public void onNext(String s) {

                System.out.println(s); }

            @Override
            public void onCompleted() { }

            @Override
            public void onError(Throwable e) { }
        };

        myObservable.subscribe(mySubscriber);
    }
}
