import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        
        System.out.print("Digite sua altura: ");
        Double altura = sc.nextDouble();
        
        System.out.print("Digite sua peso: ");
        Double peso = sc.nextDouble();
        
        Pessoa p = new Pessoa(nome, sobrenome, idade, altura, peso);

        p.setNome(nome);
        p.setSobrenome(sobrenome);
        p.setIdade(idade);
        p.setAltura(altura);
        p.setPeso(peso);

        System.out.println("IMC: " + p.calculaIMC());
        System.out.println("Classificação: " + p.informaObesidade());
        

        sc.close();
    }
}
