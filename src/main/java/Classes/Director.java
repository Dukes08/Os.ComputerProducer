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
public class Director extends Thread{
    
    private float salaryAcumulate;
    private int dayDuration;
    private int salary;
    private LogicHandler logicHandler;
    private int daysCounter;
    private int daysToFinishWork;
    private String status;
    private Semaphore mutex;
    private Semaphore mutex2;
    private Semaphore mutex3;
    private Company company;
    private int deadlineRepeat;
    private boolean directorMode;
    private JLabel[] labels;
    
    public Director(int dayDuration, LogicHandler logicHandler, Semaphore mutex, Semaphore mutex2, Semaphore mutex3, Company company) {
        this.salaryAcumulate = 0;
        this.dayDuration = dayDuration;
        this.logicHandler = logicHandler;
        this.daysCounter = 0;
        this.mutex = mutex;
        this.mutex2 = mutex2;
        this.mutex3 = mutex3;
        this.salary = 60;
        this.daysToFinishWork = 1;
        this.company = company;
        this.deadlineRepeat = company.getDeadline();
        this.directorMode = false;
    }
    
    public void paySalary(){
        this.salaryAcumulate = this.salaryAcumulate + (this.salary * 24);
    }
    
    
}
