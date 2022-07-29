import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1=new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso básico de Java");
        curso1.setCargaHoraria(10);

        Curso curso2=new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Curso avançado de Python");
        curso2.setCargaHoraria(20);

        Mentoria mentoria1=new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Mentoria de Java para evoluir na carreira");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp= new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devStefano=new Dev();
        devStefano.setNome("Stefano");
        devStefano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devStefano.getNome() + ":" +devStefano.getConteudosIncritos());

        Dev devRaquel= new Dev();
        devRaquel.setNome("Raquel");
        devRaquel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devRaquel.getNome() + ":" + devRaquel.getConteudosIncritos());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);
    }
}
