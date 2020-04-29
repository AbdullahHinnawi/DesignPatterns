package command;

// Invoker
public class WallButton {

    Command command;

    public WallButton(Command command){
        this.command = command;
    }

    public void push(){
        command.execute();
    }
}
