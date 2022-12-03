package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    // Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelRDieta miPanelRDieta;
    public PanelRCarbohidrato miPanelRCarbohidrato;
    public PanelRCostos miPanelRCostos;


    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public VentanaPrincipal()
    {
        //Definición del layout de la ventana
        this.setLayout(null);

        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(200,350,300,100);
        this.add(miPanelOperaciones);

        //Creación y adición del PanelRDieta
        miPanelRDieta = new PanelRDieta();
        miPanelRDieta.setBounds(450,50,250,230);
        this.add(miPanelRDieta);

        //Creación y adición del PanelRCarbohidrato
        miPanelRCarbohidrato = new PanelRCarbohidrato();
        miPanelRCarbohidrato.setBounds(720,230,230,100);
        this.add(miPanelRCarbohidrato);

        //Creación y adición del PanelRCostos
        miPanelRCostos = new PanelRCostos();
        miPanelRCostos.setBounds(720,330,230,100);
        this.add(miPanelRCostos);

        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(5,5,990,465);//465
        this.add(miPanelEntradaDatos);


        //Caracteristicas de la ventana
        this.setTitle("Dieta");
        this.setSize(1015,510);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}