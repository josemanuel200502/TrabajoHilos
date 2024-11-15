
public class Main {

	public static void main(String[] args) {
		 long initialTime = System.currentTimeMillis();

	        // Crear cajas
	        Caja caja1 = new Caja("Caja 1");
	        Caja caja2 = new Caja("Caja 2");

	        // Crear clientes y sus productos
	        Cliente cliente1 = new Cliente("Cliente 1", new String[]{"Manzanas", "Leche", "Huevos", "Pan", "Café"}, caja1, initialTime);
	        Cliente cliente2 = new Cliente("Cliente 2", new String[]{"Arroz", "Pasta", "Azúcar", "Té", "Queso"}, caja2, initialTime);
	        Cliente cliente3 = new Cliente("Cliente 3", new String[]{"Carne", "Pollo", "Verduras", "Fruta", "Helado"}, caja1, initialTime);
	        Cliente cliente4 = new Cliente("Cliente 4", new String[]{"Cereal", "Chocolate", "Vino", "Salsa", "Aceite"}, caja2, initialTime);
	        Cliente cliente5 = new Cliente("Cliente 5", new String[]{"Galletas", "Jugo", "Sal", "Mantequilla", "Jamón"}, caja1, initialTime);

	        // Crear hilos para cada cliente
	        Thread hilo1 = new Thread(cliente1);
	        Thread hilo2 = new Thread(cliente2);
	        Thread hilo3 = new Thread(cliente3);
	        Thread hilo4 = new Thread(cliente4);
	        Thread hilo5 = new Thread(cliente5);

	        // Iniciar los hilos
	        hilo1.start();
	        hilo2.start();
	        hilo3.start();
	        hilo4.start();
	        hilo5.start();

	        // Esperar a que terminen
	        try {
	            hilo1.join();
	            hilo2.join();
	            hilo3.join();
	            hilo4.join();
	            hilo5.join();
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }

	        System.out.printf("Tiempo total del supermercado: %d ms\n", System.currentTimeMillis() - initialTime);
	    }
	
		
	}

