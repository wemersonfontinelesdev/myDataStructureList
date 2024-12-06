package ifma.lista01;

public class TestarAlunos {
    public static void main(String[] args) {
        CadastrarAlunos cadastro = new CadastrarAlunos(5);

        // Criando alunos
        Aluno aluno1 = new Aluno();
        aluno1.setCodigo(3);
        aluno1.setNome("Wemersonlindo");
        aluno1.setMatricula("12345");

        Aluno aluno2 = new Aluno();
        aluno2.setCodigo(1);
        aluno2.setNome("Maria");
        aluno2.setMatricula("54321");

        Aluno aluno3 = new Aluno();
        aluno3.setCodigo(2);
        aluno3.setNome("Carlos");
        aluno3.setMatricula("67890");

        // Adcionar no final
        cadastro.adicionarNoFinal(aluno1);
        cadastro.adicionarNoFinal(aluno2);
        cadastro.adicionarNoFinal(aluno3);

        System.out.println("Alunos após adição:");
        cadastro.imprimirAlunos();

        // ordenar alunos
        cadastro.ordenarVetor();
        System.out.println("\nAlunos após ordenação:");
        cadastro.imprimirAlunos();

        // remoção no início
        cadastro.removerNoInicio();
        System.out.println("\nAlunos após remoção no início:");
        cadastro.imprimirAlunos();

        // Remoção no final
        cadastro.removerNoFinal();
        System.out.println("\nAlunos após remoção no final:");
        cadastro.imprimirAlunos();

        // Testar remoção por índice
        cadastro.removerComIndice(0);
        System.out.println("\nAlunos após remoção por índice:");
        cadastro.imprimirAlunos();
    }
}
