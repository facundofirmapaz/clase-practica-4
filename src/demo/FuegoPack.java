package demo;

import java.util.ArrayList;

public class FuegoPack implements FuegoArtificial
{
    private ArrayList<FuegoArtificial> pack;

    public FuegoPack(ArrayList<FuegoArtificial> pack) {
        this.pack = pack;
    }

    @Override
    public void explotar()
    {
        for (FuegoArtificial f: pack)
        {
            f.explotar();
        }
    }
}
