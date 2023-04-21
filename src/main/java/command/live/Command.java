package command.live;

public interface Command {

   public void undo();
   public void execute();
   String getCommandName();
}
