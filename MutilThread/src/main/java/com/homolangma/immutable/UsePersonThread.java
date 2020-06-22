package com.homolangma.immutable;

/**
 * @author: Mr.Harry
 * @date : 2020/5/20 23:23
 * @title :
 */
public class UsePersonThread extends Thread {

    private Person person;

    public UsePersonThread(Person person) {
        this.person = person;
    }


    @Override
    public void run() {
       while (true){

           System.out.println(Thread.currentThread().getName()+" print "+person.toString());
       }

    }
}
