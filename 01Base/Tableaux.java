import java.util.Arrays;
/**
 * Exemples avec les tableaux
 */
public class Tableaux 
{
    public static void main(String[] args) 
    {
        String abc = "abcdefghijklmnopqrstuvwxyz";
    // Longueur d'un String : .length() <-- une m�thode
    // Indexe d'un charact�re dans un String: .indexOf("texte")
    // Caract�re � un indexe : .charAt(index)
    int lenAbc = abc.length();
    int i = abc.indexOf("c");
    char c = abc.charAt(abc.length() - 2);


    char[] lettres = abc.toCharArray();
    // lettres est un tableau ("array")
    // Longueur du tableau : .length <-- un attribut
    // indexe d'un caract�re : recherche avec une boucle
    // caract�re � un indexe : [index]
    int len_lettres = lettres.length;
    for (int j = 0; j < len_lettres; j++)
    {
        if (lettres[j] =='g') {int i_g = j;}
    }

    double[] notes = new double[6];
    notes[0] = 72.3;
    notes[1] = 61.0;
    //.
    //.
    //.
    notes[notes.length - 1] = 100.0;
    }
}
