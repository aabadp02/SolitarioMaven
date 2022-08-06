package vista;

import javax.swing.*;

/**
 * Vista del menú de login de la aplicación. Este contendrá dos partes: login y sign in
 *
 * @author alejandro.abad
 */

public class VistaLoginImpl {

    /**
     * Método para crear nuestra ventana menú, indicando sus características prinicpales
     */
    public static void menu() {
        LoginFrame frame = new LoginFrame();

        frame.setTitle("Login");
        frame.setVisible(true);
        frame.setBounds(500, 500, 1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
