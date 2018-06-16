/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnables2;

/**
 *
 * @author Crazian
 */
class ClassA implements Runnable {

    @Override
    public void run() {
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId() + " i Value is " + i);
        }
        try {
            Thread.sleep(100);
            //sleep method pauses thread for 100 milliseconds and they run concurrently
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

}

public class practice3 {

    public static void main(String[] args) {
        Thread obj1 = new Thread(new ClassA());
        Thread obj2 = new Thread(new ClassA());
        obj1.start();
        obj2.start();
        
    }

}
