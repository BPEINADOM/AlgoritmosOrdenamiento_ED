package co.edu.udec;

import java.math.BigDecimal;
import java.time.LocalDate;

import co.edu.udec.application.usecase.ClasificarVentasService;
import co.edu.udec.domain.model.Venta;
import co.edu.udec.infrastructure.algorithm.QuickSortVentas;

public class Main {
    public static void main( String[] args )
    {
        // Crear las ventas de prueba
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
                LocalDate.of(2026, 5, 10), 
                "Andres Gomez", 
                new BigDecimal("320000.00")
            ),

            new Venta(
                "FAC004", 
                LocalDate.of(2026, 2, 5), 
                "Laura Torres", 
                new BigDecimal("250000.00")
            ),

            new Venta(
                "FAC005", 
                LocalDate.of(2026, 1, 20), 
                "Pedro Ramirez", 
                new BigDecimal("95000.00")
            ),

            new Venta(
                "FAC006", 
                LocalDate.of(2026, 4, 25), 
                "Ana Martinez", 
                new BigDecimal("410000.00")
            ),
        };

        // Crear el ordenador y el servicio
        QuickSortVentas quickSort = new QuickSortVentas();

        ClasificarVentasService servicio = new ClasificarVentasService(quickSort);

        // Crear copias para cada calificacion
        Venta[] ventasPorValor = ventas.clone();
        Venta[] ventasPorFecha = ventas.clone();

        // Mostrar las ventas originales
        System.out.println("========== VENTAS ORIGINALES ==========");
        
        mostrarVentas(ventas);

        // Clasificar por valor descendente
        servicio.clasificarPorValorDesendente(ventasPorValor);

        System.out.println("\n========== CLASIFICACION POR VALOR DESCENDENTE ==========");

        mostrarVentas(ventasPorValor);

        // Clasificar por fecha ascendente
        servicio.clasificarPorFechaAscendente(ventasPorFecha);

        System.out.println("\n========== CLASIFICACION POR FECHA ASCENDENTE ==========");

        mostrarVentas(ventasPorFecha);

        // Comprobar que el arreglo original se conserva
        System.out.println("\n========== COMPROBACION DEL ARREGLO ORIGINAL ==========");

        mostrarVentas(ventas);
    }

    public static void mostrarVentas(Venta[] ventas) {
            
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }
    
}
