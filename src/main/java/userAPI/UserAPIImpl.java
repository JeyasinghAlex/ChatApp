package userAPI;

import database.dbConnectionImpl;
import model.User;


//We add extra details :-

public class UserAPIImpl implements UserAPI {

    @Override
    public void insertUserInfo(User user) {
        user.setName(encryption(user.getName()));
        user.setEmail(encryption(user.getEmail()));
        dbConnectionImpl.getInstance().insertUser(user);
    }

    @Override
    public void insertMessage() {
        dbConnectionImpl.getInstance().insertRow("");
    }

    @Override
    public String getMessage() {
        dbConnectionImpl.getInstance().getRow();
        return null;
    }

    private String encryption(String str) {
        String encryptedStr = "";
        char s = 0;
        for (int i = 0; i < str.length(); ++i) {
            s = (char) (str.charAt(i) + 2);
            encryptedStr += s;
        }
        return encryptedStr;
    }

}
