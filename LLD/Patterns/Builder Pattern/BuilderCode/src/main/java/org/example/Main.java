package org.example;

import org.example.builders.DellBuilder;
import org.example.builders.HPBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new DellBuilder());
        Desktop desktop1 = director.getDesktop();
        desktop1.getConfiguration();
        Director director2 = new Director(new HPBuilder());
        Desktop desktop2 = director2.getDesktop();
        desktop2.getConfiguration();
    }
}