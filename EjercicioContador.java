package contador;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class EjercicioContador extends JFrame {

    private JPanel panel;
    private JLabel etiqueta;
    private JButton boton;
    private int contador = 0;

    public EjercicioContador() {
        setSize(400, 400);
        setLocationRelativeTo(null);
        setTitle("Contador de clicks");

        iniciarComponenetes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponenetes() {
        colocarPanel();
        colocarEtiqueta();
        colocarBoton();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    private void colocarEtiqueta() {
        etiqueta = new JLabel();
        etiqueta.setBounds(0, 50, 400, 40);
        etiqueta.setText("Pulsa el boton");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("arieal", 0, 20));
        panel.add(etiqueta);

    }

    private void colocarBoton() {
        boton = new JButton();
        boton.setBounds(90, 250, 200, 50);
        boton.setText("Pulsar aqui");
        panel.add(boton);
        eventoDeAccion();

    }

    private void eventoDeAccion() {
        ActionListener eventoAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                contador++;
                if (contador == 1) {
                    etiqueta.setText("Has presionado el boton 1 vez");

                } else {
                    etiqueta.setText("Has oresionado el boton " + contador + " veces");

                }
            }

        };

        boton.addActionListener(eventoAccion);
    }

}
