package Aula32;

public class Lista {
    private String [] elementos;
    private int tamanho;

    public Lista(int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }
    public void Adiciona (String elemento){
        if(tamanho<elementos.length)
            elementos[tamanho++] = elemento;
    }
    public String toString (){
        String retorno = "[";
        if(tamanho>0){
            for (int i=0;i<tamanho-1;i++){
                retorno += elementos[i]+", ";
            }
            retorno+=elementos[tamanho-1];
        }
        return retorno+"]";
    }
    public String obter(int posicao){
        if(posicao<0 || posicao>=tamanho)
            throw new IllegalArgumentException("Posição "+posicao+" é inválida");
        return elementos[posicao];
    }
    public void Adiciona (int posicao, String elemento){
        if(posicao<0 || posicao>=tamanho)
            throw new IllegalArgumentException("Posição "+posicao+" é inválida");
        for (int i = tamanho -1; i>=posicao; i--)
            elementos[i+1] = elementos[i];
        elementos[posicao] = elemento;
        tamanho ++;
    }
    public int posicaoDe (String elemento){
        for (int i=0; i<tamanho;i++)
            if(elementos[i].equals(elemento))
                return i;
        return -1;
    }
    private void aumentaCapacidade (){
        if(tamanho== elementos.length) {
            String[] aux = new String[tamanho + 2];
            //System.out.println(elementos,0,aux,0,elementos.length);
            for (int i = 0; i<tamanho; i++)
                aux[i]= elementos[i];
            elementos = aux;
        }
    }

    // Método para verificar se o elemento está na lista
    public boolean contem(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    // Método para remover todos os elementos da lista
    public void limpar() {
        elementos = (T[]) new Object[elementos.length]; // Mantém a capacidade
        tamanho = 0;
    }

    // Método que verifica se a lista está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Método que retorna a última posição do elemento na lista
    public int ultimaPosicaoElemento(T elemento) {
        int ultimaPosicao = -1;
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                ultimaPosicao = i;
            }
        }
        return ultimaPosicao;
    }

    // Método que retorna o tamanho da lista
    public int tamanho() {
        return tamanho;
    }
}