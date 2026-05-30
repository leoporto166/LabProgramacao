import java.util.Scanner;

interface Transporte {
    double calcularFrete(double peso, double altura, double largura, double distancia);
}

abstract class Veiculo implements Transporte {
    private int anoFabricacao;
    private String marca;
    private String modelo;
    private String propulsao;

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPropulsao() {
        return propulsao;
    }

    public void setPropulsao(String propulsao) {
        this.propulsao = propulsao;
    }
}

class VeiculoTerrestre extends Veiculo {
    private int qtdeRodas;
    private int qtdePortas;
    private String placa;
    private String chassi;

    public int getQtdeRodas() {
        return qtdeRodas;
    }

    public void setQtdeRodas(int qtdeRodas) {
        this.qtdeRodas = qtdeRodas;
    }

    public int getQtdePortas() {
        return qtdePortas;
    }

    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return 0;
    }
}

class VeiculoAereo extends Veiculo {
    private String rab;
    private int qtdeMotores;

    public String getRab() {
        return rab;
    }

    public void setRab(String rab) {
        this.rab = rab;
    }

    public int getQtdeMotores() {
        return qtdeMotores;
    }

    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }

    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return 0;
    }
}

class VeiculoFluvial extends Veiculo {
    private String numeroRegistroMarinha;
    private double boca;
    private double caladoAereo;

    public String getNumeroRegistroMarinha() {
        return numeroRegistroMarinha;
    }

    public void setNumeroRegistroMarinha(String numeroRegistroMarinha) {
        this.numeroRegistroMarinha = numeroRegistroMarinha;
    }

    public double getBoca() {
        return boca;
    }

    public void setBoca(double boca) {
        this.boca = boca;
    }

    public double getCaladoAereo() {
        return caladoAereo;
    }

    public void setCaladoAereo(double caladoAereo) {
        this.caladoAereo = caladoAereo;
    }

    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return 0;
    }
}

class Caminhao extends VeiculoTerrestre {
    private int qtdeEixos;
    private double capacidade;
    private String carroceria;

    public int getQtdeEixos() {
        return qtdeEixos;
    }

    public void setQtdeEixos(int qtdeEixos) {
        this.qtdeEixos = qtdeEixos;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return (peso + (altura * largura)) * (distancia * 6.99);
    }
}

class Aviao extends VeiculoAereo {
    private double capacidadeCarga;
    private double volume;
    private double pesoMaximoDecolagem;

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPesoMaximoDecolagem() {
        return pesoMaximoDecolagem;
    }

    public void setPesoMaximoDecolagem(double pesoMaximoDecolagem) {
        this.pesoMaximoDecolagem = pesoMaximoDecolagem;
    }

    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return ((peso * peso) * (altura * largura)) * (distancia * 9.99);
    }
}

class PortaContainer extends VeiculoFluvial {
    private double capacidadeCargaTEU;
    private String categoria;

    public double getCapacidadeCargaTEU() {
        return capacidadeCargaTEU;
    }

    public void setCapacidadeCargaTEU(double capacidadeCargaTEU) {
        this.capacidadeCargaTEU = capacidadeCargaTEU;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return peso + (altura * largura) * distancia;
    }
}

public class Transportadora {

    public static double calcularValorFrete(Transporte transporte, double peso, double altura, double largura, double distancia) {
        return transporte.calcularFrete(peso, altura, largura, distancia);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Frete da Transportadora ===");

        System.out.print("Informe o peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Informe a altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Informe a largura: ");
        double largura = scanner.nextDouble();

        System.out.print("Informe a distância: ");
        double distancia = scanner.nextDouble();

        System.out.println("\nEscolha o tipo de transporte:");
        System.out.println("1 - Caminhão");
        System.out.println("2 - Avião");
        System.out.println("3 - Porta Container");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        Transporte transporte;

        if (opcao == 1) {
            transporte = new Caminhao();
        } else if (opcao == 2) {
            transporte = new Aviao();
        } else if (opcao == 3) {
            transporte = new PortaContainer();
        } else {
            System.out.println("Opção inválida!");
            scanner.close();
            return;
        }

        double valorFrete = calcularValorFrete(transporte, peso, altura, largura, distancia);

        System.out.printf("\nValor do frete: R$ %.2f\n", valorFrete);

        scanner.close();
    }
}