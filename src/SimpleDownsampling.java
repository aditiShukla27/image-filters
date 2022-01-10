public class SimpleDownsampling implements PixelFilter {

    @Override
    public DImage processImage(DImage img) {
        short[][] pixels = img.getBWPixelGrid();
        short[][] newPixels = new short[pixels.length/2][pixels[0].length/2];
        for (int i = 0; i < pixels.length-1; i=i+2) {
            for (int j = 0; j < pixels[0].length-1; j=j+2) {
                newPixels[i/2][j/2] = pixels[i][j];
            }
        }
        img.setPixels(newPixels);
        return img;
    }
}

