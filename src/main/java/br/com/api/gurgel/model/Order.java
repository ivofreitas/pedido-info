package br.com.api.gurgel.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "codPedido",
        "dataPedido",
        "valorPedido",
        "entregas"
})
@Table(name = "Pedidos")
public class Order implements Serializable {

    @JsonProperty("codPedido")
    @Column(name = "CodPedido")
    private String orderCode;
    @JsonProperty("dataPedido")
    @Column(name = "DataPedido")
    private String orderDate;
    @JsonProperty("valorPedido")
    @Column(name = "Valor")
    private String orderValue;
    @ManyToOne
    private Customer customer;
    @JsonProperty("entregas")
    @OneToMany(mappedBy = "pedidos", cascade = CascadeType.ALL)
    private List<Delivery> deliveryList;

}
