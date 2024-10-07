/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import javax.swing.JLabel;

/**
 *
 * @author hugoduque
 */
public class LogicHandler {
    
    private int motherBoards; //placa base
    private int cpus;
    private int rams;
    private int powerSource;
    private int graphicCardsMade;
    private int counterGraphiCard;
    private int graphicCardOnUse;
    private int computers;
    private Company company;
    private int [] requirements;
    private JLabel [] labels;
    
    public LogicHandler(int [] requirements, Company company){
        this.motherBoards = 0;
        this.cpus = 0;
        this.rams = 0;
        this.powerSource = 0;
        this.graphicCardsMade = 0;
        this.graphicCardOnUse = 0;
        this.counterGraphiCard = 0;
        this.computers = 0;
        this.requirements = requirements;
        this.company = company;
    }
    
    public void createComponent (int componentType, int workersAmount){
        //Add MotherBoard
        if(componentType == 0 && this.getMotherBoards() < 25){
            //get the amount of mb that exist in the system, how many is in the warehouse and how many the workers are building
            int motherBoardsAmount = this.getMotherBoards() + (1*workersAmount);
            if(motherBoardsAmount < 25){
                this.setMotherBoards(motherBoardsAmount);
            }else{
                //validation if the count overflows the limit amount set the count to 25
                this.setMotherBoards(25);
            }
            this.labels[componentType].setText(Integer.toString(this.getMotherBoards()));
        }
        //Add CPU
        else if(componentType == 1 && this.getCpus()< 20){
            //the cpusProducer produce 1 cpu by worker
            int cpusAmount = this.getCpus() + (1*workersAmount);
            if(cpusAmount < 20){
                this.setCpus(cpusAmount);
            }else{
                 this.setCpus(20);
            }
            this.labels[componentType].setText(Integer.toString(this.getCpus()));
        }
        //Add RAM
        else if(componentType == 2 && this.getRams()< 55){
            int cpusAmount = this.getRams() + (1*workersAmount);
            if(cpusAmount < 55){
                this.setCpus(cpusAmount);
            }else{
                 this.setCpus(55);
            }
            this.labels[componentType].setText(Integer.toString(this.getRams()));
        }
        //Add Power Source
        else if(componentType == 3 && this.getPowerSource()< 35){
            //times 5 because each worker create 5 ps
            int psAmount = this.getPowerSource()+ (5*workersAmount);
            if(psAmount < 35){
                this.setCpus(psAmount);
            }else{
                 this.setPowerSource(35);
            }
            this.labels[componentType].setText(Integer.toString(this.getPowerSource()));
        }
        //Add Graphic Card
        else if(componentType == 4 && this.getGraphicCardsMade()< 10){
            int gcAmount = this.getGraphicCardsMade()+ (1*workersAmount);
            if (gcAmount < 10) {
                this.setGraphicCardsMade(gcAmount);
            } else {
                this.setGraphicCardsMade(10);
            }
            this.labels[componentType].setText(Integer.toString(this.getGraphicCardsMade()));
        }
        checkRequirements();
    }
    
