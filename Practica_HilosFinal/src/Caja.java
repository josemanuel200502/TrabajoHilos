import java.util.Random;

public class Caja {
	
	    private final String nombre;

	    public Caja(String nombre) {
	        this.nombre = nombre;
	    }

	    public synchronized void procesarProducto(String cliente, String producto) {
	        System.out.printf("Procesando cliente: %s | Producto: %s en caja %s\n", cliente, producto, nombre);
	        try {
	            Thread.sleep(new Random().nextInt(1000)); // Simula tiempo de procesamiento
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }

	    public String getNombre() {
	        return nombre;
	    }
	}