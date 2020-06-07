public class Lista {
    private final int Lista[];
    Lista(int max){
        Lista = new int[max];
    }

    private int pos=0;
    public void inserir(int aux){

        Lista[pos] = aux;
        pos++;

        if(pos >= Lista.length)
        pos=0;
    }
    public void remover(int aux){
        Lista[aux]=0;
    }
    public void editar(int posaux, int aux){
        Lista[posaux]=aux;
    }
    public void imprimir(){
        for (int i = 0; i < Lista.length; i++) {
            System.out.println(Lista[i]);
        }
    }

    public static void main (String[] args){
        Lista lista = new Lista(5);
        for (int i = 1; i < 6; i++) {
            lista.inserir(i);
            
        }
        lista.imprimir();
    }

}

