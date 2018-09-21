package br.com.api.gurgel.model.dto;

import java.io.Serializable;
import java.util.List;

import br.com.api.gurgel.model.Order;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "documentoCliente",
        "nomeCliente",
        "qtdePedidosPagosCliente",
        "telefoneCliente",
        "pedidos"
})
public class Response implements Serializable {

    @JsonProperty("documentoCliente")
    public String clientDocument;
    @JsonProperty("nomeCliente")
    public String clientName;
    @JsonProperty("qtdePedidosPagosCliente")
    public Integer payedOrdersQuantity;
    @JsonProperty("telefoneCliente")
    public String clientPhone;
    @JsonProperty("pedidos")
    public List<Order> orderList;

    public Response(String clientDocument, String clientName, String clientPhone) {
        this.clientDocument = clientDocument;
        this.clientName = clientName;
        this.clientPhone = clientPhone;
        this.orderList = orderList;
    }

}
