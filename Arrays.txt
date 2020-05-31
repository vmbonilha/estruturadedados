public class Arrays{
    public static void main(String[] args) {
            
            Teclado t = new Teclado();
            //String[] alunos = new String[t.leInt("Digite o tamanho do array:")];
            String[] alunos = new String[25];

            //for (int i = 0; i < alunos.length; i++){
            for (int i = 0; i < 30; i++){
                alunos[i] = t.leString("Digite um valor para a posicao "+i+":");
            }
            
            //for (int i=0; i < alunos.length; i++)
            for (int i=0; i < 30; i++)
            System.out.println("Posicao "+i+" : "+alunos[i]);
            /*
            Quando criamos um array, ele guarda as mesmas posições que criamos em memória. Ou seja, nesse caso aqui, ele está alocando 25 posições em memória.
            Quando tentamos adicionar mais elementos nas posições pré-definidas, ele dá um erro informando que não pode ultrapassar os limites pré-definidos,
            que no nosso caso é 25, e não deixará adicionar mais nenhum elemento dentro do array.
            É ele nos avisando: Você pediu 25 posições, não vou deixar adicionar a 26ª!
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 25 at Arrays.main(Arrays.java:9)
            */
            
    }

}