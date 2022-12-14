package controlador;

import modelo.Modelo;
import vista.VentanaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private Modelo model;

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Modelo miModelo)
    {
        this.venPrin = pVenPrin;
        this.model = miModelo;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        if(comando.equals("calcularDieta"))
        {
            int presupuesto = Integer.parseInt(this.venPrin.miPanelEntradaDatos.getPresupuesto());
            if(presupuesto >= 20000)
            {
                if (venPrin.miPanelEntradaDatos.getCacao() && venPrin.miPanelEntradaDatos.getBananos() && venPrin.miPanelEntradaDatos.getLeche() && venPrin.miPanelEntradaDatos.getMantequillaMani()) {
                    model = new Modelo();
                    model.setcal1(32);
                    model.setcal2(117);
                    model.setcal3(119);
                    model.setcal4(89);
                    model.CalcularSuma();
                    venPrin.miPanelRCarbohidrato.mostrarResultado("El numero de calorias que consume es de " + model.getSuma());
                    model = new Modelo();
                    model.setcal1(8800);
                    model.setcal2(2000);
                    model.setcal3(4000);
                    model.setcal4(10000);
                    model.CalcularSuma();
                    venPrin.miPanelRCostos.mostrarResultado("El costo de preparar esta comida es de " + model.getSuma());
                    venPrin.miPanelRDieta.mostrarResultado("""
                            MATEADA DE CHOCOLATE
                                                        
                            Ingredientes:
                            1. 1 1/2 de cucharadas de cacao
                            2. 1 taza de leche entera
                            3. 1 1/2 platanos maduros
                            4. 1 cucharada de mantequilla de mani
                                                        
                            Preparacion:
                            Coloca en la licuadora platansos congelados con la crema de man??, la leche y el polvo de chocolate mezclando bien hasta que quede una consistencia densa como un helado un poco liquido, si te gusta menos denso agrega un chorrito mas de leche y disfruta de tu malteada
                                                        
                                                        
                            """);
                }
            }
            if(presupuesto >= 10000) {
                if (venPrin.miPanelEntradaDatos.getLeche() && venPrin.miPanelEntradaDatos.getMaizena() && venPrin.miPanelEntradaDatos.getAzucar()) {
                    model = new Modelo();
                    model.setcal1(155);
                    model.setcal2(76);
                    model.setcal3(120);
                    model.setcal4(37);
                    model.CalcularSuma();
                    venPrin.miPanelRCarbohidrato.mostrarResultado("El numero de calorias que consume es de " + model.getSuma());
                    model = new Modelo();
                    model.setcal1(4000);
                    model.setcal2(10000);
                    model.setcal3(4000);
                    model.setcal4(0);
                    model.CalcularSuma();
                    venPrin.miPanelRCostos.mostrarResultado("El costo de preparar esta comida es de " + model.getSuma());
                    venPrin.miPanelRDieta.mostrarResultado("""
                            POSTRE DE VAINILLA
                                                        
                            Ingredientes:
                            1. 1 vaso de leche
                            2. 2 cucharadas de maizena
                            3. 2 cucharadas de azucar
                            4. 1 cuharada de escencia de vainilla
                                                        
                            Preparacion:
                            1. servir medio vaso de leche y agregar las 2 cucharadas de maizena, mezclar hasta que no queden grumos
                            2. Colocar la leche restante junto con el az??car y esencia de vainilla a fuego lento en una cacerola.
                            3. Una vez que est?? bien caliente, agregamos la preparaci??n anterior de la taza y revolvemos.
                            4. Cuando est?? bien espeso y por hervir, sacarlo del fuego. Seguir batiendo (con cuchara de madera) hasta que baje la temperatura.
                            5. Dejar enfriar y disfruta de este postre.
                                                        
                                                        
                            """);
                }
            }
            if(presupuesto >= 30000) {
                if (venPrin.miPanelEntradaDatos.getArroz() && venPrin.miPanelEntradaDatos.getPapasF() && venPrin.miPanelEntradaDatos.getCarne() && venPrin.miPanelEntradaDatos.getEnsalada()) {
                    model = new Modelo();
                    model.setcal1(125);
                    model.setcal2(156);
                    model.setcal3(252);
                    model.setcal4(217);
                    model.CalcularSuma();
                    venPrin.miPanelRCarbohidrato.mostrarResultado("El numero de calorias que consume es de " + model.getSuma());
                    model = new Modelo();
                    model.setcal1(4000);
                    model.setcal2(10000);
                    model.setcal3(15000);
                    model.setcal4(7000);
                    model.CalcularSuma();
                    venPrin.miPanelRCostos.mostrarResultado("El costo de preparar esta comida es de " + model.getSuma());
                    venPrin.miPanelRDieta.mostrarResultado("""
                            ALMUERZO TRADICIONAL
                                                        
                            Ingredientes:
                            1. 50 GRAMOS DE ARROZ
                            2. 50 gramos de papas fritas (156 calor??as)
                            3. 1 filete de carne (252 calor??as)??
                            4. ensalada (217 calor??as)
                                                        
                            Preparacion:
                            Arroz blanco: utiliza una olla amplia que no sea muy alta. Coloca entonces toda el agua junto con la sal y calienta a fuego medio-alto hasta que rompa un hervor.
                            A continuaci??n a??ade el arroz y baja a fuego medio hasta que se evapore todo el agua de la superficie, sin tapar la olla.
                            Para cocinar este tipo de arroz no hace falta que muevas el arroz, simplemente ??chalo en la olla y continua con la cocci??n. Si quieres a??adir alguna especia o sabor extra para el arroz blanco, puedes a??adirlas al agua antes de poner el arroz.
                            Una vez evaporada el agua, a??ade el aceite, tapa la olla y termina de cocinar el arroz a fuego muy bajo, con la llama al m??nimo, durante unos 10-15 minutos.
                            Y esta es la forma m??s f??cil de cocinar un arroz blanco perfecto.
                            Papas a la francesa:
                            1. Lo primero a tener en cuenta,como ya dec??a, es el corte. El grosor del mismo s?? importa. Y mucho. Pelamos la patata y la cortamos en forma de bastoncitos. El tama??o del mismo debe ser de alrededor de 1 cent??metro de grosor. Est?? es el tama??o estandar y m??s com??n en una patata frita. Con ??l, nos aseguramos que tenga una carcasa crujiente y un interior blandito y sabroso.
                            2. El siguiente paso, es lavar las patatas. Con ello, eliminaremos el exceso almid??n que contienen y conseguiremos que, no se peguen entre s?? y que nos queden m??s crujientes. As?? que las colocamos sobre una escurridera y las lavamos con abundante agua.
                            3. Les escurrimos bien el exceso de agua y procedemos a fre??r las patatas. Y lo vamos a hacer en dos fases muy diferenciadas entre s??. En la primera,ponemos en una sart??n o freidora abundante aceite de oliva a fuego medio; el suficiente como para que cubra por completo las patatas, y las metemos dentro. Dejamos que vayan cocin??ndose cerca de 10 minutos,dependiendo de la dureza de la patata. Cuando est?? blanda, la retiramos del aceite y las dejamos m??nimo 30 minutos para que se enfr??en. Este tiempo de reposo, es crucial as?? que, si tienes tiempo, no te lo saltes.
                            4. Pasado este tiempo, calentamos el aceite al m??ximo y metemos en ??l las patatas. Cuando est??n doradas y a nuestro gusto, las sacamos. Alrededor de dos minutos. Las ponemos sobre papel absorbente y les echamos la sal.
                                                                                                               
                            Filete de carne: 
                            1. Agarrar un filete de carne de res y adobarlo con sala barbecue y sal al gusto.
                            2. Calentar aceite en una sarten a fuego medio.
                            3. Echar la carne adobada en la sarten y asar por cada lado durante 7 minutos.
                            4. Servir
                            Ensalada: 
                            1. picar 4 rodajas de tomate 50 gramos de aguacate y echar algunos aros de cebolla en un bowl peque??o.
                            2. agregar sal , una cucharadita de aceite de oliva y revolver.
                            3. servir.
                                                     
                                                        
                            """);
                }
            }

            else
            {
                venPrin.miPanelRDieta.mostrarResultado("Presupuesto insuficiente o no se encuentran recetas ");
                venPrin.miPanelRCarbohidrato.mostrarResultado("");
                venPrin.miPanelRCostos.mostrarResultado("");
            }

        }

        //Salir
        if(comando.equals("salir"))
        {
            System.exit(0);
        }  
    }
}