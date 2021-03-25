package demo;

public class SocorristaMoto extends Moto
{
    public SocorristaMoto(double velocidad, double aceleracion, double anguloDeGiro, String patente)
    {
        super(velocidad, aceleracion, anguloDeGiro, patente);
    }

    public void socorrer(Moto moto)
    {
        System.out.println("Socorriendo moto: " + moto.getPatente());
    }
}
