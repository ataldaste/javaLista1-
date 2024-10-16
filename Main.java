import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Exercício 1: Dados do Usuário
        String nome, cidade;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite sua cidade: ");
        cidade = entrada.nextLine();
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Seu nome é " + nome + ", você mora em " + cidade + " e sua idade é " + idade + " anos.");

        // Exercício 2: Conversão de Celsius para Fahrenheit e vice-versa
        double celsius, fahrenheit;

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = entrada.nextDouble();
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        fahrenheit = entrada.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("A temperatura em Celsius é: " + celsius);

        // Exercício 3: Cálculo do IMC
        int peso;
        double altura;
        System.out.print("Digite seu peso: ");
        peso = entrada.nextInt();
        System.out.print("Digite sua altura: ");
        altura = entrada.nextDouble();
        double imc = peso / (altura * altura); // Cálculo correto do IMC
        System.out.println("Seu IMC é: " + imc);

        // Exercício 4: Quadrado e Cubo de um Valor
        System.out.print("Digite o valor desejado: ");
        double valor = entrada.nextDouble();
        double quad = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);
        System.out.println("O valor " + valor + " ao quadrado: " + quad + ", ao cubo: " + cubo);

        // Exercício 5: Cálculo da área de um triângulo
        int base, alturaTriangulo;
        double area;

        System.out.print("Digite o valor da base do triângulo: ");
        base = entrada.nextInt();
        System.out.print("Digite o valor da altura do triângulo: ");
        alturaTriangulo = entrada.nextInt();
        area = (base * alturaTriangulo) / 2.0;
        System.out.println("A área do triângulo é: " + area);
        entrada.close();
    

// Exercício 6: Cálculo de Delta da Fórmula de Bhaskara
        double a = 1;
        double b = 2;
        double c = 13;

        double delta = b * b - 4 * a * c;
        System.out.println("O valor de Delta é: " + delta);
    
//DESAFIO 
        double valorFinal;
        double numerador = (3 * Math.pow(-3.0 / 4.0, -2)) + (6 * (Math.pow(3.0, -1) / 4.0) - 4);
        double denominador = (7 * Math.pow(-3.0 / 4.0, -1) + 2);    
        valorFinal = Math.pow(numerador / denominador, -1.0) + 4;
        System.out.println(valorFinal);
    }
}
