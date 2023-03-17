package org.example.example.p3_syncronization;

public class SyncMethodApp {
    public static void main(String[] args) {
        SyncMethodApp e1 = new SyncMethodApp();
        SyncMethodApp e2 = new SyncMethodApp();
        SyncMethodApp e3 = new SyncMethodApp();
        new Thread(() -> e1.method1()).start();
        new Thread(() -> e2.method2()).start();
        new Thread(() -> e3.method3()).start();
    }

    public synchronized void method1(){
        System.out.println("M1-started");
        for (int i = 0; i <10; i++) {
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("M2-finished");
    }
    public synchronized void method2(){
        System.out.println("M2-started");
        for (int i = 0; i <10; i++) {
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("M2-finished");
    }
    public void method3(){
        System.out.println("M3-started");
        for (int i = 0; i <10; i++) {
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("M3-finished");
    }
}
