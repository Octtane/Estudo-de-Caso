public class TV {
    int tamanhoTela;
    int volume;
    int voltagem;
    int canal;
    String marca;
    boolean ligada;

    public TV(int tamanhoTela, String marca, int voltagem) {
        this.volume = 5;
        canal = 1;
        this.voltagem = voltagem;
        this.marca = marca;
        this.tamanhoTela = tamanhoTela;
        this.ligada = false;
    }

    public void ligar() {
        if (ligada = false) {
            ligada = true;
            System.out.println("Televisão Ligada");
        } else {
            System.out.println("A televisão já está ligada");
        }
    }

    public void desligar() {
        if (ligada = true) {
            ligada = false;
            System.out.println("Televisão desligada");
        } else {
            System.out.println("A televisão já está desligada");
        }
    }

    public void aumentarVolume() {
        if (volume < 10) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("Volume já está no máximo.");
        }
    }

    public void diminuirVolume() {
        if (volume > 1) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        } else {
            System.out.println("Volume já está no mínimo.");
        }

    }
    public void subirCanal(){
        if (ligada = true){
            canal++;
            System.out.println("Canal mudado para: " +canal);
        }
        else{
            System.out.println("TV desligada");
        }
    }

    public void descerCanal(){
        if (ligada = true){
            canal--;
            System.out.println("Canal mudado para: " +canal);
        }
        else{
            System.out.println("TV desligada");
        }
    }
}