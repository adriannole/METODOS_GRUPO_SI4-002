/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class MetodosNumericosGUI {
    private JFrame frame;
    private JTextArea textArea;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    MetodosNumericosGUI window = new MetodosNumericosGUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MetodosNumericosGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 930, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel titleLabel = new JLabel("Métodos Numéricos Grupo 5");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        titleLabel.setBounds(10, 10, 764, 30);
        frame.getContentPane().add(titleLabel);

        textArea = new JTextArea();
        textArea.setFont(new Font("Tahoma", Font.PLAIN, 12));
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 50, 850, 400);
        frame.getContentPane().add(scrollPane);

        JButton sistemasNumeracionButton = new JButton("Sistemas de Numeración");
        sistemasNumeracionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularSistemasDeNumeracion();
            }
        });
        sistemasNumeracionButton.setBounds(10, 460, 150, 30);
        frame.getContentPane().add(sistemasNumeracionButton);

        JButton puntoFlotanteButton = new JButton("Representación en Punto Flotante");
        puntoFlotanteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularRepresentacionEnPuntoFlotante();
            }
        });
        puntoFlotanteButton.setBounds(170, 460, 220, 30);
        frame.getContentPane().add(puntoFlotanteButton);

        JButton errorRedondeoButton = new JButton("Error de Redondeo");
        errorRedondeoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularErrorDeRedondeo();
            }
        });
        errorRedondeoButton.setBounds(400, 460, 150, 30);
        frame.getContentPane().add(errorRedondeoButton);

        JButton propagacionErroresButton = new JButton("Propagación de Errores");
        propagacionErroresButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularPropagacionDeErrores();
            }
        });
        propagacionErroresButton.setBounds(560, 460, 180, 30);
        frame.getContentPane().add(propagacionErroresButton);

        JButton teoremaBolzanoButton = new JButton("Teorema de Bolzano");
        teoremaBolzanoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularTeoremaDeBolzano();
            }
        });
        teoremaBolzanoButton.setBounds(10, 500, 150, 30);
        frame.getContentPane().add(teoremaBolzanoButton);

        JButton metodoBiseccionButton = new JButton("Método de Bisección");
        metodoBiseccionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularMetodoDeBiseccion();
            }
        });
        metodoBiseccionButton.setBounds(170, 500, 150, 30);
        frame.getContentPane().add(metodoBiseccionButton);

        JButton metodoNewtonRaphsonButton = new JButton("Método de Newton-Raphson");
        metodoNewtonRaphsonButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularMetodoDeNewtonRaphson();
            }
        });
        metodoNewtonRaphsonButton.setBounds(330, 500, 200, 30);
        frame.getContentPane().add(metodoNewtonRaphsonButton);

        JButton metodoSecanteButton = new JButton("Método de la Secante");
        metodoSecanteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularMetodoDeSecante();
            }
        });
        metodoSecanteButton.setBounds(540, 500, 160, 30);
        frame.getContentPane().add(metodoSecanteButton);

        JButton espaciosMetricosButton = new JButton("Espacios Métricos");
        espaciosMetricosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularEspaciosMetricos();
            }
        });
        espaciosMetricosButton.setBounds(750, 460, 150, 30);
        frame.getContentPane().add(espaciosMetricosButton);
    }

    private void calcularSistemasDeNumeracion() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sistemas de Numeración\n");
        sb.append("----------------------\n");

        String decimalString = JOptionPane.showInputDialog(frame, "Ingrese un número decimal:");
        if (decimalString == null || decimalString.isEmpty()) {
            return;
        }

        int decimal = Integer.parseInt(decimalString);

        sb.append("Número decimal: ").append(decimal).append("\n");
        sb.append("Número binario: ").append(Integer.toBinaryString(decimal)).append("\n");
        sb.append("Número hexadecimal: ").append(Integer.toHexString(decimal)).append("\n");

        textArea.setText(sb.toString());
    }

    private void calcularRepresentacionEnPuntoFlotante() {
        StringBuilder sb = new StringBuilder();
        sb.append("Representación en Punto Flotante\n");
        sb.append("-------------------------------\n");

        String decimalString = JOptionPane.showInputDialog(frame, "Ingrese un número decimal:");
        if (decimalString == null || decimalString.isEmpty()) {
            return;
        }

        double decimal = Double.parseDouble(decimalString);

        sb.append("Número decimal: ").append(decimal).append("\n");
        sb.append("Representación en punto flotante: ").append(Double.toHexString(decimal)).append("\n");

        textArea.setText(sb.toString());
    }

    private void calcularErrorDeRedondeo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Error de Redondeo\n");
        sb.append("-----------------\n");

        String valorRealString = JOptionPane.showInputDialog(frame, "Ingrese el valor real:");
        if (valorRealString == null || valorRealString.isEmpty()) {
            return;
        }
        double valorReal = Double.parseDouble(valorRealString);

        String valorAproximadoString = JOptionPane.showInputDialog(frame, "Ingrese el valor aproximado:");
        if (valorAproximadoString == null || valorAproximadoString.isEmpty()) {
            return;
        }
        double valorAproximado = Double.parseDouble(valorAproximadoString);

        double errorAbsoluto = Math.abs(valorReal - valorAproximado);
        double errorRelativo = Math.abs((valorReal - valorAproximado) / valorReal);

        sb.append("Valor Real: ").append(valorReal).append("\n");
        sb.append("Valor Aproximado: ").append(valorAproximado).append("\n");
        sb.append("Error Absoluto: ").append(errorAbsoluto).append("\n");
        sb.append("Error Relativo: ").append(errorRelativo).append("\n");

        textArea.setText(sb.toString());
    }

    private void calcularPropagacionDeErrores() {
        StringBuilder sb = new StringBuilder();
        sb.append("Propagación de Errores\n");
        sb.append("----------------------\n");

        String xString = JOptionPane.showInputDialog(frame, "Ingrese el valor de la variable X:");
        if (xString == null || xString.isEmpty()) {
            return;
        }
        double x = Double.parseDouble(xString);

        String yString = JOptionPane.showInputDialog(frame, "Ingrese el valor de la variable Y:");
        if (yString == null || yString.isEmpty()) {
            return;
        }
        double y = Double.parseDouble(yString);

        String errorXString = JOptionPane.showInputDialog(frame, "Ingrese el valor del error absoluto de X:");
        if (errorXString == null || errorXString.isEmpty()) {
            return;
        }
        double errorX = Double.parseDouble(errorXString);

        String errorYString = JOptionPane.showInputDialog(frame, "Ingrese el valor del error absoluto de Y:");
        if (errorYString == null || errorYString.isEmpty()) {
            return;
        }
        double errorY = Double.parseDouble(errorYString);

        double resultado = x * y;
        double errorResultado = Math.abs(resultado) * Math.sqrt((errorX / x) * (errorX / x) + (errorY / y) * (errorY / y));

        sb.append("Resultado: ").append(resultado).append("\n");
        sb.append("Error del Resultado: ").append(errorResultado).append("\n");

        textArea.setText(sb.toString());
    }

    private void calcularTeoremaDeBolzano() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teorema de Bolzano\n");
        sb.append("------------------\n");

        String inicioIntervaloString = JOptionPane.showInputDialog(frame, "Ingrese el valor inicial del intervalo:");
        if (inicioIntervaloString == null || inicioIntervaloString.isEmpty()) {
            return;
        }
        double inicioIntervalo = Double.parseDouble(inicioIntervaloString);

        String finIntervaloString = JOptionPane.showInputDialog(frame, "Ingrese el valor final del intervalo:");
        if (finIntervaloString == null || finIntervaloString.isEmpty()) {
            return;
        }
        double finIntervalo = Double.parseDouble(finIntervaloString);

        String iteracionesString = JOptionPane.showInputDialog(frame, "Ingrese el número de iteraciones:");
        if (iteracionesString == null || iteracionesString.isEmpty()) {
            return;
        }
        int iteraciones = Integer.parseInt(iteracionesString);

        boolean seCumpleTeorema = false;

        double inicio = inicioIntervalo;
        double fin = finIntervalo;

        for (int i = 0; i < iteraciones; i++) {
            double medio = (inicio + fin) / 2;

            if (funcion(medio) == 0) {
                seCumpleTeorema = true;
                break;
            } else if (funcion(inicio) * funcion(medio) < 0) {
                fin = medio;
            } else {
                inicio = medio;
            }
        }

        if (seCumpleTeorema) {
            sb.append("Se cumple el Teorema de Bolzano en el intervalo [").append(inicioIntervalo)
                    .append(", ").append(finIntervalo).append("]\n");
        } else {
            sb.append("No se cumple el Teorema de Bolzano en el intervalo [").append(inicioIntervalo)
                    .append(", ").append(finIntervalo).append("]\n");
        }

        // Crear el dataset para el gráfico de barras
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(inicioIntervalo, "Inicio", "Inicio");
        dataset.addValue(finIntervalo, "Fin", "Fin");

        // Crear el gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart("Intervalo", "Punto", "Valor",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        // Personalizar el gráfico
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinePaint(Color.BLACK);

        // Mostrar el gráfico en una ventana
        ChartFrame chartFrame = new ChartFrame("Gráfico de Intervalo", chart);
        chartFrame.pack();
        chartFrame.setVisible(true);

        textArea.setText(sb.toString());
    }

    private double funcion(double x) {
        return x * x - 4; // Ejemplo de función: f(x) = x^2 - 4
    }

    private void calcularMetodoDeBiseccion() {
        StringBuilder sb = new StringBuilder();
        sb.append("Método de Bisección\n");
        sb.append("-------------------\n");

        String inicioIntervaloString = JOptionPane.showInputDialog(frame, "Ingrese el valor inicial del intervalo:");
        if (inicioIntervaloString == null || inicioIntervaloString.isEmpty()) {
            return;
        }
        double inicioIntervalo = Double.parseDouble(inicioIntervaloString);

        String finIntervaloString = JOptionPane.showInputDialog(frame, "Ingrese el valor final del intervalo:");
        if (finIntervaloString == null || finIntervaloString.isEmpty()) {
            return;
        }
        double finIntervalo = Double.parseDouble(finIntervaloString);

        String iteracionesString = JOptionPane.showInputDialog(frame, "Ingrese el número de iteraciones:");
        if (iteracionesString == null || iteracionesString.isEmpty()) {
            return;
        }
        int iteraciones = Integer.parseInt(iteracionesString);

        double inicio = inicioIntervalo;
        double fin = finIntervalo;

        for (int i = 0; i < iteraciones; i++) {
            double medio = (inicio + fin) / 2;

            if (funcion(inicio) * funcion(medio) < 0) {
                fin = medio;
            } else {
                inicio = medio;
            }
        }

        sb.append("La aproximación de la raíz es: ").append((inicio + fin) / 2).append("\n");

        textArea.setText(sb.toString());
    }

    private void calcularMetodoDeNewtonRaphson() {
        StringBuilder sb = new StringBuilder();
        sb.append("Método de Newton-Raphson\n");
        sb.append("------------------------\n");

        String valorInicialString = JOptionPane.showInputDialog(frame, "Ingrese el valor inicial:");
        if (valorInicialString == null || valorInicialString.isEmpty()) {
            return;
        }
        double valorInicial = Double.parseDouble(valorInicialString);

        String otroValorString = JOptionPane.showInputDialog(frame, "Ingrese el otro valor:");
        if (otroValorString == null || otroValorString.isEmpty()) {
            return;
        }
        double otroValor = Double.parseDouble(otroValorString);

        String iteracionesString = JOptionPane.showInputDialog(frame, "Ingrese el número de iteraciones:");
        if (iteracionesString == null || iteracionesString.isEmpty()) {
            return;
        }
        int iteraciones = Integer.parseInt(iteracionesString);

        double valorAproximado = valorInicial;

        for (int i = 0; i < iteraciones; i++) {
            double derivada = derivadaFuncion(valorAproximado);
            double funcion = funcion(valorAproximado) - otroValor;

            valorAproximado = valorAproximado - (funcion / derivada);
        }

        sb.append("La aproximación de la raíz es: ").append(valorAproximado).append("\n");

        textArea.setText(sb.toString());
    }

    private double derivadaFuncion(double x) {
        return 2 * x; // Ejemplo de derivada de la función: f'(x) = 2x
    }

    private void calcularMetodoDeSecante() {
        StringBuilder sb = new StringBuilder();
        sb.append("Método de la Secante\n");
        sb.append("--------------------\n");

        String x0String = JOptionPane.showInputDialog(frame, "Ingrese el valor inicial X0:");
        if (x0String == null || x0String.isEmpty()) {
            return;
        }
        double x0 = Double.parseDouble(x0String);

        String x1String = JOptionPane.showInputDialog(frame, "Ingrese el valor inicial X1:");
        if (x1String == null || x1String.isEmpty()) {
            return;
        }
        double x1 = Double.parseDouble(x1String);

        String iteracionesString = JOptionPane.showInputDialog(frame, "Ingrese el número de iteraciones:");
        if (iteracionesString == null || iteracionesString.isEmpty()) {
            return;
        }
        int iteraciones = Integer.parseInt(iteracionesString);

        double xAnterior = x0;
        double xActual = x1;

        for (int i = 0; i < iteraciones; i++) {
            double funcionAnterior = funcion(xAnterior);
            double funcionActual = funcion(xActual);

            double xSiguiente = xActual - (funcionActual * (xActual - xAnterior)) / (funcionActual - funcionAnterior);

            xAnterior = xActual;
            xActual = xSiguiente;
        }

        sb.append("La aproximación de la raíz es: ").append(xActual).append("\n");

        textArea.setText(sb.toString());
    }

