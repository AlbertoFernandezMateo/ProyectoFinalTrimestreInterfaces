package swing_c_p02_FernandezMateoAlberto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDatosCliente extends JPanel implements ActionListener {
    private GridBagLayout layout;
    private GridBagConstraints constraints;
    private JTextField Nombre, Apellidos, DNI, Telefono;

    public PanelDatosCliente(){
        layout = new GridBagLayout();
        this.setLayout(layout);
        this.setPreferredSize(new Dimension(500, 390));
        Nombre = new JTextField(20);
        Apellidos = new JTextField(40);
        DNI = new JTextField(9);
        Telefono = new JTextField(9);
        this.setVisible(true);
        agregarCampos();

    }
    private void agregarCampos(){
        Insets insertar = new Insets(5, 5, 5, 5);

        // Nombre
        constraints = new GridBagConstraints(0, 0, // gridx, gridy
                1, 1, // gridwidth, gridheight
                0, 0, // weightx, weighty
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insertar, 0, 0);
        layout.setConstraints(Nombre, constraints);
        this.add(Nombre);

        // Apellidos
        constraints = new GridBagConstraints(0, 1,
                1, 1,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insertar, 0, 0);
        layout.setConstraints(Apellidos, constraints);
        this.add(Apellidos);

        // DNI
        constraints = new GridBagConstraints(0, 2,
                1, 1,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insertar, 0, 0);
        layout.setConstraints(DNI, constraints);
        this.add(DNI);

        // Telefono
        constraints = new GridBagConstraints(0, 3,
                1, 1,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insertar, 0, 0);
        layout.setConstraints(Telefono, constraints);
        this.add(Telefono);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
