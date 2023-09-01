/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProyectoGrafico;

/**
 *
 * @author Adrian Nole PC
 */
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetodoTrapecioGui extends JFrame {

    private JTextField functionField, lowerBoundField, upperBoundField, numTrapezoidsField, resultField;
    private JButton calculateButton;

    public MetodoTrapecioGui() {
        setTitle("Calculadora Metodo Trapecio");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 2, 10, 10));

        mainPanel.add(new JLabel("Funcion:"));
        functionField = new JTextField();
        mainPanel.add(functionField);

        mainPanel.add(new JLabel("Limite Inferior:"));
        lowerBoundField = new JTextField();
        mainPanel.add(lowerBoundField);

        mainPanel.add(new JLabel("Limite Superior:"));
        upperBoundField = new JTextField();
        mainPanel.add(upperBoundField);

        mainPanel.add(new JLabel("Numero de Trapecios (n)"));
        numTrapezoidsField = new JTextField();
        mainPanel.add(numTrapezoidsField);

        calculateButton = new JButton("Calcular");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metodoCalcularIn();
            }
        });

        mainPanel.add(calculateButton);

        mainPanel.add(new JLabel("Resultado:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        mainPanel.add(resultField);

        add(mainPanel);
    }

    private void metodoCalcularIn() {
        String funcionF = functionField.getText();
        double limiteInferior, limiteSuperior;
        int numeroTrapecios;

        try {
            limiteInferior = Double.parseDouble(lowerBoundField.getText());
            limiteSuperior = Double.parseDouble(upperBoundField.getText());
            numeroTrapecios = Integer.parseInt(numTrapezoidsField.getText());
        } catch (NumberFormatException ex) {
            resultField.setText("Dato no Valido");
            return;
        }

        try {
            double h = (limiteSuperior - limiteInferior) / numeroTrapecios;
            double integral = 0.0;
            Expression expression = new ExpressionBuilder(funcionF)
                    .variable("x")
                    .build();

            for (int i = 0; i < numeroTrapecios; i++) {
                double x0 = limiteInferior + i * h;
                double x1 = x0 + h;
                expression.setVariable("x", x0);
                double y0 = expression.evaluate();
                expression.setVariable("x", x1);
                double y1 = expression.evaluate();
                integral += (y0 + y1) / 2.0 * h;
            }

            resultField.setText(Double.toString(integral));
        } catch (Exception ex) {
            resultField.setText("Dato no valido o funcion no valida");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MetodoTrapecioGui calculator = new MetodoTrapecioGui();
            calculator.setVisible(true);
        });
    }
}
