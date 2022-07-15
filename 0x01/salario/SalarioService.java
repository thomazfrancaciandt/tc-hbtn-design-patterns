package salario;

import java.util.UUID;

public class SalarioService {
    private salario.CalculadorSalarioService calculador = salario.CalculadorSalarioService.getCalculadorSalarioService();

    public double calcular(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao) {
        return calculador.calcularSalarioLiquido(salarioBruto, valorDescontos, valorVendas, percentualComissao);
    }

    public UUID getUuid() {
        return calculador.getUuid();
    }
}