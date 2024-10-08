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
        this.setSalaryAcumulate(this.getSalaryAcumulate() + (this.getSalary() * 24));
    }
    
    public void checkDeadline(){
        try {
            this.getMutex2().acquire(); //wait
            if (this.getCompany().getDeadline() == 0) {
                setDirectorMode(true);
                this.getCompany().setDeadline(getDeadlineRepeat());
                this.getLabels()[1].setText(Integer.toString(this.getCompany().getDeadline()));
            }
            this.getMutex2().release(); // signal
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
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
     * @return the logicHandler
     */
    public LogicHandler getLogicHandler() {
        return logicHandler;
    }

    /**
     * @param logicHandler the logicHandler to set
     */
    public void setLogicHandler(LogicHandler logicHandler) {
        this.logicHandler = logicHandler;
    }

    /**
     * @return the daysCounter
     */
    public int getDaysCounter() {
        return daysCounter;
    }

    /**
     * @param daysCounter the daysCounter to set
     */
    public void setDaysCounter(int daysCounter) {
        this.daysCounter = daysCounter;
    }

    /**
     * @return the daysToFinishWork
     */
    public int getDaysToFinishWork() {
        return daysToFinishWork;
    }

    /**
     * @param daysToFinishWork the daysToFinishWork to set
     */
    public void setDaysToFinishWork(int daysToFinishWork) {
        this.daysToFinishWork = daysToFinishWork;
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
     * @return the deadlineRepeat
     */
    public int getDeadlineRepeat() {
        return deadlineRepeat;
    }

    /**
     * @param deadlineRepeat the deadlineRepeat to set
     */
    public void setDeadlineRepeat(int deadlineRepeat) {
        this.deadlineRepeat = deadlineRepeat;
    }

    /**
     * @return the directorMode
     */
    public boolean isDirectorMode() {
        return directorMode;
    }

    /**
     * @param directorMode the directorMode to set
     */
    public void setDirectorMode(boolean directorMode) {
        this.directorMode = directorMode;
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
    
    
}
