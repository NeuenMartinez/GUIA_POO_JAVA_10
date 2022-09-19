package Servicios10;

import Entidades10.Arreglo;
import java.text.DecimalFormat;
import static java.util.Arrays.sort;

/**
 *
 * @author NeuenMartinez
 */
public class ArregloService {
    DecimalFormat df = new DecimalFormat("0.00");
    public void crearArreglo(Arreglo A) {
        double[] aux = new double[50];
        for (int i = 0; i < 50; i++) {
            aux[i] = (Math.random() * 10);
        }
        A.setA(aux);
    }

    public void ordenar(Arreglo A) {
        sort(A.A);
    }

    public void llenarB(Arreglo B) {
        double[] aux = new double[20];
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                aux[i] = B.getA()[i];
            } else {
                aux[i] = 0.5;
            }
            B.setB(aux);
        }
    }

    public void imprimir(Arreglo array) {
        System.out.println("El primer arreglo ordenado es:");
        for (int i = 0; i < 50; i++) {
            System.out.print(" || " + df.format(array.getA()[i]));
        }
        System.out.println("");
        System.out.println("El segundo arreglo es:");
        for (int i = 0; i < 20; i++) {
            System.out.print(" || " + df.format(array.getB()[i]));
        }
        System.out.println("");
    }
}
