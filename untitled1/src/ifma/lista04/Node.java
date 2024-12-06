package ifma.lista04;

public class Node {
    public Aluno aluno;
    public Node next;
    public Node previous;

    public Node(Aluno aluno) {
        this.aluno = aluno;
    }

    public Node() {}

    @Override
    public String toString() {
        return aluno.toString();
    }
}
