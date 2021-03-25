package demo;

import java.util.ArrayList;

public class Evento
{
    private ArrayList<Invitado> invitados;
    private ArrayList<FuegoArtificial> fuegosArtificiales;

    public Evento(ArrayList<Invitado> invitados, ArrayList<FuegoArtificial> fuegosArtificiales)
    {
        this.invitados = invitados;
        this.fuegosArtificiales = fuegosArtificiales;
    }

    public void repartirTorta()
    {
        for (Invitado i: invitados)
        {
            i.comerPorcion();
        }
    }

    public void explotarFuegosArtificiales()
    {
        for (FuegoArtificial f: fuegosArtificiales)
        {
            f.explotar();
        }
    }
}
