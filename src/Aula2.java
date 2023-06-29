import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;

        do{
            System.out.println("Qual o meu nome?");
            nome = sc.nextLine();
            if (nome.equals("Leo")){
                System.out.println("Parabéns! vc acertou o meu nome.");
            };
        }while (!nome.equals("Leo"));

        /*

        //exercicio 4
        int num;

        do{
            System.out.println("Digíte um número entre 0 e 10:");
            num = sc.nextInt();
            if (num == 4){
                System.out.println("Parabéns você acertou o número da sorte!");
            }
        }while (num != 4);

        //exercício 3
        int i = 1;
        while (i <= num){
            System.out.println(i);
            i++;
        };


        //exercício 2
        for (int i = 0; i <= num; i+=2){
            System.out.println(i);
        };

        //exercício 1
        if(num > 0){
            System.out.println("Este número é positivo");
        }else if(num == 0){
            System.out.println("Este é o número 0");
        }else {
            System.out.println("Este número é negativo");
        };

        System.out.println("Digite seu nome");

        String nome = sc.nextLine();

        System.out.println("Digite o nome da morena");

        String nome2 = sc.nextLine();

        System.out.println("Digite o tempo");


        int tempo = sc.nextInt();

        System.out.println(nome + " ama " + nome2 + " há " + tempo + " anos.");

        sc.close();
        boolean acerto = false;
        while (!acerto){
            System.out.println("Qual o meu nome?");
            String nome = sc.nextLine();
            System.out.println(acerto);
            if (nome == "Leo"){
                acerto = true;
            }
        }*/


    }
}
