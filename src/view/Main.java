package view;

import model.ItemVenda;
import model.NotaFiscal;
import model.Produto;
import model.Venda;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando alguns produtos

        Produto produto1 = new Produto("Arroz", 550);
        Produto produto2 = new Produto("Feijão", 780);
        Produto produto3 = new Produto("Macarrão", 340);

        // Criando uma venda
        Venda venda = new Venda("23/10/2024");

        // Adicionando itens na venda
        venda.adicionarItem(new ItemVenda(produto1, 2));  // 2 unidades de Arroz
        venda.adicionarItem(new ItemVenda(produto2, 1));  // 1 unidade de Feijão
        venda.adicionarItem(new ItemVenda(produto3, 3));  // 3 unidades de Macarrão

        // Gerando a nota fiscal
        NotaFiscal notaFiscal = new NotaFiscal(venda);
        System.out.println(notaFiscal.gerarNotaFiscal());
    }
}
