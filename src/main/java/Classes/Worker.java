/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author andresrivas
 */
public class Worker extends Thread{
    private int type;
    private float salaryAcumulate;
    private int dayDuration;
    private int quantityWorkers;
    private int salary;
    private int daysCounter;
    private int daysToFinishWork;
    private LogicHandler logicHandler;
    private Semaphore mutex;
    
    public Worker(int type, int dayDuration, int quantity, LogicHandler logicHandler,Semaphore mutex, int [] daysToFinish) {
        this.type = type;
        this.quantityWorkers = quantity;
        this.daysToFinishWork = daysToFinish[type];
        if (this.type == 0) {
            this.salary = 20;
        }
        else if (this.type == 1) {
            this.salary = 26;
        }
        else if (this.type == 2) {
            this.salary = 40;
        }
        else if (this.type == 3) {
            this.salary = 16;
        }
        else if (this.type == 4) {
            this.salary = 34;
        } 
        this.salaryAcumulate = 0;
        this.dayDuration = dayDuration;
        this.logicHandler = logicHandler;
        this.daysCounter = 0;
        this.mutex = mutex;
    }
    
    @Override
    public void run(){
        while(true) {
            try {
                paySalary();
                work();
                sleep(this.getDayDuration());
            } catch (InterruptedException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void paySalary(){
        //System.out.println("WORKER " + type + " Acumulado " + salaryAcumulate);
        this.setSalaryAcumulate(this.getSalaryAcumulate() + ((this.getSalary() * 24)) * this.getQuantityWorkers());
    }
    
    public void work(){
        this.setDaysCounter(this.getDaysCounter() + 1);
        if (this.getDaysCounter() == this.getDaysToFinishWork()){ // ese valor de 2 depende de la compania
            try {
                this.getMutex().acquire(); //wait
                this.getLogicHandler().createComponent(this.getType(), this.getQuantityWorkers()); //critica
                this.getMutex().release(); // signal
                this.setDaysCounter(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }
     
    public void deleteWorker() {
        if (this.getQuantityWorkers() != 1) {
            this.setQuantityWorkers(this.quantityWorkers - 1);
        } else {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        }
    }
    
    public void addWorker(){
        this.setQuantityWorkers(quantityWorkers + 1);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public float getSalaryAcumulate() {
        return salaryAcumulate;
    }

    public void setSalaryAcumulate(float salaryAcumulate) {
        this.salaryAcumulate = salaryAcumulate;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public int getQuantityWorkers() {
        return quantityWorkers;
    }

    public void setQuantityWorkers(int quantityWorkers) {
        this.quantityWorkers = quantityWorkers;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDaysCounter() {
        return daysCounter;
    }

    public void setDaysCounter(int daysCounter) {
        this.daysCounter = daysCounter;
    }

    public int getDaysToFinishWork() {
        return daysToFinishWork;
    }

    public void setDaysToFinishWork(int daysToFinishWork) {
        this.daysToFinishWork = daysToFinishWork;
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    public LogicHandler getLogicHandler() {
        return logicHandler;
    }

    public void setLogicHandler(LogicHandler logicHandler) {
        this.logicHandler = logicHandler;
    }
  
}
