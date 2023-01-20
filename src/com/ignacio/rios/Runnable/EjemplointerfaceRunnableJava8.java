package com.ignacio.rios.Runnable;

public class EjemplointerfaceRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {

//        Runnable viaje = new Runnable() { //CLASE ANONIMA
//            @Override
//            public void run() {
//                for(int i = 0;i<5;i++){
//
//                    System.out.println(Thread.currentThread().getName() +" -> " + i);
//                    try {
//                        Thread.sleep((long)(1000* Math.random()));
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                } // fin for
//                System.out.println("Viaje a " + Thread.currentThread().getName()  );
//
//
//            }
//
//            };
 Thread main = Thread.currentThread();
        Runnable viaje = ()->{ // LAMBDA JAVA8
            for(int i = 0;i<3;i++){


                System.out.println(Thread.currentThread().getName()  +" -> " + i);
                try {
                    Thread.sleep((long)(1000* Math.random()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } // fin for
            System.out.println("Viaje a " + Thread.currentThread().getName()  );
            System.out.println("main.getState() = " + main.getState());
            };
        System.out.println(" estado metodo Main principal  =>>>> " + main.getState());
        Thread v1 = new Thread(viaje, "macedonia");
        Thread v2 = new Thread(viaje, "Bosnia");
        Thread v3 = new Thread(viaje, "Maracaibo");
        //Thread.sleep(5000);
        v1.start();
        v2.start();
        v3.start();
        v1.join();
        v2.join();
        v3.join();

        System.out.println("Continuamos con el metodo Main: " +main.getName());



    }



        }



