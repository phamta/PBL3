package VIEW;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JButton;

class HorizontalLineLabel extends JLabel {
    private static final long serialVersionUID = 1L;

    public HorizontalLineLabel(int width, int height) {
        setPreferredSize(new java.awt.Dimension(width, height));
        setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0)); // Thay đổi khoảng cách dưới đây
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
    }
}

public class order extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private itemplus ip;
	private JButton button_OK;

    public order(itemplus ip) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 355);
        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(254, 214, 126));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        this.ip = ip;

        JPanel panel = new JPanel();
        panel.setBounds(40, 25, 360, 260);
        contentPane.add(panel);
        panel.setLayout(null);

        // Tạo một JLabel mới với đường kẻ ngang
        HorizontalLineLabel label = new HorizontalLineLabel(200, 30);
        label.setBounds(20, 30, 320, 5);
        panel.add(label);
        
        JLabel lblNewLabel = new JLabel("Đơn hàng");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setBounds(120, 10, 80, 20);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Tên món");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1.setBounds(20, 45, 55, 15);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Đơn giá");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_2.setBounds(110, 45, 60, 15);
        panel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Số lượng");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_3.setBounds(190, 45, 70, 15);
        panel.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("Tổng");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_4.setBounds(280, 45, 45, 15);
        panel.add(lblNewLabel_4);
        
        VIEW.HorizontalLineLabel label_1 = new VIEW.HorizontalLineLabel(200, 30);
        label_1.setBounds(20, 65, 320, 5);
        panel.add(label_1);
        
        VIEW.HorizontalLineLabel label_1_1 = new VIEW.HorizontalLineLabel(200, 30);
        label_1_1.setBounds(20, 180, 320, 5);
        panel.add(label_1_1);
        
        JLabel lblNewLabel_5 = new JLabel("Tổng thành tiền");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_5.setBounds(20, 190, 110, 15);
        panel.add(lblNewLabel_5);
        
        JLabel lable_tongtien = new JLabel("0 đ");
        lable_tongtien.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lable_tongtien.setBounds(260, 190, 45, 15);
        panel.add(lable_tongtien);
        
        button_OK = new JButton("OK");
        button_OK.setBackground(new Color(0, 255, 0));
        button_OK.setBounds(30, 215, 85, 25);
        button_OK.addActionListener(this);
        panel.add(button_OK);
        
        JButton button_Huy = new JButton("Hủy");
        button_Huy.setBackground(new Color(255, 0, 0));
        button_Huy.setBounds(130, 215, 85, 25);
        panel.add(button_Huy);
        
        JButton button_quaylai = new JButton("Quay lại");
        button_quaylai.setBackground(new Color(128, 128, 128));
        button_quaylai.setBounds(240, 215, 85, 25);
        panel.add(button_quaylai);
        
        JPanel panel_listip = new JPanel();
        panel_listip.setBounds(20, 70, 320, 110);
        
        JLabel lable_item = new JLabel();
        lable_item.setText(ip.getName() +  ip.getPrice() + " " + ip.getQuantity() + ip.getTotal() );
        panel_listip.add(lable_item);
        
        panel.add(panel_listip);
        
        
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
            	itemplus ip = new itemplus("","","","");
                order frame = new order(ip);
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button_OK) {
			JOptionPane.showMessageDialog(null, "Đã đặt hàng thành công");		
		}
		this.dispose();
	}
}
