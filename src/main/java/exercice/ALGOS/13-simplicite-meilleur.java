package exercice;

import java.util.ArrayList;
import java.util.List;

public class Exercice {
    public static List<String> solution(String str, List<Character> ordre) {
        String[] mots = str.split(" ");
        List<String> listeOrdonnee = new ArrayList<String>();
        //Pour chaque lettre de l'ordre on ajoute les mots qui commencent par cette lettre
        for (int i = 0; i < ordre.size(); i++) {
            for (int j = 0; j < mots.length; j++) {
                if (mots[j].charAt(0) == ordre.get(i)) {
                    listeOrdonnee.add(mots[j]);
                }
            }
        }
        //On ajoute les mots qui ne commencent pas par les lettres de l'ordre
        for (int i = 0; i < mots.length; i++) {
            if(!listeOrdonnee.contains(mots[i])){
                listeOrdonnee.add(mots[i]);
            }
        }        
        return listeOrdonnee;
    }
}
