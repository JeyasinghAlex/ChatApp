package database;

import model.User;

import javax.ws.rs.core.Response;

public interface UserDao {

    /** default all method is public
     * @return*/
    Response insertUser(User user);
    void insertRow(String message);
    String getRow();
}
