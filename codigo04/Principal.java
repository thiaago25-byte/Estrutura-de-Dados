public class Principal{
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>("Números Inteiros");

        fila.enfileirar(4);
        fila.enfileirar(3);
        fila.enfileirar(2);
        fila.enfileirar(1);
        fila.imprimeFila();

        System.out.println("Dado " + fila.desenfileirar() + " removido!");
    }
}