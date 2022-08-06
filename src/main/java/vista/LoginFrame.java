package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {

    private Container container = getContentPane();

    LoginFrame() {
        setLayoutManager();
    }

    private void setLayoutManager() {
        container.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
