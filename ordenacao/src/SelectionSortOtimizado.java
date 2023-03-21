public class SelectionSortOtimizado {
    public static void main(String[] args) {
        int[] numeros = {0,1,54,312,123,2,10,23,12};
        selectionSort(numeros);
        exibeNros(numeros);
    }

    public static void selectionSort(int[] v){
        int menorValor = 0;
        int aux = 0;
        int comparacao = 0;
        int troca = 0;
        for(var i = 0; i < v.length -1 ; i++){
            menorValor =  i;
            for(var j = i + 1; j < v.length; j++){
                comparacao++;
                if(v[j] < v[menorValor]){
                    menorValor = j;
                    troca++;
                }
            }
            aux = v[i];
            v[i] = v[menorValor];
            v[menorValor] = aux;
        }
        System.out.println(String.format("Houveram %d comparações e %d trocas", comparacao, troca));


    }
    public static void exibeNros(int[] v){
        for (int j : v) {
            System.out.println(j);
        }
    }

}
