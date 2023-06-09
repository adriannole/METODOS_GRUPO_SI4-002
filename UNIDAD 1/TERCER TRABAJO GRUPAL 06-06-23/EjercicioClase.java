/**
 *
 * @author Adrian Nole PC
 */
//SE UTILIZO LA LIBRERIA: JFreeChart para representar la Grafica , el progroma le pide al usuario que ingrese 10 valores para x mayores a 250 y con esos reultados imprima la grafica

import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.DefaultXYDataset;

public class EjercicioClase {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        BigDecimal[] resultados = new BigDecimal[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número mayor a 250:");
            String numero = leer.nextLine();
            int numero2 = Integer.parseInt(numero);

            if (numero2 > 250) {
                BigDecimal x = new BigDecimal(numero); // Valor de x para la expresión

                // Calcular e^x
                BigDecimal ePowX = new BigDecimal(Math.exp(x.doubleValue()));

                // Calcular el denominador e^x - 1
                BigDecimal denominator = ePowX.subtract(BigDecimal.ONE);

                // Calcular el resultado final
                BigDecimal result = ePowX.divide(denominator, 10000, BigDecimal.ROUND_HALF_UP);

                resultados[i] = result;
            } else {
                System.out.println("El número está fuera de rango. Por favor, ingrese un número mayor a 250.");
                i--; // Restar 1 al contador para repetir la iteración
            }
        }

        // Imprimir tabla de resultados
        System.out.println("Tabla de Resultados:");
        System.out.println("--------------------");
        System.out.println("Iteración\tResultado");
        System.out.println("--------------------");

        DecimalFormat df = new DecimalFormat("#." + new String(new char[10000]).replace("\0", "0"));

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t\t" + df.format(resultados[i]));
        }
        System.out.println("--------------------");

        // Crear el conjunto de datos para la gráfica
        DefaultXYDataset dataset = new DefaultXYDataset();
        double[][] seriesData = new double[2][10];
        for (int i = 0; i < 10; i++) {
            seriesData[0][i] = i + 1;
            seriesData[1][i] = resultados[i].doubleValue();
        }
        dataset.addSeries("Resultado", seriesData);

        // Crear la gráfica
        JFreeChart chart = ChartFactory.createXYLineChart("Gráfico de Resultados", "Iteración", "Resultado", dataset);

        // Mostrar la gráfica en una ventana
        ChartFrame frame = new ChartFrame("Gráfica", chart);
        frame.pack();
        frame.setVisible(true);
    }
}
