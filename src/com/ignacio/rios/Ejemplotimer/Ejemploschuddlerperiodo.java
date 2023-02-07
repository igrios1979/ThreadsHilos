package com.ignacio.rios.Ejemplotimer;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.font.TextAttribute;
import java.awt.im.InputMethodHighlight;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.URL;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Ejemploschuddlerperiodo {

    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();


        AtomicInteger ai = new AtomicInteger(4);
        Timer timer = new Timer();


        timer.schedule(new TimerTask() {
           int contador = ai.getAndDecrement();

            @Override
            public void run() {
                if (contador > 0){
                    toolkit.beep();
                    System.out.println("tarea realizada en periodo "+" -> " + contador +" " +
                             new Date() +" -> " + Thread.currentThread().getName());
                       contador--;
                }else{
                    System.out.println("Finaliza....." );
                    timer.cancel();
                }


            }
        },0 ,5000);


        System.out.println("Agendamos tarea por 3 segundos" );

    }

}
