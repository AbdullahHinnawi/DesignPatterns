package proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(final String[] args){


        List<Image> images = new ArrayList<>();

        images.add(new ProxyImage("image 1"));
        images.add(new ProxyImage("image 2"));
        images.add(new ProxyImage("image 3"));


        for(Image i : images){
            i.showData();
        }

        System.out.println("--------------");

        for(Image i : images){
            i.displayImage();

        }

        System.out.println("--------------");

        for(Image i : images){
            i.displayImage();

        }











    }
}
