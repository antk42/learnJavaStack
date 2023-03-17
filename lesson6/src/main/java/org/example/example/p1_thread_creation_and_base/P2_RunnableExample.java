package org.example.example.p1_thread_creation_and_base;

public class P2_RunnableExample implements Runnable{
    public static void main(String[] args) {
        Thread t = new Thread(new P2_RunnableExample());
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
