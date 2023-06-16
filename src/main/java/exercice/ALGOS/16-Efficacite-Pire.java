package exercice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercice {
public static List<String> solution(String str, List<Character> ordre) {
List<String> mots = new ArrayList<>();
StringBuilder motActuel = new StringBuilder();Map<Character, List<String>> motsParLettre = new HashMap<>();
for (int i = 0; i < str.length(); i++) {
char caractere = str.charAt(i);
if (caractere == ' ') {
if (motActuel.length() > 0) {
char premiereLettre = motActuel.charAt(0);
motsParLettre.computeIfAbsent(premiereLettre, k -> new ArrayList<>()).add(motActuel.toString());
motActuel.setLength(0);
}
} else {
motActuel.append(caractere);
}
}
if (motActuel.length() > 0) {
char premiereLettre = motActuel.charAt(0);
motsParLettre.computeIfAbsent(premiereLettre, k -> new ArrayList<>()).add(motActuel.toString());
}
for (char lettre : ordre) {
if (motsParLettre.containsKey(lettre)) {
mots.addAll(motsParLettre.get(lettre));
}
}
return mots;
}
}
