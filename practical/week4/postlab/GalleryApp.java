package Adapter;

class GalleryApp implements ImageViewer {
    private ImageAdapter imageAdapter;

    public GalleryApp(String imageType) {
        imageAdapter = new ImageAdapter(imageType);
    }

    @Override
    public void show() {
        imageAdapter.show();
    }
}

