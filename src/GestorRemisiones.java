// GestorRemisiones.java
import java.io.*;

public class GestorRemisiones {
    private static final String ARCHIVO_CSV = "remisiones.csv";

    public static void guardarRemision(Remision remision) {
        File archivo = new File(ARCHIVO_CSV);
        boolean archivoExiste = archivo.exists();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_CSV, true))) {
            if (!archivoExiste) {
                writer.write("Numero Remision,Fecha,Cliente,Producto,Cantidad,Precio");
                writer.newLine();
            }

            for (Producto producto : remision.getProductos()) {
                writer.write(remision.getNumeroRemision() + "," +
                        remision.getFecha() + "," +
                        remision.getCliente() + "," +
                        producto.getNombre() + "," +
                        producto.getCantidad() + "," +
                        producto.getPrecio());
                writer.newLine();
            }
            System.out.println("Remisión guardada correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar la remisión: " + e.getMessage());
        }
    }
}
