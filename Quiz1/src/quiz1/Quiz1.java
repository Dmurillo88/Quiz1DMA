/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double salarioBruto =0.0;
        double IVM =0.0;
        double SEM =0.0;
        double Totcaja=0.0;
        String variableTemporal ="";
        variableTemporal= JOptionPane.showInputDialog("Digite su salario semanal");
        salarioBruto=Double.parseDouble(variableTemporal);
        IVM=salarioBruto*0.0508;
        SEM=salarioBruto*0.0925;
        Totcaja=IVM+SEM;
        
        JOptionPane.showMessageDialog(null,"La empresa debe abonar a la CCSS un monto de :"+Totcaja+" por concepto de SEM y IVM");
        
    
    }
    
}
