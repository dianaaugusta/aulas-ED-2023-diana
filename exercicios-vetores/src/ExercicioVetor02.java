import java.util.Scanner;

public class ExercicioVetor02 {
    public static void main(String[] args) {
        int[] vet = new int[9];
        int soma = 0;
        int mediaNumeros;
        Scanner scanner = new Scanner(System.in);
        for (var i = 0; i < 10; i++){
            System.out.println("Digite o número");
            vet[i] = scanner.nextInt();
        }

        for(int v: vet){
            soma += v;
        }


        mediaNumeros = soma/10;

        for(int v: vet){
            if(v > mediaNumeros){
                System.out.println(v);
            }
        }

    }
}
