import java.util.UUID;

public class CalculadorSalarioService {
    public UUID uuid = UUID.randomUUID();
    private static CalculadorSalarioService instacia;

    private CalculadorSalarioService() {
    }

    public static CalculadorSalarioService getCalculadorSalarioService(){
        if(instacia == null){
            instacia = new CalculadorSalarioService();
            return instacia;
        }else {
            return instacia;
        }
    }
    public double calcularSalarioLiquido(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao){
        return salarioBruto - valorDescontos + (valorVendas * (percentualComissao / 100));
    }

    public UUID getUuid(){
        return uuid;
    }

}

