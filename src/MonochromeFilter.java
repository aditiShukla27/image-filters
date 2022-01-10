import javax.swing.JOptionPane;
public class MonochromeFilter implements PixelFilter {

    @Override
    public DImage processImage(DImage img) {
        short[][] pixels = img.getBWPixelGrid();
        String m = JOptionPane.showInputDialog("Input Threshold: ");
        short threshold = Short.parseShort(m);
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                if(pixels[i][j]>threshold) pixels[i][j]=255;
                else pixels[i][j] = 0;
            }
        }
        img.setPixels(pixels);
        return img;
    }
}

