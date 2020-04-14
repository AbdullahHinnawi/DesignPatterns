package proxy;

// On System A
public class RealImage implements Image {

    private final String filename;

    public RealImage(String filename){
        this.filename= filename;
        loadImageFromDisk();


    }
    // Loads the image form the disk
    private void loadImageFromDisk(){

        System.out.println("Loading " + filename);
    }
    // display the image
    @Override
    public void displayImage() {

        System.out.println("Displaying " + filename);

    }

    @Override
    public void showData() {
        System.out.println("Real image name: " + filename);
    }
}
