package co.edu.uniquindio.proyectofinal.modulo.cafeteria;

public class Caja {
    private double dineroInicial;
    private double dineroFinal;

    public Caja(double dineroInicial, double dineroFinal) {
        this.dineroInicial = dineroInicial;
        this.dineroFinal = dineroFinal;
    }

    public double getDineroInicial() {
        return dineroInicial;
    }

    public void registrarDineroInicial(double dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    public double getDineroFinal() {
        return dineroFinal;
    }

    public void registrarDinerFinal(double dineroFinal) {
        this.dineroFinal = dineroFinal;
    }
}
