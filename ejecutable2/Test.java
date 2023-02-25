// factorial

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) 
    
    {
        // Leemos el número entero positivo n desde un cuadro de diálogo


        String input = JOptionPane.showInputDialog(null, "Ingrese un número entero positivo:");
        int n = Integer.parseInt(input);
        
        // el factorial de n

    
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        //  un mensaje con el resultado y lo mostramos.

        String message = "El factorial de " + n + " es " + factorial + ".";
        JOptionPane.showMessageDialog(null, message);
        
   
        System.exit(0);
    }
}
