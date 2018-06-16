/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnables;


import java.util.logging.Level;
import java.util.logging.Logger;


class ClassB implements Runnable{
    
    @Override
    public void run(){
        int i;
        for( i=0 ; i<10; i++){
            try {
                Thread.sleep(100);
                //sleep method pauses thread for 100 milliseconds and they run concurrently
            } catch (InterruptedException ex) {
                Logger.getLogger(ClassB.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(Thread.currentThread().getId()+ " i Value is " + i);
            // This way we can see the number or ID that is assigned to each thread and see it 
        }
        
    }
    
}
/**
 *
 * @author Crazian
 */
public class practice2 {
    
    public static void main(String[] args) {
        Thread obj1 = new Thread(new ClassB());
        Thread obj2 = new Thread(new ClassB());
        obj1.start();
        obj2.start();
        
    }
    
           
    
}
