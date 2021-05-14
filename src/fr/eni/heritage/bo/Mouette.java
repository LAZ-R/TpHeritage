package fr.eni.heritage.bo;

public class Mouette extends Animal {

    private String nom;

    public Mouette(int taille, String nom) {
        super(taille);
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Mouette{" +
                "nom='" + nom + '\'' +
                "taille='" + super.taille + '\'' +
                '}';
    }

    @Override
    public void manger() {
        System.out.printf("Je suis %s, je suis une mouette, et je mange !", this.nom);
    }
}
