import java.util.Scanner;

public class ExercicioVetor05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] modelos = new String[5];
        int[] rendimentoPorCarro = new int[5];
        int max = 1;
        String carroComMaiorRendimento = "";

        for (var i = 0; i < modelos.length; i++){
            System.out.println("Digite o Modelo do Carro");
            modelos[i] = scanner.next();
            System.out.println("Digite o rendimento do Carro");
            rendimentoPorCarro[i] = scanner.nextInt();
        }


        for (var i = 1; i < modelos.length; i++){
            if (rendimentoPorCarro[i] > max){
                max = rendimentoPorCarro[i];
                carroComMaiorRendimento = modelos[i];
            }
        }

        System.out.println(String.format("O carro com maior rendimento é o %s, com %d km por litro",
                carroComMaiorRendimento, max));

    }

}
