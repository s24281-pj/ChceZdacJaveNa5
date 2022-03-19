package com.company;

public class Main {

    public static void main(String[] args) {
        String[] tablica = { "1", "1", "2", "1"};
        System.out.println(sum(tablica));
        }
    public static String sum(String[] array) {
            int suma = 0;
            for (int i = 0; i < array.length; i++){
                suma += Integer.valueOf(array[i]);
            }
            return "" + suma;
        }

}
