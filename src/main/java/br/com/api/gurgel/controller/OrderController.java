package br.com.api.gurgel.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class OrderController {

    @RequestMapping(value = "/pedido/{document}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Retorna informações dos 3 ultimos pedidos do cliente")
    public ResponseEntity<?> getLastOrders(@PathVariable("document") String document) {
        return null;
    }
}
