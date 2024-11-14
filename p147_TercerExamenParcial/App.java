package p147_TercerExamenParcial;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

public class App extends JFrame {
    private final JTable tablaJugadores;
    private final DefaultTableModel modeloTabla;
    private final JTextField txtNombre, txtEdad, txtSexo, txtEstadoCivil, txtDescripcion, txtSalario;
    private List<Jugador> listaJugadores;

    public App() {
        configurarVentana();

        modeloTabla = new DefaultTableModel(new Object[]{"Nombre", "Edad", "Sexo", "Estado Civil", "Descripción", "Salario"}, 0);
        tablaJugadores = new JTable(modeloTabla);
        tablaJugadores.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mostrarJugadorSeleccionado();
            }
        });

        // Inicialización de campos de texto sin final
        txtNombre = new JTextField();
        txtEdad = new JTextField();
        txtSexo = new JTextField();
        txtEstadoCivil = new JTextField();
        txtDescripcion = new JTextField();
        txtSalario = new JTextField();

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

    private void configurarVentana() {
        setTitle("Liga de Fútbol");
        setSize(700, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JPanel crearPanelDatos() {
        JPanel panelDatos = new JPanel(new GridLayout(6, 2));
        txtNombre = crearCampo(panelDatos, "Nombre:");
        txtEdad = crearCampo(panelDatos, "Edad:");
        txtSexo = crearCampo(panelDatos, "Sexo:");
        txtEstadoCivil = crearCampo(panelDatos, "Estado Civil:");
        txtDescripcion = crearCampo(panelDatos, "Descripción:");
        txtSalario = crearCampo(panelDatos, "Salario:");
        return panelDatos;
    }

    private JTextField crearCampo(JPanel panel, String etiqueta) {
        panel.add(new JLabel(etiqueta));
        JTextField campo = new JTextField();
        panel.add(campo);
        return campo;
    }

    private JPanel crearPanelBotones() {
        JPanel panelBotones = new JPanel();
        var btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(e -> agregarJugador());
        var btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> guardarJugadoresEnArchivo());
        
        panelBotones.add(btnAgregar);
        panelBotones.add(btnGuardar);
        return panelBotones;
    }

    private JMenuBar crearMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        
        agregarMenuItem(menuArchivo, "Abrir", e -> cargarJugadoresDesdeArchivo());
        agregarMenuItem(menuArchivo, "Guardar", e -> guardarJugadoresEnArchivo());
        agregarMenuItem(menuArchivo, "Salir", e -> System.exit(0));
        
        JMenu menuAyuda = new JMenu("Ayuda");
        agregarMenuItem(menuAyuda, "Acerca de...", e -> JOptionPane.showMessageDialog(this, "Programa hecho por un estudiante de Ing. de Software de la UAZ"));
        
        menuBar.add(menuArchivo);
        menuBar.add(menuAyuda);
        return menuBar;
    }

    private void agregarMenuItem(JMenu menu, String texto, ActionListener accion) {
        var item = new JMenuItem(texto);
        item.addActionListener(accion);
        menu.add(item);
    }

    private void cargarJugadoresDesdeArchivo() {
        listaJugadores = UtileriaJugador.cargarJugadores("jugadores.dat");
        actualizarTabla();
    }

    private void actualizarTabla() {
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
        Jugador nuevoJugador = crearJugadorDesdeCampos();
        listaJugadores.add(nuevoJugador);
        modeloTabla.addRow(new Object[]{nuevoJugador.getNombre(), nuevoJugador.getEdad(), nuevoJugador.getSexo(),
                nuevoJugador.getEstadoCivil(), nuevoJugador.getDescripcion(), nuevoJugador.getSalario()});
        limpiarCampos();
    }

    private Jugador crearJugadorDesdeCampos() {
        return new Jugador(txtNombre.getText(), Integer.parseInt(txtEdad.getText()), 
                           txtSexo.getText().charAt(0), txtEstadoCivil.getText(),
                           txtDescripcion.getText(), Double.parseDouble(txtSalario.getText()));
    }

    private void mostrarJugadorSeleccionado() {
        int filaSeleccionada = tablaJugadores.getSelectedRow();
        if (filaSeleccionada >= 0) {
            txtNombre.setText((String) modeloTabla.getValueAt(filaSeleccionada, 0));
            txtEdad.setText(String.valueOf(modeloTabla.getValueAt(filaSeleccionada, 1)));
            txtSexo.setText(String.valueOf(modeloTabla.getValueAt(filaSeleccionada, 2)));
            txtEstadoCivil.setText((String) modeloTabla.getValueAt(filaSeleccionada, 3));
            txtDescripcion.setText((String) modeloTabla.getValueAt(filaSeleccionada, 4));
            txtSalario.setText(String.valueOf(modeloTabla.getValueAt(filaSeleccionada, 5)));
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
        SwingUtilities.invokeLater(() -> new App().setVisible(true));
    }
}
