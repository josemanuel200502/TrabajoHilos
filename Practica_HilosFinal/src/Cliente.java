import java.util.ArrayList;

public class Cliente implements Runnable {
    private final String nombre;
    private final String[] productos;
    private final Caja caja;
    private final long initialTime;

    public Cliente(String nombre, String[] productos, Caja caja, long initialTime) {
        this.nombre = nombre;
        this.productos = productos;
        this.caja = caja;
        this.initialTime = initialTime;
    }

    @Override
    public void run() {
        long tiempoInicioCliente = System.currentTimeMillis();
        for (String producto : productos) {
            long tiempoInicioProducto = System.currentTimeMillis();
            caja.procesarProducto(nombre, producto);
            long tiempoProcesamientoProducto = System.currentTimeMillis() - tiempoInicioProducto;
            System.out.printf("Producto procesado: %s (Tiempo: %d ms)\n", producto, tiempoProcesamientoProducto);
        }
        long tiempoTotalCliente = System.currentTimeMillis() - tiempoInicioCliente;
        System.out.printf("Cliente %s procesado en la caja %s (Tiempo total: %d ms)\n\n", 
                          nombre, caja.getNombre(), tiempoTotalCliente);
    }
}





