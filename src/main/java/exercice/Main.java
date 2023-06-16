package exercice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long beforeUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        String texte = "Il fait beau aujourd’hui comme en aout";
        List<Character> ordre = List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o');
        System.out.println(Exercice.solution(texte, ordre));
        // output: [classer, texte, exemple, a, de]
        long endTime = System.nanoTime();
        long afterUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long duration = (endTime - startTime);
        long actualMemUsed = afterUsedMem - beforeUsedMem;
        double durationMillis = (double) duration / 1_000_000.0;
        System.out.println("Temps d'exécution : " + durationMillis + " ms");
        System.out.println("Memoire utilisée : " + actualMemUsed + " octets");

    }
}

/*
 * Exemple d’input
 * texte = "Il fait beau aujourd’hui comme en aout"
 * 
 * ordre = ['f', 'I', 'z', 'u', 'k', 'a', 'b', 'o']
 * 
 * Exemple d’ouput
 * ["fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"]
 */