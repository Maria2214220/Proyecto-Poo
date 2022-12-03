package vista;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btHacerDieta;

    private JButton btSalir;

    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.white);

        //Crear y agregar boton CalcularSueldo
        btHacerDieta = new JButton("Hagamos tu dieta");
        btHacerDieta.setBounds(10,10,250,30);
        btHacerDieta.setFont(new Font("Arial", 2, 20));
        btHacerDieta.setActionCommand("calcularDieta");
        this.add(btHacerDieta);

        //Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(10,50,170,20);
        btSalir.setActionCommand("salir");
        this.add(btSalir);

    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btHacerDieta.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }


}