package com.leha;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public abstract class Device implements ICrudAction{

    private int count;
    private String id;
    private String name;
    private String price;
    private String firm;
    private String model;


    Device(){
        id= UUID.randomUUID().toString();
        count++;
    }


    @Override
    public void create() {
        Random rnd = new Random(System.currentTimeMillis());


        String[] dictionaryName={"ponch","vonch","kolob","kildeboer"};
        String[] dictionaryPrice={"1337","10300","7900","29900"};
        String[] dictionaryFirm={"OOO ponch","OAO ponch","ЗАО kolob","ООО kildeboer"};
        String[] dictionaryModel={"ponch2003","vonch97","kolob18","kildeboer_one"};

        this.name=dictionaryName[0 + rnd.nextInt(3 - 0 + 1)];
        this.price=dictionaryPrice[0 + rnd.nextInt(3 - 0 + 1)];
        this.firm=dictionaryFirm[0 + rnd.nextInt(3 - 0 + 1)];
        this.model=dictionaryModel[0 + rnd.nextInt(3 - 0 + 1)];

        count++;
    }

    @Override
    public void read() {
        System.out.println(name);
        System.out.println(price);
        System.out.println(firm);
        System.out.println(model);
    }

    @Override
    public void update() {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите наименивание:");
        this.name=in.nextLine();
        System.out.println("Введите цену:");
        this.price=in.nextLine();
        System.out.println("Введите наименование фирмы:");
        this.firm=in.nextLine();
        System.out.println("Введите наименование модели:");
        this.model=in.nextLine();
    }

    @Override
    public boolean delete() {
        this.id=null;
        this.name=null;
        this.price=null;
        this.model=null;
        this.firm=null;
        count--;

        return true;
    }

    public String getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getFirm() {
        return firm;
    }

    public String getModel() {
        return model;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
