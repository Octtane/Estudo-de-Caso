public class Carro {
    String modelo;
    int velocidade;
    int aceleracao;
    String marcha = "Neutro";

    public void ligar(){
        System.out.println("Carro Ligando");
    }

    public void desligar(){
        System.out.println("Carro desligando");
    }

    public void acelerar(){
        System.out.println("Carro Acelerando");
    }

    public void desacelerar(){
        System.out.println("Carro Desacelerando");
    }

    public void virarDireita(){
        System.out.println("Carro Virando a Direita");
    }

    public void virarEsquerda(){
        System.out.println("Carro Virando a Esquerda");
    }

    public String getMarcha() {
        return marcha;
    }

    public void setMarcha(String marcha) {
        this.marcha = marcha;
    }

    public void marchaCima(){
        this.marcha = "Cima";
        System.out.println("Marcha para " +marcha);
    }

    public void marchaBaixo(){
        this.marcha = "Baixo";
        System.out.println("Marcha para " +marcha);
    }

}
