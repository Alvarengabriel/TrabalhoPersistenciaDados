@Entity
@Table(name = "alunos")
public class Aluno {

  @Id
  @Column(name = "matricula")
  private String matricula;

  @Column(name = "nome")
  private String nome;

  @Column(name = "curso_id")
  private String cursoId;

  public Aluno() {
  }

  public Aluno(String matricula, String nome, String cursoId) {
    this.matricula = matricula;
    this.nome = nome;
    this.cursoId = cursoId;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCursoId() {
    return cursoId;
  }

  public void setCursoId(String cursoId) {
    this.cursoId = cursoId;
  }

}
