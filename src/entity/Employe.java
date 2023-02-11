package entity;

import java.util.Scanner;

public class Employe extends Personne{
    //
    private int tauxHoraire ;
    private int nbHeures ;
    private static int Prime = 15000;
    private static int Retenu = 5000;
    //Constructeurs

    public Employe() {}

    public Employe(int tauxHoraire, int nbHeures) {
        this.tauxHoraire = tauxHoraire;
        this.nbHeures = nbHeures;
    }
    public Employe(String nom, String prenom, int anneeNaiss, int tauxHoraire, int nbHeures) {
        super(nom, prenom, anneeNaiss);
        this.tauxHoraire = tauxHoraire;
        this.nbHeures = nbHeures;
    }
    //Get & Set

    public int getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(int tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public int getNbHeures() {
        return nbHeures;
    }

    public void setNbHeures(int nbHeures) {
        this.nbHeures = nbHeures;
    }

    public static int getPrime() {
        return Prime;
    }

    public static void setPrime(int prime) {
        Prime = prime;
    }

    public static int getRetenu() {
        return Retenu;
    }

    public static void setRetenu(int retenu) {
        Retenu = retenu;
    }
    //Methodes
    public void saise()
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Donner le nom de la Personne");
        nom = sc.next();
        System.out.println("Donner le prenom de la Personne");
        prenom = sc.next();
        System.out.println("Donner l' annee de naissance de la Personne");
        anneeNais = sc.nextInt();
        do{
            System.out.println("Donner le taux d'horaires de l'employe");
            tauxHoraire = sc.nextInt();
        }while (tauxHoraire < 3000 || tauxHoraire > 7000) ;
        do{
            System.out.println("Donner le nombre d'heures de l'employe");
            nbHeures = sc.nextInt();
        }while (nbHeures < 2 || nbHeures >100) ;
    }
    //Affichage des employees
    public void affiche()
    {
        System.out.println("Les infos de l'employe sont:");
        System.out.println("Nom:"+this.nom);
        System.out.println("Prenom:"+this.prenom);
        System.out.println("Age:"+age());
        System.out.println("Taux Horaires:"+this.tauxHoraire);
        System.out.println("Nombre Heures:"+this.nbHeures);
        System.out.println("Prime :"+getPrime());
        System.out.println("Retenu :"+getRetenu());
    }
    public int salaire()
    {
        return  this.nbHeures*this.tauxHoraire;
    }
}
