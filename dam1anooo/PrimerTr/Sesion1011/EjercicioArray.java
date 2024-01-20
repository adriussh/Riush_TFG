package PrimerAnyo.PrimerTr.Sesion1011;

import java.util.Scanner;

public class EjercicioArray {

    public static void main(String[] args) {
        //DOS FILAS, DOS COLUMNAS
        //primera forma.           [filas][columnas]
        System.out.println("PRIMERA FORMA");
        double [][] datos = new double [2][2];
        datos[0][0]=4;
        datos[0][1]=2;
        datos[1][0]=0;
        datos[1][1]=6;

        //cuenta las casillas
        for (int i=0;i<datos.length;i++){
            for (int j=0;j<datos.length;j++){
                System.out.println(datos[i][j]);
            }
        }

        //segunda forma.
        System.out.println("SEGUNDA FORMA");
        double [][] datos2 = {{2,1},{3,3}};

        //cuenta las casillas
        for (int i=0;i<datos2.length;i++){
            for (int j=0;j<datos2.length;j++){
                System.out.println(datos2[i][j]);
            }
        }

        //tercera forma.
        System.out.println("TERCERA FORMA");
        Scanner sc = new Scanner(System.in);
        double [][] datos3 = new double[2][2];
        for (int i=0;i<datos3.length;i++){
            for (int j=0;j<datos3.length;j++){
                System.out.println("Introducir un valor numerico");
                datos3[i][j]= sc.nextInt();
            }
        }
        //cuenta casillas
        for (int i=0;i<datos3.length;i++){
            for (int j=0;j<datos3.length;j++){
                System.out.println(datos3[i][j]);
            }
        }

        //TRES FILAS, DOS COLUMNAS
        //primera forma.
        System.out.println("PRIMERA FORMA 2X3");
        double [][] datos11 = new double [2][3];
        datos11[0][0]=2;
        datos11[0][1]=4;
        datos11[0][2]=6;
        datos11[1][0]=7;
        datos11[1][1]=8;
        datos11[1][2]=9;

        //cuenta las casillas
        for (int i=0;i<datos11.length;i++){
            for (int j=0;j<datos11[i].length;j++){
                System.out.println(datos11[i][j]);
            }
        }

        //segunda forma.
        System.out.println("SEGUNDA FORMA 2X3");
        int [][] datos22 = {{3,5},{0,1},{10,50}};

        //cuenta las casillas
        for (int i=0;i<datos22.length;i++){
            for (int j=0;j<datos22[i].length;j++){
                System.out.println(datos22[i][j]);
            }
        }

        //tercera forma.
        System.out.println("TERCERA FORMA 2X3");
        double [][] datos33 = new double[2][3];
        for (int i=0;i<datos33.length;i++){
            for (int j=0;j<datos33[i].length;j++){
                System.out.println("Introducir un valor numerico");
                datos33[i][j]= sc.nextInt();
            }
        }
        //cuenta casillas
        for (int i=0;i<datos33.length;i++){
            for (int j=0;j<datos33[i].length;j++){
                System.out.println(datos33[i][j]);
            }
        }
    }
}
