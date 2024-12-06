package ifma.lista03;

public class TesteSimpleList {
    public static void main(String[] args) {
        SimpleList lista = new SimpleList();

        //Adição
        lista.adicionarInicio(3);
        lista.adicionarInicio(1);
        lista.adicionarFim(5);
        lista.adicionarFim(7);

        System.out.println("Lista após adições: " + lista);

        //remoções
        lista.removerComeco();
        System.out.println("Após remover do inicio: " + lista);
        lista.removerFinal();
        System.out.println("Após remover do final: " + lista);


        lista.adicionarFim(10);
        lista.adicionarFim(2);
        System.out.println("Maior valor: " + lista.maiorValor());
        System.out.println("Menor valor: " + lista.menorValor());
        System.out.println("Média dos valores: " + lista.mediaValores());

        // Verificaçao final
        System.out.println("Lista final: " + lista);
    }
}
