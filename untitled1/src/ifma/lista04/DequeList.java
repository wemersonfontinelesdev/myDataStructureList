package ifma.lista04;

import java.util.NoSuchElementException;

public class DequeList {
    private Node head;
    private Node trailer;
    private int size;

    public DequeList() {
        head = new Node();
        trailer = new Node();
        head.next = trailer;
        trailer.previous = head;
        size = 0;
    }

    public void addLast(Node node) {
        Node last = trailer.previous;
        last.next = node;
        node.previous = last;
        node.next = trailer;
        trailer.previous = node;
        size++;
    }

    public void addFirst(Node node) {
        Node first = head.next;
        head.next = node;
        node.previous = head;
        node.next = first;
        first.previous = node;
        size++;
    }

    public Node getFirst() {
        if (size == 0) throw new NoSuchElementException("Lista vazia");
        return head.next;
    }

    public Node getLast() {
        if (size == 0) throw new NoSuchElementException("Lista vazia");
        return trailer.previous;
    }

    public Node removeFirst() {
        if (size == 0) throw new NoSuchElementException("Lista vazia");
        Node first = getFirst();
        head.next = first.next;
        first.next.previous = head;
        size--;
        return first;
    }

    public Node removeLast() {
        if (size == 0) throw new NoSuchElementException("Lista vazia");
        Node last = getLast();
        trailer.previous = last.previous;
        last.previous.next = trailer;
        size--;
        return last;
    }

    public Node search(String name) {
        Node current = head.next;
        while (current != trailer) {
            if (current.aluno.getNome().equals(name)) {
                return current;
            }
            current = current.next;
        }
        throw new RuntimeException("Aluno " + name + " não encontrado");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = head.next;
        while (current != trailer) {
            sb.append(current.toString());
            if (current.next != trailer) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
