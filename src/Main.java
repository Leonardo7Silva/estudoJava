// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*String nome = "Leo";
        int idade = 25;
        double altura = 1.73;
        boolean presenca = true;


        System.out.println("nome: " + nome +  "\nidade: " + idade + "\naltura: " + altura);
        System.out.println();
        System.out.printf("nome: %s%nidade: %d%naltura: %.2f\npresença: %b", nome , idade , altura, presenca);
        System.out.printf("Hello and welcome!"); */


        double PI = 3.14159;
        double raio = 5;
        double areaDoCirculo = raio * raio * PI;

        System.out.printf("A= %.4f", areaDoCirculo);

        System.out.println();

        String matricula = "123";
        int horasTrabalhadas = 100;
        float salarioPorHora = 5.50f;
        float salarioTotal = horasTrabalhadas * salarioPorHora;

        System.out.printf("Matrícula: %s \nSalário: %.2f", matricula, salarioTotal);

        System.out.println();

        String nome = "José";
        double salario = 500.00;
        double vendas = 1230.30;
        double salarioDoMes = salario + vendas * 0.15;

        System.out.printf("TOTAL = %.2f", salarioDoMes);


    }
}