private void calcularEspaciosMetricos() {
    StringBuilder sb = new StringBuilder();
    sb.append("Espacios Métricos\n");
    sb.append("-----------------\n");

    String punto1String = JOptionPane.showInputDialog(frame, "Ingrese las coordenadas del primer punto (x y):");
    if (punto1String == null || punto1String.isEmpty()) {
        return;
    }
    String[] punto1Coords = punto1String.split(" ");
    if (punto1Coords.length != 2) {
        JOptionPane.showMessageDialog(frame, "Entrada inválida. Debe ingresar dos coordenadas separadas por un espacio.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    double x1, y1;
    try {
        x1 = Double.parseDouble(punto1Coords[0]);
        y1 = Double.parseDouble(punto1Coords[1]);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(frame, "Entrada inválida. Las coordenadas deben ser números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String punto2String = JOptionPane.showInputDialog(frame, "Ingrese las coordenadas del segundo punto (x y):");
    if (punto2String == null || punto2String.isEmpty()) {
        return;
    }
    String[] punto2Coords = punto2String.split(" ");
    if (punto2Coords.length != 2) {
        JOptionPane.showMessageDialog(frame, "Entrada inválida. Debe ingresar dos coordenadas separadas por un espacio.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    double x2, y2;
    try {
        x2 = Double.parseDouble(punto2Coords[0]);
        y2 = Double.parseDouble(punto2Coords[1]);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(frame, "Entrada inválida. Las coordenadas deben ser números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    sb.append("La distancia entre los dos puntos es: ").append(distancia).append("\n");

    textArea.setText(sb.toString());
}
}