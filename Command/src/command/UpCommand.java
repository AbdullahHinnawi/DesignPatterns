package command;

// Concrete Command for putting the white screen up
public class UpCommand implements Command {

    private WhiteScreen whiteScreen;

    public UpCommand(WhiteScreen whiteScreen){
        this.whiteScreen = whiteScreen;
    }

    @Override
    public void execute() {

        whiteScreen.up();

    }
}
