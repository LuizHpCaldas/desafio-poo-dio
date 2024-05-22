import java.util.HashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Curso> cursosInscritos = new HashSet<>();
    private Set<Mentoria> mentoriasInscritas = new HashSet<>();

    // Construtor
    public Dev(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public Set<Mentoria> getMentoriasInscritas() {
        return mentoriasInscritas;
    }

    // Métodos
    public void inscreverCurso(Curso curso) {
        cursosInscritos.add(curso);
    }

    public void inscreverMentoria(Mentoria mentoria) {
        mentoriasInscritas.add(mentoria);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", cursosInscritos=" + cursosInscritos +
                ", mentoriasInscritas=" + mentoriasInscritas +
                '}';
    }
}
