package service;

import model.User;
import userAPI.UserAPI;
import userAPI.UserAPIImpl;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("user")
public class UserService {
    private static UserAPI impl = new UserAPIImpl();
    @POST
    @Path("/data")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public static Response createUserData(User user) {
        impl.insertUserInfo(user);
        return null;
    }
}
