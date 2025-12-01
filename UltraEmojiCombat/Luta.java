package UltraEmojiCombat;

public class Luta {
    private String desafiado;
    private String desafiante;
    private int Rounds;
    private Boolean aprovada;
    
    public String getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(String desafiado) {
        this.desafiado = desafiado;
    }
    public String getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(String desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return Rounds;
    }
    public void setRounds(int rounds) {
        Rounds = rounds;
    }
    public Boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Luta() {
        setAprovada(false);
    }

    public void marcarLuta(){

    }
    public void lutar() {
        
    }

}
