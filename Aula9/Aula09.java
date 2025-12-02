package Aula9;

public class Aula09 {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Christyan", 20, "Masculino");

        Livro l1 = new Livro("Codificador Limpo", "Robert Martin", 100, p1);

        l1.abrir();
        l1.folhear(120);
        l1.voltarPag();
        l1.paginaStatus();
    }
}
