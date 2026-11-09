package co.edu.udec;

import org.junit.jupiter.api.Test;

import co.edu.udec.domain.model.Venta;
import co.edu.udec.infrastructure.algorithm.QuickSortVentas;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;


public class QuickSortVentasTest {

   private final QuickSortVentas ordenador = new QuickSortVentas();

   @Test
    void debeAceptarArregloNulo() {

        assertDoesNotThrow(() ->
            ordenador.ordenadorPorValorDescendente(null));

        assertDoesNotThrow(() ->
            ordenador.ordenarPorFechaAscendente(null));
    }

    @Test
    void debeAceptarArregloVacio() {

        Venta[] ventas = new Venta[0];

        assertDoesNotThrow(() -> 
            ordenador.ordenadorPorValorDescendente(ventas));
        
        assertDoesNotThrow(() -> 
            ordenador.ordenarPorFechaAscendente(ventas));
        
        assertEquals(0, ventas.length);
        
    }

    @Test
    void debeAceptarUnaSolaVenta() {

        Venta[] ventas = {
            new Venta(
                "FAC001", 
                LocalDate.of(2026, 3, 15), 
                "Carlos Perez", 
                new BigDecimal("250000.00"))
        };

        ordenador.ordenadorPorValorDescendente(ventas);

        assertEquals("FAC001", ventas[0].getNumeroFactura());

        ordenador.ordenarPorFechaAscendente(ventas);

        assertEquals("FAC001", ventas[0].getNumeroFactura());

    }

    @Test
    void debeConservarVentasConValoresRepetidos() {

        Venta[] ventas = {

            new Venta(
                "FAC001", 
                LocalDate.of(2026, 3, 15), 
                "Carlos Perez", 
                new BigDecimal("250000.00")
            ),

            new Venta(
                "FAC002", 
                LocalDate.of(2026, 1, 20), 
                "Maria Lopez", 
                new BigDecimal("250000.00")
            ),

            new Venta(
                "FAC003", 
                LocalDate.of(2026, 5, 10), 
                "Andres Gomez", 
                new BigDecimal("100000.00")
            ),

        };

        ordenador.ordenadorPorValorDescendente(ventas);

        assertEquals(3, ventas.length);

        assertEquals(0, ventas[0].getValorTotal().compareTo(new BigDecimal("250000.00")));

        assertEquals(0, ventas[1].getValorTotal().compareTo(new BigDecimal("250000.00")));

        assertEquals(0, ventas[2].getValorTotal().compareTo(new BigDecimal("100000.00")));

    }

    @Test
    void debeOrdenarFechasAscendentemente() {

        Venta[] ventas = {
             new Venta(
                "FAC001", 
                LocalDate.of(2026, 3, 15), 
                "Carlos Perez", 
                new BigDecimal("250000.00")
            ),

            new Venta(
                "FAC002", 
                LocalDate.of(2026, 1, 20), 
                "Maria Lopez", 
                new BigDecimal("180000.00")
            ),

            new Venta(
                "FAC003", 
                LocalDate.of(2026, 1, 20), 
                "Andres Gomez", 
                new BigDecimal("320000.00")
            ),
        };

        ordenador.ordenarPorFechaAscendente(ventas);

        assertEquals(3, ventas.length);

        assertEquals(LocalDate.of(2026, 1, 20), ventas[0].getFecha());
        assertEquals(LocalDate.of(2026, 1, 20), ventas[1].getFecha());
        assertEquals(LocalDate.of(2026, 3, 15), ventas[2].getFecha());
        
    }

    
}
