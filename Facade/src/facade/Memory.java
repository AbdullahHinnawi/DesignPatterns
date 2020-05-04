package facade;

public class Memory {

    public void load(long position,byte[] data){

        StringBuilder s = new StringBuilder();
        for(byte d: data){
            s.append(d);
        }
        System.out.println("Loading to memory position: " + position + " data: " + s);



    }


}
