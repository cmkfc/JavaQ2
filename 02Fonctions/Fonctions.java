/*
ABSTRACTION
Cacher les d�tails de comment quelque chose fonctionne derri�re une structure plus simple
et facile � manipuler.


FONCTION
Abstraction qui cache un paquet de d�clarations derri�re un seul nom intuitif.
> On appelle seulement le nom et le programme fera tout ce que le nom cache.


SIGNATURE d'une fonction
------------------------
<type de retour> <nom>(<param�tres>)

Le fonctions peuvent :
* avoir ou ne pas avoir de param�tres. Il faut inclure des parenth�ses 
    vides () apr�s le nom s'il n'y a aucun param�tre.
* avoir ou ne pas avoir de valeur de retour. Il faut sp�cifier le 
    type "void" s'il n'y a aucune valeur de retour.


STRUCTURE d'une fonction
------------------------
signature
{
    corps -> le code � ex�cuter en appelant la fonction
             (remarquer que le corps est enferm� par une
              paire d'accolades {})
}

*/

public class Fonctions
{
    /** Main est une fonction
     * Il ne retourne rien... En Java, il faut sp�cifier le type "void" dans ce cas
     * Il a un param�tre de type String[] qui s'appelle args
    */
    public static void main(String[] args) 
    {    
        System.out.println(3);
        /*  La "signature" de println dans ce cas :
            void java.io.PrintStream.println(int x)

            PARAM�TRE. Le param�tre de la fonction println est int x
            ARGUMENT. Quand on appelle println, on lui a donn� la valeur 3. La valeur pass�e
            quand on appelle une fonction s'appelle l'argument.

            En appelant la fonction, on compl�te l'assignation de variable suivante :
            int x = 3;
        */

        // appel de la fonction funcNoParameters
        funcNoParameters();

        // appel de la fonction funcOneParams
        funcOneParam(5);

        // appel de la fonction funcTwoParams
        funcTwoParam(13, 21);

        // appel de la fonction funcTwoParamsWithReturn
        int sum = funcTwoParamWithReturn(13, 21);
        funcOneParam(sum); // appel "bonus" de funcOneParam

    }

    /** Notre propre fonction qui ne prend pas de param�tre 
     * 
     * On le d�finit � l'int�rieur de la classe, mais � l'ext�rieur de main.
     * L'ordre ne d�range pas parce que Java est une langue compil�e.
    */
    static void funcNoParameters()
    {
        System.out.println("You called a function with no parameters and no return value.");
    }

    /** Notre propre fonction avec un param�tre */
    static void funcOneParam(int a)
    {
        System.out.println("double your value is: " + 2*a);
    }

    /** Notre propre fonction avec deux param�tres 
     * les param�tres sont s�par�s par des virgules entre les parenth�ses
    */
    static void funcTwoParam(int a, int b)
    {
        int sum = a + b;
        System.out.println("the sum of your values is: " + sum);
    }

    /** Notre propre fonction avec deux param�tres ET une valeur de retour
     * les param�tres sont s�par�s par des virgules entre les parenth�ses
     * 
     * On est limit� � UNE SEULE VALEUR DE RETOUR par fonction
    */
    static int funcTwoParamWithReturn(int a, int b)
    {
        return a + b;
    }
}