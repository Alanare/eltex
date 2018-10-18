package com.leha;

import java.util.ArrayList;
import java.util.Date;
import java.util.PriorityQueue;

public class Orders {

    PriorityQueue<Order> listOrder;

    Orders(){
        listOrder=new PriorityQueue<>();
    }

    public void buy(Order order){
        listOrder.add(order);
    }

    //ДОПИСАТЬ
    public void read(){
        for(Order ord : listOrder) {
            System.out.println(ord);
        }
    }

    public void checkOrder(){
        Date date=new Date();
        long currentTime=date.getTime();
        for(Order ord : listOrder) {
            if(currentTime>=ord.getTimeCreate()+ord.getTimeWaiting()) listOrder.remove(ord);
        }
    }


}
