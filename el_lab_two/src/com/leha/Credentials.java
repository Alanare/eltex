package com.leha;

import java.util.Random;
import java.util.UUID;

public class Credentials {

    String id;
    String surname;
    String name;
    String middleName;
    String eMail;

    Credentials(){
        id= UUID.randomUUID().toString();
    }

    public void create() {
        Random rnd = new Random(System.currentTimeMillis());

        String[] dictionaryName={"Aleks","Vova","Ivan","Vasya"};
        String[] dictionarySurname={"Alekseev","Petrov","Ivanov","Sidorov"};
        String[] dictionaryMiddleName={"Alekseevich","Viktorovich","Ivanovich","Popovich"};
        String[] dictionaryEmail={"one_love@love.ru","sidr1337@sidr.ru","zhuk228@mail.ru","trofimloh@loh.ru"};

        this.name=dictionaryName[0 + rnd.nextInt(3 - 0 + 1)];
        this.surname=dictionarySurname[0 + rnd.nextInt(3 - 0 + 1)];
        this.middleName=dictionaryMiddleName[0 + rnd.nextInt(3 - 0 + 1)];
        this.eMail=dictionaryEmail[0 + rnd.nextInt(3 - 0 + 1)];
    }

    public String getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String geteMail() {
        return eMail;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
