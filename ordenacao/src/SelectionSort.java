public class SelectionSort {


    public static void main(String[] args) {
        int[] numeros = {0,1,54,312,123,2,10,23,12};

        selectionSort(numeros);
        exibeNros(numeros);
    }
    public static void selectionSort(int[] v){
        int aux = 0;
        int comparacao = 0;
        int troca = 0;
            for(var i = 0; i < v.length -1 ; i++){
                for(var j = i + 1; j < v.length; j++){
                    comparacao++;
                    if(v[j] < v[i]){
                        aux = v[i];
                        v[i] = v[j];
                        v[j] = aux;
                        troca++;
                    }
                }
            }
        System.out.println(String.format("Houveram %d comparações e %d trocas", comparacao, troca));


    }
    public static void exibeNros(int[] v){
        for(var i=0; i < v.length; i++){
            System.out.println(v[i]);
        }
    }
}
