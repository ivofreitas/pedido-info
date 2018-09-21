package br.com.api.gurgel.repository;

import br.com.api.gurgel.model.Order;
import br.com.api.gurgel.model.dto.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

    @Query("SELECT new br.com.api.gurgel.model.dto.Response() " +
            "FROM Order o, Customer c, Delivery d WHERE c.clientCode = o.customer AND d.")
    Response retrieveOrderByCustomerDocument(@Param("document") String document);
}
