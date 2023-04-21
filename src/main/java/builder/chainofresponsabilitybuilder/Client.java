package builder.chainofresponsabilitybuilder;

import builder.chainofresponsabilitybuilder.BaseHandler.ChainBuilder;
import chainofresponsability.example.User;

public class Client {


    public static void main(String[] args) {

        //La construye al reves...
        Handler handler = new ChainBuilder().whiteListHandler()
                .blackListHandler().databaseHandler().build();

        boolean pedro = handler.isAuthorized(new User("pedro"));


    }


}
