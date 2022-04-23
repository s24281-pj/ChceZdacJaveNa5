package com.company;

public interface PrzedstawiaEmocje {
    default boolean przestanSieUsmiechac() {
        if (true) {
            System.out.println(":-)");

        }else{
            System.out.println(":-(");
        }
        return false;
    }

    default boolean czySieUsmiecha() {
        boolean b = false;
        return b;
    }
}
