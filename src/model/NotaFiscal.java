package model;

public class NotaFiscal {
    private Venda venda;

    public NotaFiscal(Venda venda) {
        this.venda = venda;
    }

    public String gerarNotaFiscal() {
        StringBuilder nota = new StringBuilder();
        nota.append("Data da Venda: ").append(venda.getData()).append("\n");
        nota.append("Itens:\n");

        for (ItemVenda item : venda.getItemVendidos()) {
            Produto produto = item.getProduto();
            nota.append(produto.getNome())
                    .append(" - Quantidade: ")
                    .append(item.getQuantidade())
                    .append(", Preço Unitário: R$ ")
                    .append(produto.getPrecoUnitario())
                    .append(", Subtotal: R$ ")
                    .append(item.calcularSubtotal())
                    .append("\n");
        }

        nota.append("Valor Total: R$ ").append(venda.calculcarTotal()).append("\n");
        return nota.toString();
    }
}
