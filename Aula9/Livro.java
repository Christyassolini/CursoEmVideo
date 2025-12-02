package Aula9;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPagina;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public void detalhes() {

    }

    public Livro(String titulo, String autor, int totPagina, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPagina(totPagina);
        this.setLeitor(leitor);
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pagAtual) {
        if(pagAtual > this.getTotPagina()) {
            System.out.println("Página não existe");
            this.setPagAtual(0);
        } else {
            this.setPagAtual(pagAtual);
        }
    }
    @Override
    public void avançarPag() {
        if (this.getPagAtual() >= this.getTotPagina()) {
            System.out.println("Error: Não é possível avançar");
        } else {
            this.setPagAtual(getPagAtual() + 1);
            System.out.println("Avançado");
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() < 2) {
            System.out.println("Error: Não é possível retornar");
        } else {
            this.setPagAtual(getPagAtual() - 1);
            System.out.println("Retornado");
        }
    }
    public void paginaStatus() {
        System.out.println("Página atual é: " + this.getPagAtual());
        System.out.println(titulo);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPagina() {
        return totPagina;
    }
    public void setTotPagina(int totPagina) {
        this.totPagina = totPagina;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;

    }
}
