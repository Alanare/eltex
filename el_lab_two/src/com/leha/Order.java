package com.leha;

import java.util.Date;

public class Order implements Comparable{

    private boolean status;
    long timeCreate;
    long timeWaiting=10*1000;
    ShoppingCart shoppingCart;
    Credentials credentials;

    Order(){
        Date date=new Date();
        timeCreate= date.getTime();
        status=false;
        shoppingCart=new ShoppingCart();
        credentials=new Credentials();
    }

    @Override
    public String toString() {
        String fin=credentials.getName()+
                credentials.getSurname()+
                credentials.getMiddleName()+
                "\n"+
                shoppingCart.getListProd().toString();
        return fin;
    }

    public long getTimeCreate() {
        return timeCreate;
    }

    public long getTimeWaiting() {
        return timeWaiting;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public boolean getStatus() {
        return status;
    }

    public void setTimeCreate(long timeCreate) {
        this.timeCreate = timeCreate;
    }

    public void setTimeWaiting(long timeWaiting) {
        this.timeWaiting = timeWaiting;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
