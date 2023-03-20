import java.util.Scanner;

public class ExercicioVetor03 {
    public static void main(String[] args) {
        String[] nomes = new String[9];
        String nomeBuscado;
        Scanner scanner = new Scanner(System.in);

        for (var i = 0; i < nomes.length; i++){
            System.out.println("Digite o nome");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("Digite o nome a ser buscado");
        nomeBuscado = scanner.next();

        for (var i = 0; i < nomes.length; i++){
            if(nomes[i].equals(nomeBuscado)){
                System.out.println(String.format("%s é o %d nome a aparecer", nomes[i], i));
            }
        }
    }
}
