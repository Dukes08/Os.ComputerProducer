/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;

/**
 *
 * @author hugoduque
 */
public class Company extends Thread{
    private Worker motherBoardMakers;
    private Worker cpusMakers;
    private Worker ramMakers;
    private Worker powerSourceMakers;
    private Worker graphicCardMakers;
    private Assembler ensambladores; 
    private ProjectManager projectManager;
    private int [] requirements;
    private int [] daysToFinishWork;
    private int [] initialAmount;
    private int maxWorkers;
    private int dayDuration;
    private int computerPrice;
    private int graphiCardPrice;
    private int revenue;  // RUN
    private int costs;
    private int utility;
    private int deadline;
    
    private Semaphore mutex;
    private Semaphore mutex2;
    private Semaphore mutex3;
    private LogicHandler logicHandler;
    
    public Company(int [] requirements, int [] daysToFinishWork, int [] initialAmount, int maxWorkers, int dayDuration, int computerPrice, int graphiCardPrice, int deadline){
        this.requirements = requirements;
        this.daysToFinishWork = daysToFinishWork;
        this.initialAmount = initialAmount;
        this.maxWorkers = maxWorkers;
        this.dayDuration = dayDuration;
        this.revenue = 0;
        this.costs = 0;
        this.utility = 0;
        this.computerPrice = computerPrice;
        this.graphiCardPrice = graphiCardPrice;
        this.logicHandler = new LogicHandler(requirements, this);
        this.mutex = new Semaphore(1);
        this.mutex2 = new Semaphore(1);
        this.mutex3 = new Semaphore(1);
        this.deadline = deadline;
        workersIntance();   
    }
    
    public void costAnalytics() {
        this.setCosts((int) (getMotherBoardMakers().getSalaryAcumulate() + getCpusMakers().getSalaryAcumulate() + getRamMakers().getSalaryAcumulate() + getPowerSourceMakers().getSalaryAcumulate() + getGraphicCardMakers().getSalaryAcumulate() + getEnsambladores().getSalaryAcumulate())); // director an pm classes missing       
    }
    
    public void utilidadesTotales() {
        this.setUtility(this.getRevenue() - this.getCosts());
    }
    
    public void workersIntance(){
        setMotherBoardMakers(new Worker(0, getDayDuration(), getInitialAmount()[0], getLogicHandler(), getMutex(), getDaysToFinishWork()));
        setCpusMakers(new Worker(1, getDayDuration(), getInitialAmount()[1], getLogicHandler(), getMutex(), getDaysToFinishWork()));
        setRamMakers(new Worker(2, getDayDuration(), getInitialAmount()[2], getLogicHandler(), getMutex(), getDaysToFinishWork()));
        setPowerSourceMakers(new Worker(3, getDayDuration(), getInitialAmount()[3], getLogicHandler(), getMutex(), getDaysToFinishWork()));
        setGraphicCardMakers(new Worker(4, getDayDuration(), getInitialAmount()[4], getLogicHandler(), getMutex(), getDaysToFinishWork()));
        setEnsambladores(new Assembler(getDayDuration(), getInitialAmount()[5], getLogicHandler(), getMutex()));
        projectManager = new ProjectManager(dayDuration, mutex, mutex2, mutex3, this);
        //director missing
    }
    
    public void workersStart() {
        getMotherBoardMakers().start();
        getCpusMakers().start();
        getRamMakers().start();
        getPowerSourceMakers().start();
        getGraphicCardMakers().start();
        getEnsambladores().start();  
        projectManager.start();  
        //director missing
    }
    
    public void addWorkers(int type) {
        int actualWorkersCounter = (getMotherBoardMakers().getQuantityWorkers() + getCpusMakers().getQuantityWorkers() + getRamMakers().getQuantityWorkers() + getPowerSourceMakers().getQuantityWorkers() + getGraphicCardMakers().getQuantityWorkers() + getEnsambladores().getQuantityWorkers());
        if (actualWorkersCounter < getMaxWorkers()) {
            if (type == 0) {
                getMotherBoardMakers().addWorker();  
            }
            if (type == 1) {
                getCpusMakers().addWorker();   
            }
            if (type == 2) {
                getRamMakers().addWorker();  
            }
            if (type == 3) {
                getPowerSourceMakers().addWorker();   
            }
            if (type == 4) {
                getGraphicCardMakers().addWorker();   
            }
            if (type == 5) {
                getEnsambladores().addWorker();   
            }    
        } else {
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        }
    }  

