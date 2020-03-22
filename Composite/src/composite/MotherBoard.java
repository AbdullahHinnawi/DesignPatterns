package composite;

import java.util.ArrayList;
import java.util.List;

// Composite component
// Määrittelee koosteolion käyttäytymisen ja pitää tallessa lapsiosolmut.
// Toteuttaa lapsiin liittyvät rajapintaoperaatiot.
public class MotherBoard implements HardwareComponent {
    List<HardwareComponent> hardwareComponents = new ArrayList<>();
    @Override
    public int getPrice() {
        int price = 1000;
        for(HardwareComponent hc : hardwareComponents){
            price += hc.getPrice();
        }
        return price;
    }

    @Override
    public void add(HardwareComponent hardwareComponent) {

      hardwareComponents.add(hardwareComponent);

    }
}
