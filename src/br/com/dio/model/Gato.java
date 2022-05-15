package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String nome;
    private String color;
    private Integer idade;

    public Gato() {}

    public Gato(String nome, String color, Integer idade) {
        this.nome = nome;
        this.color = color;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getColor() {
        return color;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(color, gato.color) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, color, idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", color='" + color + '\'' +
                ", idade=" + idade +
                '}';
    }
}
