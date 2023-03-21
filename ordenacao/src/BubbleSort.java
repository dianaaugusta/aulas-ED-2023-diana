public class BubbleSort {
    public static void main(String[] args) {
        int[] numeros = {0,1,54,312,123,2,10,23,12};

        bubbleSort(numeros);
        exibeNros(numeros);
    }

    public static void bubbleSort(int[] v){
        int aux = 0;
        for(var i=0; i < v.length-1; i++){
            for(var j=1; j < v.length-i;j++){
                if(v[j-1] > v[j]){
                    aux = v[j];
                    v[j] = v[j-1];
                    v[j-1] = aux;
                }
            }
        }
    }

    public static void exibeNros(int[] v){
        for (int j : v) {
            System.out.println(j);
        }
    }
}
