package p147_TercerExamenParcial;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

public class App extends JFrame {
    private JTable tablaJugadores;
    private DefaultTableModel modeloTabla;
    private JTextField txtNombre, txtEdad, txtSexo, txtEstadoCivil, txtDescripcion, txtSalario;
    private List<Jugador> listaJugadores;

    public App() {
        setTitle("Liga de Fútbol");
        setSize(700, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        modeloTabla = new DefaultTableModel(new Object[]{"Nombre", "Edad", "Sexo", "Estado Civil", "Descripción", "Salario"}, 0);
        tablaJugadores = new JTable(modeloTabla);
        tablaJugadores.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mostrarJugadorSeleccionado();
            }
        });

        JScrollPane scrollPane = new JScrollPane(tablaJugadores);
        JPanel panelDatos = crearPanelDatos(); 
        JPanel panelBotones = crearPanelBotones();
        JMenuBar menuBar = crearMenu();

        setJMenuBar(menuBar);
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(panelDatos, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.SOUTH);

        listaJugadores = new ArrayList<>();
    }

    private JPanel crearPanelDatos() {
        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panel.add(txtNombre);

        panel.add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        panel.add(txtEdad);

        panel.add(new JLabel("Sexo:"));
        txtSexo = new JTextField();
        panel.add(txtSexo);

        panel.add(new JLabel("Estado Civil:"));
        txtEstadoCivil = new JTextField();
        panel.add(txtEstadoCivil);

        panel.add(new JLabel("Descripción:"));
        txtDescripcion = new JTextField();
        panel.add(txtDescripcion);

        panel.add(new JLabel("Salario:"));
        txtSalario = new JTextField();
        panel.add(txtSalario);

        return panel;
    }

    private JPanel crearPanelBotones() {
        JPanel panel = new JPanel();
        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(e -> agregarJugador());
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> guardarJugadoresEnArchivo());
        panel.add(btnAgregar);
        panel.add(btnGuardar);
        return panel;
    }

    private JMenuBar crearMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        itemAbrir.addActionListener(e -> cargarJugadoresDesdeArchivo());
        JMenuItem itemGuardar = new JMenuItem("Guardar");
        itemGuardar.addActionListener(e -> guardarJugadoresEnArchivo());
        JMenuItem itemSalir = new JMenuItem("Salir");
        itemSalir.addActionListener(e -> System.exit(0));
        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGuardar);
        menuArchivo.add(itemSalir);

        JMenu menuAyuda = new JMenu("Ayuda");
        JMenuItem itemAcercaDe = new JMenuItem("Acerca de...");
        itemAcercaDe.addActionListener(e -> JOptionPane.showMessageDialog(this, "Programa hecho por un estudiante de Ing. de Software de la UAZ"));
        menuAyuda.add(itemAcercaDe);

        menuBar.add(menuArchivo);
        menuBar.add(menuAyuda);
        return menuBar;
    }

    private void cargarJugadoresDesdeArchivo() {
        listaJugadores = UtileriaJugador.cargarJugadores("jugadores.dat");
        modeloTabla.setRowCount(0);
        for (Jugador jugador : listaJugadores) {
            modeloTabla.addRow(new Object[]{
                jugador.getNombre(), jugador.getEdad(), jugador.getSexo(), jugador.getEstadoCivil(),
                jugador.getDescripcion(), jugador.getSalario()
            });
        }
    }

    private void guardarJugadoresEnArchivo() {
        UtileriaJugador.guardarJugadores(listaJugadores, "jugadores.dat");
    }

    private void agregarJugador() {
        String nombre = txtNombre.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        char sexo = txtSexo.getText().charAt(0);
        String estadoCivil = txtEstadoCivil.getText();
        String descripcion = txtDescripcion.getText();
        double salario = Double.parseDouble(txtSalario.getText());

        Jugador jugador = new Jugador(nombre, edad, sexo, estadoCivil, descripcion, salario);
        listaJugadores.add(jugador);

        modeloTabla.addRow(new Object[]{jugador.getNombre(), jugador.getEdad(), jugador.getSexo(),
                jugador.getEstadoCivil(), jugador.getDescripcion(), jugador.getSalario()});

        limpiarCampos();
    }

    private void mostrarJugadorSeleccionado() {
        int selectedRow = tablaJugadores.getSelectedRow();
        if (selectedRow >= 0) {
            txtNombre.setText((String) modeloTabla.getValueAt(selectedRow, 0));
            txtEdad.setText(String.valueOf(modeloTabla.getValueAt(selectedRow, 1)));
            txtSexo.setText(String.valueOf(modeloTabla.getValueAt(selectedRow, 2)));
            txtEstadoCivil.setText((String) modeloTabla.getValueAt(selectedRow, 3));
            txtDescripcion.setText((String) modeloTabla.getValueAt(selectedRow, 4));
            txtSalario.setText(String.valueOf(modeloTabla.getValueAt(selectedRow, 5)));
        }
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtEdad.setText("");
        txtSexo.setText("");
        txtEstadoCivil.setText("");
        txtDescripcion.setText("");
        txtSalario.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new App().setVisible(true);
        });
    }
}
