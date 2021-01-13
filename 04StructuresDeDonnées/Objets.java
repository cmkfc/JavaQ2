/* Introduction au concept d'un objet en programmation

Types natifs : int, double, etc. 
    --> seulement une valeur

Objets : String, Scanner, cette classe "Objets", Integer, etc.
    --> valeurs (champs/attributs) et 
    --> comportements (m�thodes/fonctions)

NOMS DES OBJETS
Commencent par une lettre majuscule (A-Z).
* Variables > commencent avec une lettre minuscule
* Fonctions > lettre minuscule
* Types natifs > lettre minuscule

Par : David Crowley, crowlda@ecolecatholique.ca
2020-11-30

*/

import java.util.HashMap;       // Noter que tous les objets (sauf l'exception String)
import java.util.LinkedList;    // doivent �tre import�s.
import java.util.Random;
import java.util.Scanner;


public class Objets
{
    //---champs (ou attributs ou valeurs) de la classe Objets---
    
    // les champs sont tous des variables
    
    Scanner input = new Scanner(System.in);


    //---m�thodes (comportements) de la classe Objets---

    /* 
       Normalement, quand on d�finit une classe qui sera utilis�e 
        pour d�finir des objets, la classe n'inclut pas de m�thode
        main().
       Une application typique inclut une seule classe principale
        (celle qu'on nomme quand on lance la commande `java`) avec 
        une m�thode main() et les autres classes sont utilis�es pour
        d�finir des objets utiles � l'application.
        
       Voir les exemples o� ClassesEtObjets est la classe principale
        est MonTableau et Vecteurs2D sont des classes qui d�finissent
        des objets pour une structure et une relation plus typique entre
        les classes d'une application.
    */
    
    public static void main(String[] args)
    {
        
        String s = "WoHoOoO!"; // "WoHoOoO!" est la valeur de l'objet s (de type String)

        s = s.toLowerCase(); // toLowerCase() est un comportement d�fini pour l'objet s
        System.out.println(s);


        /*--------QUELQUES OBJETS UTILES-----------*/


        //-----------TABLEAUX-----------------
        // type fixe, taille fixe, valeurs accessibles avec un indice
        // --> pour des structures de taille connue; tr�s rapide


        // Exemple. Tableau intialis� avec des valeurs
        int[] nums = {1,1,2,3,5,8,13,21,34}; // valeurs entre accolades, s�par�es par des virgules 

        for (int i = 0; i < nums.length; i++) // boucle typique pour TRAVAILLER avec les valeurs d'un tableau
        {
            System.out.print(nums[i] + ", "); // acc�der aux valeurs avec un indice, i
            if (i == nums.length - 1) System.out.println(); // retour de ligne � la fin
        }

        // Exemple. Tableau vide de taille 6
        String[] noms = new String[6]; 
        // mot-cl� "new" cr�e un objet du type qui le suit; la taille est sp�cifi�e entre crochets

        noms[0] = "Wesley"; // assigner les valeurs individuelles par la suite
        noms[1] = "Simon";
        noms[2] = "Zachary";
        noms[3] = "Ali";
        noms[4] = "Luccin";
        noms[5] = "Charles";

        for (String n : noms) // boucle pour LIRE les valeurs dans un tableau
        {
            System.out.println(n); // n prend la valeur de chaque �l�ment du tableau, en s�quence
        }


        /*---------AUTRES OBJETS UTILES-----------*/

        // HASHMAP
        // types fixes, taille flexible, valeurs accessibles avec une cl�
        // --> pour acc�der aux valeur par quelque chose d'autre qu'un chiffre
        // --> acc�s rapide avec une taille flexible
        
        HashMap<String, Double> gradeBook = new HashMap<String, Double>();
        // HashMap est un objet qui contient d'autres types d'objets. Des objets comme
        // des HashMap sont appel�s "g�n�riques". On ajoute les types sp�cifiques
        // qu'ils contiennent entre les chevrons <>. Dans le cas de HashMap, il faut
        // indiquer les types pour la cl� (key) et pour la valeur (V) : HashMap<K, V>

        for (String n : noms)
        {
            gradeBook.put(n, 100.0);
        }

        System.out.println(gradeBook.get("Zachary"));
        System.out.println(gradeBook.values());


        // LINKEDLIST
        // types fixes, taille flexible, valeurs accessibles par recherche
        // --> si on doit ajouter/enlever des �l�ments souvent
        // --> si on veut trier souvent les �l�ments (les bouger)

        LinkedList<Integer> values = new LinkedList<Integer>();
        // LinkedList est aussi un type g�n�rique qui peut contenir une
        // vari�t� de types (T) : LinkedList<T>

        Random new_num = new Random(); // un objet pour g�n�rer des valeurs al�atoires

        // Cr�er et afficher une liste de 10 valeurs al�atoires
        for (int i = 0; i < 10; i++) values.add(new_num.nextInt(100));
        System.out.println(values);

        
        // Exemple d'algorithme de tri (Insertion Sort)
        for (int i = 0; i < values.size() - 1; i++) // jusqu'� l'avant-dernier �l�ment
        {
            // l'�l�ment apr�s l'indice i (jusqu'au dernier �l�ment)
            int sortMe = values.get(i+1);

            // comparer des paires de valeurs de reculons � travers la partie d�j� tri�e
            for (int j = i; j >= 0; j--) 
            {
                if (sortMe < values.get(j))
                {
                    // change les valeurs de place
                    int temp = values.get(j);
                    values.set(j, sortMe);
                    values.set(j+1, temp);
                }
                else break; // passe au prochain �l�ment i dans la liste
            }
        }
        System.out.println(values);



        /*----------STRUCTURE<-->LOGIQUE---------------//
                   STRUCTURE<-->ALGORITHME

        Le choix de structure affecte comment tu �cris la logique
        de ton programme. 

        La bonne structure peut simplifier ton code �norm�ment et le 
        rendre plus facile � maintenir/modifier. */

    }
}