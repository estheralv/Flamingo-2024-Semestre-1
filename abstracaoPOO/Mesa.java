package abstracaoPOO;

public class Mesa {
    private String material;
    private String cor;
    private double comprimento;
    private double largura;
    private double altura;
    private String tipo;

    public Mesa(String material, String cor, double comprimento, double largura, double altura, String tipo) {
        this.material = material;
        this.cor = cor;
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
        this.tipo = tipo;
    }

    public void ajustarAltura(double novaAltura) {
        this.altura = novaAltura;
    }

    public void expandir(double novaLargura) {
        this.largura = novaLargura;
    }

    public void dobrar(double novoComprimento) {
        this.comprimento = novoComprimento;
    }

    public void suportarPeso(double peso) {
        System.out.println("Suportando peso de " + peso + "kg");
    }
}
