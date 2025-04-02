// Main.java
public class Main {
    public static void main(String[] args) {
        Remision remision = new Remision("4285", "25/03/2025", "Tacos Jose");
        remision.agregarProducto("Mesa", 12, 25.0);
        remision.agregarProducto("Taquera", 7, 45.0);

        GestorRemisiones.guardarRemision(remision);
    }
}