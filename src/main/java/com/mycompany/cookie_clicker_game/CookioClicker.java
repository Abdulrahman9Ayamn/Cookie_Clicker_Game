
package com.mycompany.cookie_clicker_game;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.*;
/**
 *
 * @author qwertet
 */
public class CookioClicker extends JFrame {
  public CookioClicker() throws IOException{
  super("Cookie Clicker");
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setPreferredSize(new Dimension(600,800));
  pack();
  setResizable(false);
  setLocationRelativeTo(null);
  
  addGuicomponents();
  }  

    private void addGuicomponents() throws IOException {
    SpringLayout springLayout =new SpringLayout();
    JPanel jPanel =new JPanel();
    jPanel.setLayout(springLayout);

      var bannerImg = loadImage("Cookie.jpg");
      
     this.getContentPane().add(jPanel);
    }
    
    private JLabel loadImage(String fileName) throws IOException{
        BufferedImage image;
        JLabel imageContainer;
        try{
        InputStream inputStream = this.getClass().getResourceAsStream(fileName);
        image = ImageIO.read(inputStream);
        imageContainer = new JLabel(new ImageIcon(image));
        return imageContainer;
        }catch(IOException e){
            System.out.println("Error: " + e);
            return null;
        }
    }
    
}
