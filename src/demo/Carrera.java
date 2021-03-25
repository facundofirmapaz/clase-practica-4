package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Carrera
{
    private double distancia;
    private String nombre;
    private int cantidadDeVehiculosPermitidos;
    private ArrayList<Vehiculo> vehiculos;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    public Carrera(double distancia, String nombre, int cantidadDeVehiculosPermitidos, SocorristaMoto socorristaMoto, SocorristaAuto socorristaAuto)
    {
        this.distancia = distancia;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.vehiculos = new ArrayList<>();
        this.socorristaAuto = socorristaAuto;
        this.socorristaMoto = socorristaMoto;
    }

    public void darDeAltaAuto(double velocidad, double aceleracion, double anguloDeGiro, String patente)
    {
        if (vehiculos.size() < this.cantidadDeVehiculosPermitidos)
            vehiculos.add(new Auto(velocidad, aceleracion, anguloDeGiro, patente));
    }

    public void darDeAltaMoto(double velocidad, double aceleracion, double anguloDeGiro, String patente)
    {
        if (vehiculos.size() < this.cantidadDeVehiculosPermitidos)
            vehiculos.add(new Moto(velocidad, aceleracion, anguloDeGiro, patente));
    }

    public void eliminarVehiculo(Vehiculo v)
    {
        vehiculos.remove(v);
    }

    public void eliminarVehiculoConPatente(String unaPatente)
    {
        for (int i = 0; i < vehiculos.size(); i++)
        {
            if (vehiculos.get(i).getPatente().equals(unaPatente))
            {
                vehiculos.remove(i);
                break;
            }
        }

    }

    public Vehiculo ganadorCarrera()
    {
        return Collections.max(vehiculos, Comparator.comparing(s -> s.getFormula()));
    }

    public void socorrerAuto(String patente)
    {
        Vehiculo v = getVehiculoByPatente(patente);

        if (v != null && v.getClass() == Auto.class)
            socorristaAuto.socorrer((Auto) v);
        else
            System.out.println("No se encontro auto.");
    }

    public void socorrerMoto(String patente)
    {
        Vehiculo v = getVehiculoByPatente(patente);

        if (v != null && v.getClass() == Moto.class)
            socorristaMoto.socorrer((Moto) v);
        else
            System.out.println("No se encontro moto.");
    }

    private Vehiculo getVehiculoByPatente(String patente)
    {
        int index = -1;
        for (int i = 0; i < vehiculos.size(); i++)
        {
            if (vehiculos.get(i).getPatente().equals(patente))
            {
                index = i;
                break;
            }
        }

        if (index != -1)
            return vehiculos.get(index);
        else
            return null;
    }
}
