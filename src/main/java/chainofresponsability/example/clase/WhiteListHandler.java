package chainofresponsability.example.clase;

import chainofresponsability.example.User;

import java.util.List;

public class WhiteListHandler extends BaseHandler {


    private List<String> whiteList = List.of(
            "Juan Perez",
            "Pedro Rodriguez",
            "Santiago Gómez"
    );

    public WhiteListHandler(Handler next) {
        super(next);
    }

    @Override
    public boolean isAuthorized(User user) {
        if (whiteList.contains(user.getId())){
            return true;
        } else {
            return handleNext(user);
        }
    }
}
