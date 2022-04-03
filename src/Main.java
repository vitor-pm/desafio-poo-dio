import br.com.artnomic.desafio.dominio.*;


import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Neste curso, aprenda sobre linguagem java");
        cursoJava.setCargaHoraria(20);

        Curso cursoSpringBoot = new Curso();
        cursoSpringBoot.setTitulo("Curso Spring Boot");
        cursoSpringBoot.setDescricao("Curso de Spring, um FrameWork Java");
        cursoSpringBoot.setCargaHoraria(6);

        Mentoria mentoriaIntellij = new Mentoria();
        mentoriaIntellij.setTitulo("Mentoria IDE - Intellij");
        mentoriaIntellij.setDescricao("Aprenda os Atalhos, os Truques e Plugins para ser mais produtivo no Intellij");
        mentoriaIntellij.setData(LocalDate.now());

        Mentoria mentoriaMercadoJava = new Mentoria();
        mentoriaMercadoJava.setTitulo("Mentoria - Mercado Java");
        mentoriaMercadoJava.setDescricao("Tenha uma mentoria completa sobre o mercado de trabalho");
        mentoriaMercadoJava.setData(LocalDate.now().plusDays(1));

        Bootcamp bootcampJavaPlus = new Bootcamp();
        bootcampJavaPlus.setNome("Bootcamp Java ++");
        bootcampJavaPlus.setDescricao("Um BootCamp avançado de Java");
        bootcampJavaPlus.getConteudos().add(cursoJava);
        bootcampJavaPlus.getConteudos().add(cursoSpringBoot);
        bootcampJavaPlus.getConteudos().add(mentoriaIntellij);
        bootcampJavaPlus.getConteudos().add(mentoriaMercadoJava);

        System.out.println("---------------------------------------------------------------------");

        Dev devMichael = new Dev();
        devMichael.setNome("Michael");
        devMichael.inscreverBootcamp(bootcampJavaPlus);
        System.out.println("Conteudos Inscritos Michael: " + devMichael.getConteudoInscritos());
        devMichael.progredir();
        devMichael.progredir();
        devMichael.progredir();
        devMichael.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteudos Inscritos Michael: " + devMichael.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Michael: " + devMichael.getConteudoConcluidos());
        System.out.println("XP: " + devMichael.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcampJavaPlus);
        System.out.println("ConteÃºdos Inscritos Bruno: " + devBruno.getConteudoInscritos());
        devBruno.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteudos Inscritos Bruno: " + devBruno.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Bruno: " + devBruno.getConteudoConcluidos());
        System.out.println("XP: " + devBruno.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Jhonatan");
        devCamila.inscreverBootcamp(bootcampJavaPlus);
        System.out.println("Conteudo Inscritos Camila: " + devCamila.getConteudoInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteudo Inscritos Camila: " + devCamila.getConteudoInscritos());
        System.out.println("ConteudosConcluidos Camila: " + devCamila.getConteudoConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");
    }
}
