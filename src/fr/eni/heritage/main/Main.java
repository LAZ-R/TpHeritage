package fr.eni.heritage.main;

import fr.eni.heritage.bo.Mouette;

public class Main {

    public static void main(String[] args) {

        Mouette bob = new Mouette(45,"bob");

        System.out.println(bob.toString());

        bob.manger();

    }

}
