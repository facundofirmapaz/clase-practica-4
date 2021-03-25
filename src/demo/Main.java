package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Properties;

public class Main {

    public static void marteGroup()
    {
        ArrayList<Invitado> invitados = new ArrayList<>();

        for (int i = 0; i < 100; i++)
        {
            if (i % 2 == 0)
                invitados.add(new InvitadoMeli());
            else
                invitados.add(new InvitadoStandard());
        }

        ArrayList<FuegoArtificial> fuegosInd = new ArrayList<>();
        fuegosInd.add(new FuegoIndividual("PIM"));
        fuegosInd.add(new FuegoIndividual("PAM"));
        fuegosInd.add(new FuegoIndividual("PUM"));
        fuegosInd.add(new FuegoIndividual("PUM PUM PUM"));


        ArrayList<FuegoArtificial> paraPack = new ArrayList<>();
        paraPack.add(new FuegoIndividual("PIM PACK"));
        paraPack.add(new FuegoIndividual("PAM PACK"));
        paraPack.add(new FuegoIndividual("PUM PACK"));

        FuegoPack pack = new FuegoPack(paraPack);

        fuegosInd.add(pack);


        Evento e = new Evento(invitados, fuegosInd);

        MarteGroup.apagarVelas(e);

    }

    public static void primerPractica() throws IOException {
        Properties propiedades = new Properties();

        propiedades.load(new FileInputStream("MiFactory.properties"));


        //MiFactory.getInstance(propiedades.getProperty("sorter"));

        Integer [] arr = new Integer[100];

        int num = 100;
        for (int i = 0; i < arr.length; i++)
            arr[i] = num--;

        Comparator<Integer> c = (x, y) -> x - y;

        QuickSortSorterImple<Integer> qs = new QuickSortSorterImple<>();
        HeapSortSorterImple<Integer> hs = new HeapSortSorterImple<>();

        //hs.sort(arr, c);

        qs.sort(arr, c);

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void saveTheRopa()
    {
        ArrayList<Prenda> prendas = new ArrayList<>();

        prendas.add(new Prenda("Inside", "Remera"));
        prendas.add(new Prenda("Levys", "Jean"));

        GuardaRopa gr = new GuardaRopa();

        int codigo = gr.guardarPrendas(prendas);
        System.out.println(codigo);

        gr.mostrarPrendas();

        gr.devolverPrendas(codigo);


    }

    public static void dakar()
    {

        SocorristaAuto socorristaAuto = new SocorristaAuto(10, 20, 30, "SOC123");
        SocorristaMoto socorristaMoto = new SocorristaMoto(10, 20, 30, "SOC456");

        Carrera carrera = new Carrera(200, "Dakar", 4, socorristaMoto, socorristaAuto);

        carrera.darDeAltaAuto(300, 30, 45, "ABC123");
        carrera.darDeAltaAuto(10000, 30, 45, "ABC456");
        carrera.darDeAltaAuto(10, 30, 45, "ABC789");
        carrera.darDeAltaMoto(10, 30, 45, "MOT123");


//        Vehiculo v = carrera.ganadorCarrera();
//
//        carrera.eliminarVehiculo(v);
//
//        Vehiculo v1 = carrera.ganadorCarrera();
//
//        System.out.println(v1.toString());

        //carrera.socorrerAuto("ABC123");
        carrera.socorrerMoto("MOT123");
    }

    public static void main(String[] args)
    {
        //marteGroup();

        //saveTheRopa();

        dakar();

    }
}
