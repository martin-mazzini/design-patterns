package builder.chainofresponsabilitybuilder;

import chainofresponsability.example.User;

public interface Handler {


    public boolean isAuthorized(User user);


}