    public ProjectManager getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(ProjectManager projectManager) {
        this.projectManager = projectManager;
    }

    /**
     * @return the motherBoardMakers
     */
    public Worker getMotherBoardMakers() {
        return motherBoardMakers;
    }

    /**
     * @param motherBoardMakers the motherBoardMakers to set
     */
    public void setMotherBoardMakers(Worker motherBoardMakers) {
        this.motherBoardMakers = motherBoardMakers;
    }

    /**
     * @return the cpusMakers
     */
    public Worker getCpusMakers() {
        return cpusMakers;
    }

    /**
     * @param cpusMakers the cpusMakers to set
     */
    public void setCpusMakers(Worker cpusMakers) {
        this.cpusMakers = cpusMakers;
    }

    /**
     * @return the ramMakers
     */
    public Worker getRamMakers() {
        return ramMakers;
    }

    /**
     * @param ramMakers the ramMakers to set
     */
    public void setRamMakers(Worker ramMakers) {
        this.ramMakers = ramMakers;
    }

    /**
     * @return the powerSourceMakers
     */
    public Worker getPowerSourceMakers() {
        return powerSourceMakers;
    }

    /**
     * @param powerSourceMakers the powerSourceMakers to set
     */
    public void setPowerSourceMakers(Worker powerSourceMakers) {
        this.powerSourceMakers = powerSourceMakers;
    }

    /**
     * @return the graphicCardMakers
     */
    public Worker getGraphicCardMakers() {
        return graphicCardMakers;
    }

    /**
     * @param graphicCardMakers the graphicCardMakers to set
     */
    public void setGraphicCardMakers(Worker graphicCardMakers) {
        this.graphicCardMakers = graphicCardMakers;
    }

    /**
     * @return the ensambladores
     */
    public Assembler getEnsambladores() {
        return ensambladores;
    }

    /**
     * @param ensambladores the ensambladores to set
     */
    public void setEnsambladores(Assembler ensambladores) {
        this.ensambladores = ensambladores;
    }

    /**
     * @return the requirements
     */
    public int[] getRequirements() {
        return requirements;
    }

    /**
     * @param requirements the requirements to set
     */
    public void setRequirements(int[] requirements) {
        this.requirements = requirements;
    }

    /**
     * @return the daysToFinishWork
     */
    public int[] getDaysToFinishWork() {
        return daysToFinishWork;
    }

    /**
     * @param daysToFinishWork the daysToFinishWork to set
     */
    public void setDaysToFinishWork(int[] daysToFinishWork) {
        this.daysToFinishWork = daysToFinishWork;
    }

    /**
     * @return the initialAmount
     */
    public int[] getInitialAmount() {
        return initialAmount;
    }

    /**
     * @param initialAmount the initialAmount to set
     */
    public void setInitialAmount(int[] initialAmount) {
        this.initialAmount = initialAmount;
    }

    /**
     * @return the maxWorkers
     */
    public int getMaxWorkers() {
        return maxWorkers;
    }

    /**
     * @param maxWorkers the maxWorkers to set
     */
    public void setMaxWorkers(int maxWorkers) {
        this.maxWorkers = maxWorkers;
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
     * @return the computerPrice
     */
    public int getComputerPrice() {
        return computerPrice;
    }

    /**
     * @param computerPrice the computerPrice to set
     */
    public void setComputerPrice(int computerPrice) {
        this.computerPrice = computerPrice;
    }

    /**
     * @return the graphiCardPrice
     */
    public int getGraphiCardPrice() {
        return graphiCardPrice;
    }

    /**
     * @param graphiCardPrice the graphiCardPrice to set
     */
    public void setGraphiCardPrice(int graphiCardPrice) {
        this.graphiCardPrice = graphiCardPrice;
    }

    /**
     * @return the revenue
     */
    public int getRevenue() {
        return revenue;
    }

    /**
     * @param revenue the revenue to set
     */
    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    /**
     * @return the costs
     */
    public int getCosts() {
        return costs;
    }

    /**
     * @param costs the costs to set
     */
    public void setCosts(int costs) {
        this.costs = costs;
    }

    /**
     * @return the utility
     */
    public int getUtility() {
        return utility;
    }

    /**
     * @param utility the utility to set
     */
    public void setUtility(int utility) {
        this.utility = utility;
    }

    /**
     * @return the deadline
     */
    public int getDeadline() {
        return deadline;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(int deadline) {
        this.deadline = deadline;
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
}


