/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author hugoduque
 */
public class ProjectManager extends Thread{
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
    private GraphManager grafico;
    
    public ProjectManager(int dayDuration, Semaphore mutex, Semaphore mutex2, Semaphore mutex3, Company company){
        this.salaryAcumulate = 0;
        this.dayDuration = dayDuration;
        this.salary = 40;
        this.fault = 0;
        this.discounted = 0;
        this.daysPassedTotal = 0;
        this.status = "Viendo Anime";
        this.mutex = mutex;
        this.mutex3 = mutex3;
        this.mutex2 = mutex2;
        this.company = company;
    }
    
    public void paySalary(){
        try {
            this.getMutex3().acquire(); //wait
            setSalaryAcumulate(this.getSalaryAcumulate() + (this.getSalary() * 24));
            this.getMutex3().release(); // signal
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void calculate(){
         try {
            this.mutex3.acquire(); //wait
            this.company.costAnalytics(); //critica
            this.labels[1].setText(Integer.toString(this.company.getCosts()));
            this.company.utilidadesTotales();
            this.labels[2].setText(Integer.toString(this.company.getUtility()));
            this.mutex3.release(); // signal
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
       
       
    public void work(){
        try {
            this.mutex2.acquire(); //wait
            this.company.setDeadline(this.company.getDeadline() - 1); //critica
            this.labels[3].setText(Integer.toString(this.company.getDeadline()));
            this.mutex2.release(); // signal
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void run(){
        while(true) {
            try {
                paySalary();
                calculate();
                // first 16 hours
                long startTime = System.currentTimeMillis();
                while(System.currentTimeMillis() - startTime <= ((dayDuration/24)*16)){
                    status = "Viendo anime";
                    this.labels[0].setText(status);
                    sleep(((dayDuration/24)/2));

                    status = "Reviewing";
                    this.labels[0].setText(status);
                    // check();
                    sleep(((dayDuration/24)/2));
                }
                
                // Restantes 8 horas
                status = "Working";
                this.labels[0].setText(status);
                work();
                setDaysPassedTotal(getDaysPassedTotal() + 1);
                this.labels[4].setText(Integer.toString(getDaysPassedTotal()));
                if (company.getMaxWorkers() == 13) {
                    this.labels[5].setText(Integer.toString(getDaysPassedTotal()));
                    this.grafico.actualizarGrafico();
                }
                sleep((dayDuration/24)*8);
            } catch (InterruptedException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * @return the salaryAcumulate
     */
    public float getSalaryAcumulate() {
        return salaryAcumulate;
    }

    /**
     * @param salaryAcumulate the salaryAcumulate to set
     */
    public void setSalaryAcumulate(float salaryAcumulate) {
        this.salaryAcumulate = salaryAcumulate;
    }

    /**
     * @return the dayDuration
     */
    public int getDayDuration() {
        return dayDuration;
    }

    /**
     * @param dayDuration the dayDuration to set
     */
    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the fault
     */
    public int getFault() {
        return fault;
    }

    /**
     * @param fault the fault to set
     */
    public void setFault(int fault) {
        this.fault = fault;
    }

    /**
     * @return the discounted
     */
    public int getDiscounted() {
        return discounted;
    }

    /**
     * @param discounted the discounted to set
     */
    public void setDiscounted(int discounted) {
        this.discounted = discounted;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the hoursCounter
     */
    public int getHoursCounter() {
        return hoursCounter;
    }

    /**
     * @param hoursCounter the hoursCounter to set
     */
    public void setHoursCounter(int hoursCounter) {
        this.hoursCounter = hoursCounter;
    }

    /**
     * @return the minutesCounter
     */
    public int getMinutesCounter() {
        return minutesCounter;
    }

    /**
     * @param minutesCounter the minutesCounter to set
     */
    public void setMinutesCounter(int minutesCounter) {
        this.minutesCounter = minutesCounter;
    }

    /**
     * @return the daysPassedTotal
     */
    public int getDaysPassedTotal() {
        return daysPassedTotal;
    }

    /**
     * @param daysPassedTotal the daysPassedTotal to set
     */
    public void setDaysPassedTotal(int daysPassedTotal) {
        this.daysPassedTotal = daysPassedTotal;
    }

    /**
     * @return the labels
     */
    public JLabel[] getLabels() {
        return labels;
    }

    /**
     * @param labels the labels to set
     */
    public void setLabels(JLabel[] labels) {
        this.labels = labels;
    }

    /**
     * @return the mutex
     */
    public Semaphore getMutex() {
        return mutex;
    }

    /**
     * @param mutex the mutex to set
     */
    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    /**
     * @return the company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(Company company) {
        this.company = company;
    }

    /**
     * @return the mutex2
     */
    public Semaphore getMutex2() {
        return mutex2;
    }

    /**
     * @param mutex2 the mutex2 to set
     */
    public void setMutex2(Semaphore mutex2) {
        this.mutex2 = mutex2;
    }

    /**
     * @return the mutex3
     */
    public Semaphore getMutex3() {
        return mutex3;
    }

    /**
     * @param mutex3 the mutex3 to set
     */
    public void setMutex3(Semaphore mutex3) {
        this.mutex3 = mutex3;
    }

    public GraphManager getGrafico() {
        return grafico;
    }

    public void setGrafico(GraphManager grafico) {
        this.grafico = grafico;
    }
    
    
}
