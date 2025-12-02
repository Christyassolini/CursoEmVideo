package Aula9;

public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int totPagina);
    public abstract void avançarPag();
    public abstract void voltarPag();
}
