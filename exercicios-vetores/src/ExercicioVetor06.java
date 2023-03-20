import java.util.Scanner;

public class ExercicioVetor06 {
    public static void main(String[] args) {
        int mes = 1;
        int dia =1;
        int somaDosMeses = 0;
        int[] dias = {31,28,31,30,31,30,31,30,31,30,31,30};
        int dataFinal = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o mes");
        mes = scanner.nextInt();
        System.out.println("Digite o dia");
        dia = scanner.nextInt();

        somaDosMeses = 0;

        for(var i = 0; i < (mes - i); i++){
            somaDosMeses += dias[i];
        }

        dataFinal = somaDosMeses + dia;

        System.out.println(String.format("O dia %d/%d corresponde ao dia %d do ano",
                dia, mes, dataFinal));


    }
}
