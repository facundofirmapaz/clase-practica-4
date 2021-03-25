package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

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
}
