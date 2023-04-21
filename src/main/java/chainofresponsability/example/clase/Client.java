package chainofresponsability.example.clase;

import chainofresponsability.example.User;

public class Client {


    public static void main(String[] args) {


        Handler chain = new BlackListHandler(new WhiteListHandler(new BlackListHandler(new WhiteListHandler(null))));
        boolean pedro = chain.isAuthorized(new User("pedro"));


    }


}
