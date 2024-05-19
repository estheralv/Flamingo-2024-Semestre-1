package abstracaoPOO;

public class Computador {
    private String processador;
    private int memoriaRAM;
    private int armazenamento;
    private String sistemaOperacional;
    private String marca;
    private double tamanhoTela;

    public Computador(String processador, int memoriaRAM, int armazenamento, String sistemaOperacional, String marca, double tamanhoTela) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
        this.marca = marca;
        this.tamanhoTela = tamanhoTela;
    }

    public void ligar() {
        System.out.println("Ligando o computador " + marca);
    }

    public void desligar() {
        System.out.println("Desligando o computador " + marca);
    }

    public void executarPrograma(String programa) {
        System.out.println("Executando " + programa + " no computador " + marca);
    }

    public void abrirArquivo(String arquivo) {
        System.out.println("Abrindo arquivo " + arquivo + " no computador " + marca);
    }
}
