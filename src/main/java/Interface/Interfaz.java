/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;
import Classes.Company;
import Classes.GraphManager;
import javax.swing.*;
import java.io.File;
import java.io.PrintWriter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author andresrivas
 */
public class Interfaz extends javax.swing.JFrame {
    static Company apple;
    static Company hp;
    /**
     * Creates new form Interfaz
     */
    public Interfaz(Company apple, Company hp, int[] initialQuantitiesApple, int[] initialQuantitiesHp) {
        initComponents();
        this.apple = apple;
        this.hp = hp;
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana
        
     
        JLabel[] qttySavedPartsLabelsApple = {motherBoardMakersQttySavedApple, cpuMakersAppleQttySavedApple, ramMakersAppleQttySavedApple, powerSourceMakersAppleQttySavedApple, graphiCardMakersAppleQttySavedApple, basicComputersQttySavedApple, specialComputersAppleQttySavedApple, salesAppleLabel};
        apple.getLogicHandler().setLabels(qttySavedPartsLabelsApple);
        
        JLabel[] qttySavedPartsLabelsHp = {motherBoardMakersQttySavedHp, cpuMakersQttySavedHp, ramMakersHpQttySavedHp, powerSourceMakersHpQttySavedHp, graphiCardMakersHpQttySaveHp, basicComputersQttySavedHp, specialComputersQttySavedHp, salesHp};
        hp.getLogicHandler().setLabels(qttySavedPartsLabelsHp);
        
        JLabel[] pmLabelsApple = {pmStatusApple, costAppleLable, utilityAppleLable, appleDeadlineLable, appleDaysPassedLable, appleDaysPassedLable}; 
        apple.getProjectManager().setLabels(pmLabelsApple);
        
        JLabel[] pmLabelsHp = {pmStatusHp, costHp, utilityHp, hpDeadlineLable, hpDaysPassedLable, daysPassedGrafico}; 
        hp.getProjectManager().setLabels(pmLabelsHp);
        
        JLabel[] directorLabelsApple = {directorStatusApple, appleDeadlineLable, pmFaultsApple, applePmDiscountLable};
        apple.getDirector().setLabels(directorLabelsApple);
        
        JLabel[] directorLabelsHp = {directorStatusHp, hpDeadlineLable, pmFaultsHp, hpPmDiscountLable};
        hp.getDirector().setLabels(directorLabelsHp);
        
        GraphManager grafico = new GraphManager(Graph, apple, hp);
        hp.getProjectManager().setGrafico(grafico);
        
        apple.workersStart();
        hp.workersStart();
        
        this.motherBoardMakersQtty.setText(String.valueOf(initialQuantitiesApple[0]));
        this.cpuMakersAppleQtty.setText(String.valueOf(initialQuantitiesApple[1]));
        this.ramMakersAppleQtty.setText(String.valueOf(initialQuantitiesApple[2]));
        this.powerSourceMakersAppleQtty.setText(String.valueOf(initialQuantitiesApple[3]));
        this.graphiCardMakersAppleQtty.setText(String.valueOf(initialQuantitiesApple[4]));
        this.assemblersAppleQtty.setText(String.valueOf(initialQuantitiesApple[5]));
        
        this.motherBoardMakersQtty3.setText(String.valueOf(initialQuantitiesHp[0]));
        this.cpuMakersQttyHp.setText(String.valueOf(initialQuantitiesHp[1]));
        this.ramMakersHpQtty2.setText(String.valueOf(initialQuantitiesHp[2]));
        this.powerSourceMakersHpQtty2.setText(String.valueOf(initialQuantitiesHp[3]));
        this.graphiCardMakersHpQtty2.setText(String.valueOf(initialQuantitiesHp[4]));
        this.assemblersHpQtty2.setText(String.valueOf(initialQuantitiesHp[5]));
        
        this.motherBoardMakersApple.setText(String.valueOf(initialQuantitiesApple[0]));
        this.cpuMakersApple.setText(String.valueOf(initialQuantitiesApple[1]));
        this.ramMakersApple.setText(String.valueOf(initialQuantitiesApple[2]));
        this.powerSourceMakersApple.setText(String.valueOf(initialQuantitiesApple[3]));
        this.graphCardMakersApple.setText(String.valueOf(initialQuantitiesApple[4]));
        this.assemblersApple.setText(String.valueOf(initialQuantitiesApple[5]));
        
        this.motherBoardMakersHp.setText(String.valueOf(initialQuantitiesHp[0]));
        this.cpuMakersHp.setText(String.valueOf(initialQuantitiesHp[1]));
        this.ramMakersHp.setText(String.valueOf(initialQuantitiesHp[2]));
        this.powerSourceMakersHp.setText(String.valueOf(initialQuantitiesHp[3]));
        this.graphCardMakersHp.setText(String.valueOf(initialQuantitiesHp[4]));
        this.assemblersHp.setText(String.valueOf(initialQuantitiesHp[5]));
        
        this.deadline.setText(Integer.toString(apple.getDeadline()));
        this.day.setText(Integer.toString(apple.getDayDuration()));
        this.appleDeadlineLable.setText(Integer.toString(apple.getDeadline()));
        this.hpDeadlineLable.setText(Integer.toString(hp.getDeadline()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        daysPassedGrafico = new javax.swing.JLabel();
        Graph = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        motherBoardMakersQttySavedApple = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cpuMakersAppleQttySavedApple = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ramMakersAppleQttySavedApple = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        powerSourceMakersAppleQttySavedApple = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        graphiCardMakersAppleQttySavedApple = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        basicComputersQttySavedApple = new javax.swing.JLabel();
        specialComputersAppleQttySavedApple = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        ramsMaxQttyApple = new javax.swing.JLabel();
        cpusMaxQttyApple = new javax.swing.JLabel();
        motherBoardMaxQttyApple = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        powerSouerceMaxQttyApple = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        graphiCardMaxQttyApple = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        removeMB4 = new javax.swing.JButton();
        motherBoardMakersQtty = new javax.swing.JLabel();
        addMb4 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        removeCpu4 = new javax.swing.JButton();
        cpuMakersAppleQtty = new javax.swing.JLabel();
        addCpu4 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        removeRam4 = new javax.swing.JButton();
        ramMakersAppleQtty = new javax.swing.JLabel();
        addRam4 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        removePowSour4 = new javax.swing.JButton();
        powerSourceMakersAppleQtty = new javax.swing.JLabel();
        addPowSour4 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        removeGraphiCard5 = new javax.swing.JButton();
        addGraphiCard5 = new javax.swing.JButton();
        graphiCardMakersAppleQtty = new javax.swing.JLabel();
        removeAssembler6 = new javax.swing.JButton();
        addAssembler6 = new javax.swing.JButton();
        assemblersAppleQtty = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        projectManagerAppleQtty = new javax.swing.JLabel();
        directorAppleQtty = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        directorStatusApple = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        pmStatusApple = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        pmFaultsApple = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        salesAppleLabel = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        costAppleLable = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        utilityAppleLable = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        appleDaysPassedLable = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        appleDeadlineLable = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        applePmDiscountLable = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        motherBoardMakersQttySavedHp = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        cpuMakersQttySavedHp = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        ramMakersHpQttySavedHp = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        powerSourceMakersHpQttySavedHp = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        graphiCardMakersHpQttySaveHp = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        basicComputersQttySavedHp = new javax.swing.JLabel();
        specialComputersQttySavedHp = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        assemblersAppleQtty12 = new javax.swing.JLabel();
        assemblersAppleQtty13 = new javax.swing.JLabel();
        assemblersAppleQtty14 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        assemblersAppleQtty15 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        assemblersAppleQtty16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        salesHp = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        costHp = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        utilityHp = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        hpDaysPassedLable = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        hpDeadlineLable = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        hpPmDiscountLable = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        removeMB5 = new javax.swing.JButton();
        motherBoardMakersQtty3 = new javax.swing.JLabel();
        addMb5 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        removeCpu5 = new javax.swing.JButton();
        cpuMakersQttyHp = new javax.swing.JLabel();
        addCpu5 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        removeRam5 = new javax.swing.JButton();
        ramMakersHpQtty2 = new javax.swing.JLabel();
        addRam5 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        removePowSour5 = new javax.swing.JButton();
        powerSourceMakersHpQtty2 = new javax.swing.JLabel();
        addPowSour5 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        removeGraphiCard6 = new javax.swing.JButton();
        addGraphiCard6 = new javax.swing.JButton();
        graphiCardMakersHpQtty2 = new javax.swing.JLabel();
        removeAssembler7 = new javax.swing.JButton();
        addAssembler7 = new javax.swing.JButton();
        assemblersHpQtty2 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        projectManagerAppleQtty2 = new javax.swing.JLabel();
        directorAppleQtty2 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        directorStatusHp = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        pmStatusHp = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        pmFaultsHp = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        removeMB2 = new javax.swing.JButton();
        addMb2 = new javax.swing.JButton();
        motherBoardMakersApple = new javax.swing.JLabel();
        removeCpu1 = new javax.swing.JButton();
        cpuMakersApple = new javax.swing.JLabel();
        addCpu1 = new javax.swing.JButton();
        removeRam1 = new javax.swing.JButton();
        ramMakersApple = new javax.swing.JLabel();
        addRam1 = new javax.swing.JButton();
        removePowSour1 = new javax.swing.JButton();
        powerSourceMakersApple = new javax.swing.JLabel();
        addPowSour1 = new javax.swing.JButton();
        removeGraphCard1 = new javax.swing.JButton();
        graphCardMakersApple = new javax.swing.JLabel();
        addGraphCard1 = new javax.swing.JButton();
        removeAssembler1 = new javax.swing.JButton();
        assemblersApple = new javax.swing.JLabel();
        addAssembler1 = new javax.swing.JButton();
        removeDay = new javax.swing.JButton();
        day = new javax.swing.JLabel();
        addDay = new javax.swing.JButton();
        removeDeadline = new javax.swing.JButton();
        deadline = new javax.swing.JLabel();
        addDeadline = new javax.swing.JButton();
        removeCpu2 = new javax.swing.JButton();
        motherBoardMakersHp = new javax.swing.JLabel();
        addMotherBoard1 = new javax.swing.JButton();
        removeMotherBoard1 = new javax.swing.JButton();
        cpuMakersHp = new javax.swing.JLabel();
        addCpu2 = new javax.swing.JButton();
        removeRam2 = new javax.swing.JButton();
        ramMakersHp = new javax.swing.JLabel();
        addRam2 = new javax.swing.JButton();
        removePowSour2 = new javax.swing.JButton();
        powerSourceMakersHp = new javax.swing.JLabel();
        addPowSour2 = new javax.swing.JButton();
        removeGraphCard2 = new javax.swing.JButton();
        graphCardMakersHp = new javax.swing.JLabel();
        addGraphCard2 = new javax.swing.JButton();
        removeAssembler2 = new javax.swing.JButton();
        assemblersHp = new javax.swing.JLabel();
        addAssembler2 = new javax.swing.JButton();
        txt = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(null);

        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("Dias transcurridos: ");
        jPanel4.add(jLabel82);
        jLabel82.setBounds(432, 51, 150, 17);

        daysPassedGrafico.setForeground(new java.awt.Color(255, 255, 255));
        daysPassedGrafico.setText("0");
        jPanel4.add(daysPassedGrafico);
        daysPassedGrafico.setBounds(588, 51, 40, 17);

        Graph.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout GraphLayout = new javax.swing.GroupLayout(Graph);
        Graph.setLayout(GraphLayout);
        GraphLayout.setHorizontalGroup(
            GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        GraphLayout.setVerticalGroup(
            GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        jPanel4.add(Graph);
        Graph.setBounds(210, 90, 710, 412);

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Money.jpg"))); // NOI18N
        jPanel4.add(jLabel86);
        jLabel86.setBounds(-10, 0, 1180, 790);

        jTabbedPane1.addTab("Apple vs Hp", jPanel4);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("WAREHOUSE");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Placas Base Guardadas:");

        motherBoardMakersQttySavedApple.setForeground(new java.awt.Color(255, 255, 255));
        motherBoardMakersQttySavedApple.setText("0");

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CPUs Guardados");

        cpuMakersAppleQttySavedApple.setForeground(new java.awt.Color(255, 255, 255));
        cpuMakersAppleQttySavedApple.setText("0");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Productores de memoria RAM:");

        ramMakersAppleQttySavedApple.setForeground(new java.awt.Color(255, 255, 255));
        ramMakersAppleQttySavedApple.setText("0");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Productores de Fuente de Alimentacion:");

        powerSourceMakersAppleQttySavedApple.setForeground(new java.awt.Color(255, 255, 255));
        powerSourceMakersAppleQttySavedApple.setText("0");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Tarjetas Graficas Guardadas:");

        graphiCardMakersAppleQttySavedApple.setForeground(new java.awt.Color(255, 255, 255));
        graphiCardMakersAppleQttySavedApple.setText("0");

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Computadores basicos:");

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Computadores con TarjetaG:");

        basicComputersQttySavedApple.setForeground(new java.awt.Color(255, 255, 255));
        basicComputersQttySavedApple.setText("0");

        specialComputersAppleQttySavedApple.setForeground(new java.awt.Color(255, 255, 255));
        specialComputersAppleQttySavedApple.setText("0");

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Placa Base Max:");

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("CPUs Max:");

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("RAMs Max:");

        ramsMaxQttyApple.setForeground(new java.awt.Color(255, 255, 255));
        ramsMaxQttyApple.setText("55");

        cpusMaxQttyApple.setForeground(new java.awt.Color(255, 255, 255));
        cpusMaxQttyApple.setText("20");

        motherBoardMaxQttyApple.setForeground(new java.awt.Color(255, 255, 255));
        motherBoardMaxQttyApple.setText("25");

        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Power Source Max:");

        powerSouerceMaxQttyApple.setForeground(new java.awt.Color(255, 255, 255));
        powerSouerceMaxQttyApple.setText("35");

        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("TarjetaG Max:");

        graphiCardMaxQttyApple.setForeground(new java.awt.Color(255, 255, 255));
        graphiCardMaxQttyApple.setText("10");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel23)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel18))
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel20))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(powerSourceMakersAppleQttySavedApple)
                                            .addComponent(cpuMakersAppleQttySavedApple)
                                            .addComponent(motherBoardMakersQttySavedApple)
                                            .addComponent(graphiCardMakersAppleQttySavedApple))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ramMakersAppleQttySavedApple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(motherBoardMaxQttyApple)
                                    .addComponent(cpusMaxQttyApple)
                                    .addComponent(ramsMaxQttyApple))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel57))))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(powerSouerceMaxQttyApple)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(graphiCardMaxQttyApple)
                                .addGap(14, 14, 14))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(specialComputersAppleQttySavedApple))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(basicComputersQttySavedApple)))
                        .addGap(30, 30, 30))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(motherBoardMakersQttySavedApple))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cpuMakersAppleQttySavedApple))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(ramMakersAppleQttySavedApple))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(powerSourceMakersAppleQttySavedApple))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(graphiCardMakersAppleQttySavedApple))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(basicComputersQttySavedApple))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(specialComputersAppleQttySavedApple))
                .addGap(98, 98, 98)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel29))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(motherBoardMaxQttyApple)
                            .addComponent(jLabel56)
                            .addComponent(powerSouerceMaxQttyApple))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpusMaxQttyApple)
                            .addComponent(jLabel57)
                            .addComponent(graphiCardMaxQttyApple))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ramsMaxQttyApple)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(514, 22, 310, 422);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel30.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("TRABAJADORES");

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Productores Placa Base:");

        removeMB4.setText("-");
        removeMB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMB4ActionPerformed(evt);
            }
        });

        motherBoardMakersQtty.setForeground(new java.awt.Color(255, 255, 255));
        motherBoardMakersQtty.setText("0");

        addMb4.setText("+");
        addMb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMb4ActionPerformed(evt);
            }
        });

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Productores de CPU:");

        removeCpu4.setText("-");
        removeCpu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCpu4ActionPerformed(evt);
            }
        });

        cpuMakersAppleQtty.setForeground(new java.awt.Color(255, 255, 255));
        cpuMakersAppleQtty.setText("0");

        addCpu4.setText("+");
        addCpu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCpu4ActionPerformed(evt);
            }
        });

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Productores de memoria RAM:");

        removeRam4.setText("-");
        removeRam4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRam4ActionPerformed(evt);
            }
        });

        ramMakersAppleQtty.setForeground(new java.awt.Color(255, 255, 255));
        ramMakersAppleQtty.setText("0");

        addRam4.setText("+");
        addRam4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRam4ActionPerformed(evt);
            }
        });

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Productores de Fuente de Alimentacion:");

        removePowSour4.setText("-");
        removePowSour4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePowSour4ActionPerformed(evt);
            }
        });

        powerSourceMakersAppleQtty.setForeground(new java.awt.Color(255, 255, 255));
        powerSourceMakersAppleQtty.setText("0");

        addPowSour4.setText("+");
        addPowSour4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPowSour4ActionPerformed(evt);
            }
        });

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Productores de Tarjetas Graficas:");

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Ensambladores:");

        removeGraphiCard5.setText("-");
        removeGraphiCard5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeGraphiCard5ActionPerformed(evt);
            }
        });

        addGraphiCard5.setText("+");
        addGraphiCard5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGraphiCard5ActionPerformed(evt);
            }
        });

        graphiCardMakersAppleQtty.setForeground(new java.awt.Color(255, 255, 255));
        graphiCardMakersAppleQtty.setText("0");

        removeAssembler6.setText("-");
        removeAssembler6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAssembler6ActionPerformed(evt);
            }
        });

        addAssembler6.setText("+");
        addAssembler6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAssembler6ActionPerformed(evt);
            }
        });

        assemblersAppleQtty.setForeground(new java.awt.Color(255, 255, 255));
        assemblersAppleQtty.setText("0");

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Project Manager:");

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Director:");

        projectManagerAppleQtty.setForeground(new java.awt.Color(255, 255, 255));
        projectManagerAppleQtty.setText("1");

        directorAppleQtty.setForeground(new java.awt.Color(255, 255, 255));
        directorAppleQtty.setText("1");

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("DirectorStatus:");

        directorStatusApple.setForeground(new java.awt.Color(255, 255, 255));
        directorStatusApple.setText("#");

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("PmStatus:");

        pmStatusApple.setForeground(new java.awt.Color(255, 255, 255));
        pmStatusApple.setText("#");

        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Project Manager fouls:");

        pmFaultsApple.setForeground(new java.awt.Color(255, 255, 255));
        pmFaultsApple.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeMB4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(motherBoardMakersQtty)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addMb4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeRam4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ramMakersAppleQtty)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addRam4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeCpu4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpuMakersAppleQtty)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addCpu4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel30)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(removeAssembler6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(removeGraphiCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                        .addComponent(removePowSour4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(powerSourceMakersAppleQtty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(addPowSour4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(graphiCardMakersAppleQtty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addGraphiCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(assemblersAppleQtty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addAssembler6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(18, 18, 18)
                                .addComponent(projectManagerAppleQtty))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pmStatusApple)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(directorAppleQtty)
                            .addComponent(directorStatusApple))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addComponent(pmFaultsApple)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(removeMB4)
                    .addComponent(motherBoardMakersQtty)
                    .addComponent(addMb4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(removeCpu4)
                    .addComponent(cpuMakersAppleQtty)
                    .addComponent(addCpu4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(removeRam4)
                    .addComponent(ramMakersAppleQtty)
                    .addComponent(addRam4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(removePowSour4)
                    .addComponent(powerSourceMakersAppleQtty)
                    .addComponent(addPowSour4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(removeGraphiCard5)
                    .addComponent(addGraphiCard5)
                    .addComponent(graphiCardMakersAppleQtty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(removeAssembler6)
                    .addComponent(addAssembler6)
                    .addComponent(assemblersAppleQtty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel37)
                    .addComponent(projectManagerAppleQtty)
                    .addComponent(directorAppleQtty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(directorStatusApple)
                    .addComponent(jLabel41)
                    .addComponent(pmStatusApple))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(pmFaultsApple))
                .addGap(76, 76, 76))
        );

        jPanel2.add(jPanel6);
        jPanel6.setBounds(17, 22, 429, 420);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jLabel43.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(204, 204, 204));
        jLabel43.setText("ANALITICAS");

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Ventas Totales");

        salesAppleLabel.setForeground(new java.awt.Color(255, 255, 255));
        salesAppleLabel.setText("0");

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Costos:");

        costAppleLable.setForeground(new java.awt.Color(255, 255, 255));
        costAppleLable.setText("0");

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Utilidad:");

        utilityAppleLable.setForeground(new java.awt.Color(255, 255, 255));
        utilityAppleLable.setText("0");

        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Dias transcurridos:");

        appleDaysPassedLable.setForeground(new java.awt.Color(255, 255, 255));
        appleDaysPassedLable.setText("0");

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Deadline:");

        appleDeadlineLable.setForeground(new java.awt.Color(255, 255, 255));
        appleDeadlineLable.setText("0");

        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Descuento al Pm:");

        applePmDiscountLable.setForeground(new java.awt.Color(255, 255, 255));
        applePmDiscountLable.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel43)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(applePmDiscountLable)
                            .addComponent(appleDeadlineLable)
                            .addComponent(salesAppleLabel)
                            .addComponent(appleDaysPassedLable)
                            .addComponent(utilityAppleLable)
                            .addComponent(costAppleLable))
                        .addGap(54, 54, 54))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(salesAppleLabel))
                .addGap(54, 54, 54)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(costAppleLable))
                .addGap(60, 60, 60)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(utilityAppleLable))
                .addGap(56, 56, 56)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(appleDaysPassedLable))
                .addGap(51, 51, 51)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(appleDeadlineLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(applePmDiscountLable))
                .addGap(15, 15, 15))
        );

        jPanel2.add(jPanel7);
        jPanel7.setBounds(859, 22, 287, 422);

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apple Fondo.jpeg"))); // NOI18N
        jLabel87.setText("jLabel87");
        jPanel2.add(jLabel87);
        jLabel87.setBounds(0, -30, 1180, 730);

        jTabbedPane1.addTab("Apple", jPanel2);

        jPanel3.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        jLabel24.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("WAREHOUSE");

        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Placas Base Guardadas:");

        motherBoardMakersQttySavedHp.setForeground(new java.awt.Color(255, 255, 255));
        motherBoardMakersQttySavedHp.setText("0");

        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("CPUs Guardados");

        cpuMakersQttySavedHp.setForeground(new java.awt.Color(255, 255, 255));
        cpuMakersQttySavedHp.setText("0");

        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Productores de memoria RAM:");

        ramMakersHpQttySavedHp.setForeground(new java.awt.Color(255, 255, 255));
        ramMakersHpQttySavedHp.setText("0");

        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Productores de Fuente de Alimentacion:");

        powerSourceMakersHpQttySavedHp.setForeground(new java.awt.Color(255, 255, 255));
        powerSourceMakersHpQttySavedHp.setText("0");

        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Tarjetas Graficas Guardadas:");

        graphiCardMakersHpQttySaveHp.setForeground(new java.awt.Color(255, 255, 255));
        graphiCardMakersHpQttySaveHp.setText("0");

        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Computadores basicos:");

        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Computadores con TarjetaG:");

        basicComputersQttySavedHp.setForeground(new java.awt.Color(255, 255, 255));
        basicComputersQttySavedHp.setText("0");

        specialComputersQttySavedHp.setForeground(new java.awt.Color(255, 255, 255));
        specialComputersQttySavedHp.setText("0");

        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Placa Base Max:");

        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("CPUs Max:");

        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("RAMs Max:");

        assemblersAppleQtty12.setForeground(new java.awt.Color(255, 255, 255));
        assemblersAppleQtty12.setText("55");

        assemblersAppleQtty13.setForeground(new java.awt.Color(255, 255, 255));
        assemblersAppleQtty13.setText("20");

        assemblersAppleQtty14.setForeground(new java.awt.Color(255, 255, 255));
        assemblersAppleQtty14.setText("25");

        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Power Source Max:");

        assemblersAppleQtty15.setForeground(new java.awt.Color(255, 255, 255));
        assemblersAppleQtty15.setText("35");

        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("TarjetaG Max:");

        assemblersAppleQtty16.setForeground(new java.awt.Color(255, 255, 255));
        assemblersAppleQtty16.setText("10");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addComponent(jLabel67)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel24))
                            .addComponent(jLabel65)
                            .addComponent(jLabel66)
                            .addComponent(jLabel69)
                            .addComponent(jLabel64))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(motherBoardMakersQttySavedHp)
                                    .addComponent(cpuMakersQttySavedHp))
                                .addGap(29, 29, 29))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(graphiCardMakersHpQttySaveHp)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ramMakersHpQttySavedHp)
                                            .addComponent(powerSourceMakersHpQttySavedHp))))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(specialComputersQttySavedHp)
                                .addGap(31, 31, 31))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(basicComputersQttySavedHp)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(jLabel71)
                            .addComponent(jLabel72))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(assemblersAppleQtty14)
                            .addComponent(assemblersAppleQtty13)
                            .addComponent(assemblersAppleQtty12))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73)
                            .addComponent(jLabel74))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assemblersAppleQtty16)
                            .addComponent(assemblersAppleQtty15))
                        .addGap(0, 13, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(motherBoardMakersQttySavedHp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(cpuMakersQttySavedHp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(ramMakersHpQttySavedHp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(powerSourceMakersHpQttySavedHp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(graphiCardMakersHpQttySaveHp))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(basicComputersQttySavedHp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(specialComputersQttySavedHp))
                .addGap(98, 98, 98)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel72))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assemblersAppleQtty14)
                            .addComponent(jLabel73)
                            .addComponent(assemblersAppleQtty15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(assemblersAppleQtty13)
                                    .addComponent(jLabel74))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(assemblersAppleQtty12))
                            .addComponent(assemblersAppleQtty16))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel9);
        jPanel9.setBounds(390, 40, 327, 422);

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        jLabel75.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(204, 204, 204));
        jLabel75.setText("ANALITICAS");

        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Ventas Totales:");

        salesHp.setForeground(new java.awt.Color(255, 255, 255));
        salesHp.setText("0");

        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Costos:");

        costHp.setForeground(new java.awt.Color(255, 255, 255));
        costHp.setText("0");

        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("Utilidad:");

        utilityHp.setForeground(new java.awt.Color(255, 255, 255));
        utilityHp.setText("0");

        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Dias transcurridos:");

        hpDaysPassedLable.setForeground(new java.awt.Color(255, 255, 255));
        hpDaysPassedLable.setText("0");

        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Deadline:");

        hpDeadlineLable.setForeground(new java.awt.Color(255, 255, 255));
        hpDeadlineLable.setText("0");

        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("Descuento al Pm:");

        hpPmDiscountLable.setForeground(new java.awt.Color(255, 255, 255));
        hpPmDiscountLable.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel75)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel77)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel76)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(salesHp))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel81)
                                            .addComponent(jLabel80)
                                            .addComponent(jLabel79)
                                            .addComponent(jLabel78))
                                        .addGap(130, 130, 130)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(hpDeadlineLable)
                                            .addComponent(hpPmDiscountLable)
                                            .addComponent(hpDaysPassedLable)
                                            .addComponent(utilityHp)
                                            .addComponent(costHp))))
                                .addGap(451, 451, 451)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel75)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(salesHp))
                .addGap(42, 42, 42)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(costHp))
                .addGap(60, 60, 60)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(utilityHp))
                .addGap(56, 56, 56)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(hpDaysPassedLable))
                .addGap(51, 51, 51)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(hpDeadlineLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(hpPmDiscountLable))
                .addGap(15, 15, 15))
        );

        jPanel3.add(jPanel10);
        jPanel10.setBounds(730, 40, 319, 422);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jLabel38.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("TRABAJADORES");

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Productores Placa Base:");

        removeMB5.setText("-");
        removeMB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMB5ActionPerformed(evt);
            }
        });

        motherBoardMakersQtty3.setForeground(new java.awt.Color(255, 255, 255));
        motherBoardMakersQtty3.setText("0");

        addMb5.setText("+");
        addMb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMb5ActionPerformed(evt);
            }
        });

        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Productores de CPU:");

        removeCpu5.setText("-");
        removeCpu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCpu5ActionPerformed(evt);
            }
        });

        cpuMakersQttyHp.setForeground(new java.awt.Color(255, 255, 255));
        cpuMakersQttyHp.setText("0");

        addCpu5.setText("+");
        addCpu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCpu5ActionPerformed(evt);
            }
        });

        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Productores de memoria RAM:");

        removeRam5.setText("-");
        removeRam5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRam5ActionPerformed(evt);
            }
        });

        ramMakersHpQtty2.setForeground(new java.awt.Color(255, 255, 255));
        ramMakersHpQtty2.setText("0");

        addRam5.setText("+");
        addRam5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRam5ActionPerformed(evt);
            }
        });

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Productores de Fuente de Alimentacion:");

        removePowSour5.setText("-");
        removePowSour5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePowSour5ActionPerformed(evt);
            }
        });

        powerSourceMakersHpQtty2.setForeground(new java.awt.Color(255, 255, 255));
        powerSourceMakersHpQtty2.setText("0");

        addPowSour5.setText("+");
        addPowSour5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPowSour5ActionPerformed(evt);
            }
        });

        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Productores de Tarjetas Graficas:");

        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Ensambladores:");

        removeGraphiCard6.setText("-");
        removeGraphiCard6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeGraphiCard6ActionPerformed(evt);
            }
        });

        addGraphiCard6.setText("+");
        addGraphiCard6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGraphiCard6ActionPerformed(evt);
            }
        });

        graphiCardMakersHpQtty2.setForeground(new java.awt.Color(255, 255, 255));
        graphiCardMakersHpQtty2.setText("0");

        removeAssembler7.setText("-");
        removeAssembler7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAssembler7ActionPerformed(evt);
            }
        });

        addAssembler7.setText("+");
        addAssembler7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAssembler7ActionPerformed(evt);
            }
        });

        assemblersHpQtty2.setForeground(new java.awt.Color(255, 255, 255));
        assemblersHpQtty2.setText("0");

        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Project Manager:");

        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Director:");

        projectManagerAppleQtty2.setForeground(new java.awt.Color(255, 255, 255));
        projectManagerAppleQtty2.setText("1");

        directorAppleQtty2.setForeground(new java.awt.Color(255, 255, 255));
        directorAppleQtty2.setText("1");

        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("DirectorStatus:");

        directorStatusHp.setForeground(new java.awt.Color(255, 255, 255));
        directorStatusHp.setText("#");

        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("PmStatus:");

        pmStatusHp.setForeground(new java.awt.Color(255, 255, 255));
        pmStatusHp.setText("#");

        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Project Manager fouls:");

        pmFaultsHp.setForeground(new java.awt.Color(255, 255, 255));
        pmFaultsHp.setText("0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeMB5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(motherBoardMakersQtty3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addMb5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeRam5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ramMakersHpQtty2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addRam5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeCpu5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpuMakersQttyHp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addCpu5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel38)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel55)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(removeAssembler7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel54)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(removeGraphiCard6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel53)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addComponent(removePowSour5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(powerSourceMakersHpQtty2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(addPowSour5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(graphiCardMakersHpQtty2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addGraphiCard6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(assemblersHpQtty2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addAssembler7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel58)
                                .addGap(18, 18, 18)
                                .addComponent(projectManagerAppleQtty2))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pmStatusHp)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(directorAppleQtty2)
                            .addComponent(directorStatusHp))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addGap(18, 18, 18)
                        .addComponent(pmFaultsHp)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(removeMB5)
                    .addComponent(motherBoardMakersQtty3)
                    .addComponent(addMb5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(removeCpu5)
                    .addComponent(cpuMakersQttyHp)
                    .addComponent(addCpu5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(removeRam5)
                    .addComponent(ramMakersHpQtty2)
                    .addComponent(addRam5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(removePowSour5)
                    .addComponent(powerSourceMakersHpQtty2)
                    .addComponent(addPowSour5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(removeGraphiCard6)
                    .addComponent(addGraphiCard6)
                    .addComponent(graphiCardMakersHpQtty2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(removeAssembler7)
                    .addComponent(addAssembler7)
                    .addComponent(assemblersHpQtty2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel58)
                    .addComponent(projectManagerAppleQtty2)
                    .addComponent(directorAppleQtty2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(directorStatusHp)
                    .addComponent(jLabel61)
                    .addComponent(pmStatusHp))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(pmFaultsHp))
                .addGap(76, 76, 76))
        );

        jPanel3.add(jPanel8);
        jPanel8.setBounds(0, 40, 374, 420);

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HpF.jpg"))); // NOI18N
        jPanel3.add(jLabel84);
        jLabel84.setBounds(-270, 0, 1450, 730);

        jTabbedPane1.addTab("Hp", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("CONFIGURACION");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(530, 30, 197, 34);

        jLabel2.setText("APPLE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(187, 63, 39, 17);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HP");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1082, 63, 17, 17);

        jLabel4.setText("Productores Placa Base:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(15, 101, 200, 17);

        jLabel5.setText("Productores de CPU:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(15, 142, 180, 17);

        jLabel6.setText("Productores de memoria RAM:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(15, 186, 220, 17);

        jLabel7.setText("Productores de Fuente de Alimentacion:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(15, 219, 260, 17);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Productores de Tarjetas Graficas:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(809, 260, 250, 17);

        jLabel9.setText("Ensambladores:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(15, 289, 110, 17);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Productores Placa Base:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(797, 101, 210, 17);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Productores de CPU:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(796, 142, 190, 17);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Productores de memoria RAM:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(802, 186, 240, 17);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Productores de Fuente de Alimentacion:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(796, 219, 300, 17);

        jLabel14.setText("Productores de Tarjetas Graficas:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(15, 260, 250, 17);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ensambladores:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(818, 289, 140, 17);

        jLabel16.setText("Duracion del dia:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(460, 320, 120, 17);

        jLabel17.setText("Deadline:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(460, 360, 80, 17);

        removeMB2.setText("-");
        removeMB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMB2ActionPerformed(evt);
            }
        });
        jPanel1.add(removeMB2);
        removeMB2.setBounds(230, 100, 23, 23);

        addMb2.setText("+");
        addMb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMb2ActionPerformed(evt);
            }
        });
        jPanel1.add(addMb2);
        addMb2.setBounds(280, 100, 23, 23);

        motherBoardMakersApple.setText("0");
        jPanel1.add(motherBoardMakersApple);
        motherBoardMakersApple.setBounds(260, 100, 13, 17);

        removeCpu1.setText("-");
        removeCpu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCpu1ActionPerformed(evt);
            }
        });
        jPanel1.add(removeCpu1);
        removeCpu1.setBounds(230, 140, 23, 23);

        cpuMakersApple.setText("0");
        jPanel1.add(cpuMakersApple);
        cpuMakersApple.setBounds(267, 140, 10, 17);

        addCpu1.setText("+");
        addCpu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCpu1ActionPerformed(evt);
            }
        });
        jPanel1.add(addCpu1);
        addCpu1.setBounds(290, 140, 25, 23);

        removeRam1.setText("-");
        removeRam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRam1ActionPerformed(evt);
            }
        });
        jPanel1.add(removeRam1);
        removeRam1.setBounds(250, 180, 23, 23);

        ramMakersApple.setText("0");
        jPanel1.add(ramMakersApple);
        ramMakersApple.setBounds(277, 180, 20, 17);

        addRam1.setText("+");
        addRam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRam1ActionPerformed(evt);
            }
        });
        jPanel1.add(addRam1);
        addRam1.setBounds(300, 180, 25, 23);

        removePowSour1.setText("-");
        removePowSour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePowSour1ActionPerformed(evt);
            }
        });
        jPanel1.add(removePowSour1);
        removePowSour1.setBounds(280, 220, 23, 23);

        powerSourceMakersApple.setText("0");
        jPanel1.add(powerSourceMakersApple);
        powerSourceMakersApple.setBounds(310, 220, 20, 17);

        addPowSour1.setText("+");
        addPowSour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPowSour1ActionPerformed(evt);
            }
        });
        jPanel1.add(addPowSour1);
        addPowSour1.setBounds(330, 220, 25, 23);

        removeGraphCard1.setText("-");
        removeGraphCard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeGraphCard1ActionPerformed(evt);
            }
        });
        jPanel1.add(removeGraphCard1);
        removeGraphCard1.setBounds(280, 260, 23, 23);

        graphCardMakersApple.setText("0");
        jPanel1.add(graphCardMakersApple);
        graphCardMakersApple.setBounds(307, 260, 20, 17);

        addGraphCard1.setText("+");
        addGraphCard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGraphCard1ActionPerformed(evt);
            }
        });
        jPanel1.add(addGraphCard1);
        addGraphCard1.setBounds(340, 260, 25, 23);

        removeAssembler1.setText("-");
        removeAssembler1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAssembler1ActionPerformed(evt);
            }
        });
        jPanel1.add(removeAssembler1);
        removeAssembler1.setBounds(170, 290, 23, 23);

        assemblersApple.setText("0");
        jPanel1.add(assemblersApple);
        assemblersApple.setBounds(207, 290, 10, 17);

        addAssembler1.setText("+");
        addAssembler1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAssembler1ActionPerformed(evt);
            }
        });
        jPanel1.add(addAssembler1);
        addAssembler1.setBounds(230, 290, 25, 23);

        removeDay.setText("-");
        removeDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDayActionPerformed(evt);
            }
        });
        jPanel1.add(removeDay);
        removeDay.setBounds(620, 320, 23, 23);

        day.setText("0");
        jPanel1.add(day);
        day.setBounds(660, 330, 50, 17);

        addDay.setText("+");
        addDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDayActionPerformed(evt);
            }
        });
        jPanel1.add(addDay);
        addDay.setBounds(720, 320, 25, 23);

        removeDeadline.setText("-");
        removeDeadline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDeadlineActionPerformed(evt);
            }
        });
        jPanel1.add(removeDeadline);
        removeDeadline.setBounds(620, 360, 23, 23);

        deadline.setText("0");
        jPanel1.add(deadline);
        deadline.setBounds(670, 360, 20, 17);

        addDeadline.setText("+");
        addDeadline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeadlineActionPerformed(evt);
            }
        });
        jPanel1.add(addDeadline);
        addDeadline.setBounds(720, 360, 25, 23);

        removeCpu2.setText("-");
        removeCpu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCpu2ActionPerformed(evt);
            }
        });
        jPanel1.add(removeCpu2);
        removeCpu2.setBounds(1100, 140, 23, 23);

        motherBoardMakersHp.setForeground(new java.awt.Color(255, 255, 255));
        motherBoardMakersHp.setText("0");
        jPanel1.add(motherBoardMakersHp);
        motherBoardMakersHp.setBounds(1130, 100, 20, 17);

        addMotherBoard1.setText("+");
        addMotherBoard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMotherBoard1ActionPerformed(evt);
            }
        });
        jPanel1.add(addMotherBoard1);
        addMotherBoard1.setBounds(1140, 100, 25, 23);

        removeMotherBoard1.setText("-");
        removeMotherBoard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMotherBoard1ActionPerformed(evt);
            }
        });
        jPanel1.add(removeMotherBoard1);
        removeMotherBoard1.setBounds(1100, 100, 23, 23);

        cpuMakersHp.setForeground(new java.awt.Color(255, 255, 255));
        cpuMakersHp.setText("0");
        jPanel1.add(cpuMakersHp);
        cpuMakersHp.setBounds(1130, 140, 20, 17);

        addCpu2.setText("+");
        addCpu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCpu2ActionPerformed(evt);
            }
        });
        jPanel1.add(addCpu2);
        addCpu2.setBounds(1140, 140, 25, 23);

        removeRam2.setText("-");
        removeRam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRam2ActionPerformed(evt);
            }
        });
        jPanel1.add(removeRam2);
        removeRam2.setBounds(1100, 180, 23, 23);

        ramMakersHp.setForeground(new java.awt.Color(255, 255, 255));
        ramMakersHp.setText("0");
        jPanel1.add(ramMakersHp);
        ramMakersHp.setBounds(1130, 180, 20, 17);

        addRam2.setText("+");
        addRam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRam2ActionPerformed(evt);
            }
        });
        jPanel1.add(addRam2);
        addRam2.setBounds(1140, 180, 25, 23);

        removePowSour2.setText("-");
        removePowSour2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePowSour2ActionPerformed(evt);
            }
        });
        jPanel1.add(removePowSour2);
        removePowSour2.setBounds(1102, 216, 23, 23);

        powerSourceMakersHp.setForeground(new java.awt.Color(255, 255, 255));
        powerSourceMakersHp.setText("0");
        jPanel1.add(powerSourceMakersHp);
        powerSourceMakersHp.setBounds(1130, 220, 20, 17);

        addPowSour2.setText("+");
        addPowSour2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPowSour2ActionPerformed(evt);
            }
        });
        jPanel1.add(addPowSour2);
        addPowSour2.setBounds(1140, 210, 25, 23);

        removeGraphCard2.setText("-");
        removeGraphCard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeGraphCard2ActionPerformed(evt);
            }
        });
        jPanel1.add(removeGraphCard2);
        removeGraphCard2.setBounds(1100, 260, 23, 23);

        graphCardMakersHp.setForeground(new java.awt.Color(255, 255, 255));
        graphCardMakersHp.setText("0");
        jPanel1.add(graphCardMakersHp);
        graphCardMakersHp.setBounds(1130, 260, 20, 17);

        addGraphCard2.setText("+");
        addGraphCard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGraphCard2ActionPerformed(evt);
            }
        });
        jPanel1.add(addGraphCard2);
        addGraphCard2.setBounds(1140, 260, 25, 23);

        removeAssembler2.setText("-");
        removeAssembler2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAssembler2ActionPerformed(evt);
            }
        });
        jPanel1.add(removeAssembler2);
        removeAssembler2.setBounds(1100, 290, 23, 23);

        assemblersHp.setForeground(new java.awt.Color(255, 255, 255));
        assemblersHp.setText("0");
        jPanel1.add(assemblersHp);
        assemblersHp.setBounds(1130, 290, 20, 17);

        addAssembler2.setText("+");
        addAssembler2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAssembler2ActionPerformed(evt);
            }
        });
        jPanel1.add(addAssembler2);
        addAssembler2.setBounds(1140, 290, 25, 23);

        txt.setText("Guardar");
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });
        jPanel1.add(txt);
        txt.setBounds(600, 410, 77, 23);

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hp y Apple.jpg"))); // NOI18N
        jPanel1.add(jLabel83);
        jLabel83.setBounds(-50, -10, 1770, 730);

        jTabbedPane1.addTab("Configuration", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeMB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMB2ActionPerformed
        if (Integer.parseInt(motherBoardMakersApple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(motherBoardMakersApple.getText())-1;
            motherBoardMakersApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeMB2ActionPerformed

    private void addMb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMb2ActionPerformed
        if (calculateQuantityApple() == 12){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(motherBoardMakersApple.getText())+1;
            motherBoardMakersApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addMb2ActionPerformed

    private void removeCpu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCpu1ActionPerformed
        if (Integer.parseInt(cpuMakersApple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(cpuMakersApple.getText())-1;
            cpuMakersApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeCpu1ActionPerformed

    private void addCpu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCpu1ActionPerformed
        if (calculateQuantityApple() == 12){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(cpuMakersApple.getText())+1;
            cpuMakersApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addCpu1ActionPerformed

    private void removeRam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRam1ActionPerformed
        if (Integer.parseInt(ramMakersApple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(ramMakersApple.getText())-1;
            ramMakersApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeRam1ActionPerformed

    private void addRam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRam1ActionPerformed
        if (calculateQuantityApple() == 12){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(ramMakersApple.getText())+1;
            ramMakersApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addRam1ActionPerformed

    private void removePowSour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePowSour1ActionPerformed
        if (Integer.parseInt(powerSourceMakersApple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(powerSourceMakersApple.getText())-1;
            powerSourceMakersApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removePowSour1ActionPerformed

    private void addPowSour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPowSour1ActionPerformed
        if (calculateQuantityApple() == 12){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(powerSourceMakersApple.getText())+1;
            powerSourceMakersApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addPowSour1ActionPerformed

    private void removeGraphCard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeGraphCard1ActionPerformed
        if (Integer.parseInt(graphCardMakersApple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(graphCardMakersApple.getText())-1;
            graphCardMakersApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeGraphCard1ActionPerformed

    private void addGraphCard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGraphCard1ActionPerformed
        if (calculateQuantityApple() == 12){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(graphCardMakersApple.getText())+1;
            graphCardMakersApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addGraphCard1ActionPerformed

    private void removeAssembler1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAssembler1ActionPerformed
        if (Integer.parseInt(assemblersApple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(assemblersApple.getText())-1;
            assemblersApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeAssembler1ActionPerformed

    private void addAssembler1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAssembler1ActionPerformed
        if (calculateQuantityApple() == 12){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(assemblersApple.getText())+1;
            assemblersApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addAssembler1ActionPerformed

    private void removeDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDayActionPerformed
        if(Integer.parseInt(day.getText())==2000){
            JOptionPane.showMessageDialog(null, "EL DIA DEBE DURAR MINIMO 2000MS");
        } else {
            int nuevo = Integer.parseInt(day.getText())-1000;
            day.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeDayActionPerformed

    private void addDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDayActionPerformed
        int nuevo = Integer.parseInt(day.getText())+1000;
        day.setText(String.valueOf(nuevo));
    }//GEN-LAST:event_addDayActionPerformed

    private void removeDeadlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDeadlineActionPerformed
        if(Integer.parseInt(deadline.getText())== 1){
            JOptionPane.showMessageDialog(null, "SE DEBE TENER POR LO MENOS UN DIA COMO DEADLINE DE ENTREGA");
        } else {
            int nuevo = Integer.parseInt(deadline.getText())-1;
            deadline.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeDeadlineActionPerformed

    private void addDeadlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDeadlineActionPerformed
        int nuevo = Integer.parseInt(deadline.getText())+1;
        deadline.setText(String.valueOf(nuevo));
    }//GEN-LAST:event_addDeadlineActionPerformed

    private void removeCpu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCpu2ActionPerformed
        if (Integer.parseInt(cpuMakersHp.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(cpuMakersHp.getText())-1;
            cpuMakersHp.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeCpu2ActionPerformed

    private void addMotherBoard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMotherBoard1ActionPerformed
        if (calculateQuantityHp() == 12){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(motherBoardMakersHp.getText())+1;
            motherBoardMakersHp.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addMotherBoard1ActionPerformed

    private void removeMotherBoard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMotherBoard1ActionPerformed
        if (Integer.parseInt(motherBoardMakersHp.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(motherBoardMakersHp.getText())-1;
            motherBoardMakersHp.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeMotherBoard1ActionPerformed

    private void addCpu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCpu2ActionPerformed
        if (calculateQuantityHp() == 12){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(cpuMakersHp.getText())+1;
            cpuMakersHp.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addCpu2ActionPerformed

    private void removeRam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRam2ActionPerformed
        if (Integer.parseInt(ramMakersHp.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(ramMakersHp.getText())-1;
            ramMakersHp.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeRam2ActionPerformed

    private void addRam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRam2ActionPerformed
        if (calculateQuantityHp() == 12){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(ramMakersHp.getText())+1;
            ramMakersHp.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addRam2ActionPerformed

    private void removePowSour2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePowSour2ActionPerformed
        if (Integer.parseInt(powerSourceMakersHp.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(powerSourceMakersHp.getText())-1;
            powerSourceMakersHp.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removePowSour2ActionPerformed

    private void addPowSour2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPowSour2ActionPerformed
        if (calculateQuantityHp() == 12){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(powerSourceMakersHp.getText())+1;
            powerSourceMakersHp.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addPowSour2ActionPerformed

    private void removeGraphCard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeGraphCard2ActionPerformed
        if (Integer.parseInt(graphCardMakersHp.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(graphCardMakersHp.getText())-1;
            graphCardMakersHp.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeGraphCard2ActionPerformed

    private void addGraphCard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGraphCard2ActionPerformed
        if (calculateQuantityHp() == 12){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(graphCardMakersHp.getText())+1;
            graphCardMakersHp.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addGraphCard2ActionPerformed

    private void removeAssembler2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAssembler2ActionPerformed
        if (Integer.parseInt(assemblersHp.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(assemblersHp.getText())-1;
            assemblersHp.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeAssembler2ActionPerformed

    private void addAssembler2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAssembler2ActionPerformed
        if (calculateQuantityHp() == 12){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(assemblersHp.getText())+1;
            assemblersHp.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addAssembler2ActionPerformed

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        String quantities = motherBoardMakersApple.getText() + ", " + cpuMakersApple.getText() + ", " + ramMakersApple.getText() + ", " + powerSourceMakersApple.getText() + ", " + graphCardMakersApple.getText() + ", " + assemblersApple.getText() + " / " + motherBoardMakersHp.getText() + ", " + cpuMakersHp.getText() + ", " + ramMakersHp.getText() + ", " + powerSourceMakersHp.getText() + ", " + graphCardMakersHp.getText() + ", " + assemblersHp.getText();
        String data = day.getText() + " / " + deadline.getText();

        // DATOS INICIALES
        File fichero = new File("DatosIniciales.txt");
        String contenido = "";

        try{
            PrintWriter salida = new PrintWriter(fichero);
            salida.print(data);
            salida.close();
        }catch(Exception e){
            System.out.println(e);
        }

        // CANTIDADES INICIALES

        fichero = new File("InitialQuantity.txt");

        try{
            PrintWriter salida = new PrintWriter(fichero);
            salida.print(quantities);
            salida.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_txtActionPerformed

    private void removeMB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMB4ActionPerformed
        // TODO add your handling code here:
        apple.getMotherBoardMakers().deleteWorker();
        this.motherBoardMakersQtty.setText(Integer.toString(apple.getMotherBoardMakers().getQuantityWorkers()));
    }//GEN-LAST:event_removeMB4ActionPerformed

    private void addMb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMb4ActionPerformed
        // TODO add your handling code here:
        apple.addWorkers(0);
        this.motherBoardMakersQtty.setText(Integer.toString(apple.getMotherBoardMakers().getQuantityWorkers()));
    }//GEN-LAST:event_addMb4ActionPerformed

    private void removeCpu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCpu4ActionPerformed
        // TODO add your handling code here:
        apple.getCpusMakers().deleteWorker();
        this.cpuMakersAppleQtty.setText(Integer.toString(apple.getCpusMakers().getQuantityWorkers()));
    }//GEN-LAST:event_removeCpu4ActionPerformed

    private void addCpu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCpu4ActionPerformed
        // TODO add your handling code here:
        apple.addWorkers(1);
        this.cpuMakersAppleQtty.setText(Integer.toString(apple.getCpusMakers().getQuantityWorkers()));
    }//GEN-LAST:event_addCpu4ActionPerformed

    private void removeRam4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRam4ActionPerformed
        // TODO add your handling code here:
         apple.getRamMakers().deleteWorker();
        this.ramMakersAppleQtty.setText(Integer.toString(apple.getRamMakers().getQuantityWorkers()));
    }//GEN-LAST:event_removeRam4ActionPerformed

    private void addRam4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRam4ActionPerformed
        // TODO add your handling code here:
         apple.addWorkers(2);
        this.ramMakersAppleQtty.setText(Integer.toString(apple.getRamMakers().getQuantityWorkers()));
    }//GEN-LAST:event_addRam4ActionPerformed

    private void removePowSour4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePowSour4ActionPerformed
        // TODO add your handling code here:
        apple.getPowerSourceMakers().deleteWorker();
        this.powerSourceMakersAppleQtty.setText(Integer.toString(apple.getPowerSourceMakers().getQuantityWorkers()));
    }//GEN-LAST:event_removePowSour4ActionPerformed

    private void addPowSour4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPowSour4ActionPerformed
        // TODO add your handling code here:
        apple.addWorkers(3);
        this.powerSourceMakersAppleQtty.setText(Integer.toString(apple.getPowerSourceMakers().getQuantityWorkers()));
    }//GEN-LAST:event_addPowSour4ActionPerformed

    private void removeGraphiCard5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeGraphiCard5ActionPerformed
        // TODO add your handling code here:
        apple.getGraphicCardMakers().deleteWorker();
        this.graphiCardMakersAppleQtty.setText(Integer.toString(apple.getGraphicCardMakers().getQuantityWorkers()));
    }//GEN-LAST:event_removeGraphiCard5ActionPerformed

    private void addGraphiCard5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGraphiCard5ActionPerformed
        // TODO add your handling code here:
        apple.addWorkers(4);
        this.graphiCardMakersAppleQtty.setText(Integer.toString(apple.getGraphicCardMakers().getQuantityWorkers()));
    }//GEN-LAST:event_addGraphiCard5ActionPerformed

    private void removeAssembler6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAssembler6ActionPerformed
        // TODO add your handling code here:
        apple.getEnsambladores().deleteWorker();
        this.assemblersAppleQtty.setText(Integer.toString(apple.getEnsambladores().getQuantityWorkers()));
    }//GEN-LAST:event_removeAssembler6ActionPerformed

    private void addAssembler6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAssembler6ActionPerformed
        // TODO add your handling code here:
        apple.addWorkers(5);
        this.assemblersAppleQtty.setText(Integer.toString(apple.getEnsambladores().getQuantityWorkers()));
    }//GEN-LAST:event_addAssembler6ActionPerformed

    private void removeMB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMB5ActionPerformed
        // TODO add your handling code here:
        hp.getMotherBoardMakers().deleteWorker();
        this.motherBoardMakersQtty3.setText(Integer.toString(hp.getMotherBoardMakers().getQuantityWorkers()));
    }//GEN-LAST:event_removeMB5ActionPerformed

    private void addMb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMb5ActionPerformed
        // TODO add your handling code here:
        hp.addWorkers(0);
        this.motherBoardMakersQtty3.setText(Integer.toString(hp.getMotherBoardMakers().getQuantityWorkers()));
    }//GEN-LAST:event_addMb5ActionPerformed

    private void removeCpu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCpu5ActionPerformed
        // TODO add your handling code here:
        hp.getCpusMakers().deleteWorker();
        this.cpuMakersQttyHp.setText(Integer.toString(hp.getCpusMakers().getQuantityWorkers()));
    }//GEN-LAST:event_removeCpu5ActionPerformed

    private void addCpu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCpu5ActionPerformed
        // TODO add your handling code here:
        hp.addWorkers(0);
        this.cpuMakersQttyHp.setText(Integer.toString(hp.getCpusMakers().getQuantityWorkers()));
    }//GEN-LAST:event_addCpu5ActionPerformed

    private void removeRam5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRam5ActionPerformed
        // TODO add your handling code here:
        hp.getRamMakers().deleteWorker();
        this.ramMakersHpQtty2.setText(Integer.toString(hp.getRamMakers().getQuantityWorkers()));
    }//GEN-LAST:event_removeRam5ActionPerformed

    private void addRam5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRam5ActionPerformed
        // TODO add your handling code here:
        hp.addWorkers(2);
        this.ramMakersHpQtty2.setText(Integer.toString(hp.getRamMakers().getQuantityWorkers()));
    }//GEN-LAST:event_addRam5ActionPerformed

    private void removePowSour5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePowSour5ActionPerformed
        // TODO add your handling code here:
        hp.getPowerSourceMakers().deleteWorker();
        this.powerSourceMakersHpQtty2.setText(Integer.toString(hp.getPowerSourceMakers().getQuantityWorkers()));
    }//GEN-LAST:event_removePowSour5ActionPerformed

    private void addPowSour5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPowSour5ActionPerformed
        // TODO add your handling code here:
        hp.addWorkers(3);
        this.powerSourceMakersHpQtty2.setText(Integer.toString(hp.getPowerSourceMakers().getQuantityWorkers()));
    }//GEN-LAST:event_addPowSour5ActionPerformed

    private void removeGraphiCard6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeGraphiCard6ActionPerformed
        // TODO add your handling code here:
        hp.getGraphicCardMakers().deleteWorker();
        this.graphiCardMakersHpQtty2.setText(Integer.toString(hp.getGraphicCardMakers().getQuantityWorkers()));
    }//GEN-LAST:event_removeGraphiCard6ActionPerformed

    private void addGraphiCard6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGraphiCard6ActionPerformed
        // TODO add your handling code here:
        hp.addWorkers(4);
        this.graphiCardMakersHpQtty2.setText(Integer.toString(hp.getGraphicCardMakers().getQuantityWorkers()));
    }//GEN-LAST:event_addGraphiCard6ActionPerformed

    private void removeAssembler7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAssembler7ActionPerformed
        // TODO add your handling code here:
        hp.getEnsambladores().deleteWorker();
        this.assemblersHpQtty2.setText(Integer.toString(hp.getEnsambladores().getQuantityWorkers()));
    }//GEN-LAST:event_removeAssembler7ActionPerformed

    private void addAssembler7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAssembler7ActionPerformed
        // TODO add your handling code here:
        hp.addWorkers(5);
        this.assemblersHpQtty2.setText(Integer.toString(hp.getEnsambladores().getQuantityWorkers()));
    }//GEN-LAST:event_addAssembler7ActionPerformed

    private int calculateQuantityApple(){
        int cantidadTotal = Integer.parseInt(motherBoardMakersApple.getText()) + Integer.parseInt(cpuMakersApple.getText()) + Integer.parseInt(ramMakersApple.getText()) + Integer.parseInt(powerSourceMakersApple.getText()) + Integer.parseInt(graphCardMakersApple.getText()) + Integer.parseInt(assemblersApple.getText());
        System.out.println(cantidadTotal);
        return cantidadTotal;
    }
    
    private int calculateQuantityHp(){
        int cantidadTotal = Integer.parseInt(motherBoardMakersHp.getText()) + Integer.parseInt(cpuMakersHp.getText()) + Integer.parseInt(ramMakersHp.getText()) + Integer.parseInt(powerSourceMakersHp.getText()) + Integer.parseInt(graphCardMakersHp.getText()) + Integer.parseInt(assemblersHp.getText());
        return cantidadTotal;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
       //         new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Graph;
    private javax.swing.JButton addAssembler1;
    private javax.swing.JButton addAssembler2;
    private javax.swing.JButton addAssembler6;
    private javax.swing.JButton addAssembler7;
    private javax.swing.JButton addCpu1;
    private javax.swing.JButton addCpu2;
    private javax.swing.JButton addCpu4;
    private javax.swing.JButton addCpu5;
    private javax.swing.JButton addDay;
    private javax.swing.JButton addDeadline;
    private javax.swing.JButton addGraphCard1;
    private javax.swing.JButton addGraphCard2;
    private javax.swing.JButton addGraphiCard5;
    private javax.swing.JButton addGraphiCard6;
    private javax.swing.JButton addMb2;
    private javax.swing.JButton addMb4;
    private javax.swing.JButton addMb5;
    private javax.swing.JButton addMotherBoard1;
    private javax.swing.JButton addPowSour1;
    private javax.swing.JButton addPowSour2;
    private javax.swing.JButton addPowSour4;
    private javax.swing.JButton addPowSour5;
    private javax.swing.JButton addRam1;
    private javax.swing.JButton addRam2;
    private javax.swing.JButton addRam4;
    private javax.swing.JButton addRam5;
    private javax.swing.JLabel appleDaysPassedLable;
    private javax.swing.JLabel appleDeadlineLable;
    private javax.swing.JLabel applePmDiscountLable;
    private javax.swing.JLabel assemblersApple;
    private javax.swing.JLabel assemblersAppleQtty;
    private javax.swing.JLabel assemblersAppleQtty12;
    private javax.swing.JLabel assemblersAppleQtty13;
    private javax.swing.JLabel assemblersAppleQtty14;
    private javax.swing.JLabel assemblersAppleQtty15;
    private javax.swing.JLabel assemblersAppleQtty16;
    private javax.swing.JLabel assemblersHp;
    private javax.swing.JLabel assemblersHpQtty2;
    private javax.swing.JLabel basicComputersQttySavedApple;
    private javax.swing.JLabel basicComputersQttySavedHp;
    private javax.swing.JLabel costAppleLable;
    private javax.swing.JLabel costHp;
    private javax.swing.JLabel cpuMakersApple;
    private javax.swing.JLabel cpuMakersAppleQtty;
    private javax.swing.JLabel cpuMakersAppleQttySavedApple;
    private javax.swing.JLabel cpuMakersHp;
    private javax.swing.JLabel cpuMakersQttyHp;
    private javax.swing.JLabel cpuMakersQttySavedHp;
    private javax.swing.JLabel cpusMaxQttyApple;
    private javax.swing.JLabel day;
    private javax.swing.JLabel daysPassedGrafico;
    private javax.swing.JLabel deadline;
    private javax.swing.JLabel directorAppleQtty;
    private javax.swing.JLabel directorAppleQtty2;
    private javax.swing.JLabel directorStatusApple;
    private javax.swing.JLabel directorStatusHp;
    private javax.swing.JLabel graphCardMakersApple;
    private javax.swing.JLabel graphCardMakersHp;
    private javax.swing.JLabel graphiCardMakersAppleQtty;
    private javax.swing.JLabel graphiCardMakersAppleQttySavedApple;
    private javax.swing.JLabel graphiCardMakersHpQtty2;
    private javax.swing.JLabel graphiCardMakersHpQttySaveHp;
    private javax.swing.JLabel graphiCardMaxQttyApple;
    private javax.swing.JLabel hpDaysPassedLable;
    private javax.swing.JLabel hpDeadlineLable;
    private javax.swing.JLabel hpPmDiscountLable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel motherBoardMakersApple;
    private javax.swing.JLabel motherBoardMakersHp;
    private javax.swing.JLabel motherBoardMakersQtty;
    private javax.swing.JLabel motherBoardMakersQtty3;
    private javax.swing.JLabel motherBoardMakersQttySavedApple;
    private javax.swing.JLabel motherBoardMakersQttySavedHp;
    private javax.swing.JLabel motherBoardMaxQttyApple;
    private javax.swing.JLabel pmFaultsApple;
    private javax.swing.JLabel pmFaultsHp;
    private javax.swing.JLabel pmStatusApple;
    private javax.swing.JLabel pmStatusHp;
    private javax.swing.JLabel powerSouerceMaxQttyApple;
    private javax.swing.JLabel powerSourceMakersApple;
    private javax.swing.JLabel powerSourceMakersAppleQtty;
    private javax.swing.JLabel powerSourceMakersAppleQttySavedApple;
    private javax.swing.JLabel powerSourceMakersHp;
    private javax.swing.JLabel powerSourceMakersHpQtty2;
    private javax.swing.JLabel powerSourceMakersHpQttySavedHp;
    private javax.swing.JLabel projectManagerAppleQtty;
    private javax.swing.JLabel projectManagerAppleQtty2;
    private javax.swing.JLabel ramMakersApple;
    private javax.swing.JLabel ramMakersAppleQtty;
    private javax.swing.JLabel ramMakersAppleQttySavedApple;
    private javax.swing.JLabel ramMakersHp;
    private javax.swing.JLabel ramMakersHpQtty2;
    private javax.swing.JLabel ramMakersHpQttySavedHp;
    private javax.swing.JLabel ramsMaxQttyApple;
    private javax.swing.JButton removeAssembler1;
    private javax.swing.JButton removeAssembler2;
    private javax.swing.JButton removeAssembler6;
    private javax.swing.JButton removeAssembler7;
    private javax.swing.JButton removeCpu1;
    private javax.swing.JButton removeCpu2;
    private javax.swing.JButton removeCpu4;
    private javax.swing.JButton removeCpu5;
    private javax.swing.JButton removeDay;
    private javax.swing.JButton removeDeadline;
    private javax.swing.JButton removeGraphCard1;
    private javax.swing.JButton removeGraphCard2;
    private javax.swing.JButton removeGraphiCard5;
    private javax.swing.JButton removeGraphiCard6;
    private javax.swing.JButton removeMB2;
    private javax.swing.JButton removeMB4;
    private javax.swing.JButton removeMB5;
    private javax.swing.JButton removeMotherBoard1;
    private javax.swing.JButton removePowSour1;
    private javax.swing.JButton removePowSour2;
    private javax.swing.JButton removePowSour4;
    private javax.swing.JButton removePowSour5;
    private javax.swing.JButton removeRam1;
    private javax.swing.JButton removeRam2;
    private javax.swing.JButton removeRam4;
    private javax.swing.JButton removeRam5;
    private javax.swing.JLabel salesAppleLabel;
    private javax.swing.JLabel salesHp;
    private javax.swing.JLabel specialComputersAppleQttySavedApple;
    private javax.swing.JLabel specialComputersQttySavedHp;
    private javax.swing.JButton txt;
    private javax.swing.JLabel utilityAppleLable;
    private javax.swing.JLabel utilityHp;
    // End of variables declaration//GEN-END:variables
}
