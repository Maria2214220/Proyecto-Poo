package ejecutable;

import controlador.Controlador;
import vista.VentanaPrincipal;
import modelo.Modelo;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Modelo miModelo = null;
        Controlador miControlador = new Controlador(miVentana,miModelo);
    }    
}