package org.generation.italy;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> mazzo = new ArrayList<>();
        ArrayList<Float> valori = new ArrayList<>();
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
       int estrazione;
        String risposta;

        for (Integer i = 1; i < 11; i++) {
            mazzo.add(i + " bastoni");
            if (i > 7)
                valori.add(0.5f);
            else
                valori.add(i.floatValue());
        }

        for (Integer i = 1; i < 11; i++) {
            mazzo.add(i + " coppe");
            if (i > 7)
                valori.add(0.5f);
            else
                valori.add(i.floatValue());
        }

        for (Integer i = 1; i < 11; i++) {
            mazzo.add(i + " spade");
            if (i > 7)
                valori.add(0.5f);
            else
                valori.add(i.floatValue());
        }

        for (Integer i = 1; i < 11; i++) {
            mazzo.add(i + " denari");
            if (i > 7)
                valori.add(0.5f);
            else
                valori.add(i.floatValue());
        }

        System.out.println("Vuoi giocare a Sette e mezzo? Se si, ti do una carta!");
        risposta = sc.nextLine();
        if (risposta.equals("si")) 
        {
            float punteggioGiocatore = 0;

            do {
               
                 estrazione = r.nextInt(mazzo.size());

                
                System.out.println("Hai pescato: " + mazzo.get(estrazione));

                
                punteggioGiocatore=punteggioGiocatore + valori.get(estrazione);

               
                System.out.println("Il tuo punteggio attuale è: " + punteggioGiocatore);

              
                if (punteggioGiocatore < 7.5) {
                    System.out.println("Vuoi un'altra carta? (si/no)");
                    risposta = sc.nextLine();
                } else {
                    System.out.println("Hai sballato");
                    risposta = "no";  
                }

            } while (risposta.equals("si"));

           if(punteggioGiocatore<=7.5)
            System.out.println("Il tuo punteggio finale è: " + punteggioGiocatore);
sc.close();
    }
    }
}

	
	 
    



