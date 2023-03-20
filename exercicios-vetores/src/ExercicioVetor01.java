import java.util.Scanner;

public class ExercicioVetor01 {
    public static void main(String[] args) {
        int[] vet = new int[7];
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
//soma os elementos de vet
        for (var i = 0; i< 7; i++){
            System.out.println("Digite o número");
            vet[i] = scanner.nextInt();
        }
        System.out.println("Ordem crescente");
        for (var i = 0; i< 7; i++){
            System.out.println(vet[i]);
        }

        for (var i = 0; i< 7; i++){
            System.out.println("Digite o número");
            vet[i] = scanner.nextInt();
        }
        System.out.println("Ordem decrescente");
        for (var i = vet.length - 1; i>= 0; i--){
            System.out.println(vet[i]);
        }
    }
}
