package br.com.api.gurgel.service;

import br.com.api.gurgel.model.dto.Response;

import java.util.Optional;

public interface OrderService {

    Optional<Response> getLastOrders(String document);
}
