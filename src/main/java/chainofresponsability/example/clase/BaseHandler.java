package chainofresponsability.example.clase;

import chainofresponsability.example.User;

public abstract class BaseHandler implements Handler{

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

}
