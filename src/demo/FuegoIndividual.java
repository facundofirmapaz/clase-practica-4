package demo;

public class FuegoIndividual implements FuegoArtificial
{

    private String sonido;

    public FuegoIndividual(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public void explotar()
    {
        System.out.println(sonido);
    }
}
