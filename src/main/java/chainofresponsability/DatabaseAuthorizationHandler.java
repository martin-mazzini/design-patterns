package chainofresponsability;

public class DatabaseAuthorizationHandler extends BaseAuthorizationHandler{


    private UserRepository userRepository = new UserRepository();


    protected DatabaseAuthorizationHandler(BaseAuthorizationHandler handler) {
        super(handler);
    }

    @Override
    public boolean isAuthorized(User user) {
        User databaseUser = userRepository.findUserById(user.getId());
        if (databaseUser != null){
            return true;
        }
        System.out.println("User not found in database. Passing user to next handler");
        return handleNext(user);
    }
}
