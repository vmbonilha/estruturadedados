import java.util.*;

public class Unidade3 {
    public static void main(String[] args) {
        List<Integer> lista = new Vector<Integer>();
        Stack<Integer> pilha = new Stack<Integer>();
        Queue<Integer> fila = new LinkedList<Integer>();
        
        //Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células;
        int v[] = { 1, 2, 3, 4, 5 };
            for (int i : v) {
                lista.add(i);
            }
        //Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista;
        for (int i = 0; i <= 4; i++) {
            pilha.push(lista.get(0));
            lista.remove(0);
        }
        //Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células);
        while(!pilha.isEmpty()){
            fila.add(pilha.pop());
        }
        //Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista;
        int z[] = { 6, 7, 8, 9, 10 };
        for (int i : z) {
            lista.add(i);
        }
        //Passo 5: Repita os passos 2 e 3.
        //Passo 2:
        for (int i = 0; i <= 4; i++) {
            pilha.push(lista.get(0));
            lista.remove(0);
        }
        //Passo 3:
        while(!pilha.isEmpty()){
            fila.add(pilha.pop());
        }

        //Passo 6: Exiba todos os números que foram inseridos na fila.
        System.out.println("Lista Atualizada: " + lista);
        System.out.println("Pilha Atualizada: " + pilha);
        System.out.println("Fila Atualizada: " + fila);
    } 
}