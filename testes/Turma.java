
public class Turma {
    private Aluno turma[]=new Aluno[30];
    private int tam=0;
    
    public void cadastrarAluno(String matricula,String nome){
        turma[tam]= new Aluno(matricula,nome);
        tam++;
    }
    public Aluno buscarAluno(String matricula){
        for(int i=0 ; i<tam ;i++){
            if(turma[i].getMatricula().equals(matricula))
                return turma[i];
        }
        return null;
    } 
}
