// Archivo: ProgramaPrincipal.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgramaPrincipal extends JFrame {
    private JTextField nombreField;
    private JTextField matriculaField;
    private JTextField edadField;
    private JTextField direccionField;
    private JTextField telefonoField;
    private JButton guardarButton;

    public ProgramaPrincipal() {
        super("Registro de Alumnos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLayout(new BorderLayout());

        JPanel panelFormulario = new JPanel(new GridLayout(5, 2, 10, 10));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        nombreField = new JTextField();
        matriculaField = new JTextField();
        edadField = new JTextField();
        direccionField = new JTextField();
        telefonoField = new JTextField();
        guardarButton = new JButton("Guardar");

        panelFormulario.add(new JLabel("Nombre:"));
        panelFormulario.add(nombreField);
        panelFormulario.add(new JLabel("Matrícula:"));
        panelFormulario.add(matriculaField);
        panelFormulario.add(new JLabel("Edad:"));
        panelFormulario.add(edadField);
        panelFormulario.add(new JLabel("Dirección:"));
        panelFormulario.add(direccionField);
        panelFormulario.add(new JLabel("Teléfono:"));
        panelFormulario.add(telefonoField);

        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBoton.add(guardarButton);

        add(panelFormulario, BorderLayout.CENTER);
        add(panelBoton, BorderLayout.SOUTH);

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                String matricula = matriculaField.getText();
                int edad = Integer.parseInt(edadField.getText());
                String direccion = direccionField.getText();
                String telefono = telefonoField.getText();

                Alumno alumno = new Alumno(nombre, matricula, edad, direccion, telefono);
                mostrarMensaje("Alumno registrado:\n\nNombre: " + alumno.getNombre() +
                        "\nMatrícula: " + alumno.getMatricula() +
                        "\nEdad: " + alumno.getEdad() +
                        "\nDirección: " + alumno.getDireccion() +
                        "\nTeléfono: " + alumno.getTelefono());
            }
        });
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProgramaPrincipal().setVisible(true);
            }
        });
    }
}
