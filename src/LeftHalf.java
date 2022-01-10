public class LeftHalf implements PixelFilter {
    /**
     * Returns an image representing only the left half of the original image
     * @param img the image to filter
     * @return
     */
    @Override
    public DImage processImage(DImage img) {
        short[][] inputPixels = img.getBWPixelGrid();
        short[][] outputPixels = new short[inputPixels.length][inputPixels[0].length/2];
        // we don't change the input image at all!
        for (int i = 0; i < outputPixels.length; i++) {
            for (int j = 0; j < outputPixels[i].length; j++) {
                outputPixels[i][j] = inputPixels[i][j];
            }
        }
        img.setPixels(outputPixels);
        return img;
    }
}

