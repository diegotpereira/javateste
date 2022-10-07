public class App {

    public static int adicionar(int primeiroNumero, int segundoNumero) {

        return primeiroNumero + segundoNumero;
    }

    public static int multiplicar(int multiplicando, int multiplicador) {

        return multiplicando * multiplicador;
    }

    public static int dividir(int dividendo, int divisor) {

        if(divisor == 0)

           throw new IllegalArgumentException("Não pode dividir poor zero");

        return dividendo/divisor;
    }
    public static void main(String[] args) throws Exception {

        System.out.println(App.adicionar(3, 3));
    }
}
