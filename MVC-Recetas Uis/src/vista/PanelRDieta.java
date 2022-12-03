package vista;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelRDieta extends JPanel
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
    public PanelRDieta()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar area de texto Resultados
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,230,200);
        taResultado.setFont(new Font("Arial", 1, 13));
        taResultado.setLineWrap(true);
        taResultado.setWrapStyleWord(true);
        this.add(spResultado);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Dieta");
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