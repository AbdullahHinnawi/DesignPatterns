package composite;

public class Main {

    public static void main(String[] args){

        HardwareComponent processor = new Processor();
        HardwareComponent graphicsCard = new GraphicsCard();
        HardwareComponent networkCard = new NetworkCard();
        HardwareComponent memoryCard = new MemoryCard();

        // Try to add a component to  a simple (leaf) component
        try{
            processor.add(graphicsCard);
        }catch(RuntimeException e){
           System.out.println("Runtime Exception: " + e.getMessage());
        }

        HardwareComponent motherBoard = new MotherBoard();
        // Add processor, graphicsCard, networkCard and memoryCard to motherBoard component
        motherBoard.add(processor);
        motherBoard.add(graphicsCard);
        motherBoard.add(networkCard);
        motherBoard.add(memoryCard);

        HardwareComponent powerSupply = new PowerSupply();

        HardwareComponent c = new Case();
        // Add powerSupply and motherBoard to case component
        c.add(powerSupply);
        c.add(motherBoard);

        int totalPrice = c.getPrice();
        System.out.println("Total price: " + totalPrice);

    }
}
