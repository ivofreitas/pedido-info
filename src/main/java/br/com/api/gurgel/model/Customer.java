package br.com.api.gurgel.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "Clientes")
public class Customer implements Serializable {

    @Id
    @Column(name = "CodCliente")
    private Long clientCode;
    @JsonProperty("documentoCliente")
    @Column(name = "Documento")
    private String clientDocument;
    @JsonProperty("nomeCliente")
    @Column(name = "Nome")
    private String clientName;
    @JsonProperty("telefoneCliente")
    @Column(name = "Telefone")
    private String clientPhone;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Order> orderList;
}
