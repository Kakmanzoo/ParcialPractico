import java.util.*;

public class tercero {
    public static void main(String[] args) {


        //Creamos un linkedlist para agregar a las personas que están en la fila
        LinkedList<String> fila = new LinkedList<>();

        fila.add("Juan");
        fila.add("Camilo");
        fila.add("Eliana");



        //Por medio del metodo creado, mostramos la cantidad de personas que están haciendo fila.
        System.out.println("Así va la fila para la gente que quiere comer una salchipapa.");
        mostrarfila(fila);


        //Mientras haya personas en la fila, se van atendiendo
        while (!fila.isEmpty()) {


            //Cuando se atiende a la primera persona, la eliminamos.
            String atendiendo = fila.poll(); //Gracias al metodo Poll(), nos ayuda a eliminar a la persona y devuelve el primer elemento
            System.out.println("Estamos atendiendo a: " + atendiendo);


            //Vuelve a mostrar a las personas que siguen en la fila
            System.out.println("Aun hay mucha gente que quiere una salchipapa O.O: ");
            mostrarfila(fila);
        }


        //Despues de que el While se cumpla y el arreglo no tenga mas personas, muestra este mensaje.
        System.out.println("Ya no hay nadie en la fila :c");

    }

    //Metodo para mostrar el estado de la fila
    public static void mostrarfila(LinkedList<String> fila) {

        //Si la fila esta vacia, muestra el mensaje, sino, va mostrando a las personas.
        if (fila.isEmpty()) {
            System.out.println("No hay mas gente para su salchipapa :(");
        } else {
            for (String persona : fila) {
                System.out.println(persona);
            }
        }
    }
}
