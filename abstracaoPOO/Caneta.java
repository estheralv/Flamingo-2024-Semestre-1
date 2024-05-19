package abstracaoPOO;

public class Caneta {
    private String cor;
    private String tipo;
    private double ponta;
    private String marca;
    private int quantidadeTinta;

    public Caneta(String cor, String tipo, double ponta, String marca, int quantidadeTinta) {
        this.cor = cor;
        this.tipo = tipo;
        this.ponta = ponta;
        this.marca = marca;
        this.quantidadeTinta = quantidadeTinta;
    }

    public void escrever() {
        if (quantidadeTinta > 0) {
            System.out.println("Escrevendo com a caneta " + marca);
            quantidadeTinta--;
        } else {
            System.out.println("Sem tinta! Recarregue a caneta " + marca);
        }
    }

    public void recarregar() {
        quantidadeTinta = 100;
    }

    public int verificarTinta() {
        return quantidadeTinta;
    }
}
