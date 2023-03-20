import java.util.Scanner;

public class ExercicioVetor04 {
    public static void main(String[] args) {
        int[] vet = new int[9];
        int soma = 0;
        int numeroBuscado;
        int vezesAparicaoNumero = 0;
        Scanner scanner = new Scanner(System.in);
        for (var i = 0; i < vet.length; i++){
            System.out.println("Digite o"+ i +" número");
            vet[i] = scanner.nextInt();
        }

        System.out.println("Digite o nome a ser buscado");
        numeroBuscado = scanner.nextInt();

        for (var i = 0; i < vet.length; i++){
            if(vet[i] == numeroBuscado){
                vezesAparicaoNumero++;
            }
        }

        System.out.println(String.format("O numero %d foi encontrado %d vezes", numeroBuscado, vezesAparicaoNumero));

    }
}
