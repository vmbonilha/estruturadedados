
public class Aluno {
    private String matricula;
    private String nome;
    
    public Aluno(String matricula,String nome){
        this.matricula=matricula;
        this.nome=nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString(){
        return "Matricula:"+getMatricula()+" Nome:"+getNome();
    }
}

