import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p143_PagaTrabajadorGUI extends JFrame implements ActionListener {
    private JTextField txtNombre, txtHoras, txtPaga, txtTasa;
    private JLabel lblResultado;
    private JButton btnCalcular, btnSalir;

    public p143_PagaTrabajadorGUI() {
        super("Cálculo de Paga de Trabajador");
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Nombre del Trabajador: ", JLabel.RIGHT));
        txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("Horas Trabajadas: ", JLabel.RIGHT));
        txtHoras = new JTextField();
        add(txtHoras);

        add(new JLabel("Paga por Hora: ", JLabel.RIGHT));
        txtPaga = new JTextField();
        add(txtPaga);

        add(new JLabel("Tasa de Impuestos: ", JLabel.RIGHT));
        txtTasa = new JTextField();
        txtTasa.setText("0.03"); 
        add(txtTasa);

        btnCalcular = new JButton("Calcular");
        add(btnCalcular);

        btnSalir = new JButton("Salir");
        add(btnSalir);

        lblResultado = new JLabel("Resultado: ");
        add(lblResultado);

        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);

        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            try {
                String nombre = txtNombre.getText();
                int horas = Integer.parseInt(txtHoras.getText());
                double paga = Double.parseDouble(txtPaga.getText());
                double tasa = Double.parseDouble(txtTasa.getText());

                double pagabruta = horas * paga;
                double impuesto = pagabruta * tasa;
                double paganeta = pagabruta - impuesto;

                lblResultado.setText("<html>" + nombre + "<br>Paga Bruta: " + String.format("%.2f", pagabruta) +
                        "<br>Impuesto: " + String.format("%.2f", impuesto) +
                        "<br>Paga Neta: " + String.format("%.2f", paganeta) + "</html>");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnSalir) {
            dispose();
        }
    }

    public static void main(String[] args) {
        p143_PagaTrabajadorGUI app = new p143_PagaTrabajadorGUI();
        app.setVisible(true);
    }
}
