/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.FileReader;

/**
 *
 * @author hugoduque
 */
public class Main {
    
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try{
            FileReader lector = new FileReader ("DatosIniciales.txt");
            String contenido = "";
            int valor = lector.read( );

            while (valor != -1){
                contenido += (char)valor;
                valor = lector.read( );
            }

            String [] divide1 = contenido.split(" / ");

            lector = new FileReader ("InitialQuantity.txt");
            contenido = "";
            valor = lector.read( );

            while (valor != -1){
                contenido += (char)valor;
                valor = lector.read( );
            }

            String [] divide2 = contenido.split(" / ");

            int dayDuration = Integer.parseInt(divide1[0].replaceAll("\\p{C}", ""));
            int deadline = Integer.parseInt(divide1[1].replaceAll("\\p{C}", ""));


            int [] initialQuantityApple = new int [6];

            for (int i = 0; i < 6; i++){
                initialQuantityApple[i] = Integer.parseInt(divide2[0].split(", ")[i]);
            }

            int [] requirementsApple = new int [6]; 
            requirementsApple[0] = 2;
            requirementsApple[1] = 1;
            requirementsApple[2] = 4;
            requirementsApple[3] = 4;
            requirementsApple[4] = 2;
            requirementsApple[5] = 5;

            int [] daysToFinsihApple = new int[5]; 
            daysToFinsihApple[0] = 2;
            daysToFinsihApple[1] = 2;
            daysToFinsihApple[2] = 1;
            daysToFinsihApple[3] = 1;
            daysToFinsihApple[4] = 3;


            Company Apple = new Company(requirementsApple, daysToFinsihApple, initialQuantityApple, 12, dayDuration, 100000, 150000, deadline);

            int [] initialQuantityHp= new int [6];

            for (int i = 0; i < 6; i++){
                initialQuantityHp[i] = Integer.parseInt(divide2[1].split(", ")[i]);
            }

            int [] requirementsHp = new int [6];
            // Cuando hagamos lo del TXT, sacamos con un .split una lista con c/valor y ya, no hace falta hacer esto
            // Luego esa lista se modifca cuando se desee eliminar o agregar
            requirementsHp[0] = 1;
            requirementsHp[1] = 1;
            requirementsHp[2] = 2;
            requirementsHp[3] = 4;
            requirementsHp[4] = 3;
            requirementsHp[5] = 2;

            int [] daysToFinishHp = new int[5]; 
            daysToFinishHp[0] = 2;
            daysToFinishHp[1] = 2;
            daysToFinishHp[2] = 1;
            daysToFinishHp[3] = 1;
            daysToFinishHp[4] = 3;

            Company disney = new Company(requirementsHp, daysToFinishHp, initialQuantityHp, 13, dayDuration, 80000, 140000, deadline);

//          

        } catch (Exception e){
            e.printStackTrace( );
    
}
    }
}
