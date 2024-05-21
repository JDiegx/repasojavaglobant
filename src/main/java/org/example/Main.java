package org.example;

import org.example.modelos.Panel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Panel panel = new Panel();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la Autonomia del Panel");
        panel.setAutonomia(sc.nextDouble());



    }
}