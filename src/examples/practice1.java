/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Crazian
 */
class ClassA extends Thread {
    public void run(){
        int i;
        for( i=0 ; i<10; i++){
            try {
                Thread.sleep(100);
                //sleep method pauses thread for 100 milliseconds and they run concurrently
            } catch (InterruptedException ex) {
                Logger.getLogger(ClassA.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(Thread.currentThread().getId()+ " i Value is " + i);
            // This way we can see the number or ID that is assigned to each thread and see it 
        }
        

    }
}

public class practice1 {

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.start();
        // First Thread is called first
        ClassA classB = new ClassA();
        classB.start();
        // Second Thread is ran second but they are ran concurrently
     

    }
}
