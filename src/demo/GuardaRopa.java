package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GuardaRopa
{
    private int contador;
    private HashMap<Integer, ArrayList<Prenda>> perchero;

    public GuardaRopa()
    {
        contador = 0;
        perchero = new HashMap<>();
    }

    public Integer guardarPrendas(ArrayList<Prenda> listaDePrenda)
    {
        perchero.put(contador, listaDePrenda);
        contador++;

        return contador - 1;
    }

    public void mostrarPrendas()
    {
        for (Map.Entry<Integer, ArrayList<Prenda>> e: perchero.entrySet())
            for (Prenda p: e.getValue())
                System.out.println(e.getKey() + ": " + p.toString());
    }

    public ArrayList<Prenda> devolverPrendas(Integer numero)
    {
        return perchero.get(numero);
    }
}
