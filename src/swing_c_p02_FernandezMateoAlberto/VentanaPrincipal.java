package swing_c_p02_FernandezMateoAlberto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.*;

public class VentanaPrincipal extends JFrame  implements ActionListener{
    private JMenuBar barraJMenuBar;
    private JMenu archivo, registro, ayuda;
    private JMenuItem itemAbrir, itemGuardar, itemSalir, itemAltaReserva, itemBajasRevservas, itemAcercaDe;
    JButton botonAltaReserva, botonBajaReserva;
    //constructor
    public VentanaPrincipal() {
        super("Gestion Hotel Gran Huercal de Almeria");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);


        //al final
        this.setVisible(true);
        this.Menu();
    }

    private void Menu() {
        Container ventana = getContentPane();
        ventana.setLayout(null);

        //creamos
        barraJMenuBar = new JMenuBar();
        archivo = new JMenu("Archivo");
        registro = new JMenu("Registro");
        ayuda = new JMenu("Ayuda");


        itemAbrir = new JMenuItem("Abrir");
        itemGuardar = new JMenuItem("Guardar");
        itemSalir = new JMenuItem("Salir");
        itemAltaReserva = new JMenuItem("Alta Reservas");
        itemBajasRevservas = new JMenuItem("Baja Reservas");
        itemAcercaDe = new JMenuItem("Acerca De");


        //añadimos
        barraJMenuBar.add(archivo);
        barraJMenuBar.add(registro);
        barraJMenuBar.add(ayuda);


        //Mnemonic
        archivo.setMnemonic(KeyEvent.VK_A);
        registro.setMnemonic(KeyEvent.VK_R);
        ayuda.setMnemonic(KeyEvent.VK_D);


        archivo.add(itemAbrir);
        archivo.add(itemGuardar);
        archivo.add(itemSalir);
        registro.add(itemAltaReserva);
        registro.add(itemBajasRevservas);
        ayuda.add(itemAcercaDe);


        //aceleradores
        itemAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
        itemGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        itemSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_DOWN_MASK));
        itemAltaReserva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        itemBajasRevservas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_DOWN_MASK));
        itemAcercaDe.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_DOWN_MASK));


        //acciones
        itemSalir.addActionListener(e -> this.dispose());
        itemAbrir.addActionListener(e -> abrirArchivoNativo());
        itemGuardar.addActionListener( e -> guardarComoNativo() );
        itemBajasRevservas.addActionListener(e -> JOptionPane.showMessageDialog(this, "No está desarrollada."));
        itemAcercaDe.addActionListener(e -> JOptionPane.showMessageDialog(this, "Nombre de la empresa: Hotel Gran Huercal de Almeria\n Versión: 1.0\n Autor: Alberto Fernandez Mateo\n Curso: 2 DAM"));
        this.setJMenuBar(barraJMenuBar);

        botonBajaReserva= new JButton();
        botonBajaReserva.setText(" Boton Baja Reserva");
        botonBajaReserva.setBounds(152, 170, 230, 80);
        botonBajaReserva.addActionListener(this);

        botonAltaReserva= new JButton();
        botonAltaReserva.setText("Boton Alta Reserva");
        botonAltaReserva.setBounds(402, 170, 230, 80);
        botonAltaReserva.addActionListener(this);
        getRootPane().setDefaultButton(botonAltaReserva);


        ventana.add(botonBajaReserva);
        ventana.add(botonAltaReserva);

        botonBajaReserva.addActionListener(e -> JOptionPane.showMessageDialog(this, "Esta opción no esta implementada todavía."));

    }


    // Mostrar diálogo para abrir archivos

    // Diálogo nativo para abrir un archivo
    private void abrirArchivoNativo() {
        FileDialog dialogo = new FileDialog(this, "Abrir archivo", FileDialog.LOAD);
        dialogo.setVisible(true);
        if (dialogo.getFile() != null) {
            File archivo = new File(dialogo.getDirectory(), dialogo.getFile());
            System.out.println("Archivo seleccionado: " + archivo.getAbsolutePath());
        }
    }

    private void guardarComoNativo() {
        FileDialog dialogo = new FileDialog(this, "Guardar como...", FileDialog.SAVE);
        dialogo.setFile("documento.txt");
        dialogo.setVisible(true);
        if (dialogo.getFile() != null) {
            File archivo = new File(dialogo.getDirectory(), dialogo.getFile());
            System.out.println("Guardar como: " + archivo.getAbsolutePath());
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}