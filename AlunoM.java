package modelo;

public class AlunoM {

    private int ra;
    private String cpf;
    private String nome;
    private int idade;
    private char sexo;
    private int Codcurso;
    CursoM curso;


    //Construtor padrão (sem argumento/sem parametro): Método que é disparado ao criar um objeto AlunoM
    public AlunoM(){
        ra = 0;
        cpf = "";
        nome = "";
        idade = 0;
        sexo= '0';
        Codcurso = 0;
        curso=null;
    }

    //Construtor com parametro


    public AlunoM(int ra, String cpf, String nome, int idade, char sexo, int codcurso, CursoM curso) {
        this.ra = ra;
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        Codcurso = codcurso;
        this.curso = curso;
    }

    public AlunoM(int i, String string, String clayton, int i0, char c, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getRa() {
        return ra;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public int getCodcurso() {
        return Codcurso;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setCodcurso(int Codcurso) {
        this.Codcurso = Codcurso;
    }

    public CursoM getCurso() {
        return curso;
    }

    public void setCurso(CursoM curso) {
        this.curso = curso;
    }

    public void ImprimeAtributos(){
        System.out.println("\nRA: "+ this.getRa());
        System.out.println("Cpf: "+ this.getCpf());
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Sexo: "+ this.getSexo());
        System.out.println("CodCurso: "+ this.getCodcurso());
        System.out.println(">> Dados do curso <<\n");
        this.curso.ImprimeCurso();
      
        
    }
}
