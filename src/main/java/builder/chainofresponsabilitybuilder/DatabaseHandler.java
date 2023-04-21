package builder.chainofresponsabilitybuilder;

import chainofresponsability.example.User;

import java.util.List;

public class DatabaseHandler extends BaseHandler {


    private List<String> database = List.of(
            "Felipe Sanchez",
            "Ignacio Blanco",
            "Alejandra Rojo"
    );

    public DatabaseHandler(Handler next) {
        super(next);
    }


    @Override
    public boolean isAuthorized(User user) {
        if (database.contains(user.getId())){
            return false;
        }else {
            return handleNext(user);
        }
    }
}
