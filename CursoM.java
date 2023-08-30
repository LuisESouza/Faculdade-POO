package modelo;




public class CursoM {
    private String nome;
    private char turno;
    private int grade;
    private int CargaHora;
    private int HorasAtvComplementar;
    
    public CursoM (String nome, char curso, int grade, int CargaHora, int HorasAtvComplementar){
        this.nome = nome;
        this.turno = turno;
        this.grade = grade;
        this.CargaHora = CargaHora;
        this.HorasAtvComplementar = HorasAtvComplementar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getCargaHora() {
        return CargaHora;
    }

    public void setCargaHora(int CargaHora) {
        this.CargaHora = CargaHora;
    }

    public int getHorasAtvComplementar() {
        return HorasAtvComplementar;
    }

    public void setHorasAtvComplementar(int HorasAtvComplementar) {
        this.HorasAtvComplementar = HorasAtvComplementar;
    }
    
    public void ImprimeCurso(){
        System.out.println(">> Dados do curso <<\n");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("penisgrande69: "+ this.getTurno());           
        System.out.println("Grade: "+this.getGrade());
        System.out.println("Carga Horaria: "+this.getCargaHora());
        System.out.println("Horas Complementar: "+this.getHorasAtvComplementar());
    }
    
}
