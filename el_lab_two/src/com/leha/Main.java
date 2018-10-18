package com.leha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int kol=0;
        int opr;
        String vid;
        ShoppingCart shoppingCart=new ShoppingCart();
        Credentials credentials=new Credentials();
        Orders orders=new Orders();
        Order order;

        Scanner in=new Scanner(System.in);

        boolean cheker = true;

        while (cheker){
            System.out.println("Ведите номер опрерации:"+"\n");
            opr=in.nextInt();
            switch (opr){
                case 0:
                    in=new Scanner(System.in);
                    System.out.println("Введите тип объекта:");
                    vid=in.nextLine();

                    System.out.println("Введите количество вводимых объектов:");
                    kol=in.nextInt();

                    for(int i=0;i<kol;i++){
                        credentials.create();
                        order=new Order();
                        if(vid.equals("TV")){
                            TV objTV=new TV();
                            objTV.create();
                            objTV.update();
//                objTV.read();
//                objTV.delete();
                            shoppingCart.add(objTV);
                            Device obj=new TV();
                            obj=shoppingCart.find(objTV.getId());
                            System.out.println(obj);
                        }

                        if(vid.equals("GameConsole")){
                            GameConsole objGC=new GameConsole();
                            objGC.create();
                            objGC.update();
//                objGC.read();
//                objGC.delete();
                            shoppingCart.add(objGC);
                        }

                        if(vid.equals("SetTop")){
                            SetTop objST=new SetTop();
                            objST.create();
                            objST.update();
//                objST.read();
//                objST.delete();
                            shoppingCart.add(objST);

                        }
                        order.setCredentials(credentials);
                        order.setShoppingCart(shoppingCart);
                        orders.buy(order);
                    }
                    break;
                case 1:
                    orders.checkOrder();
                    break;
                case 2:
                    orders.read();
                    break;
                case 3:
                    shoppingCart.read();
                    break;
                case 4:
                    cheker=false;
                    break;
            }
        }


    }
}
