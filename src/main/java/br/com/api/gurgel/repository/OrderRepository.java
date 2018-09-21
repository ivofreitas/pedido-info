package br.com.api.gurgel.repository;

import br.com.api.gurgel.model.Order;
import br.com.api.gurgel.model.dto.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

    @Query( "SELECT new br.com.api.gurgel.model.dto.Response() " +
            "FROM Delivery d JOIN d.order o JOIN o.customer c AND " +
            "(" +
                "SELECT subO.orderCode " +
                "FROM Order subO " +
                "WHERE subO.customer = o.customer " +
                "ORDER BY o.orderDate DESC " +
                "LIMIT 0, 3" +
            ")" +
            "WHERE c.clientDocument = :document"
        )
    Response retrieveOrderByCustomerDocument(@Param("document") String document);
}
