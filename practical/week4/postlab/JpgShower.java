package Adapter;

class JpgShower implements AdvancedImageViewer {
    @Override
    public void showPng() {
        // Do nothing
    }

    @Override
    public void showJpg() {
        System.out.println("Displaying JPG image");
    }
}
