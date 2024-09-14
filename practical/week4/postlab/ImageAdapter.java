package Adapter;

//ImageAdapter class that implements ImageViewer
class ImageAdapter implements ImageViewer {
 private AdvancedImageViewer advancedImageViewer;

 public ImageAdapter(String imageType) {
     if (imageType.equalsIgnoreCase("png")) {
         advancedImageViewer = new PngShower();
     } else if (imageType.equalsIgnoreCase("jpg")) {
         advancedImageViewer = new JpgShower();
     }
 }

 @Override
 public void show() {
     if (advancedImageViewer instanceof PngShower) {
         advancedImageViewer.showPng();
     } else if (advancedImageViewer instanceof JpgShower) {
         advancedImageViewer.showJpg();
     }
 }
}
