package fr.eni.heritage.bo;

public class Animal {

    // Attributs d'instances
    protected int taille;
    // Attributs de classe

    // Méthode

    public Animal(int taille) {
        this.taille = taille;
    }

    public void manger() {
        System.out.println("je mange");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "taille=" + taille +
                '}';
    }
}
