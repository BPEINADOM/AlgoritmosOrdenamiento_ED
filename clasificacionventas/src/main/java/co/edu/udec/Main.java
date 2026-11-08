package co.edu.udec;

import java.math.BigDecimal;
import java.time.LocalDate;

import co.edu.udec.domain.model.Venta;

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
    }
}
