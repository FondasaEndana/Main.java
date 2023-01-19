import javax.swing.JFrame;
import java.awt.Component;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public abstract class MainFrame extends JFrame {
    private ImageIcon image = new ImageIcon("logoFE.png");

    protected Color backgroundColor = Color.decode("#F0F0F0");
    protected Color primaryColor = Color.decode("#2490EC");
    protected Color secondaryColor = Color.decode("#D9D9D9");

    protected String defaultFontName = "SegoeUI";
    protected int defaultFontSize = 18;
    
    public MainFrame(String title, int width, int height){
        setTitle(title);
        setSize(width, height);
        setLayout(null);
        setLocation(600, 200);
        setIconImage(image.getImage());
        setBackground(backgroundColor);
    }

    public void setVisible(boolean b){
        if (b == true) {
            component();
            event();
        }
        super.setVisible(b);
    }

    protected abstract void component();
    protected abstract void event();

    protected void boundedAdd(Component comp, int x, int y, int width, int height){
        int constX = 15;
        int constY = 55;

        x = x - (constX / 2);
        y = y - (constY / 2);

        width = width + (constX / 2);
        comp.setBounds(x, y, width, height);

        add(comp);
    }
    
    // protected ImageIcon loadImage(String imagePath) {
    //     return loadImage(imagePath, 150, 150);
    // }

    // protected ImageIcon loadImage(String imagePath, int width, int height) {
    //     try {
    //         BufferedImage bImage;
    //         Image imgResize;
    //         ImageIcon imgIcon = null;

    //         bImage = ImageIO.read(new File(imagePath));

    //         imgResize = bImage.getScaledInstance(
    //                 width, height,
    //                 Image.SCALE_SMOOTH);

    //         imgIcon = new ImageIcon(imgResize);

    //         return imgIcon;
    //     } catch (IOException ex) {
    //         return null;
    //     }
    // }

    protected void setFontStyle(Component comp, int style) {
        Font fontLama = comp.getFont();
        Font fontBaru = new Font(fontLama.getFontName(), style, fontLama.getSize());
        comp.setFont(fontBaru);
    }

    protected void setFontSize(Component comp, int size) {
        Font fontLama = comp.getFont();
        Font fontBaru = new Font(fontLama.getFontName(), fontLama.getStyle(), size);
        comp.setFont(fontBaru);
    }

    protected void setFontFamily(Component comp, String fontFamily) {
        Font fontLama = comp.getFont();
        Font fontBaru = new Font(fontFamily, fontLama.getStyle(), fontLama.getSize());
        comp.setFont(fontBaru);
    }

    protected Color color(String code) {
        return Color.decode(code);
    }
}