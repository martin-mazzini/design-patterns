package chainofresponsability.example.live2;

public class Client {


    public static void main(String[] args) {

        //Queremos construir un metodo para autorizacion de nuestra aplicacion
        //public boolean isAuthorized(User user);
        //Cada request que llege a nuestra app va a pasar por este metodo
        //Este metodo tiene que permitirnos autorizar/denegar acceso en base a:
        //Si las credenciales (usuario, password) estan en la base de datos
        //Si las credenciales (usuario, password) estan en un servicio externo (Auth0)
        //Una whitelist
        //Una blacklist
        //Nota, hagamoslo solo con el nombre de usuario para simplificar

        //Queremos poder modificar esta logica (agregar, eliminar o modificar de orden los pasos) - Open closed
        //Queremos Single responsability para las distintas logicas de autorizacion
        //Queremos poder modificar la logica de manera dinamica, ej bajo ciertas condiciones eliminar el Whitelist




    }
}
