package co.edu.udec.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Venta {

    private String numeroFactura;
    private LocalDate fecha;
    private String cliente;
    private BigDecimal valorTotal;

    public Venta(String numeroFactura, LocalDate fecha, String cliente, BigDecimal valorTotal) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    // Metodo para mostrar los datos de cada venta en consola
    @Override
    public String toString() {
        return "Factura: " + numeroFactura
               + " | Fecha: " + fecha
               + " | Cliente: " + cliente
               + " | Valor total: $" + valorTotal;
    }

}
