package ifma.lista01;

public class CadastrarAlunos {
    private Aluno[] alunos;
    private int contador;


    public CadastrarAlunos(int tamanho) {
        this.alunos = new Aluno[tamanho];
        this.contador = 0;
    }

    // adcionar  no final do Vetor
    public boolean adicionarNoFinal(Aluno aluno) {
        if (contador < alunos.length) {
            alunos[contador] = aluno;
            contador++;
            return true;
        } else {
            System.out.println("Erro: Não há espaço disponível para adicionar o aluno.");
            return false;
        }
    }

    // adcionar  no inicio do Vetor
    public boolean adicionarNoInicio(Aluno aluno) {
        if (contador == alunos.length) {
            System.out.println("Erro: Não há espaço disponível no início do vetor.");
            return false;
        }

        // Move os elementos existents para frente
        for (int i = contador; i > 0; i--) {
            alunos[i] = alunos[i - 1];
        }
        alunos[0] = aluno;
        contador++;
        return true;
    }

    //remover aluno do final do vetor
    public boolean removerNoFinal() {
        if (contador == 0) {
            System.out.println("Erro: Não há alunos para remover.");
            return false;
        }
        alunos[contador - 1] = null; // Remove o último aluno
        contador--;
        return true;
    }

    //Remover aluno do inicio do vetor
    public boolean removerNoInicio() {
        if (contador == 0) {
            System.out.println("Erro: Não há alunos para remover.");
            return false;
        }

        // Move todos os alunos uma posição para a esquerda
        for (int i = 0; i < contador - 1; i++) {
            alunos[i] = alunos[i + 1];
        }
        alunos[contador - 1] = null;
        contador--;
        return true;
    }


    //verifica se o metodo passado existe ou está ocupado por algum aluno
    public boolean verificarIndice(int indice) {
        if (indice >= 0 && indice < contador && alunos[indice] != null) {
            return true;
        }
        return false;
    }

    // Remover aluno por indice
    public String removerComIndice(int indice) {
        if (!verificarIndice(indice)) {
            System.out.println("Erro: Indice invalido ou posição já ocupada .");
            return null;
        }

        String nomeRemovido = alunos[indice].getNome();

        if (indice == 0) {
            removerNoInicio(); // Remove no início
        } else if (indice == contador - 1) {
            removerNoFinal(); // Remove no final
        } else {
            // Remove o aluno do meio
            for (int i = indice; i < contador - 1; i++) {
                alunos[i] = alunos[i + 1];
            }
            alunos[contador - 1] = null; // Remove o último aluno,
            contador--;
        }
        return nomeRemovido;
    }

    public void ordenarVetor() {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = i + 1; j < contador; j++) {
                if (alunos[i].getCodigo() > alunos[j].getCodigo()) {
                    // Troca os alunos de posição
                    Aluno temp = alunos[i];
                    alunos[i] = alunos[j];
                    alunos[j] = temp;
                }
            }
        }
    }


    public void imprimirAlunos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(alunos[i]);
        }
    }
}