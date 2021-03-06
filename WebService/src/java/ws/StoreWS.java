/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.google.gson.Gson;
import dao.UserDAO;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import modelo.Store;
import dao.StoreDAO;
import javax.ws.rs.PathParam;

/**
 * REST Web Service
 *
 * @author Xoi
 */
@Path("store")
public class StoreWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of StoreWS
     */
    public StoreWS() {
    }

    /**
     * Retrieves representation of an instance of ws.StoreWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
    
        @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/insert")
    public boolean inserirStore(String content){
        Gson g = new Gson();
        Store s = (Store) g.fromJson(content, Store.class);
        StoreDAO dao = new StoreDAO();
        return dao.insertStore(s);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/delete/{idstore}")
    public String deletarUsuario(@PathParam("idstore")int idstore){
        StoreDAO dao = new StoreDAO();
        if(dao.deleteStore(idstore)){
            return "true";
        }else{
            return "false";
        }
    }

    /**
     * PUT method for updating or creating an instance of StoreWS
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
