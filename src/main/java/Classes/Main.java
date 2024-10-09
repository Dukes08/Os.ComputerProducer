/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interface.Interface;
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
            daysToFinsihApple[0] = 4;
            daysToFinsihApple[1] = 4;
            daysToFinsihApple[2] = 1;
            daysToFinsihApple[3] = 1;
            daysToFinsihApple[4] = 2;


            Company apple = new Company(requirementsApple, daysToFinsihApple, initialQuantityApple, 10, dayDuration, 100000, 150000, deadline);

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

            int [] daysToFinoshHp = new int[5]; 
            daysToFinoshHp[0] = 4;
            daysToFinoshHp[1] = 4;
            daysToFinoshHp[2] = 1;
            daysToFinoshHp[3] = 1;
            daysToFinoshHp[4] = 2;

            Company hp = new Company(requirementsHp, daysToFinoshHp, initialQuantityHp, 11, dayDuration, 90000, 140000, deadline);
            Interface main = new Interface(apple, hp, initialQuantityApple, initialQuantityHp);
            main.show();
//          

        } catch (Exception e){
            e.printStackTrace( );
    
}
    }
}
