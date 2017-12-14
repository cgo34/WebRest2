/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ft.epsi.mtp.i42.ws.rest;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 *
 * @author Geoffroy
 */
@Path("/trains")
@Produces("application/xml")
public class TrainResource {
    
    public TrainResource(){
        
    }
    
    @GET // Méthode HTTP utilisée pour déclencher cette méthode
    public Response getTrains(){
        System.out.println("getTrains");
        
        return Response.status(Status.OK).entity(new GenericEntity<List<Train>>(BookTrainBD.getTrains()){}).build();
    }
    
    @GET // Méthode HTTP utilisée pour déclencher cette méthode
    @Path("numTrain-{id}") // numTrain-TR123
    public Response getTrain(@PathParam("id") String numTrain){
        System.out.println("getTrain");
        
        for(Train current : BookTrainBD.getTrains()){
            if(numTrain.equals(current.getNumTrain())){
                return Response.status(Status.OK).entity(current).build();
            }
        }
        return Response.status(Status.NO_CONTENT).build();
    }
    
     
    @POST
    @Path("/addTrain")
    public Response addTrain(){
        System.out.println("addTrain");
        
        return Response.status(Status.NO_CONTENT).build();
    }
    
    @GET
    @Path("/search")
    public Response searchByCriteria(@QueryParam("departure") String departure, @QueryParam("arrival") String arrival, @QueryParam("arrivalhour") String arrivalHour){
        System.out.println("searchTrainsByCriteria");
        
        return Response.status(Status.OK).entity(BookTrainBD.getTrains().subList(0,2)).build();
    }
    
    
    
}
