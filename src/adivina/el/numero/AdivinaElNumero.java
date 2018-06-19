/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivina.el.numero;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int h;
        int c;
        String s, p;
        System.out.println("Bienvenido a Adivina el Numero!!!");

        p = JOptionPane.showInputDialog(null, "Escribe 'yo' si quieres adivinar el numero o escribe 'tu' si quieres que yo lo adivine");

        switch (p) {
            case "yo":
                c = (int) (Math.random() * 100) + 1;

                do {
                    s = JOptionPane.showInputDialog("Ingresa tu numero:");
                    h = Integer.parseInt(s);
                    if (h < c) {
                        System.out.println("Tu numero es menor");
                    }
                    if (h > c) {

                        System.out.println("Tu numero es mayor");
                    }

                } while (c != h);
                System.out.println("Adivinaste!");
                break;

            case "tu":
                int a = 1;
                int menor = 100,mayor = 1,x=1;

                do {
                     c = (int) (Math.random() * (menor-mayor)) + mayor;
                    if (menor >= mayor && c<=100 && x!=c) {

                        System.out.println("tu numero es? " + c);
                        String r = JOptionPane.showInputDialog("Tu numero es mayo o menor:");
                        char j = r.charAt(0);
                        x =c;
                        if (j == '+') {
                            mayor = c;
                        }
                        if (j == '-') {
                            menor = c;
                        }
                        if (j == '=') {
                            a = 2;
                        }
                    }
                } while (a != 2);

                System.out.println("Te gane");
                break;
            default:
        }
    }
}


