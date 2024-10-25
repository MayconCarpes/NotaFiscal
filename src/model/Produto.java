package model;

public class Produto {
        private String nome;
        private float precoUnitario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Produto(String nome, float precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }
}
