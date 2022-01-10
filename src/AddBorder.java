public class AddBorder implements PixelFilter {

    @Override
    public DImage processImage(DImage img) {
        short[][] pixels = img.getBWPixelGrid();
        short[][] newPixels = new short[pixels.length+70][pixels[0].length+70];
        for(int i =0; i<newPixels.length; i++){
            for(int j =0; j<newPixels[0].length; j++){
                newPixels[i][j] = 115;
            }
        }
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[0].length; j++) {
                newPixels[35+i][35+j] = pixels[i][j];
            }

        }
        img.setPixels(newPixels);
        return img;
    }
}

