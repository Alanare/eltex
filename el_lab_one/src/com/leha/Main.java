package com.leha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int kol=0;
        String vid;

        Scanner in=new Scanner(System.in);

        System.out.println("Введите тип объекта:");
        vid=in.nextLine();

        System.out.println("Введите количество вводимых объектов:");
        kol=in.nextInt();

        for(int i=0;i<kol;i++){
            if(vid.equals("TV")){
                TV objTV=new TV();
                objTV.create();
                objTV.update();
                objTV.read();
                objTV.delete();
            }

            if(vid.equals("GameConsole")){
                GameConsole objGC=new GameConsole();
                objGC.create();
                objGC.update();
                objGC.read();
                objGC.delete();
            }

            if(vid.equals("SetTop")){
                SetTop objST=new SetTop();
                objST.create();
                objST.update();
                objST.read();
                objST.delete();
            }
        }
    }
}
