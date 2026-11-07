package co.edu.udec.application.usecase;

import co.edu.udec.application.port.out.OrdenadorVentas;
import co.edu.udec.domain.model.Venta;

public class ClasificarVentasService {

    private final OrdenadorVentas ordenadorVentas;

    public ClasificarVentasService(OrdenadorVentas ordenadorVentas) {
        this.ordenadorVentas = ordenadorVentas;
    }

    public void clasificarPorValorDesendente(Venta[] ventas) {
        ordenadorVentas.ordenadorPorValorDesendente(ventas);
    }

    public void clasificarPorFechaAscendente(Venta[] ventas) {
        ordenadorVentas.ordenarPorFechaAscendente(ventas);
    }
    
}
