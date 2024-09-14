package Adapter;

class PngShower implements AdvancedImageViewer {
    @Override
    public void showPng() {
        System.out.println("Displaying PNG image");
    }

    @Override
    public void showJpg() {
        // Do nothing
    }
}