package chainofresponsability;

import java.util.List;

public class BlackListHandler extends BaseAuthorizationHandler {

    private List<String> blackList = List.of(
            "Felipe Sanchez",
            "Ignacio Blanco",
            "Alejandra Rojo"
    );

    protected BlackListHandler(BaseAuthorizationHandler handler) {
        super(handler);
    }


    @Override
    public boolean isAuthorized(User user) {
        if (blackList.contains(user.getId())){
            System.out.println("User " + user.getId() + " is in Blacklist. User authorization denied");
            return false;
        }
        System.out.println("User not found in blackList. Passing user to next handler");
        return handleNext(user);
    }
}
