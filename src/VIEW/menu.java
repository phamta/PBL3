package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingContainer;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.FlowLayout;

public class menu extends JFrame implements MouseListener, ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel_order;
	public int quantity;
	private JLabel lable_tongtien;
	private JButton button_thanhtoan;
	private JButton button_huy;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 375);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 214, 126));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_menu = new JPanel();
		panel_menu.setBounds(20, 30, 400, 300);
		contentPane.add(panel_menu);
		panel_menu.setLayout(null);

		// --------------------------------------------------------------------------------//
		JPanel panel_burger = new JPanel();
		panel_burger.setBounds(30, 50, 60, 70);
//		panel_burger.addMouseListener(this);
		panel_burger.addMouseListener(createMouseListener(panel_burger));
		panel_burger.addMouseMotionListener(createMouseMotionListener(panel_burger));
		panel_menu.add(panel_burger);
		panel_burger.setLayout(null);

		JLabel lblNewLabel = new JLabel("Burger");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(5, 30, 45, 15);
		panel_burger.add(lblNewLabel);

		JLabel lable_giaBurger = new JLabel("54.000 đ");
		lable_giaBurger.setForeground(new Color(255, 0, 0));
		lable_giaBurger.setFont(new Font("Tahoma", Font.BOLD, 10));
		lable_giaBurger.setBounds(0, 55, 50, 13);
		panel_burger.add(lable_giaBurger);

		Border boder = BorderFactory.createLineBorder(Color.BLACK);
		JLabel labelImage = new JLabel();
		labelImage.setBounds(0, 0, 60, 30);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		labelImage.setBorder(border);
		ImageIcon icon = new ImageIcon("C:\\Users\\LENOVO\\Downloads\\burger.jpg");
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(60, 30, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(scaledImage);
		labelImage.setIcon(scaledIcon);
		panel_burger.add(labelImage);
		panel_burger.setBorder(boder);
		panel_burger.addMouseListener(this);

		// --------------------------------------------------------------------------------//
		JPanel panel_pizza = new JPanel();
		panel_pizza.setLayout(null);
		panel_pizza.setBounds(30, 130, 60, 70);
		panel_pizza.addMouseListener(createMouseListener(panel_pizza));
		panel_menu.add(panel_pizza);

		JLabel lblNewLabel_3 = new JLabel("Pizza");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setBounds(0, 30, 45, 15);
		panel_pizza.add(lblNewLabel_3);

		JLabel lblNewLabel_1_2 = new JLabel("44.000 đ");
		lblNewLabel_1_2.setForeground(Color.RED);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_2.setBounds(0, 55, 50, 13);
		panel_pizza.add(lblNewLabel_1_2);

		JLabel lableImage_2 = new JLabel();
		lableImage_2.setBounds(0, 0, 60, 30);
		ImageIcon iconpizza_temp = new ImageIcon("C:\\Users\\LENOVO\\Downloads\\pizza.jpg");
		Image imagepizza = iconpizza_temp.getImage();
		Image imagepizzaScale = imagepizza.getScaledInstance(60, 30, Image.SCALE_SMOOTH);
		ImageIcon iconpizza = new ImageIcon(imagepizzaScale);
		lableImage_2.setIcon(iconpizza);
		panel_pizza.add(lableImage_2);

		// --------------------------------------------------------------------------------//

		// --------------------------------------------------------------------------------//
		JButton button_food = new JButton("Food");
		button_food.setBounds(10, 10, 80, 30);
		Image img = new ImageIcon("C:\\Users\\LENOVO\\Downloads\\hamburger (2).png").getImage();
		ImageIcon icon_img = new ImageIcon(img.getScaledInstance(13, 20, Image.SCALE_SMOOTH));
		button_food.setIcon(icon_img);
		button_food.setHorizontalTextPosition(SwingConstants.RIGHT);
		panel_menu.add(button_food);

		JButton button_drink = new JButton("Drink");
		button_drink.setBounds(100, 10, 80, 30);
		img = new ImageIcon("C:\\Users\\LENOVO\\Downloads\\drink.png").getImage();
		icon_img = new ImageIcon(img.getScaledInstance(10, 20, Image.SCALE_SMOOTH));
		button_drink.setIcon(icon_img);
		button_drink.setHorizontalTextPosition(SwingConstants.RIGHT);
		panel_menu.add(button_drink);

		JButton button_combo = new JButton("Combo");
		button_combo.setBounds(190, 10, 80, 30);
//		img = new ImageIcon("C:\\Users\\LENOVO\\Downloads\\food (2).png").getImage();
//		icon_img = new ImageIcon(img.getScaledInstance(5, 10, Image.SCALE_SMOOTH));
//		button_combo.setIcon(icon_img);
//		button_combo.setHorizontalTextPosition(SwingConstants.RIGHT);
		panel_menu.add(button_combo);

		textField_1 = new JTextField();
		textField_1.setBounds(280, 10, 100, 30);
//		textField_1.addMouseListener(this); // Thay đổi từ textField thành textField_1
		textField_1.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textField_1.getText().equals("Search")) { // Thay đổi từ textField thành textField_1
					textField_1.setText("");
					textField_1.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (textField_1.getText().isEmpty()) { // Thay đổi từ textField thành textField_1
					textField_1.setText("Search");
					textField_1.setForeground(Color.LIGHT_GRAY);
				}
			}
		});
		panel_menu.add(textField_1);
		textField_1.setColumns(10);

		panel_order = new JPanel();
		panel_order.setBounds(450, 30, 200, 230);
		contentPane.add(panel_order);
		panel_order.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_thanhtoan = new JPanel();
		panel_thanhtoan.setBounds(450, 260, 200, 70);
		contentPane.add(panel_thanhtoan);
		panel_thanhtoan.setLayout(null);

		JLabel lblNewLabel_7 = new JLabel("Tổng tiền");
		lblNewLabel_7.setBounds(10, 10, 60, 20);
		panel_thanhtoan.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));

		lable_tongtien = new JLabel("0 đ");
		lable_tongtien.setBounds(110, 10, 60, 20);
		panel_thanhtoan.add(lable_tongtien);
		lable_tongtien.setForeground(new Color(255, 0, 0));
		lable_tongtien.setFont(new Font("Tahoma", Font.BOLD, 12));

		button_huy = new JButton("Hủy");
		button_huy.setBounds(10, 40, 70, 25);
		button_huy.addActionListener(this);
		panel_thanhtoan.add(button_huy);
		button_huy.setBackground(new Color(255, 0, 0));

		button_thanhtoan = new JButton("Thanh toán");
		button_thanhtoan.setBounds(90, 40, 100, 25);
		panel_thanhtoan.add(button_thanhtoan);
		button_thanhtoan.setBackground(new Color(0, 255, 0));
		button_thanhtoan.setForeground(new Color(255, 255, 255));
		button_thanhtoan.addActionListener(this);
		
		
		checkPanelContents();

	}

	public void receiveData(String name, int soluong) {
		this.quantity = soluong;
		JLabel label_data = new JLabel("Tên: " + name + ", Số lượng: " + quantity);
		label_data.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_data.setBounds(10, 10, 180, 20);

		// Thêm JLabel vào panel_order
		panel_order.add(label_data);
		checkPanelContents();
		int tongtien = 54*quantity;
		lable_tongtien.setText(""+tongtien+"000 đ");

		panel_order.revalidate();
		panel_order.repaint();

	}

	private MouseAdapter createMouseListener(JPanel panel) {
		return new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Xử lý sự kiện mouseClicked ở đây
				
	            Component[] components = panel.getComponents();
	            String productName = null;
	            String productPrice = null;
	            String imagePath = null;

	            for (Component component : components) {
	                if (component instanceof JLabel) {
	                    JLabel label = (JLabel) component;
	                    String labelText = label.getText();
	                    if (labelText.equals("Burger")) {
	                        productName = labelText;
	                    } else if (labelText.endsWith("đ")) {
	                        productPrice = labelText;
	                    } else if (label.getIcon() instanceof ImageIcon) {
//	                    	System.out.println("Anh");
	                        ImageIcon icon = (ImageIcon) label.getIcon();
	                        imagePath = icon.getDescription();
	                    }
	                }
	            }
	            
//                System.out.println("Tên sản phẩm: " + productName);
//                System.out.println("Giá sản phẩm: " + productPrice);
//                System.out.println("Đường dẫn ảnh: " + imagePath);
				detail d = new detail(menu.this);
				d.setVisible(true);
			}
		};
	}

	private MouseMotionListener createMouseMotionListener(JPanel panel) {
		return new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				// Thay đổi hình dạng chuột khi di chuyển vào panel
				setHandCursor(panel);
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// Không cần xử lý sự kiện này
			}
		};
	}

	private static void setHandCursor(JPanel panel) {
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		panel.setCursor(cursor);
	}

	public void checkPanelContents() {
	    Component[] components = panel_order.getComponents();
	    boolean panelEmpty = components.length == 0;
	    button_thanhtoan.setEnabled(!panelEmpty);
	}


	public void check() {
		if (panel_order.getComponentCount() == 0) {
			// Nếu panel_order không có thành phần con, thêm hai nút "Hủy" và "Thanh toán"
			JButton button_huy = new JButton("Hủy");
			button_huy.setBackground(Color.RED);
			button_huy.setFont(new Font("Tahoma", Font.PLAIN, 13));
			button_huy.setBounds(50, 190, 60, 25);
			panel_order.add(button_huy);

			JButton button_thanhToan = new JButton("Thanh toán");
			button_thanhToan.setBackground(Color.GREEN);
			button_thanhToan.setFont(new Font("Tahoma", Font.PLAIN, 13));
			button_thanhToan.setBounds(130, 190, 100, 25);
			panel_order.add(button_thanhToan);

			// Đặt hành động cho nút "Hủy"
			button_huy.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// Xử lý hành động khi nhấn nút "Hủy"
				}
			});

			// Đặt hành động cho nút "Thanh toán"
			button_thanhToan.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// Xử lý hành động khi nhấn nút "Thanh toán"
				}
			});
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button_huy) {
			panel_order.removeAll();
			panel_order.revalidate();
			panel_order.repaint();
			button_thanhtoan.setEnabled(false);
			lable_tongtien.setText("0 đ");
		}
		else {
			String soluong = ""+ this.quantity;
			itemplus ip = new itemplus("Burger           ","    54 000đ             ", "      "+ soluong + "            ","  "+ lable_tongtien.getText() + "         ");
			order o = new order(ip);
			o.setVisible(true);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
