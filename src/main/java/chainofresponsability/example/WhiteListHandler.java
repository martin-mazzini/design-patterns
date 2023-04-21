package chainofresponsability.example;

import java.util.List;

public class WhiteListHandler extends BaseAuthorizationHandler {


    private List<String> whiteList = List.of(
            "Juan Perez",
            "Pedro Rodriguez",
            "Santiago Gómez"
    );



    protected WhiteListHandler(BaseAuthorizationHandler handler) {
        super(handler);
    }

    @Override
    public boolean isAuthorized(User user) {
        if (whiteList.contains(user.getId())){
            System.out.println("User " + user.getId() + " is in whiteList. User authorization granted");
            return true;
        }
        System.out.println("User not found in whiteList. Passing user to next handler");
        return handleNext(user);
    }
}
