import java.util.Scanner;




public class Aula3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Exercicios
        System.out.println("Digite um Número:");

        int num = sc.nextInt();

        System.out.println("Triangulo retângulo:");

        String aux = "";
        int numAux = num;

        do{
            for (int i = 0; i< numAux; i++){
                aux += "*";
            };
            numAux--;
            System.out.println(aux);
            aux = "";

        }while (numAux > 0);

        System.out.println();
        //----------------------------------------
        System.out.println("Triângulo Isósceles:");

        int aux2 = 1;
        String linha = "";

        do{
            for (int i = 0; i< num - aux2; i++){
                linha += " ";
            };
            for(int j = 0; j< 2*aux2 -1; j++){
                linha +="*";
            };
            aux2++;
            System.out.println(linha);
            linha = "";
        }while (aux2 <= num);




    }
}
