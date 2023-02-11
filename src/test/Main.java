package test;

import entity.Employe;
import entity.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Service> serviceList = new ArrayList<>() ;
        int nb = 0 ;
        do {
            System.out.println("Donner la taille de la listes des Service");
            Scanner scanner = new Scanner(System.in);
            nb = scanner.nextInt();
        }while (nb<=0) ;
        System.out.println("Remplissage de la listes des Services");
        for (int i = 0; i < nb; i++) {
            Service service = new Service() ;
            Scanner sc = new Scanner(System.in);
            System.out.println("Donner le nom du Service");
            service.setNomS(sc.next());
            service.saise();
            serviceList.add(service);
        }
        System.out.println("Affichage de la listes des Services");
        for (int i = 0; i < serviceList.size(); i++) {
            System.out.println("Les infos du Service N°" + i);
            System.out.println("Nom du service:" + serviceList.get(i).getNomS());
            serviceList.get(i).affiche();
            System.out.println("Le salaire ");
            double sal = serviceList.get(i).salaire() ;
            System.out.println(sal);
        }
        //Employe
        Employe employe = new Employe() ;
        int nb1 = 0 ;
        do {
            System.out.println("Donner la taille de la listes des Employees");
            Scanner scanner = new Scanner(System.in);
            nb1 = scanner.nextInt();
        }while (nb1 <= 0) ;
        int cpt = 0;
        int cpt1 = 0;
        for (int i = 0; i < nb1; i++) {
            employe.saise();
            double sal = employe.salaire() ;

            if (sal > 75000 && employe.getNom().equals("bah") ) {
                cpt++;
            }
            if (employe.age() > 30 || employe.age() < 45){
                cpt1 ++;
            }
        }
        System.out.println("Le nombre d'employés dont le salaire dépasse 7500 et dont le nom est 'Bah' est de: " + cpt);
        System.out.println("Le nombre d'employés dont l'age  est comprise entre 30  et 45 sont: " + cpt1);
    }
}