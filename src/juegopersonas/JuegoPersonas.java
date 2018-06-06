/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopersonas;

import javax.swing.JOptionPane;

/**
 *
 * @author krist
 */
public class JuegoPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String viva, genero, politico, personajeSeleccionado;

        JOptionPane.showMessageDialog(null,"Elegi un nombre "+ "\nSusana Giménez, Diego Maradona, Carlos Menem, Lilita Carrió, Domingo Sarmiento");
        viva = JOptionPane.showInputDialog("¿Esta viva? \nSi o no");
        genero = JOptionPane.showInputDialog("¿Es mujer?? \nSi o no");
        politico = JOptionPane.showInputDialog("¿Es politico ?? \nSi o no");
        if (viva.equalsIgnoreCase("si")) {
            if (genero.equalsIgnoreCase("si")) {
                if (politico.equalsIgnoreCase("si")) {

                    personajeSeleccionado = "Lilita Carrió";
                } else {

                    personajeSeleccionado = "Susana Giménez";
                }
            } else {
                if (politico.equalsIgnoreCase("si")) {

                    personajeSeleccionado = "Carlos Menem";
                } else {
                    personajeSeleccionado = "Diego Maradona";

                }
            }
        } else {
            personajeSeleccionado = "Domingo Sarmiento";

        }
        JOptionPane.showMessageDialog(null, personajeSeleccionado);

    }

}
