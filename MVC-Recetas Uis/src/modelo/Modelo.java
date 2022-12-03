package modelo;

public class Modelo
{
    private double cal1=0;
    private double cal2=0;
    private double cal3=0;
    private double cal4=0;
    private double cal5=0;
    private double Suma;

    public Modelo() {}

    public void setcal1(double pCal1) {this.cal1 = pCal1;}
    public void setcal2(double pCal2) {this.cal2 = pCal2;}
    public void setcal3(double pCal3) {this.cal3 = pCal3;}
    public void setcal4(double pCal4) {this.cal4 = pCal4;}
    public void setcal5(double pCal5) {this.cal5 = pCal5;}

    public void CalcularSuma() {
        this.Suma = (cal1+cal2+cal3+cal4+cal5);
    }

    public double getSuma() {
        return this.Suma;
    }

}
