package builder.chainofresponsabilitybuilder;

import chainofresponsability.example.User;

public abstract class BaseHandler implements Handler {

    //siguiente en la cadena
    private Handler next;

    public BaseHandler(Handler next) {
        this.next = next;
    }

    public boolean handleNext(User user){
        if (next != null){
            return next.isAuthorized(user);
        }else{
            //por defecto esta desautorizado el usuario
            return false;
        }
    }

    public static class ChainBuilder {

        private Handler handler;

        public ChainBuilder(){}

        public ChainBuilder blackListHandler(){
            Handler blackListHandler = new BlackListHandler(handler);
            this.handler = blackListHandler;
           return this;
        }

        public ChainBuilder whiteListHandler(){
            Handler blackListHandler = new WhiteListHandler(handler);
            this.handler = blackListHandler;
            return this;
        }

        public ChainBuilder databaseHandler(){
            Handler blackListHandler = new DatabaseHandler(handler);
            this.handler = blackListHandler;
            return this;
        }

        public Handler build(){
            return handler;
        }


    }

}
