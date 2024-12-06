package ifma.lista04;

public class TestDequeList {
    public static void main(String[] args) {
        DequeList deque = new DequeList();

        deque.addFirst(new Node(new Aluno("Ana", 9.0, 7.5)));
        deque.addFirst(new Node(new Aluno("Carlos", 8.5, 8.0)));
        deque.addLast(new Node(new Aluno("Beatriz", 7.0, 6.5)));

        System.out.println("Lista de alunos:");
        System.out.println(deque);

        System.out.println("\nPrimeiro aluno: ");
        System.out.println(deque.getFirst());

        System.out.println("\nÚltimo aluno: ");
        System.out.println(deque.getLast());

        System.out.println("\nRemovendo o primeiro aluno:");
        deque.removeFirst();
        System.out.println(deque);

        System.out.println("\nRemovendo o último aluno:");
        deque.removeLast();
        System.out.println(deque);

        System.out.println("\nAdicionando novo aluno no final:");
        deque.addLast(new Node(new Aluno("Daniel", 8.0, 9.0)));
        System.out.println(deque);

        System.out.println("\nBuscando aluno com nome 'Ana':");
        try {
            Node result = deque.search("Ana");
            System.out.println(result);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

