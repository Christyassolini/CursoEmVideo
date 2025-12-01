package UltraEmojiCombat;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrota, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitoria(vitoria);
        this.setDerrota(derrota);
        this.setEmpates(empates);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        } else if(this.peso <= 70.3){
            this.categoria = "Leve";
        } else if(this.peso <= 83.9){
            this.categoria = "Médio";
        } else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        } else{
            this.categoria = "Inválido";
        }
    }
    public int getVitoria() {
        return vitoria;
    }
    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }
    public int getDerrota() {
        return derrota;
    }
    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public void apresentar(){
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + " m de altura");
        System.out.println("Pesando " + getPeso() + " KG");
        System.out.println("Ganhou: " + getVitoria());
        System.out.println("Perdeu: " + getDerrota());
        System.out.println("Empatou: " + getEmpates());
    }
    public void status(){
        System.out.println(getNome());
        System.out.println("É um peso: " + getCategoria());
        System.out.println(getVitoria() + " vitórias");
        System.out.println(getDerrota() + " derrotas");
        System.out.println(getEmpates() + " empates"); 
    }
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    public void perderLuta(){
        this.setDerrota(this.getDerrota() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

}
