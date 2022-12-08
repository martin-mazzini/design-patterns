package chainofresponsability;

public interface AuthorizationHandler {

    public boolean isAuthorized(User user);
}
