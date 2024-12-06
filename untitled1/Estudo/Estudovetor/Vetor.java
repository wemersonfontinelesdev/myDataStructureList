package Estudovetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private  int tamanho;

//    public Vetor(String[] elementos) {
//        this.elementos = elementos;
    // }

    public Vetor (int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // Novo metodo para adcionar elementos no Vetor

    /*public void adiciona (String elemento){
        for (int i =0; i<this.elementos.length; i++){
            if(this.elementos[i]==null){
                this.elementos[i]=elemento;
                break;

            }

        }
}*/
    public void adiciona (String elemento) throws Exception{
//estamos guardando a ultima posição::
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else{
            //praq serve
            throw new Exception("Vetor já está cheio ");
        }
    }
    //Adicionar um elemneto em qualquer posição ----aula7
    public boolean adiciona( int posicao, String elemento){
        //this.aumentaCapacidade();
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posiçaõ inválida");

        }
        //this.aumentaCapacidade(); - tirei pra testar


        //mover todos os elementos
        for (int i=this.tamanho-1; i>=posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao]= elemento;
        this.tamanho++;
        return  false;

    }

    private void aumentaCapacidade(){
        if (this.tamanho== this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];
            for ( int i=0; i<this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
            }
        }




    //Busca=====================
    public  String busca(int posicao){
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posiçaõ inválida");
        }
        return this.elementos[posicao];
    }
    //Verificar se um elemento existe no vetor
    public int busca(String elemento){
        //busca sequencia:=========================
        for ( int i=0; i<this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
            }
        return -1;
        }


/*
    public boolean adiciona (String elemento) {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
        }

 */

    //B C E F G REMOVIDA 1 (G)
    //B D E F F
    //0 1 2 3 4  TAMANHO 5
    //vetor[1] = vetor[2]
    //vetor[2] = vetor[3]
    //vetor[4] = vetor[4]
    public void remove(int posicao){
        if (!(posicao>=0 && posicao < tamanho)){
            throw new IllegalArgumentException("posição Invalida");
        }
        for (int i = posicao; i<this.tamanho-1; i++){
            this.elementos[i]= this.elementos[i+1];
        }
        this.tamanho--;
    }
    public int tamanho(){
        return this.tamanho;
    }
//Aula 4
    @Override
    public String toString() {
        return "Vetor{" +
                "elementos=" + Arrays.toString(elementos) +
                ", tamanho=" + tamanho +
                '}';
    }
}





