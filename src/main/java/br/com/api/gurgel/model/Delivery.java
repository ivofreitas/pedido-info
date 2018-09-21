package br.com.api.gurgel.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "idEntrega",
        "statusEntrega",
        "transportadora",
        "dataPrevistaEntrega",
        "codigoRastreio"
})
@Entity
@Table
public class Delivery implements Serializable {

    @JsonProperty("idEntrega")
    private String deliveryID;
    @JsonProperty("statusEntrega")
    private String status;
    @JsonProperty("transportadora")
    private String shippingCompany;
    @JsonProperty("dataPrevistaEntrega")
    private String deliveryDate;
    @JsonProperty("codigoRastreio")
    private String trackCode;
    @ManyToOne
    private Order order;

}