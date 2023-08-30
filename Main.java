package aluno;

import controle.AlunoC;
import modelo.AlunoM;
import modelo.CursoM;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        CursoM tads = new CursoM("TADs", 'N', 20,20,20);
        
        AlunoM luis= new AlunoM(11223, "222.333.444-55", "luis", 19, 'm', 111, tads);
        AlunoM clayton = new AlunoM(3, "111.222.333-44", "clayton", 44, 'm', 123);

        clayton.ImprimeAtributos();
        
        AlunoC controle = new AlunoC();
        
        controle.InsertAlunoM(luis);
        controle.InsertAlunoM(clayton);
        controle.ListaGeralAlunoM();
    }

}
