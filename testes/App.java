import javax.swing.JOptionPane;

public class App {
    static Turma classe = new Turma();
    
    public static int menu() {
        String menu = "MENU\n";
        menu = menu + "1 – Cadastrar Aluno\n";
        menu = menu + "2 – Buscar Aluno\n";
        menu = menu + "3 – Sair";
        int opcao = 0;
        String aux = JOptionPane.showInputDialog(menu);
        opcao = Integer.valueOf(aux);
        return opcao;
    }
    public static void cadastrarAluno(){
        
        String nome,matricula;
        nome=   JOptionPane.showInputDialog(null,
                "Qual o nome do Aluno?",
                "Controle de Aluno - Informar Nome",
                JOptionPane.QUESTION_MESSAGE);
        matricula=   JOptionPane.showInputDialog(null,
                "Qual a matricula do Aluno?",
                "Controle de Aluno - Informar Matricula",
                JOptionPane.QUESTION_MESSAGE);
        classe.cadastrarAluno(matricula,nome); 
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!"); //Obs:tratar essa mensagem!      
    }
    
    public static void buscarAluno(){
        
        String matricula;
        matricula=   JOptionPane.showInputDialog(null,
                "Qual a matricula do Aluno?",
                "Controle de Aluno - Buscar Aluno",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,classe.buscarAluno(matricula));
    }
    public static void main(String[] args) {
         
    int op;
    do {
            op = menu();
            switch (op) {
                case 1://Cadastro de Aluno
                    cadastrarAluno();
                break;

                case 2://Busca Aluno 
                    buscarAluno();
                break;

                case 3://Sai  
                     System.exit(0); 
                break;

            }
        } while (op >= 1 && op <= 3);
    }   
}
    
