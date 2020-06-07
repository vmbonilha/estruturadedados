import java.util.*;
public class Pilha {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<Integer>();
        pilha.add(5);
        pilha.push(5);
        pilha.pop();
        pilha.remove(5);
        pilha.remove(new Integer(4));
        pilha.contains(5);
        pilha.peek();
        pilha.isEmpty();
    }

}