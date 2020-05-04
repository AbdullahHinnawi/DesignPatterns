package facade;

// Facade
public class ComputerFacade {

    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;
    final long BOOT_ADDRESS = 1415425;
    final long BOOT_SECTOR = 10;
    final int SECTOR_SIZE = 16;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();

        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        // After the data is loaded to the memory position, Processor jumps
        // to that position to process the data
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
