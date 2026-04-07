public class Maximo {
    public static void main(String[] args) {
        new Maximo();
    }

    public Maximo() {;
        int a[] = {12, 11, 21, 89, 99, 45, 89, 12, 24, 6, 70, 1002, 999, 987};
        System.out.println( "Maior dos vetores 1: " + maximoInterativo(a) );
        System.out.println( "Maior dos vetores 2: " + maximoRecursivo(a, 0, 4, 0) );

    }

    public int maximoInterativo(int[] vet) {
        int max = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > max) max = vet[i];
        }
        return max;
    }

    public int maximoRecursivo(int[] vet, int inicio, int fim, int nivel) {
        if (inicio == fim) return vet[inicio];
        int meio = (inicio + fim) / 2;
        int a = maximoRecursivo(vet, inicio, meio, ++nivel);
        int b = maximoRecursivo(vet, meio + 1, fim, nivel);
        System.out.println("Nivel " + nivel + ": " + a + " > " + b);
        return (a > b) ? a : b;
    }

}
