package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaNumero {
    private JPanel PanelPrincipal;
    private JTextField txt_n1;
    private JTextField txt_n2;
    private JButton btn_suma;
    private JLabel lbl_resultado;
    private JButton btn_restar;
    private JButton btn_multiplicacion;
    private JButton btn_dividir;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public SumaNumero() {
    btn_suma.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int suma = Integer.parseInt(txt_n1.getText()) +Integer.parseInt(txt_n2.getText());
            lbl_resultado.setText(String.valueOf(suma));

        }
    });
        btn_restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resta = Integer.parseInt(txt_n1.getText()) -Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(resta));

            }
        });
        btn_multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int multiplicacion = Integer.parseInt(txt_n1.getText()) *Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(multiplicacion));
            }
        });
        btn_dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double dividir = Double.parseDouble(txt_n1.getText()) /Double.parseDouble(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(dividir));

            }
        });
    }

    public static void main(String[] args) {
        JFrame inicio= new JFrame("SumaNumero");
        inicio.setContentPane(new SumaNumero().PanelPrincipal);
        inicio.pack();
        inicio.setVisible(true);
    }
}
