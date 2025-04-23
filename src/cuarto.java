import java.util.ArrayList;
import java.util.Scanner;
 
public class cuarto {
// inicializaciopn de la lista profe nso merecemos un 5 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 
        
        ArrayList<String> estudiantes = new ArrayList<>();
        estudiantes.add("aberto");
        estudiantes.add("messi");
        estudiantes.add("cristiano");
        estudiantes.add("millosdvid");
        estudiantes.add("jhonfreison");
 
        inicializarLista(estudiantes, teclado);
 
      
    }
 
    // Método para verificar si el estudiante está en la lista
    public static void inicializarLista(ArrayList<String> estudiantes, Scanner teclado) {

        System.out.println("Ingrese el nombre de la persona que desea verificar:");
        String h = teclado.next();
 
        // Convertir  a minúsculas 
        String nombreBuscado = h.toLowerCase();
 
        if (estudiantes.contains(nombreBuscado)) {
            System.out.println("El estudiante se encuentra en la lista.");
        } else {
            System.out.println("El estudiante no está en la lista.");
        }
    }
}