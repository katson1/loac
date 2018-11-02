/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.google.gson.Gson;
import modelo.User;
import dao.UserDAO;
import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Xoi
 */
@Path("users")
public class UserWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UsuarioWS
     */
    public UserWS() {
    }

    /**
     * Retrieves representation of an instance of ws.UsuarioWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        return "Ola meu webservice";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("get/users")
    public String getUsuario() throws ClassNotFoundException, SQLException{
        Gson g = new Gson();       
        UserDAO dao = new UserDAO();
        List<User> usuarios = dao.getUsers();
        
        return "{" +"\"users\":" + g.toJson(usuarios)+"}";
    }
        
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/insert")
    public boolean inserirUsuario(String content){
        Gson g = new Gson();
        User u = (User) g.fromJson(content, User.class);
        UserDAO dao = new UserDAO();
        return dao.insertUsers(u);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/delete/{iduser}")
    public String deletarUsuario(@PathParam("iduser")int iduser){
        UserDAO dao = new UserDAO();
        if(dao.deleteUser(iduser)){
            return "true";
        }else{
            return "false";
        }
    }
    
    
    
    //////////////
    //UPDATES
    /////////////
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/updatemame/{iduser},{name}")
    public String updateNameUser(@PathParam("iduser")int iduser, 
            @PathParam("name")String name){
        User u = new User();
        u.setId(iduser);
        u.setName(name);
        UserDAO dao = new UserDAO();
        if(dao.updateNameUser(u)){
            return "true";
        }else{
            return "false";
        }
        
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/updatepass/{iduser},{pass}")
    public String updatePassUser(@PathParam("iduser")int iduser, 
        @PathParam("pass")String pass){
        User u = new User();
        u.setId(iduser);
        u.setPass(pass);
        UserDAO dao = new UserDAO();
        if(dao.updatePassUser(u)){
            return "true";
        }else{
            return "false";
        }
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/updatecpf/{iduser},{cpf}")
    public String updateCpfUser(@PathParam("iduser")int iduser, 
        @PathParam("cpf")String cpf){
        User u = new User();
        u.setId(iduser);
        u.setCpf(cpf);
        UserDAO dao = new UserDAO();
        if(dao.updateCpfUser(u)){
            return "true";
        }else{
            return "false";
        }
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/updateemail/{iduser},{email}")
    public String updateEmailUser(@PathParam("iduser")int iduser, 
        @PathParam("email")String email){
        User u = new User();
        u.setId(iduser);
        u.setEmail(email);
        UserDAO dao = new UserDAO();
        if(dao.updateEmailUser(u)){
            return "true";
        }else{
            return "false";
        }
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/updateend/{iduser},{end}")
    public String updateEndUser(@PathParam("iduser")int iduser, 
        @PathParam("end")String end){
        User u = new User();
        u.setId(iduser);
        u.setEnd(end);
        UserDAO dao = new UserDAO();
        if(dao.updateEndUser(u)){
            return "true";
        }else{
            return "false";
        }
        
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/updatelp/{iduser},{lp},{sum}")
    public String updateLPUser(@PathParam("iduser")int iduser, 
        @PathParam("lp")int lp, @PathParam("sum")int sum){
        User u = new User();
        u.setId(iduser);
        u.setLoacpoint(lp+sum);
        UserDAO dao = new UserDAO();
        if(dao.updateLPUser(u)){
            return "true";
        }else{
            return "false";
        }
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/updatefoto/{iduser},{foto}")
    public String updateFotoUser(@PathParam("iduser")int iduser, 
        @PathParam("foto")byte[] foto){
        User u = new User();
        u.setId(iduser);
        u.setFoto(foto);
        UserDAO dao = new UserDAO();
        if(dao.updateLPUser(u)){
            return "true";
        }else{
            return "false";
        }
        
    }
    
    
    
    
    /**
     * PUT method for updating or creating an instance of UsuarioWS
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
