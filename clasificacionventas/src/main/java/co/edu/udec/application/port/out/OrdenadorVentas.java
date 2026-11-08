package co.edu.udec.application.port.out;

import co.edu.udec.domain.model.Venta;

public interface OrdenadorVentas {

    void ordenadorPorValorDescendente(Venta[] ventas);

    void ordenarPorFechaAscendente(Venta[] ventas);

}
