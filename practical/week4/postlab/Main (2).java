package Adapter;

public class Main {
    public static void main(String[] args) {
   
        GalleryApp pngApp = new GalleryApp("png");
        pngApp.show(); 

     
        GalleryApp jpgApp = new GalleryApp("jpg");
        jpgApp.show(); 
    }
}