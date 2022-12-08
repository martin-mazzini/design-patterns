package chainofresponsability;


public abstract class BaseAuthorizationHandler implements AuthorizationHandler {

    private BaseAuthorizationHandler next;

    protected BaseAuthorizationHandler(BaseAuthorizationHandler handler) {
        this.next = handler;
    }

    public boolean handleNext(User user){
        if (next != null){
            return next.isAuthorized(user);
        }else{
            return false;
        }
    }



}
