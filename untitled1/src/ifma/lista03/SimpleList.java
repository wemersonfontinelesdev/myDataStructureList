package ifma.lista03;

public class SimpleList {
    private Node head;

    public SimpleList() {
        this.head = null;
    }


    public void adicionarInicio(int value) {
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
    }


    public void adicionarFim(int value) {
        if (head == null) {
            adicionarInicio(value);
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node(value));
        }
    }

    public int removerComeco() {
        if (head == null) throw new IllegalStateException("Lista vazia.");
        int value = head.getData();
        head = head.getNext();
        return value;
    }


    public int removerFinal() {
        if (head == null) throw new IllegalStateException("Lista vazia.");
        if (head.getNext() == null) {
            return removerComeco();
        }
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        int value = current.getNext().getData();
        current.setNext(null);
        return value;
    }

    // Encontrar o maior valor
    public int maiorValor() {
        if (head == null) throw new IllegalStateException("Lista vazia.");
        int maior = head.getData();
        Node current = head;
        while (current != null) {
            if (current.getData() > maior) {
                maior = current.getData();
            }
            current = current.getNext();
        }
        return maior;
    }

    public int menorValor() {
        if (head == null) throw new IllegalStateException("Lista vazia.");
        int menor = head.getData();
        Node current = head;
        while (current != null) {
            if (current.getData() < menor) {
                menor = current.getData();
            }
            current = current.getNext();
        }
        return menor;
    }

    // Calcular a média dos valores
    public double mediaValores() {
        if (head == null) throw new IllegalStateException("Lista vazia.");
        int soma = 0, count = 0;
        Node current = head;
        while (current != null) {
            soma += current.getData();
            count++;
            current = current.getNext();
        }
        return (double) soma / count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
