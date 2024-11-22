package net.javaguide.Thread;

import java.io.*;

// DO NOT change the class name
// Write a Java program to print even and odd numbers alternatively using two separate threads.
public class OddEvenPrint
{
    private static final int MAX =20;
    private int number =1;
    private final Object lock = new Object();

    public static void main(String args[]){

        OddEvenPrint printer = new OddEvenPrint();
        Thread t1 = new Thread(printer.new EvenPrint());
        Thread t2 = new Thread(printer.new OddPrint());
        t1.start();
        t2.start();
    }

    class EvenPrint implements Runnable{

        public void run(){
            while(number<MAX){
                synchronized(lock){
                    while(number%2==1){
                        try{
                            lock .wait();
                        }
                        catch(InterruptedException e)
                        {
                            Thread.currentThread().interrupt();
                        }
                    }
                    if(number<=MAX){
                        System.out.println("even Number "+number);
                        number++;
                    }
                    lock.notifyAll();
                }
            }
        }

    }

    class OddPrint implements Runnable{

        public void run(){
            while(number<MAX){
                synchronized(lock){
                    while(number%2==0){
                        try{
                            lock .wait();
                        }
                        catch(InterruptedException e)
                        {
                            Thread.currentThread().interrupt();
                        }
                    }
                    if(number<=MAX){
                        System.out.println("odd Number "+number);
                        number++;
                    }
                    lock.notifyAll();
                }
            }
        }
    }
}