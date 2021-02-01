
package getscreensize;

import java.awt.Toolkit;

public class GetScreenSize {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        System.out.println(xSize+" x "+ySize);
    }
    
}
