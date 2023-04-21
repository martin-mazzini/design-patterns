package chainofresponsability.example;

public interface AuthorizationHandler {

    public boolean isAuthorized(User user);
}
