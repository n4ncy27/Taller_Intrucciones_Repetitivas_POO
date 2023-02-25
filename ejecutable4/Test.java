// si un número es capicúa o no. Se dice
// que un número capicúa es aquel que al invertir sus
// cifras da el mismo número. Por ejemplo, 12321
// invertido es 12321. Entonces es un número capicúa.
package ejecutable4;

import javax.swing.JOptionPane;

public class Test{

    public static void main(String[] args) {

        //  variables

        int n;

        // Pedir al usuario que ingrese un número
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        // Llamar al método isPalindrome y mostrar el resultado
        if (capicua(n)) {
            JOptionPane.showMessageDialog(null, n + " es capicúa");
        } else {
            JOptionPane.showMessageDialog(null, n + " no es capicúa");
        }
    }

    // Método que verifica si un número es capicúa
    public static boolean capicua(int n) {
        // Copiar el número en una variable temporal
        int temp = n;

        //  almacenar el reverso del número
        int reverse = 0;

        // Usar un bucle while para invertir el número
        while (temp != 0) {
            // Obtener el último dígito del número usando el operador %
            int lastDigit = temp % 10;

            // Añadir el último dígito al reverso multiplicando por 10 y sumando
            reverse = reverse * 10 + lastDigit;

            // Eliminar el último dígito del número usando el operador /
            temp = temp / 10;
        }
        // Comparar el número original con el reverso y devolver true o false
        return n == reverse;

    
    }
}