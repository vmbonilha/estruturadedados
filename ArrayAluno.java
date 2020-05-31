
public class ArrayAluno {
    private Alunos arraydealunos[]=new Alunos[25];
    private int j=0;
    
    public void cadastrarAluno(String nome){
        arraydealunos[j]= new Alunos(nome);
        j++;
    }
    public Alunos buscarAluno(String matricula){
        for(int i=0 ; i<j ;i++){
            if(arraydealunos[i].getNome().equals("nome"))
                return arraydealunos[i];
        }
        return null;
    } 
}
