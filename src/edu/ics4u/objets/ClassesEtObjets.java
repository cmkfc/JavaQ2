package edu.ics4u.objets;
/**
 * Une classe est une d�finition
 * 
 * Un objet est quelque chose qui vit en m�moire, qui est cr�� selon
 * la d�finition dans une classe
 * 
 * Les objets ont donc tous un type qui commence avec une majuscule
 * en Java, parce que le type est le nom de la classe qui d�finit l'objet.
 * 
 * Dans une application, il y a aussi toujours une classe principale qui
 * d�finit la m�thode main(). Cette classe est la classe principale d'une
 * mini application qui inclut aussi les classes MonTableau et Vecteurs2D.
 * 
 * David Crowley, crowlda@ecolecatholique.ca
 * 2020-12-08
 */
public class ClassesEtObjets 
{
    public static void main(String[] args) 
    {
        String s = "";
        /* 
        *   > String est une classe qui d�finit un type
        *   > s est un objet qui applique ces d�finitions et acc�de
        *   aux m�thodes de la classe String
        */


        // Objets de type MonTableau

        MonTableau tableau = new MonTableau(), tab2 = new MonTableau();
            // le mot-cl� new est utilis� pour cr�er un objet � partir d'une
            // d�finition dans la classe
        tableau.tab = new int[] {1, 3, 5, 8, 0};
        tab2.tab = new int[] {-2, 5, -100, 73};
        System.out.printf("max1=%d, milieu=%d\n",tableau.getMax(), tableau.getMid());
        System.out.println(tableau);
        System.out.printf("max2=%d, milieu=%d\n",tab2.getMax(), tab2.getMid());
        System.out.println(tab2);


        // Objet de type Vecteurs2D

        Vecteurs2D balle = new Vecteurs2D();
            // le mot-cl� new est utilis� pour cr�er un objet � partir d'une
            // d�finition dans la classe
        balle.vitesse[1] = 12; // vy... vx reste 0 (comme d�finie dans la classe)
        balle.bouger();
        System.out.println(balle);
        balle.bouger();
        System.out.println(balle);
    }
}
