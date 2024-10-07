/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.concurrent.Semaphore;
import javax.swing.JLabel;

/**
 *
 * @author hugoduque
 */
public class ProjectManager {
    private float salaryAcumulate;
    private int dayDuration;
    private int salary;
    private int fault;
    private int discounted;
    private String status;
    private int hoursCounter;
    private int minutesCounter;
    private int daysPassedTotal; // solo para el pm, que el lo cambie 
    private JLabel[] labels;
    private Semaphore mutex;
    private Company company;
    private Semaphore mutex2;
    private Semaphore mutex3;
}
