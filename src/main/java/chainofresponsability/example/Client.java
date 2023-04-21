package chainofresponsability.example;

public class Client {


    public static void main(String[] args) {


        AuthorizationHandler authorizationChain =
                new DatabaseAuthorizationHandler(new BlackListHandler(new WhiteListHandler(null)));

        boolean isAuthorized1 = authorizationChain.isAuthorized(new User("Santiago Gómez"));

        System.out.println("---------------Changing order of handlers ---------------------------");

        AuthorizationHandler  authorizationChain2 =
                new WhiteListHandler(new BlackListHandler(new DatabaseAuthorizationHandler(null)));

        boolean isAuthorized2 = authorizationChain2.isAuthorized(new User("Santiago Gómez"));

    }
}
