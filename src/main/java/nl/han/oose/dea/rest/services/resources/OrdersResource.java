package nl.han.oose.dea.rest.services.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import java.util.ArrayList;
import java.util.List;

@Path("/orders")
public class OrdersResource {

    @GET
    public ArrayList<Order> getOrders() {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 1));
        orders.add(new Order(2, 1));
        return orders;
    }

    // /orders/order-id
    @GET
    @Path("/{order-id}")
    public String getOrder(@PathParam("order-id") int orderId) {
        return "Specifiek deze order! ->" + orderId;
    }
}

