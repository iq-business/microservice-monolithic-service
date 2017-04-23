package net.iqbusiness.masterclass.beveragemaker.webservices;

import com.google.gson.Gson;
import net.iqbusiness.masterclass.beveragemaker.model.Beverage;
import net.iqbusiness.masterclass.beveragemaker.repository.BeverageRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    private static final Logger logger = LogManager.getLogger(BeverageMakerWebService.class);

    @GET
    @Path("/coffee")
    @Produces(MediaType.APPLICATION_JSON)
    public Response makeCoffee() {

        logger.info("\n\n\t>>> Request to Monolith to makeCoffee() >>>\n");
        Beverage coffee = BeverageRepository.getCoffee();
        String coffeeDetails = new Gson().toJson(coffee);
        logger.info("\n\n\t<<< Response to makeCoffee(): {} <<<\n", coffeeDetails);
        return Response.ok(coffeeDetails, MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("/tea")
    @Produces(MediaType.APPLICATION_JSON)
    public Response makeTea() {

        logger.info("\n\n\t>>> Request to Monolith to makeTea() >>>\n");
        Beverage tea = BeverageRepository.getTea();
        String teaDetails = new Gson().toJson(tea);
        logger.info("\n\n\t<<< Response to makeTea(): {} <<<\n", teaDetails);
        return Response.ok(teaDetails, MediaType.APPLICATION_JSON).build();
    }
}
