package com.godaddy.domains;


import rx.Observable;
import rx.Subscriber;

/**
 * Created by agupta on 12/19/2014.
 */
public class terseObservable {
    public void runCode()
    {
        //observable is source of data
        Observable<String> myObservable = Observable.just("Hellow worlkd");

        //subscriber is the consumer of the data ..does magic with the data.
        //here it prints the string
        Subscriber<String> mySubscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("done");
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(String s) {
            System.out.println(s);
            }
        };
        myObservable.subscribe(mySubscriber);
    }
}
