package com.company;

import com.company.TrojkatRownoboczny;
import com.company.TrojkatRownoramienny;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // oczywiście ma też działać po zmianie tych wartości
        double podstawa = 2, ramie = 3;
        TrojkatRownoramienny trojkat1 = new TrojkatRownoramienny(podstawa, ramie);
        TrojkatRownoboczny trojkat2 = new TrojkatRownoboczny(podstawa, podstawa);
        TrojkatRownoramienny trojkat3 = new TrojkatRownoboczny(podstawa);
        trojkat3.equals(trojkat2);

        if (trojkat2.wysokosc() == ((TrojkatRownoboczny) trojkat3).wysokosc())
            System.out.println("To powinno się wydrukować 1 (za 1 p.)");
        if (trojkat1.wysokosc(2.5) == 2.5)//(Math.sqrt((ramie * ramie) - (podstawa * podstawa / 4)) * 2.5))
            System.out.println("To powinno się wydrukować 2 (za 1 p.)");
        if ((int) ((podstawa * Math.sqrt(3) / 2.) * 2) == trojkat3.wysokosc(2))
            System.out.println("To powinno się wydrukować 3 (za 2 p.)");
        if (!trojkat1.equals(trojkat2))
            System.out.println("To powinno się wydrukować 4 (za 1 p.)");
        ArrayList lista1 = new ArrayList();
        lista1.add(trojkat1);
        lista1.add(trojkat2);
        lista1.add(trojkat3);
        lista1.equals(trojkat3.equals(trojkat2));
        if (lista1.contains(trojkat3))
            System.out.println("To powinno się wydrukować 5 (za 2 p.)");
    }
}