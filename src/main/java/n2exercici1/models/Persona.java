package n2exercici1.models;

public class Persona {

    // ATRIBUTS

    private String nom;
    private String cognom;
    private int edat;

    // CONSTRUCTOR

    public Persona (String nom, String cognom, int edat){
        this.nom    = nom;
        this.cognom = cognom;
        this.edat   = edat;
    }

    // GETTERS

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public int getEdat() {
        return edat;
    }

    // ALTRES MÈTODES

    public String toString(){
        return "Nom: " + nom + ", Cognom: " + cognom + ", Edat: " + edat;
    }
}
