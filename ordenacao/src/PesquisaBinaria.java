public class PesquisaBinaria {
    public static void main(String[] args) {

    }
    public static int pesquisaBin(int[] v, int x){
        int inicio = 0;
        int fim = v.length - 1;
        int meio = (inicio + fim)/2;

        for(var i=0; i < fim; i++){
            if(x == v[meio]){
                return meio;
            }
            if(x > v[meio]){
                inicio = meio +1;
            }else{
                fim = meio-1;
            }
        }

        return -1;
    }
}
