package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
    private String data;
    private List<ItemVenda> itemVendidos;

    public Venda(String data) {
        this.data = data;
        this.itemVendidos = new ArrayList<>();
    }

    public void adicionarItem(ItemVenda item) {
        this.itemVendidos.add(item);
    }

    public double calculcarTotal(){
        double total = 0;
        for (ItemVenda item : this.itemVendidos){
            total += item.calcularSubtotal();
        }
        return total;
    }

    public List<ItemVenda> getItemVendidos() {
        return itemVendidos;
    }
    public String getData() {
        return data;
    }


}
