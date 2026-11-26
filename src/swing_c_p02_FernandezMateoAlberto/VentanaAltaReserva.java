package swing_c_p02_FernandezMateoAlberto;

import javax.swing.*;
import java.awt.*;

public class VentanaAltaReserva extends JDialog {
    public VentanaAltaReserva() {
        setTitle("Alta Reservas");
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setModal(true);

        this.setLayout(new GridLayout(2, 1));
        this.add(new PanelCabecera());
        this.add(new PanelDatosCliente());

        //al final
        this.setVisible(true);
    }
        //Añadir un gridlayout de varias filas y añadir los paneles para ir viendo como quedan para luego con un gridbaglayout le das el ultimo toque

        //this.setLayout(new GridLayout(?,?,?.?)
    }


