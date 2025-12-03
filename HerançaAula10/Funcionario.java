package HerançaAula10;

public class Funcionario extends Pessoa implements StatusInterface {
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, String sexo, String setor) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setSetor(setor);
        this.setTrabalhando(false);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho(String novoSetor) {
        this.setSetor(novoSetor);
        System.out.println("Setor de " + getNome() + " foi atualizado para: " + getSetor());
    }

    public void estaTrabalhando(){
        if (this.trabalhando == false) {
            this.setTrabalhando(true);
            System.out.println("Funcionário " + getNome() + " está trabalhando agora.");
        } else {
            System.out.println("Funcionário " + getNome() + " já está trabalhando.");
        }
    }

    @Override
    public void status() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Setor: " + getSetor());
        switch (trabalhando) {
            case true:
                System.out.println("Funcionário " + getNome() + " trabalhando");
                break;
        
            case false:
                System.out.println("Funcionário " + getNome() + " não está trabalhando");
                break;
        }
    }
}
