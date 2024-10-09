/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author andresrivas
 */

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
public class GraphManager {
    private XYSeries seriesApple;
    private XYSeries seriesHp;
    //private XYPlot plot;
    private JPanel grafico;
    private Company apple;
    private Company hp;
    private int counter = 1;

    public GraphManager(JPanel grafico, Company apple, Company hp) {
        seriesApple = new XYSeries("Nickelodeon");
        seriesHp = new XYSeries("Disney");
        this.grafico = grafico;
        this.apple = apple;
        this.hp = hp;

        JFreeChart lineChart = ChartFactory.createXYLineChart("Utility VS Time", "Days", "Utility", getDataset(), PlotOrientation.VERTICAL, true, true, false);
        ChartPanel chartpanel = new ChartPanel(lineChart);
        
        XYPlot plot = lineChart.getXYPlot();

        // Crear un renderizador de series personalizado (LineAndShapeRenderer para gráficos de líneas)
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.BLUE);  // Serie 0 (Apple) en azul
        renderer.setSeriesPaint(1, Color.RED);    // Serie 1 (Hp) en rojo
        renderer.setSeriesShapesVisible(0, true);  // Mostrar puntos para la serie 0
        renderer.setSeriesShapesVisible(1, true);  // Mostrar puntos para la serie 1
        renderer.setSeriesLinesVisible(0, true);    // Mostrar líneas para la serie 0
        renderer.setSeriesLinesVisible(1, true);    // Mostrar líneas para la serie 1
        renderer.setSeriesStroke(0, new BasicStroke(3.0f)); // Grosor de la línea para la serie 0
        renderer.setSeriesStroke(1, new BasicStroke(3.0f)); // Grosor de la línea para la serie 1

        plot.setRenderer(renderer);

        chartpanel.setPreferredSize(new java.awt.Dimension(700, 500));
        grafico.setLayout(new BorderLayout());
        grafico.add(chartpanel, BorderLayout.CENTER);
        grafico.validate();
    }

    private XYSeriesCollection getDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(seriesApple);
        dataset.addSeries(seriesHp);
        return dataset;
    }

    // Método para actualizar las utilidades y el tiempo en el gráfico
    public void actualizarGrafico() {
        seriesApple.add(counter, apple.getUtility());
        seriesHp.add(counter, hp.getUtility());
        counter ++;
    }
}
