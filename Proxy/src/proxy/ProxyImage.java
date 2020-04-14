package proxy;

// On System B
public class ProxyImage implements Image {

    private final String filename;
    private RealImage image;

    public ProxyImage(String filename){
        this.filename = filename;

    }
    // Display the image

    @Override
    public void displayImage() {
        if(image == null){
            image = new RealImage(filename);
        }
        image.displayImage();
    }

    // Show image data
    @Override
    public void showData() {
        System.out.println("Proxy image name: " + filename);
    }
}
