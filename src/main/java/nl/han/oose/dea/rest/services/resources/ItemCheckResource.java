package nl.han.oose.dea.rest.services.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import nl.han.oose.dea.rest.services.ItemService;
import nl.han.oose.dea.rest.services.dto.ItemDTO;

import java.util.List;

@Path("/items")
public class ItemCheckResource {
    ItemService IS = new ItemService();

    @GET
    public String healthy() {
        return "bread, butter";
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
    public List<ItemDTO> getItemsJSON() {
        return IS.getAll();
    }
}