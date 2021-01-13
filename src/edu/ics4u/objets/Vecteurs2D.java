package edu.ics4u.objets;
/**
 * un objet qui contient des �l�ments de vecteurs en 2 dimensions
 * 
 * David Crowley, crowlda@ecolecatholique.ca
 * 2020-12-08
 */
public class Vecteurs2D 
{
    // les champs (ou attributs ou valeurs) de la classe

    int[] position = {0, 0}; // {px, py}
    int[] vitesse = {0, 0}; // {vx, vy}


    // les m�thodes de la classe

    /** modifier la position de chaque dimension selon le vecteur vitesse */
    void bouger()
    {
        this.position[0] += this.vitesse[0]; // les x
        this.position[1] += this.vitesse[1]; // les y
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
        return String.format("pos=[%d, %d] v=[%d, %d]",
            this.position[0], this.position[1],
            this.vitesse[0], this.vitesse[1]);
    }
}
