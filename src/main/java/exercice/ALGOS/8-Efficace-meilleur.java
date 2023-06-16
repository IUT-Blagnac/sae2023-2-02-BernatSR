package exercice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Efficace {
    public static List<String> solution(String str, List<Character> ordre) {
        List<String> reponse = new ArrayList<>();
        Map<Character, List<String>> motsParInitial = new HashMap<>();

        StringBuilder motCourant = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isWhitespace(c)) {
                traiterMot(motCourant, motsParInitial, ordre);
                motCourant.setLength(0);
            } else {
                motCourant.append(c);
            }
        }

        traiterMot(motCourant, motsParInitial, ordre);

        for (char initial : ordre) {
            if (motsParInitial.containsKey(initial)) {
                reponse.addAll(motsParInitial.get(initial));
            }
        }
        

        return reponse;
    }

    private static void traiterMot(StringBuilder motCourant, Map<Character, List<String>> motsParInitial, List<Character> ordre) {
        String mot = motCourant.toString().trim();
        if (!mot.isEmpty()) {
            char initial = mot.charAt(0);
            if (ordre.contains(initial)) {
                motsParInitial.computeIfAbsent(initial, k -> new ArrayList<>()).add(mot);
            }
        }
    }
    
}

