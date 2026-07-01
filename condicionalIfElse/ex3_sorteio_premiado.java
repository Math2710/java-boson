package condicionalIfElse;
import java.util.Scanner;
import java.util.Random;
public class ex3_sorteio_premiado {
    private static final double PREMIO = 500.0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleaorio = new Random();
        System.out.printf("Digite seu palpite (1 a 20): ");
        int palpite = sc.nextInt();
        int saida = aleaorio.nextInt(20) + 1;
        String msg = (palpite > saida) ? "maior que o sorteado" : "menor que o resultado";
        int diferenca = Math.abs(palpite - saida);

        if (palpite == saida) {
            System.out.println("Parabéns! Você ganhou R$" + PREMIO);
            
        }
        else if (diferenca <= 3 ){
            System.out.println("Quase lá! Você ganhou R$ 50.00");
            System.out.println("Seu palpite foi: " + msg);
        }
        else{
            System.out.println("Não foi de dessa vez! O número era " + saida);
            System.out.println("Seu palpite foi: " + msg);
        }

        sc.close();
    }
    
}
