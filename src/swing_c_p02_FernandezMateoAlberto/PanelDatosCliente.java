package swing_c_p02_FernandezMateoAlberto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class PanelDatosCliente extends JPanel implements ActionListener, FocusListener {
    private GridBagLayout layout;
    private GridBagConstraints constraints;
    private JTextField Nombre, Apellidos, DNI, Telefono;
    private JLabel lblNombre, lblApellidos, lblDNI, lblTelefono;

    public PanelDatosCliente(){
        iniciarDatosCliente();
        agregarCampos();
        DNI.addFocusListener(this);
        Telefono.addFocusListener(this);

    }

    private void iniciarDatosCliente(){
        layout = new GridBagLayout();
        this.setLayout(layout);
        this.setPreferredSize(new Dimension(600, 200));
        lblNombre = new JLabel("Nombre");
        lblApellidos = new JLabel("Apellidos");
        lblDNI = new JLabel("DNI");
        lblTelefono = new JLabel("Telefono");
        Nombre = new JTextField(20);
        Apellidos = new JTextField(40);
        DNI = new JTextField(9);
        Telefono = new JTextField(9);
        this.setVisible(true);
    }

    private void agregarCampos(){
        Insets insert = new Insets(0, 0, 0, 0);

        // Nombre
        constraints = new GridBagConstraints(0, 0,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(lblNombre, constraints);
        this.add(lblNombre);

        constraints = new GridBagConstraints(8, 0,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(Nombre, constraints);
        this.add(Nombre);

        // Apellidos
        constraints = new GridBagConstraints(0, 4,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(lblApellidos, constraints);
        this.add(lblApellidos);

        constraints = new GridBagConstraints(8, 4,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(Apellidos, constraints);
        this.add(Apellidos);

        // DNI
        constraints = new GridBagConstraints(0, 8,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(lblDNI, constraints);
        this.add(lblDNI);

        constraints = new GridBagConstraints(8, 8,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(DNI, constraints);
        this.add(DNI);

        // Telefono
        constraints = new GridBagConstraints(0, 12,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(lblTelefono, constraints);
        this.add(lblTelefono);

        constraints = new GridBagConstraints(8, 12,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(Telefono, constraints);
        this.add(Telefono);
    }
    private boolean verificadorDNI(){
        boolean valido = false;
        if (DNI.getText().matches("[0-9]{8}[A-Z]")){
            valido = true;
        }
        return valido;
    }

    private boolean verificadorTelefono(){
        boolean valido = false;
        if (Telefono.getText().matches("[0-9]{9}")){
            valido = true;
        }
        return valido;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() == Telefono){
            Telefono.setBorder(BorderFactory.createLineBorder(verificadorTelefono() ? Color.GREEN : Color.RED));
        }

        if (e.getSource() == DNI){
            DNI.setBorder(BorderFactory.createLineBorder(verificadorDNI() ? Color.GREEN : Color.RED));
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == Telefono){
            Telefono.setBorder(BorderFactory.createLineBorder(verificadorTelefono() ? Color.GREEN : Color.RED));
        }

        if (e.getSource() == DNI){
            DNI.setBorder(BorderFactory.createLineBorder(verificadorDNI() ? Color.GREEN : Color.RED));
        }

    }
}