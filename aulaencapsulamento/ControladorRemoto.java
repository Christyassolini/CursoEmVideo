package aulaencapsulamento; 

public class ControladorRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControladorRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getvolume(){
        return this.volume;
    }
    public void setvolume(int volume){
        this.volume = volume;
    }
    public boolean getligado(){
        return this.ligado;
    }
    public void setligado(boolean ligado){
        this.ligado = ligado;
    }
    public boolean gettocando(){
        return this.ligado;
    }
    public void settocando(boolean tocando){
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        if (this.getligado() == false){
            this.setligado(true);
            System.out.println("Controle Ligado");
        } else {
            System.out.println("Controle já está Ligado");
        }
    }

    @Override
    public void desligar() {
        if (this.getligado() == true){
            this.setligado(true);
            System.out.println("Controle Desligado");
        } else {
            System.out.println("Controle já está desligado");
        }
    }

    @Override
    public void abrirMenu() {
        if (getligado() == true) {
            System.out.println("Menu Aberto");
        } else {
            System.out.println("Error: Controle desligado");
        }
    }

    @Override
    public void fecharMenu() {
        if (getligado() == true) {
            System.out.println("Menu Fechado");
        } else {
            System.out.println("Error: Controle desligado");
        }
    }

    @Override
    public void maisVolume() {
        if (getligado() == true && getvolume() < 100) {
            this.setvolume(getvolume() + 1);
            System.out.println("Volume Aumentado");
        } else {
            System.out.println("Error!");
        }
    }

    @Override
    public void menosVolume() {
        if (getligado() == true && getvolume() > 0) {
            this.setvolume(getvolume() - 1);
            System.out.println("Volume Diminuido");
        } else {
            System.out.println("Error!");
        }
    }

    @Override
    public void ligarMudo() {
        if (getligado() == true && getvolume() > 0){
            this.setvolume(0);
            System.out.println("Mudo Ligado");

        } else {
            System.out.println("Error!");
        }
    }

    @Override
    public void desligarMudo() {
        if (getligado() == true && getvolume() == 0){
            this.setvolume(50);
            System.out.println("Mudo Desligado");
        } else {
            System.out.println("Error!");
        }
    }

    @Override
    public void play() {
        if (getligado() == true && gettocando() == false) {
            this.settocando(true);
            System.out.println("Play");
        }else{
            System.out.println("Error!");
        }
    }

    @Override
    public void pause() {
        if (getligado() == true && gettocando() == true) {
            this.settocando(false);
            System.out.println("Pause");
        }else{
            System.out.println("Error!");
        }
    }
}