package entity;

public class Personne {
    //static
    public  static int AC = 2023 ;
    //attributs
    protected String nom ;
    protected String prenom ;
    protected int anneeNais ;
    //Constructeurs
    public Personne() {}

    public Personne(String nom, String prenom, int anneeNais) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNais = anneeNais;
    }
    //Get & Set

    public static int getAC() {
        return AC;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAnneeNais() {
        return anneeNais;
    }
    //Methodes
    public int age()
    {
       int age  = 2023-this.anneeNais;
        return  age ;
    }
}
