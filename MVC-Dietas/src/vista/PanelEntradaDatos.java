package vista;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JComboBox cbEmpleados;
    private JRadioButton jButtonAzucar;
    private JRadioButton jButtonBananos;
    private JRadioButton jButtonPollo;
    private JRadioButton jButtonCereal;
    private JRadioButton jButtonArroz;
    private JRadioButton jButtonMantequilla;
    private JRadioButton jButtonCacao;
    private JRadioButton jButtonMaizena;
    private JRadioButton jButtonmMantequillaM;
    private JRadioButton jButtonPapasF;
    private JRadioButton jButtonLeche;
    private JRadioButton jButtonEnsalada;
    private JRadioButton jButtonCarne;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel lbImagen;
    private ImageIcon iImagen;

    private JTextField textPresupuesto;

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {

        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar los JLabel
        jLabel1 = new JLabel("CREA TU DIETA SALUDABLE AQUI!!!");
        jLabel1.setBounds(60,40,400,40);
        jLabel1.setForeground(Color.GREEN);
        jLabel1.setFont(new Font("Times New Roman", 1, 20));
        this.add(jLabel1);

        this.iImagen = new ImageIcon(this.getClass().getResource("/img/manzana.png"));
        this.lbImagen = new JLabel(this.iImagen);
        this.add(this.lbImagen);
        this.lbImagen.setBounds(710, 50, 250, 150);

        jLabel2 = new JLabel("Elije tu presupuesto:");
        jLabel2.setBounds(60,100,200,20);
        jLabel2.setForeground(Color.black);
        jLabel2.setFont(new Font("Arial", 1, 12));
        this.add(jLabel2);

        jLabel3 = new JLabel("Elije los alimentos de tu despensa");
        jLabel3.setBounds(60,150,200,20);
        jLabel3.setForeground(Color.black);
        jLabel3.setFont(new Font("Arial", 1, 12));
        this.add(jLabel3);

        //Crear y agregar los JtextField
        textPresupuesto = new JTextField("");
        add(textPresupuesto);
        textPresupuesto.setBounds(180,100,120,20);
        textPresupuesto.setFont(new Font("Arial",Font.BOLD,15));
        textPresupuesto.setForeground(Color.black);

        //Checkbox Azucar
        jButtonAzucar = new JRadioButton("Azucar");
        jButtonAzucar.setBounds(50, 180, 120, 20);
        jButtonAzucar.setEnabled(true);
        add(jButtonAzucar);
        jButtonAzucar.setBackground(Color.WHITE);

        //Checkbox cereal
        jButtonCereal = new JRadioButton("Cereal");
        jButtonCereal.setBounds(183, 180, 120, 20);
        jButtonCereal.setEnabled(true);
        add(jButtonCereal);
        jButtonCereal.setBackground(Color.WHITE);

        //Checkbox bananos
        jButtonBananos = new JRadioButton("Bananos");
        jButtonBananos.setBounds(316, 180, 100, 20);
        jButtonBananos.setEnabled(true);
        add(jButtonBananos);
        jButtonBananos.setBackground(Color.WHITE);

        //Checkbox pollo
        jButtonPollo = new JRadioButton("pollo");
        jButtonPollo.setBounds(50, 220, 120, 20);
        jButtonPollo.setEnabled(true);
        add(jButtonPollo);
        jButtonPollo.setBackground(Color.WHITE);

        //Checkbox chocolate
        jButtonArroz = new JRadioButton("Arroz");
        jButtonArroz.setBounds(183, 220, 120, 20);
        jButtonArroz.setEnabled(true);
        add(jButtonArroz);
        jButtonArroz.setBackground(Color.WHITE);

        //Checkbox mantequilla
        jButtonMantequilla = new JRadioButton("Mantequilla");
        jButtonMantequilla.setBounds(316, 220, 100, 20);
        jButtonMantequilla.setEnabled(true);
        add(jButtonMantequilla);
        jButtonMantequilla.setBackground(Color.WHITE);

        //Checkbox cacao
        jButtonCacao = new JRadioButton("Cacao");
        jButtonCacao.setBounds(50, 260, 120, 20);
        jButtonCacao.setEnabled(true);
        add(jButtonCacao);
        jButtonCacao.setBackground(Color.WHITE);

        //Checkbox Maizena
        jButtonMaizena = new JRadioButton("Maizena");
        jButtonMaizena.setBounds(183, 260, 120, 20);
        jButtonMaizena.setEnabled(true);
        add(jButtonMaizena);
        jButtonMaizena.setBackground(Color.WHITE);

        //Checkbox Mani
        jButtonmMantequillaM = new JRadioButton("Mani");
        jButtonmMantequillaM.setBounds(316, 260, 100, 20);
        jButtonmMantequillaM.setEnabled(true);
        add(jButtonmMantequillaM);
        jButtonmMantequillaM.setBackground(Color.WHITE);

        //Checkbox Papas fritas
        jButtonPapasF = new JRadioButton("Papas Fritas");
        jButtonPapasF.setBounds(50, 300, 120, 20);
        jButtonPapasF.setEnabled(true);
        add(jButtonPapasF);
        jButtonPapasF.setBackground(Color.WHITE);

        //Checkbox Leche
        jButtonLeche = new JRadioButton("Leche");
        jButtonLeche.setBounds(183, 300, 120, 20);
        jButtonLeche.setEnabled(true);
        add(jButtonLeche);
        jButtonLeche.setBackground(Color.WHITE);

        //Checkbox ensalada
        jButtonEnsalada = new JRadioButton("Ensalada");
        jButtonEnsalada.setBounds(316, 300, 120, 20);
        jButtonEnsalada.setEnabled(true);
        add(jButtonEnsalada);
        jButtonEnsalada.setBackground(Color.WHITE);

        //Checkbox carne
        jButtonCarne = new JRadioButton("Carne");
        jButtonCarne.setBounds(50, 340, 120, 20);
        jButtonCarne.setEnabled(true);
        add(jButtonCarne);
        jButtonCarne.setBackground(Color.WHITE);

        //Crear y agregar combo lista Empleados
        cbEmpleados = new JComboBox();
        cbEmpleados.setBounds(1000,90,260,40);
        cbEmpleados.setFont(new Font("Arial", 0, 40));
        this.add(cbEmpleados);

        //Método de acceso a la información
        //public String getPresupuesto() {    return textPresupuesto.getText();}

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    //Metodos de acceso

    public boolean getAzucar() { return this.jButtonAzucar.isSelected(); }

    public boolean getCereal() {return this.jButtonCereal.isSelected();}

    public boolean getBananos() {return this.jButtonBananos.isSelected();}

    public boolean getPollo() {return this.jButtonPollo.isSelected();}

    public boolean getArroz() {return this.jButtonArroz.isSelected();}

    public boolean getMantequilla() {return this.jButtonMantequilla.isSelected();}

    public boolean getEnsalada() {return this.jButtonEnsalada.isSelected();}

    public boolean getCarne() {return this.jButtonCarne.isSelected();}

    public boolean getCacao() {return this.jButtonCacao.isSelected();}

    public boolean getLeche() {return this.jButtonLeche.isSelected();}

    public boolean getMaizena() {return this.jButtonMaizena.isSelected();}

    public boolean getMantequillaMani() {return this.jButtonmMantequillaM.isSelected();}

    public boolean getPapasF() {return this.jButtonPapasF.isSelected();}

    public String getPresupuesto()
    {
        return textPresupuesto.getText();
    }

}