import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p144_TemperaturasGUI extends JFrame implements ActionListener {
    private JLabel lblTitulo, lblTemperatura, lblResultado;
    private JTextField txtTemperatura;
    private JButton btnConvertir, btnSalir;
    private JRadioButton rbtnFtoC, rbtnCtoF;
    private ButtonGroup group;

    public p144_TemperaturasGUI() {
        super("Conversión de Temperaturas");
        setLayout(null);

        lblTitulo = new JLabel("Conversión de Temperaturas");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitulo.setBounds(60, 10, 250, 30);
        add(lblTitulo);

        lblTemperatura = new JLabel("Temperatura:");
        lblTemperatura.setBounds(30, 50, 100, 30);
        add(lblTemperatura);

        txtTemperatura = new JTextField();
        txtTemperatura.setBounds(150, 50, 100, 30);
        add(txtTemperatura);

        rbtnFtoC = new JRadioButton("Fahrenheit a Celsius");
        rbtnFtoC.setBounds(30, 90, 150, 30);
        rbtnCtoF = new JRadioButton("Celsius a Fahrenheit");
        rbtnCtoF.setBounds(180, 90, 150, 30);

        group = new ButtonGroup();
        group.add(rbtnFtoC);
        group.add(rbtnCtoF);

        add(rbtnFtoC);
        add(rbtnCtoF);

        btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(50, 140, 100, 30);
        add(btnConvertir);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(180, 140, 100, 30);
        add(btnSalir);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(50, 180, 250, 30);
        add(lblResultado);

        btnConvertir.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnConvertir) {
            try {
                double temp = Double.parseDouble(txtTemperatura.getText());
                double resultado = 0.0;
                if (rbtnFtoC.isSelected()) {
                    resultado = (temp - 32) * 5 / 9;
                    lblResultado.setText(String.format("%.2f °F = %.2f °C", temp, resultado));
                } else if (rbtnCtoF.isSelected()) {
                    resultado = (temp * 9 / 5) + 32;
                    lblResultado.setText(String.format("%.2f °C = %.2f °F", temp, resultado));
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, selecciona una opción de conversión.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese una temperatura válida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnSalir) {
            dispose();
        }
    }

    public static void main(String[] args) {
        p144_TemperaturasGUI app = new p144_TemperaturasGUI();
        app.setBounds(10, 10, 350, 250);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
