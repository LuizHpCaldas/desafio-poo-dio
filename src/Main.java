import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java Básico", "Curso introdutório de Java", 8);
        Curso curso2 = new Curso("Java Avançado", "Curso avançado de Java", 16);

        Mentoria mentoria1 = new Mentoria("Mentoria de Carreira", "Mentoria sobre carreira em TI", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp Java Developer");
        bootcamp.adicionarCurso(curso1);
        bootcamp.adicionarCurso(curso2);
        bootcamp.adicionarMentoria(mentoria1);

        Dev dev1 = new Dev("João");
        Dev dev2 = new Dev("Maria");

        dev1.inscreverCurso(curso1);
        dev2.inscreverCurso(curso2);
        dev1.inscreverMentoria(mentoria1);
        dev2.inscreverMentoria(mentoria1);

        bootcamp.matricularDev(dev1);
        bootcamp.matricularDev(dev2);

        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Cursos no bootcamp: " + bootcamp.getCursos().size());
        System.out.println("Mentorias no bootcamp: " + bootcamp.getMentorias().size());
        System.out.println("Devs matriculados no bootcamp: " + bootcamp.getDevs().size());
    }
}
