/**
 * Exemples de bool�ens et de l'op�ration ternaire pour simplifier nos
 * conditions
 */
public class Booleans {
    public static void main(String[] args) {
        /*
            Un bool�en peut seulement avoir 2 valeurs : true ou false

            UTILIT� : indicateur / drapeau -> signaler un �tat

            NOMS : commencent g�n�ralement avec "est" ou "is"
        */

        boolean isOn = false;

        // code qui duplique le comportement d'un bouton (un "toggle swithch")
        if (isOn) // isOn doit �tre true
        {
            isOn = false;
            System.out.println("Off");
        }
        else // isOn est false
        {
            isOn = true;
            System.out.println("On");
        }

        isOn = toggle(isOn);
        System.out.println(isOn);
        isOn = toggle(isOn);
        System.out.println(isOn);


        /*
            Op�ration ternaire -> fa�on court de remplacer un if-else

            Exigence -> le r�sultat doit �tre assign� � une variable o� utiliser par le
            programme directement

            STRUCTURE
            <expression conditionnelle > ? <valeur si vrai> : <valeur si faux>

            IMPL�MENTATION -> les chiffriers comme Excel et Sheets
            =if(<expression conditionnelle>; <valeur si vrai>; <valeur si faux>)
        */

        String lightStatus = isOn ? "On" : "Off";
        System.out.println(lightStatus);
        isOn = toggle(isOn);
        System.out.println(isOn ? "On" : "Off");

        int a = 20;
        int b = 15;
        int biggest = a >= b ? a : b;
        System.out.printf("Nombres : %d, %d -> le plus grand : %d %d\n", a, b, biggest);
        /* printf te permet d'ins�rer des valeurs dans un String

           Utiliser :
            %d pour un int (et les autres comme long, byte)
            %f pour un double (ou un float)
            %s pour un String
            %b pour un boolean
            \n pour un retour de ligne
            \t pour une tabulation
        */
    }

    /** M�thode simple pour inverser la valeur d'un bool�en, true <--> false */
    static boolean toggle(boolean b)
    {
        return !b;
    }
    
}
