package VIEW;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Image;

public class test {
    public static void main(String[] args) {
        // Đường dẫn hoặc URL đến tệp hình ảnh
        String imagePath = "C:\\\\Users\\\\LENOVO\\\\Downloads\\\\burger.jpg";

        // Tạo một đối tượng ToolkitImage từ đường dẫn hoặc URL
        Image toolkitImage = Toolkit.getDefaultToolkit().getImage(imagePath);

        // Tạo một ImageIcon từ đối tượng ToolkitImage
        ImageIcon imageIcon = new ImageIcon(toolkitImage);

        // Tạo một JLabel để hiển thị hình ảnh
        JLabel imageLabel = new JLabel(imageIcon);

        // Tạo JFrame để chứa JLabel với hình ảnh
        JFrame frame = new JFrame("Hình ảnh");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Tạo JPanel để chứa JLabel với hình ảnh và thêm nó vào JFrame
        JPanel panel = new JPanel();
        panel.add(imageLabel);
        frame.add(panel);

        // Hiển thị cửa sổ JFrame
        frame.setVisible(true);
    }
}
