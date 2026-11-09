package co.edu.udec.infrastructure.algorithm;

import java.util.Comparator;

import co.edu.udec.application.port.out.OrdenadorVentas;
import co.edu.udec.domain.model.Venta;

public class QuickSortVentas implements OrdenadorVentas {

    @Override
    public void ordenadorPorValorDescendente(Venta[] ventas) {

        if (ventas == null || ventas.length <= 1) {
            return;
        }

        Comparator<Venta> comparador = (venta1, venta2) ->
            venta2.getValorTotal().compareTo(venta1.getValorTotal());
        
        quickSort(ventas, 0, ventas.length - 1, comparador);
    }

    @Override
    public void ordenarPorFechaAscendente(Venta[] ventas) {

        if (ventas == null || ventas.length <= 1) {
            return;
        }
        
        Comparator<Venta> comparador = (venta1, venta2) ->
            venta1.getFecha().compareTo(venta2.getFecha());
        
        quickSort(ventas, 0, ventas.length - 1, comparador);
    }

    private void quickSort(Venta[] ventas, int inicio, int fin, Comparator<Venta> comparador) {

        if (inicio < fin) {

            int posicionPivote = particionar(ventas, inicio, fin, comparador);

            quickSort(ventas, inicio, posicionPivote - 1, comparador);

            quickSort(ventas, posicionPivote + 1, fin, comparador);

        }

    }

    private int particionar(Venta[] ventas, int inicio, int fin, Comparator<Venta> comparador) {

        Venta pivote = ventas[fin];

        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {

            if (comparador.compare(ventas[j], pivote) <= 0) {

                i++;

                intercambiar(ventas, i, j);
            }
        }

        intercambiar(ventas, i + 1, fin);

        return i + 1;
    }

    private void intercambiar (Venta[] ventas, int i, int j) {

        Venta temporal = ventas[i];

        ventas[i] = ventas[j];

        ventas[j] = temporal;
    
    }

}
