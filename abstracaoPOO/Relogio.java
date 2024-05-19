package abstracaoPOO;

public class Relogio {
    private String tipo;
    private String marca;
    private String cor;
    private String material;
    private boolean resistenteAgua;

    public Relogio(String tipo, String marca, String cor, String material, boolean resistenteAgua) {
        this.tipo = tipo;
        this.marca = marca;
        this.cor = cor;
        this.material = material;
        this.resistenteAgua = resistenteAgua;
    }

    public void mostrarHora() {
        System.out.println("Mostrando hora no relógio " + marca);
    }

    public void ajustarHora(int hora, int minuto) {
        System.out.println("Ajustando hora para " + hora + ":" + minuto + " no relógio " + marca);
    }

    public void cronometro() {
        System.out.println("Iniciando cronômetro no relógio " + marca);
    }

    public void alarme() {
        System.out.println("Configurando alarme no relógio " + marca);
    }
}
