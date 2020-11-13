package rest;

import com.google.gson.Gson;
import dto.XKCDDTO;
import entities.XKCD;
import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import utils.HttpUtils;

@Path("xkcd")
public class XKCDResource {

    @Context
    private UriInfo context;

    @Path("daily")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getComic() throws IOException {
        Gson gson = new Gson();
        String xkcd = HttpUtils.fetchData("https://xkcd.com/info.0.json");
        XKCDDTO xkcdDTO = gson.fromJson(xkcd, XKCDDTO.class);
        
        String xkcdJSON = gson.toJson(xkcdDTO);
        return xkcdJSON;
    }
    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getById(@PathParam("id") String id) throws IOException {
        String url = ("https://xkcd.com/" +id+"/info.0.json");
        Gson gson = new Gson();
        String xkcd = HttpUtils.fetchData(url);
        XKCDDTO xkcdDTO = gson.fromJson(xkcd, XKCDDTO.class);
       
        String xkcdJSON = gson.toJson(xkcdDTO);
        return xkcdJSON;
    }
    
}
