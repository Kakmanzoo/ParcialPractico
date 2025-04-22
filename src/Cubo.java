
public class Cubo {

    public static void main(String[] args) {

        int Matrices[][] = new int[4][3];

        int c = 0;

        int f = 0;

        int contador = 0;

        arreglo(Matrices[f][c]);

        arreglo(contador);

    }

    public static void arreglo(int Matriz) {

        int Matrices[][] = new int[4][3];

        Matrices[0][0] = 1;

        Matrices[0][1] = 2;

        Matrices[0][2] = 3;

        Matrices[1][0] = 4;

        Matrices[1][1] = 5;

        Matrices[1][2] = 6;

        Matrices[2][0] = 7;

        Matrices[2][1] = 8;

        Matrices[2][2] = 9;

        Matrices[3][0] = 10;

        Matrices[3][1] = 11;

        Matrices[3][2] = 12;


        int contadornumeropar = 0;
        int contadorenumeroimpar = 0;

        for (int f = 0; f < 4; f++) {

            for (int c = 0; c < 3; c++) {

                if (Matrices[f][c] % 2 == 0) {


                     System.out.println("estos numero son pares "+Matrices[f][c]);
                     contadornumeropar++;

                } else {

                    int contador = Matrices[f][c] + 1;

                    contador ++;

                    System.out.println("Este numero es impar " + Matrices[f][c]);
                    contadorenumeroimpar++;
                }

            }

        }
        System.out.println("El numero total de numeros pares es de: " + contadornumeropar);

    }

}
