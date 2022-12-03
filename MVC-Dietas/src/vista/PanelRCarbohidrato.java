package vista;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelRCarbohidrato extends  JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JTextArea taResultado;
    private JScrollPane spResultado;

    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelRCarbohidrato()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar area de texto Resultados
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,215,75);
        taResultado.setFont(new Font("Arial", 1, 13));
        taResultado.setLineWrap(true);
        taResultado.setWrapStyleWord(true);
        this.add(spResultado);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Carbohidratos");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    //Metodos de acceso
    public void mostrarResultado(String msj)
    {
        //taResultado.append(msj + "\n");
        taResultado.setText(msj);
    }
}
