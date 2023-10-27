@Entity
@Table(name = "cursos")
public class Curso {

  @Id
  @Column(name = "codigo")
  private String codigo;

  @Column(name = "nome")
  private String nome;

  @Column(name = "carga_horaria")
  private int cargaHoraria;

  public Curso() {
  }

  public Curso(String codigo, String nome, int cargaHoraria) {
    this.codigo = codigo;
    this.nome = nome;
    this.cargaHoraria = cargaHoraria;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

}
