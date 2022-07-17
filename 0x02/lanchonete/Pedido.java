import java.util.HashSet;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa;
    private HashSet<ItemPedido> itensForaCaixa;

    public Pedido() {
        this.itensDentroCaixa = new HashSet<ItemPedido>();
        this.itensForaCaixa = new HashSet<ItemPedido>();
    }

    public void adicionarItemDentroCaixa(ItemPedido item) {
        this.itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        this.itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        StringBuilder itemForaCx = new StringBuilder();
        StringBuilder itemDentroCx = new StringBuilder();
        for (ItemPedido element : this.itensForaCaixa) {
            itemForaCx.append(
                    String.format("\t\t- %s %s%n", element.getTipo().name(), element.getNome()));
        }
        for (ItemPedido e : this.itensDentroCaixa) {
            itemDentroCx.append(String.format("\t\t- %s %s%n", e.getTipo().name(), e.getNome()));
        }

        return String.format("\tFora da Caixa:%n%s\tDentro da Caixa:%n%s", itemForaCx, itemDentroCx);
    }
}