import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class RemisionGUI {
    private JFrame frame;
    private JTextField txtNumRemision, txtFecha, txtCliente, txtProducto, txtCantidad, txtPrecio;
    private DefaultTableModel tableModel;
    private JTable table;

    public RemisionGUI() {
        frame = new JFrame("Captura de Remisiones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        JPanel panelTop = new JPanel(new GridLayout(3, 2));
        panelTop.add(new JLabel("Número de Remisión:"));
        txtNumRemision = new JTextField();
        panelTop.add(txtNumRemision);

        panelTop.add(new JLabel("Fecha:"));
        txtFecha = new JTextField();
        panelTop.add(txtFecha);

        panelTop.add(new JLabel("Cliente:"));
        txtCliente = new JTextField();
        panelTop.add(txtCliente);

        frame.add(panelTop, BorderLayout.NORTH);

        tableModel = new DefaultTableModel(new Object[]{"Producto", "Cantidad", "Precio"}, 0);
        table = new JTable(tableModel);
        frame.add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel panelBottom = new JPanel(new GridLayout(2, 4));
        txtProducto = new JTextField();
        txtCantidad = new JTextField();
        txtPrecio = new JTextField();
        JButton btnAgregar = new JButton("Agregar Producto");
        JButton btnGuardar = new JButton("Guardar Remisión");

        panelBottom.add(new JLabel("Producto:"));
        panelBottom.add(txtProducto);
        panelBottom.add(new JLabel("Cantidad:"));
        panelBottom.add(txtCantidad);
        panelBottom.add(new JLabel("Precio:"));
        panelBottom.add(txtPrecio);
        panelBottom.add(btnAgregar);
        panelBottom.add(btnGuardar);

        frame.add(panelBottom, BorderLayout.SOUTH);

        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tableModel.addRow(new Object[]{txtProducto.getText(), txtCantidad.getText(), txtPrecio.getText()});
                txtProducto.setText("");
                txtCantidad.setText("");
                txtPrecio.setText("");
            }
        });

        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarRemision();
            }
        });

        frame.setVisible(true);
    }

    private void guardarRemision() {
        try (FileWriter writer = new FileWriter("remisiones.csv", true)) {
            String numRemision = txtNumRemision.getText();
            String fecha = txtFecha.getText();
            String cliente = txtCliente.getText();

            for (int i = 0; i < tableModel.getRowCount(); i++) {
                String producto = tableModel.getValueAt(i, 0).toString();
                String cantidad = tableModel.getValueAt(i, 1).toString();
                String precio = tableModel.getValueAt(i, 2).toString();
                writer.write(numRemision + "," + fecha + "," + cliente + "," + producto + "," + cantidad + "," + precio + "\n");
            }
            JOptionPane.showMessageDialog(frame, "Remisión guardada correctamente.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, "Error al guardar la remisión.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new RemisionGUI();
    }
}
