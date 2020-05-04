package facade;


public class HardDrive {

    public byte[] read(long bootSector, int sectorSize) {
        System.out.println("Reading data from hard drive's boot-sector: " + bootSector);
        byte[] array = new byte[sectorSize];
        byte b = 0;
        for(int i = 0; i< sectorSize; i++){
            array[i] = b ;
            b++;
        }
        return array;
    }



}
