package edu.ics4u.poly;

/**
 * POLYMORPHISME - un objet peut b�n�ficier de comportements vari�s
 * au moment de l'ex�cution du programme en utilisant intelligement
 * la hierarchie des classes dans laquelle elle se trouve.
 * <p>
 * Il y a deux techniques pour atteindre le polymorphisme :
 * 1- l'H�RITAGE; 
 * 2- la COMPOSITION.
 * <p>
 * H�RITAGE - L'h�ritage en programmation est comme l'h�ritage chez les 
 * �tres vivants: il y a un arbre g�n�ologique avec des parents et des 
 * enfants. Sauf, en programmation Java, chaque classe peut seulement 
 * avoir UN parent, ce qu'on appelle la "classe m�re". Les enfants s'appellent 
 * les "classes filles".
 * <p>
 * On dit � Java qu'une classe h�rite d'une autre avec le mot-cl� {@code extends}
 * apr�s le nom de la classe dans sa signature. Par exemple :
 * <p>
 * <code> public class Bird extends Animal {}</code>
 * <p>
 * Les classes filles incluent tous les champs et toutes les m�thodes de la
 * classe m�re. Les classes filles peuvent s'en servir directement ou 
 * inclure une nouvelle d�claration pour ces m�thodes (ce qui s'appelle un
 * Override). La d�finition dans la classe fille sera toujours utilis�e si
 * elle est pr�sente, sinon on ira trouver la d�finition dans la classe m�re.
 * <p>
 * Les classes filles peuvent aussi d�finir d'autres champs et m�thodes qui
 * ne sont pas dans la classe m�re, mais c'est g�n�ralement d�conseill�. On
 * verra pourquoi dans quelques exemples.
 * <p>
 * COMPOSITION - la composition est lorsqu'une classe inclut dans ses champs
 * une INTERFACE qui peut avoir plusieurs impl�mentations diff�rentes. Une
 * classe qui b�n�ficie de la composition n'a rien de diff�rent � d�clarer
 * dans sa signature. Tout le travail d'ajouter un comportement polymorphique
 * vient dans la d�claration de l'interface et des classes qui l'impl�mentent.
 * <p>
 * On d�clare une INTERFACE avec la signature :
 * <p>
 * <code> public interface MyInterface {}</code>
 * <p>
 * Le corps d'une interface est simplement une liste de signatures de m�thodes
 * vides comme {@code void crier();}. Noter le {@code ;} � la fin de la ligne. Une
 * interface est UN CONTRAT -> toutes les classes qui impl�mentent une interface
 * DOIVENT �crire un corps pour chaque m�thode annonc�e dans l'interface. C'est
 * comme �a qu'on atteint des comportements diff�rents en incluant une seule
 * interface dans notre classe : on appelle toujours la m�me m�thode, mais l'action
 * qui se produit d�pend de la classe qui a impl�ment� l'interface.
 * <p>
 * UN RETOUR SUR LE POLYMORPHISME
 * <p>
 * Dans les deux cas - de l'h�ritage et de la composition - le polymorphisme est
 * �vident lors de la d�claration d'un objet. Pour l'h�ritage, on a une classe
 * m�re Animal et des classes filles Bird, Dog, Cat. Dans notre application, on
 * d�clare alors nos objets comme ceci :
 * <p>
 * <code>
 * Bird duck = new Bird();<p>
 * Dog ruff = new Dog();<p>
 * Cat whiskers = new Cat();<p>
 * Animal[] menagerie = {duck, ruff, whiskers}; // polymorphisme: Bird est un Animal, etc.
 * </code>
 * <p>
 * Pour la composition, dans notre classe Animal, on d�clare un champs qui est l'interface
 * FaireUnSon, par exemple:
 * <p>
 * <code> public class Animal { FaireUnSon monSon; }</code>
 * <p>
 * Chaque interface peut �tre impl�ment� de diff�rentes fa�ons par des classes qui utilisent
 * le mot-cl� {@code implements} dans la signature, par exemple :
 * <p>
 * <code> 
 * public class Bark implements FaireUnSon { public void monSon() {System.out.prinln("Woof!");} }
 * </code>
 * <p>
 * Si l'interface FaireUnSon est impl�ment� dans des classes Sing, Bark, Meow, on peut alors
 * avoir cette d�claration dans les classes filles Bird, Cat et Dog: 
 * <p>
 * <code>
 * public class Bird extends Animal
 * {
 *      Bird()
 *      {
 *          this.monSon = new Sing();
 *      }
 * }
 * <p>
 * public class Cat extends Animal
 * {
 *      Cat()
 *      {
 *          this.monSon = new Meow();
 *      }
 * }
 * <p>
 * public class Dog extends Animal
 * {
 *      Dog()
 *      {
 *          this.monSon = new Bark();
 *      }
 * }
 * </code>
 */
public class Polymorphisme
{
    public static void main(String[] args) 
    {
        // Voir les classes pour des exemples d'h�ritage ("extends")
        // et de composition (inclusion d'une interface comme champ)
        //Animal unknown = new Animal(); //ne peut pas cr�er un objet � partir d'une classe abstraite
        Bird tweety = new Bird();
        Cat fluffy = new Cat();
        Dog patches = new Dog();

        // polymorphisme via h�ritage
        //      Bird, Cat et Dog sont aussi de type Animal
        //      car ils sont des classes filles de la classe Animal
        Animal[] menagerie = {tweety, fluffy, patches};

        // polymorphisme via composition
        //      On n'a pas �crit de code qui change le comportement
        //      de chaque animal. On a simplement d�clar� une impl�mentation
        //      d'interface diff�rente pour son champ "son"
        for (Animal a : menagerie) a.son.monSon();

        /* 
        La composition est super utile, car le comportement n'est pas cach� dans
        une classe mais bien accessible � toutes les classes et c'est facile
        d'�crire une nouvelle impl�mentation de l'interface si on veut ajouter
        des nouveaux comportements.
        */

        /*
        La fa�on que les classes ont �t� cr�es - avec les comportements impl�ment�s
        via des interfaces - suit une structure de d�veloppement de projets
        orient�s objet qui s'appelle le STRATEGY PATTERN o� chaque interface est
        une des "strat�gies" que les classes utilisent selon leur besoin sp�cifique
        en choissisant l'impl�mentation appropri�e.

        Se rappeler que les strat�gies (interfaces) sont impl�ment�es dans des 
        CLASSES avec le mot-cl� `implements`.
        */
    }
}
