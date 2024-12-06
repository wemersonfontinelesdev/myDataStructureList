public class Vetor {
    private String[] elementos;

//    public Vetor(String[] elementos) {
//        this.elementos = elementos;
   // }

    public Vetor (int capacidade){
        this.elementos = new String[capacidade];
    }

    // Novo metodo para adcionar elementos no Vetor

    public void adiciona (String elemento){
        for (int i =0; i<this.elementos.length; i++){
            if(this.elementos[i]==null){
                this.elementos[i]=elemento;
                break;

            }

        }
    }



}
