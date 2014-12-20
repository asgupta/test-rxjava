package com.godaddy.domains;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Starting the test runs");

        System.out.println("***********************************************");
        System.out.println("verbose observable and subscriber");
        firstObservable first = new firstObservable();
        first.runCode();

        System.out.println("***********************************************");
        System.out.println("terse observable verbose subscriber");
        terseObservable second = new terseObservable();
        second.runCode();

        System.out.println("***********************************************");
        System.out.println("terse observable action as a subscriber");
        terseSubscriber third = new terseSubscriber();
        third.runCode();

        System.out.println("***********************************************");
        System.out.println("Single Chained call");
        chainedCall four = new chainedCall();
        four.runCode();


        System.out.println("***********************************************");
        System.out.println("Lamda call");
        lemdaCall five = new lemdaCall();
        five.runCode();


        System.out.println("***********************************************");
        System.out.println("Adding Maps");
        addingMaps six = new addingMaps();
        six.runCode();

        System.out.println("***********************************************");
        System.out.println("Lamda Maps");
        terseMap seven = new terseMap();
        seven.runCode();


    }
}
