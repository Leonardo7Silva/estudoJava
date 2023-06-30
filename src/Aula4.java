import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*int[][] matriz =  new int[3][3];

        int[][] matrizPreenchida = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < matrizPreenchida.length; i++){
            System.out.println();
            for (int j = 0; j < matrizPreenchida[i].length; j++) {
                System.out.print(matrizPreenchida[i][j] + " ");
            }
        };

        System.out.println("Preencha uma matriz 3x3:");

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Add um elemento");
                matriz[i][j] = sc.nextInt();
            }
        };

        System.out.println("Sua matriz:");
        for (int i = 0; i < matriz.length; i++){
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        };



        int[][] matriz1 = {{1,2,3},{4,5,6}};
        int[][] matriz2 = {{7,8},{9,10},{11,12}};

        int aux = 0;

        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz2[0].length; j++) {
                for(int k = 0; k< matriz1[0].length; k++){
                    aux += matriz1[i][k]*matriz2[k][j];
                };
                System.out.print(aux +" ");
                aux = 0;
            };
            System.out.println();
        };
        */
        sc.close();

        int[][] matriz4 = {{1,2,3}, {4,5,6},{7,8,9},{10,11,12}};

        for (int i = 0; i < matriz4[0].length; i++){
            for(int j = 0; j< matriz4.length; j++){
                System.out.print(matriz4[j][i] + " ");
            };
            System.out.println();
        };
    }
}
