package userAPI;
import model.User;

public interface UserAPI {

    void insertUserInfo(User user);
    void insertMessage();
    String getMessage();

}
