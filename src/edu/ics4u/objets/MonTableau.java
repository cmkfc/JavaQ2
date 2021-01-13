package edu.ics4u.objets;
/**
 * contient un tableau et une m�thode pour trouver la valeur maximum
 * 
 * David Crowley, crowlda@ecolecatholique.ca
 * 2020-12-08
 */
public class MonTableau 
{
    // les champs (ou attributs ou valeurs) de la classe
    
    int[] tab;


    // les m�thodes de la classe

    /** obtenir la valeur maximale dans le tableau */
    int getMax()
    {
        int max = this.tab[0];
            // "this." r�f�re � l'objet qui appelle la fonction
            // et utilise donc les valeurs dans le tableau tab
            // sp�cifique � chaque objet en ex�cutant la m�thode
        
        for (int n : this.tab)
        {
            if (n > max) max = n;
        }
        return max;
    }

    /** obtenir l'objet au milieu du tableau */
    int getMid()
    {
        // la valeur � l'indice du milieu, soit longueur / 2
        return this.tab[(this.tab.length-1)/2];
    }
    
    /** D�finir comment afficher l'objet quand on fait un print
     * 
     * Cette m�thode est d�finie par d�faut dans Objet.java... le grand-parent de
     * tous les objets Java, mais produit une s�rie de symboles au lieu de pr�senter
     * de l'information plus pertinente sur les valeurs de l'objet.
     * 
     * Il faut que la signature soit exactement pareil � ce que tu vois ci-dessous
     * 
     * @return le String � afficher -> ne pas imprimer dans cette m�thode, mais
     *          plut�t d�finir le String qui sera afficher dans un print
     */
    public String toString()
    {
        String s = "[";
        for (int i = 0; i < this.tab.length; i++)
        {
            s += i < this.tab.length - 1 ? this.tab[i]+", " : this.tab[i];
        }
        s += "]";
        return s;
    }
}
