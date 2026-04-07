public class Fatorial{
    public static void main(String[] args) {
        new Fatorial();
    }

    public Fatorial (){
        System.out.println("Fatorial de 4: 4! = " + calculoIterativo(4));
        System.out.println("Fatorial de 5: 5! = " + calculoIterativo(5));
        System.out.println("Fatorial de 1: 1! = " + calculoIterativo(1));
    }

    public long calculoIterativo(int n) {
        long resposta = n;
        if (resposta < 0 ) return -1;
        else if (resposta == 0 || resposta == 1) return 1;
        for (int i = n - 1; i > 1; i--) {
            resposta = resposta * i;

        }
        return resposta;
    }

    public long calculoRecursivo(int n) {
        if (n < 0) return -1;
        else if (n == 0 || n == 1) return 1;
        else return (n * calculoRecursivo(n - 1));
    }
}