    public boolean checkRequirements() {
    return motherBoards >= requirements[0] && 
           cpus >= requirements[1] && 
           rams >= requirements[2] && 
           powerSource >= requirements[3];
}
    public void produceComputer(int assemblersAmount){
        int computersAmount = assemblersAmount;
        //motherBoards
        int quantity = posibleAmountOfProduceComputers(motherBoards, 0);
        if (quantity < computersAmount){
            computersAmount = quantity;
        }
        //cpus
        quantity = posibleAmountOfProduceComputers(cpus, 1);
        if (quantity < computersAmount){
            computersAmount = quantity;
        }
        
        //rams
        quantity = posibleAmountOfProduceComputers(cpus, 2);
        if (quantity < computersAmount){
            computersAmount = quantity;
        }
        
        //powerSource
        quantity = posibleAmountOfProduceComputers(cpus, 3);
        if (quantity < computersAmount){
            computersAmount = quantity;
        }
        
        motherBoards -= (requirements[0]*computersAmount);
        this.labels[0].setText(Integer.toString(this.getMotherBoards()));
        cpus -= (requirements[1]*computersAmount);
        this.labels[1].setText(Integer.toString(this.getCpus()));
        rams -= (requirements[2]*computersAmount);
        this.labels[2].setText(Integer.toString(this.getRams()));
        powerSource -= (requirements[3]*computersAmount);
        this.labels[3].setText(Integer.toString(this.getPowerSource()));
        
        
        while (counterGraphiCard >= requirements[5] && graphicCardsMade >= requirements[4] && computersAmount > 0){
            graphicCardOnUse += 1;
            graphicCardsMade -= requirements[4];
            counterGraphiCard -= requirements[5];
            computersAmount -= 1;
        }        
        this.labels[4].setText(Integer.toString(this.getGraphicCardsMade()));
        computers += computersAmount;
        counterGraphiCard += computersAmount;
        
        this.labels[5].setText(Integer.toString(computers));
        this.labels[6].setText(Integer.toString(graphicCardOnUse));  
        
        
    }
    
    public int posibleAmountOfProduceComputers(int value, int componentType){
        int amount = value;
        int quantity = 0;
        while (amount > 0){
            int rest = amount - requirements[componentType];
            if (rest >= 0){
                quantity += 1;
            }
            amount = rest;
        }
        
        return quantity;
    }
    
    public void sendComputer() {
        this.company.setRevenue(this.company.getRevenue()+ (this.company.getComputerPrice()*computers));
        this.company.setRevenue(this.company.getRevenue() + this.company.getGraphiCardPrice()*graphicCardOnUse);
        this.labels[7].setText(Integer.toString(this.company.getRevenue()));
        computers = 0;
        graphicCardOnUse = 0;
        this.labels[5].setText(Integer.toString(computers));
        this.labels[6].setText(Integer.toString(graphicCardOnUse));
    }
    
    /**
     * @return the motherBoards
     */
    public int getMotherBoards() {
        return motherBoards;
    }

    /**
     * @param motherBoards the motherBoards to set
     */
    public void setMotherBoards(int motherBoards) {
        this.motherBoards = motherBoards;
    }

    /**
     * @return the cpus
     */
    public int getCpus() {
        return cpus;
    }

    /**
     * @param cpus the cpus to set
     */
    public void setCpus(int cpus) {
        this.cpus = cpus;
    }

    /**
     * @return the rams
     */
    public int getRams() {
        return rams;
    }

    /**
     * @param rams the rams to set
     */
    public void setRams(int rams) {
        this.rams = rams;
    }

    /**
     * @return the powerSource
     */
    public int getPowerSource() {
        return powerSource;
    }

    /**
     * @param powerSource the powerSource to set
     */
    public void setPowerSource(int powerSource) {
        this.powerSource = powerSource;
    }

    /**
     * @return the graphicCardsMade
     */
    public int getGraphicCardsMade() {
        return graphicCardsMade;
    }

    /**
     * @param graphicCardsMade the graphicCardsMade to set
     */
    public void setGraphicCardsMade(int graphicCardsMade) {
        this.graphicCardsMade = graphicCardsMade;
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
     * @return the counterGraphiCard
     */
    public int getCounterGraphiCard() {
        return counterGraphiCard;
    }

    /**
     * @return the graphicCardOnUse
     */
    public int getGraphicCardOnUse() {
        return graphicCardOnUse;
    }

    /**
     * @return the computers
     */
    public int getComputers() {
        return computers;
    }

    /**
     * @param computers the computers to set
     */
    public void setComputers(int computers) {
        this.computers = computers;
    }
    public JLabel[] getLabels() {
        return labels;
    }

    public void setLabels(JLabel[] labels) {
        this.labels = labels;
    }
    
    
}
