package composite;

// Simple component (leaf)
// Edustaa lapsisolmun ja määrittelee lapsiolion operaatiot
public class Processor implements HardwareComponent {
    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public void add(HardwareComponent hardwareComponent) {
        throw new RuntimeException("Cannot add a hardware component to a simple component");

    }
}
