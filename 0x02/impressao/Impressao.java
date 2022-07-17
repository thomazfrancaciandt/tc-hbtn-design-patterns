import java.util.Locale;

public class Impressao {
    private int paginasTotais;
    private  int paginasColoridas;
    private final boolean ehFrenteVerso;
    TamanhoImpressao tamanhoImpressao;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public Impressao(
            TamanhoImpressao tamanhoImpressao,
            int paginasTotais,
            int paginasColoridas,
            boolean ehFrenteVerso) {
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.tamanhoImpressao = tamanhoImpressao;
    }

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public int getPaginasPb() {
        return getPaginasTotais() - getPaginasColoridas();
    }

    public double getTotalA2() {
        double quantidadePb = getPaginasPb();
        double quantidadeColorida = getPaginasColoridas();
        double valorTotal;
        double valorTotalPb = 0;
        double valorTotalCor = 0;

        if (this.tamanhoImpressao == TamanhoImpressao.A2 && !ehFrenteVerso) {
            this.valorPretoBrancoFrenteApenas = 0.22;
            this.valorColoridasFrenteApenas = 0.32;

            valorTotalPb = quantidadePb * this.valorPretoBrancoFrenteApenas;
            valorTotalCor = quantidadeColorida * this.valorColoridasFrenteApenas;

        } else if (this.tamanhoImpressao == TamanhoImpressao.A2 && ehFrenteVerso) {
            this.valorPretoBrancoFrenteVerso = 0.18;
            this.valorColoridasFrenteVerso = 0.28;

            valorTotalPb = quantidadePb * this.valorPretoBrancoFrenteVerso;
            valorTotalCor = quantidadeColorida * this.valorColoridasFrenteVerso;
        }

        valorTotal = valorTotalPb + valorTotalCor;
        return valorTotal;
    }

    public double getTotalA3() {
        double quantidadePb = getPaginasPb();
        double quantidadeColorida = getPaginasColoridas();
        double valorTotal;
        double valorTotalPb = 0;
        double valorTotalCor = 0;

        if (this.tamanhoImpressao == TamanhoImpressao.A3 && !ehFrenteVerso) {
            this.valorPretoBrancoFrenteApenas = 0.20;
            this.valorColoridasFrenteApenas = 0.30;

            valorTotalPb = quantidadePb * this.valorPretoBrancoFrenteApenas;
            valorTotalCor = quantidadeColorida * this.valorColoridasFrenteApenas;

        } else if (this.tamanhoImpressao == TamanhoImpressao.A3) {
            this.valorPretoBrancoFrenteVerso = 0.15;
            this.valorColoridasFrenteVerso = 0.25;

            valorTotalPb = quantidadePb * this.valorPretoBrancoFrenteVerso;
            valorTotalCor = quantidadeColorida * this.valorColoridasFrenteVerso;
        }
        valorTotal = valorTotalPb + valorTotalCor;
        return valorTotal;
    }

    public double getTotalA4() {
        double quantidadePb = getPaginasPb();
        double quantidadeColorida = getPaginasColoridas();
        double valorTotal;
        double valorTotalPb = 0;
        double valorTotalCor = 0;

        if (this.tamanhoImpressao == TamanhoImpressao.A4 && !ehFrenteVerso) {
            this.valorPretoBrancoFrenteApenas = 0.15;
            this.valorColoridasFrenteApenas = 0.25;

            valorTotalPb = quantidadePb * this.valorPretoBrancoFrenteApenas;
            valorTotalCor = quantidadeColorida * this.valorColoridasFrenteApenas;

        } else if (this.tamanhoImpressao == TamanhoImpressao.A4) {
            this.valorPretoBrancoFrenteVerso = 0.10;
            this.valorColoridasFrenteVerso = 0.20;

            valorTotalPb = quantidadePb * this.valorPretoBrancoFrenteVerso;
            valorTotalCor = quantidadeColorida * this.valorColoridasFrenteVerso;
        }
        valorTotal = valorTotalPb + valorTotalCor;
        return valorTotal;
    }

    public double calcularTotal() {
        return getTotalA2() + getTotalA3() + getTotalA4();
    }

    @Override
    public String toString() {
        String frente = "frente apenas";
        String frenteVerso = "frente e verso";

        String s = ehFrenteVerso ? frenteVerso : frente;

        return String.format(
                Locale.GERMANY,
                "total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
                getPaginasTotais(),
                getPaginasColoridas(),
                getPaginasPb(),
                s,
                calcularTotal());
    }
}