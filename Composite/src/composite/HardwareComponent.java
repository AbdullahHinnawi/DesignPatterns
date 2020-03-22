package composite;

// Component interface
// määrittele kompositio-olioiden rajapinnan ja yhteiset oletustoteutukset
// määrittelee rajapinnan, jolla päästään käsiksi lapsisolmuihin
public interface HardwareComponent {

    public int getPrice();
    public void add(HardwareComponent hardwareComponent);
}
