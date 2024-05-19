package abstracaoPOO;

public class Celular {
    private String marca;
    private String modelo;
    private String sistemaOperacional;
    private int armazenamento;
    private double tamanhoTela;
    private int bateria;

    public Celular(String marca, String modelo, String sistemaOperacional, int armazenamento, double tamanhoTela, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.armazenamento = armazenamento;
        this.tamanhoTela = tamanhoTela;
        this.bateria = bateria;
    }

    public void ligar() {
        System.out.println("Ligando o celular " + marca);
    }

    public void desligar() {
        System.out.println("Desligando o celular " + marca);
    }

    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero + " com o celular " + marca);
    }

    public void enviarMensagem(String mensagem, String numero) {
        System.out.println("Enviando mensagem '" + mensagem + "' para " + numero + " com o celular " + marca);
    }

    public void tirarFoto() {
        System.out.println("Tirando foto com o celular " + marca);
    }

    public void navegarNaInternet() {
        System.out.println("Navegando na internet com o celular " + marca);
    }
}

