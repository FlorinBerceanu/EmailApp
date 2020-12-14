package com.company;

public class Main {

    public static void main(String[] args) {
        EmailApp em1 = new EmailApp("John", "Smith");
        em1.changePassword("123ABc");
        em1.setAlternateEmail("js@gmail.com");
        System.out.println(em1.getAlternateEmail());
        em1.showInfo();

    }
}
