package chainofresponsability.example.clase;

import chainofresponsability.example.User;

import java.util.List;

public class BlackListHandler extends BaseHandler{


    private List<String> blackList = List.of(
            "Felipe Sanchez",
            "Ignacio Blanco",
            "Alejandra Rojo"
    );

    public BlackListHandler(Handler next) {
        super(next);
    }


    @Override
    public boolean isAuthorized(User user) {
        if (blackList.contains(user.getId())){
            return false;
        }else {
            return handleNext(user);
        }
    }
}
