package entity;

import java.util.List;

public class Service extends Employe{
    //attributs
    private String nomS ;
    private List<Employe> employeList ;
    //Constrcuteurs

    public Service() {
    }

    public Service(String nomS, List<Employe> employeList) {
        this.nomS = nomS;
        this.employeList = employeList;
    }

    public Service(int tauxHoraire, int nbHeures, String nomS, List<Employe> employeList) {
        super(tauxHoraire, nbHeures);
        this.nomS = nomS;
        this.employeList = employeList;
    }

    public Service(String nom, String prenom, int anneeNaiss, int tauxHoraire, int nbHeures, String nomS, List<Employe> employeList) {
        super(nom, prenom, anneeNaiss, tauxHoraire, nbHeures);
        this.nomS = nomS;
        this.employeList = employeList;
    }
    //Get & Set


    public String getNomS() {
        return nomS;
    }

    public void setNomS(String nomS) {
        this.nomS = nomS;
    }

    public List<Employe> getEmployeList() {
        return employeList;
    }

    public void setEmployeList(List<Employe> employeList) {
        this.employeList = employeList;
    }
}
