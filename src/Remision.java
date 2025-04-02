// Remision.java
import java.util.ArrayList;
import java.util.List;

public class Remision {
    private String numeroRemision;
    private String fecha;
    private String cliente;
    private List<Producto> productos;

    public Remision(String numeroRemision, String fecha, String cliente) {
        this.numeroRemision = numeroRemision;
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(String nombre, int cantidad, double precio) {
        productos.add(new Producto(nombre, cantidad, precio));
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public String getNumeroRemision() {
        return numeroRemision;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCliente() {
        return cliente;
    }
}
