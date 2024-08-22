package com.example.springboot.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.*;


// Entity = entidade da base de dados para que a gente faça este mapeamento de uma classe Java para uma entidade no banco
// Table = nome da tabela no banco de dados
@Entity
@Table(name = "tb_product")

// Serializable = é uma interface (marcação) que serve para que os objetos daclasse possam ser convertidos em uma sequência de bytes
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable {
    private static final long serialVersionUID = 1L; // numero de controle de versão enviada de um objeto seja compatível com a versão recebida.

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct;
    private String name;
    private BigDecimal value;

    public UUID getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
