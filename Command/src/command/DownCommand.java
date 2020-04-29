package command;

// Concrete Command for putting the white screen down
public class DownCommand implements Command {

    private WhiteScreen whiteScreen;

    public DownCommand(WhiteScreen whiteScreen){

        this.whiteScreen = whiteScreen;
    }

    @Override
    public void execute() {

        whiteScreen.down();
    }
}
