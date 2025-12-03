package HerançaAula10;

import java.util.Random;

public class Aluno extends Pessoa implements StatusInterface {
    private int matr;
    private String curso;

    public Aluno(String nome, int idade, String sexo, String curso) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        Random random  = new Random();
        this.setMatr(random.nextInt(100, 999));
        this.setCurso(curso);
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatr() {
        System.out.println("Matrícula cancelada!");
    }

    @Override
    public void status() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Matrícula: " + getMatr());
        System.out.println("Curso: " + getCurso());
    }
}
