import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Programação em Java");
        curso1.setCargaHoraria(60);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Titulo");
        mentoria1.setDescricao("descriçao");
        mentoria1.setData(LocalDate.now());


        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java");
        bootCamp.setDescricao("Descrição java Bootcamp");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(mentoria1);

        Dev devEmerson = new Dev();
        devEmerson.setNome("Emerson");
        devEmerson.inscreverBootCAmp(bootCamp);
        System.out.println("Conteudos Inscritos" + devEmerson.getConteudosInscritos());
        devEmerson.progredir();
        System.out.println("Conteudos Inscritos" + devEmerson.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devEmerson.getConteudosConcluidos());

        Dev devKey = new Dev();
        devKey.setNome("Key");
        devKey.inscreverBootCAmp(bootCamp);
        System.out.println("Conteudos Inscritos" + devKey.getConteudosInscritos());
        devKey.progredir();
        System.out.println("Conteudos Inscritos" + devKey.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devKey.getConteudosConcluidos());


    }
}
