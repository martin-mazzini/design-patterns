package chainofresponsability.example;

import java.util.Map;

public class UserRepository {

    Map<String, User> userDatabase = Map.of(
            "Luciana Perez", new User("Luciana Perez"),
            "Jorge Martínez", new User("Jorge Martínez")
    );

    public User findUserById(String id){
        return userDatabase.get(id);
    }

}
