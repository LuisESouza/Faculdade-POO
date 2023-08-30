package controle;

import modelo.AlunoM;

import java.util.ArrayList;

public class AlunoC {
    public ArrayList<AlunoM> vetAluno;

    public AlunoC() {
        //Ao criar objeto AlunoC, já instancia a proxima posicao para armazenar um novo objeto AlunoM
        vetAluno = new ArrayList<AlunoM>();
    }

        //Cadastro de objetos AlunoM
        public void InsertAlunoM(AlunoM aluno){
            vetAluno.add(aluno);
        }
        
    public void ListaGeralAlunoM(){
        for(AlunoM dados: vetAluno){
            dados.ImprimeAtributos();
        }
    }

public void BuscaPorRA(int ra){
        for(int i=0;i<vetAluno.size();i++){
           
            if(vetAluno.get(i).getRa()==ra){
                System.out.println("----------");
                System.out.println("RA encontrado");
                System.out.println("RA"+vetAluno.get(i).getRa());
            }
        }  
    }  
   
    public void RemoveAluno(int ra){
        for(int i=0;i<vetAluno.size();i++){
            if(vetAluno.get(i).getRa()==ra){
                vetAluno.remove(i);
            }
        }
    }    
   
}