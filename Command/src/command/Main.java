package command;

public class Main {

    public static void main(String[] args) {

        WhiteScreen whiteScreen = new WhiteScreen();

        Command putUp = new UpCommand(whiteScreen);
        Command putDown = new DownCommand(whiteScreen);

        WallButton upButton = new WallButton(putUp);
        WallButton downButton = new WallButton(putDown);

        upButton.push();
        downButton.push();

    }

}
