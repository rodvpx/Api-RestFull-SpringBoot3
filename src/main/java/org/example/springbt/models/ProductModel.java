package org.example.springbt.models;

import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

//mapeamento JPA
//anotações para ser uma tabela no banco de dados
@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable { // habilitada a passar por serelização
    private static final long serialVersionUID = 1L; //número de controle de versão, quando serelizada

    //iniciar os atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //id gerados automaticamente
    private UUID idProduct; //identificador UUID indicado arquiteturas distribuidas, evita conflitos, universais
    private String name;
    private BigDecimal value;

    //gerar os metodos
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
