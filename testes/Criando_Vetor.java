public class Criando_Vetor {
    public static void main(final String[] args) {
        int soma = 0;
        final int vetor[] = new int[5];

        for(int i = 0; i < 5; i++){
            vetor[i] = i * 5;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        System.out.println("Soma dos numeros armazenados no vetor: "+ soma);
    }
}