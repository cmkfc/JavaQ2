/*  Par: David Crowley, crowlda@ecolecatholique.ca 
    2020-11-17
*/

// Au d�but du fichier, avant la d�claration de classe...
// importer la d�finition de l'objet Scanner 
import java.util.Scanner;

/** Exemples sur les types et les entr�es et sorties au console */
class Base
{
    public static void main(String[] args) 
    {
        //----------TYPES DE DONN�ES----------//

        // Il faut d�clarer le TYPE des variables
        // Format : <type> <nom> = <valeur assign�e>;

        String s = "45"; // texte -> usage g�n�ral
        int n = 3; // nombres entiers -> pour compter
        double d = 3.1415; // nombres d�cimaux -> pour les calculs

        // conversions de type (texte -> nombre)
        n = Integer.parseInt(s);
        d = Double.parseDouble(s);

        // casting entre types num�riques
        n = (int) 0.691;
        d = (double) 365;


        //-----------SORTIE � LA CONSOLE-----------//
        
        // System.out 
        // est la console d�finit par ton syst�me d'exploitation

        // .println() ajoute automatiquement un retour de ligne
        System.out.println(s); 

        //.print() affiche seulement le texte (sans retour de ligne)
        System.out.print(s); 
        System.out.print(", " + n);
        System.out.print(", " + d + "\n"); // \n est le caract�re pour un retour de ligne

        
        //-----------ENTR�ES � LA CONSOLE------------//

        // Tu dois cr�er UN SEUL objet de type Scanner

        // System.in 
        // est la console d�finit par ton syst�me d'exploitation
        Scanner input = new Scanner(System.in);

        // Indiquer � l'utilisateur d'entrer quelque chose
        System.out.println("Taper un nombre d�cimal ('.' est le symbole d�cimal)");

        // Saisir le texte entr� avec la m�thode .nextLine()
        String getNum = input.nextLine();

        // Convertir le texte capt� en valeur num�rique (de type double)
        // --> cette �tape peut g�n�rer une erreur si le texte n'a pas 
        //     le format appropri�
        double num = Double.parseDouble(getNum);
        
        // Confirmer le r�sultat avec un message � la console
        System.out.println("Tu as inscrit le nombre " + num);
        
        // � la fin de la m�thode main()...
        // fermer/tuer le Scanner qui observe la console / System.in
        input.close(); 
    }
}