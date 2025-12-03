package HerançaAula10;

public class Professor extends Pessoa implements StatusInterface {
    private String especialidade;
    private float salario;

    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void receberAum(int valor) {
        this.setSalario(getSalario() + valor);
        System.out.println("Salário Aumentado");
    }

    @Override
    public void status() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Especialidade: " + getEspecialidade());
        System.out.println("Salário: " + getSalario());
    }
}
