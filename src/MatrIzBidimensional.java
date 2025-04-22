import java.util.*;

public class MatrIzBidimensional {
    public static void main(String[] args) throws Exception {

        //Definimos el arreglo bidimensional
        int[][] arturo = { 
            {2, 4, 6},
            {8, 10, 15},
            {16, 20, 30}
        };

        //Llamar los metodos creados
        ImprimirArturo(arturo);
        SumarArturo(arturo);
        SumaFilaArturo(arturo);

    }


        //Metodo para imprimir arreglo
        public static void ImprimirArturo (int[][] arturo){

        //Recorremos el arreglo para luego imprimirlo utilizando el .lenght para entrar al arreglo
        for(int i = 0 ; i < arturo.length ; i++) {
            for(int j = 0 ; j < arturo[i].length; j++){
                //Imprimimos el arreglo
                System.out.print(arturo[i][j] + " ");
            }
            System.out.println();
        }
    }


        //Metodo para sumar Arreglo
        public static void SumarArturo (int[][] arturo) {
        //Creamos un entero para saber la suma total del arreglo
        int sumatotal = 0;
        //Nuevamenete entramos al arreglo para realizar la suma
        for(int x = 0 ; x < arturo.length  ; x++) {
            for(int y = 0 ; y < arturo[x].length; y++) {
                //Después de recorrer el arreglo, utilizamos la variable creada para que vaya sumando fila por fila
                sumatotal+=arturo[x][y];
            }
        }
        System.out.println("La suma total es: "+ sumatotal);

    }



        //Metodo para sumar las filas
        public static void SumaFilaArturo(int[][] arturo) {

        //Para realizar la suma de las filas, entramos nuevamente al arreglo, pero creamos una variable para realizar la suma de cada fila
        for(int h = 0 ; h < arturo.length ; h++) {
            int sumafilaarturo = 0;
            for(int l = 0 ; l < arturo[h].length ; l++) {

                //La variable creada, ira sumando fila por fila.
                sumafilaarturo += arturo[h][l];
            }


            //Imprimimos cada fila con su respectivo resultado.
            System.out.println("La suma de la fila " + h +  " es: " + sumafilaarturo);
        }
    }
}
