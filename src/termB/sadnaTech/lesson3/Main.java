package termB.sadnaTech.lesson3;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
            File file = new File("/Users/shaya/Downloads/11/cake.png");
            if(file.exists()){
                System.out.println("Exist");
                BufferedImage bufferedImage = ImageIO.read(file);
                for (int i = 0; i < bufferedImage.getWidth(); i++) {

                    for (int j = 0; j < bufferedImage.getHeight(); j++) {
                        Color currentPixel = new Color(bufferedImage.getRGB(i, j));

                        if (i + 1 < bufferedImage.getWidth() && j + 1 < bufferedImage.getHeight()) {
                            Color rightPixel = new Color(bufferedImage.getRGB(i + 1, j));
                            Color bottomPixel = new Color(bufferedImage.getRGB(i, j + 1));

                            int diffRight = Math.abs(currentPixel.getRed() - rightPixel.getRed()) +
                                    Math.abs(currentPixel.getGreen() - rightPixel.getGreen()) +
                                    Math.abs(currentPixel.getBlue() - rightPixel.getBlue());

                            int diffBottom = Math.abs(currentPixel.getRed() - bottomPixel.getRed()) +
                                    Math.abs(currentPixel.getGreen() - bottomPixel.getGreen()) +
                                    Math.abs(currentPixel.getBlue() - bottomPixel.getBlue());

                            int threshold = 150;

                            if (diffRight > threshold || diffBottom > threshold) {

                                bufferedImage.setRGB(i, j, Color.WHITE.getRGB());
                            } else {

                                bufferedImage.setRGB(i, j, Color.BLACK.getRGB());
                            }
                        }
                    }
                    File output = new File("/Users/shaya/Downloads/11/cake_edges.png");
                    ImageIO.write(bufferedImage, "png", output);
                }
            }

        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
