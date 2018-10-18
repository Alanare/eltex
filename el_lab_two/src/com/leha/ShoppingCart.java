package com.leha;

import java.util.LinkedList;
import java.util.TreeSet;

public class ShoppingCart {

    LinkedList<Device> listProd;
    TreeSet<String> unicID;

    ShoppingCart(){
        listProd=new LinkedList<>();
        unicID=new TreeSet<>();
    }

    public Device find(String id){
        Device dv=null;
        for(Device dev:listProd) {
            if (id == dev.getId()) dv=dev;
        }
        return dv;
    }

    public void read(){
        for(Device dev:listProd){
            System.out.println(dev);
        }
    }

    public boolean add(Device prod){
        if(listProd.add(prod)){
            unicID.add(prod.getId());
            return true;
        }
        else return false;
    }

    public boolean delete(Device prod){
        if(listProd.remove(prod)) return true;
        else return false;
    }

    public LinkedList<Device> getListProd() {
        return listProd;
    }

    public void setListProd(LinkedList<Device> listProd) {
        this.listProd = listProd;
    }
}
