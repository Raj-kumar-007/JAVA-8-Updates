package API;
import javax.ws.rs.*;


@Path("/controller/test")
public class APIController {

    @GET
    @Produces("text/plain")
    public String getWelcomeMsg()
    {
        return "Welcome to my first API without Spring";
    }

    @POST
    public int getCalculatedSum(@HeaderParam("firstValue") int firstValue,
                                @HeaderParam("secondValue") int secondValue)
    {
        return firstValue + secondValue ;
    }
}
