package org.example.example.p1_thread_creation_and_base;

public class P1_thread_example_class extends Thread{
    public static void main(String[] args) {
        Thread t = new P1_thread_example_class();
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main--" + i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println("thread--" + i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
