
package britezjonathan7102020scanner;

/**
 *
 * @author jonathan
 */
import java.util.Scanner;
public class ClaseScanner {

   
    public static void main(String args[]) {
        
        //declaramos las variables con su tipo de dato
        String nombre,apellido;
        int Dni,FechaNac,fechaA = 2020;
        
        //iniciamos el Scanner
        
        Scanner entrada = new Scanner(System.in);
        
        //pedimos al usuario que ingrese su nombre
        
        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        
        //pedimos al usuario que ingrese su apellido
        System.out.print("Ingrese su apellido: ");
        apellido = entrada.nextLine();
        
        //pedimos al usuario que ingrese su fecha de nacimiento
        System.out.print("Ingrese su fecha de nacimiento: ");
        FechaNac = entrada.nextInt();
        
        //pedimos al usuario que ingrese su dni
        System.out.print("Ingrese su dni: ");
        Dni = entrada.nextInt();
        
        //realizamos la operacion de la edad 
        
        int edad = fechaA - FechaNac;
        
        //le mostramos otro mensaje al usuario sobre sus datos 
        System.out.println("Usted se llama " + nombre + " " + apellido + " y tiene " + edad + " años con un dni " + Dni);
    }
}
