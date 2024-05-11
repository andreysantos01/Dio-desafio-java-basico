import java.util.Scanner;
import  java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite seu Nome ");
        String nome = scanner.next();

        System.out.println("Digite sua Agencia com o digito xxx-x");
        String agencia = scanner.next();


        System.out.println("Digite sua Conta xxxx ");
        int conta = scanner.nextInt();

        System.out.println("Digite o valor que quer depositar : ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome+ ",Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " seu saldo " +saldo + " já está disponível para saque");


        



          




        
    }
}
