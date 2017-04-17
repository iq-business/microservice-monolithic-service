package net.iqbusiness.masterclass.beveragemaker.webservices;

import com.google.gson.Gson;
import net.iqbusiness.masterclass.beveragemaker.model.Beverage;
import net.iqbusiness.masterclass.beveragemaker.repository.BeverageRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by abawa on 2017/04/17.
 */

@Path("/beverage")
public class BeverageMakerWebService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response makeBeverage(@QueryParam(value="type") String beverageType) {

        Gson gson = new Gson();
        if(beverageType != null ){

            switch (beverageType.toLowerCase()){
                case "tea" :
                    Beverage tea = BeverageRepository.getTea();
                    String teaDetails = gson.toJson(tea);
                    return Response.ok(teaDetails, MediaType.APPLICATION_JSON).build();
                case "coffee" :
                    Beverage coffee = BeverageRepository.getCoffee();
                    String coffeeDetails = gson.toJson(coffee);
                    return Response.ok(coffeeDetails, MediaType.APPLICATION_JSON).build();
                default:
                    return Response.status(Response.Status.NOT_FOUND).build();
            }
        }
        else {
            // Oops, beverageType is missing was requested
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
}
