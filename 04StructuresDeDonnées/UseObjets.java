public class UseObjets 
{
    public static void main(String[] args) 
    {
        Objets o = new Objets(); // cr�er un objet avec le mot-cl� new
        
        System.out.println("Quel est ton nom?");
        String nom = o.input.nextLine(); // utiliser le champs input (de type Scanner) de l'objet o (de type Objets)
        System.out.println("Bonjour " + nom);
    }
}
