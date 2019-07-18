package com.company;

public class Ctl_03 {
    public static void main(String[] args) {


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                method("1");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                method("2");
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                method("1");
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                method("1");
            }
        });
        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                method("5");
            }
        });Thread t6 = new Thread(new Runnable() {
            @Override
            public void run() {
                method("6");
            }
        });
        Thread t7 = new Thread(new Runnable() {
            @Override
            public void run() {
                method("7");
            }
        });Thread t8 = new Thread(new Runnable() {
            @Override
            public void run() {
                method("8");
            }
        });
        Thread t9 = new Thread(new Runnable() {
            @Override
            public void run() {
                method("9");
            }
        });Thread t10 = new Thread(new Runnable() {
            @Override
            public void run() {
                method("10");
            }
        });
        Thread t11 = new Thread(new Runnable() {
            @Override
            public void run() {
                method("11");
            }
        });




//        long startTime=System.currentTimeMillis();   //获取开始时间
//        System.out.println(startTime);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
//        t7.start();
//        t8.start();
//        t9.start();
//        t10.start();
//        t11.start();
//        long endTime=System.currentTimeMillis(); //获取结束时间
//        System.out.println(endTime);
//        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
    }

    public static void method(String s){
//        System.out.println("diao");
        String synchronizedCard = "weiyibiaoshi" + s;
        String intern = synchronizedCard.intern();
        synchronized (intern) {

            System.out.println(Thread.currentThread().getName()+"-method start");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-method end");
        }

    }

}
