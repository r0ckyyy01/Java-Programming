import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton extends JFrame implements ActionListener {
    private JLabel pictureLabel;
    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;

    public RadioButton() {
        setTitle("RadioButtonDemo");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout(10, 10)); // 10px padding around edges

        // ===== LEFT PANEL (Radio Buttons) =====
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));
        radioPanel.setBorder(BorderFactory.createEmptyBorder(30, 20, 30, 20)); // top, left, bottom, right

        // Radio buttons
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Action listeners
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        // Radio panel buttons
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);

        // ===== CENTER PANEL (Image Display) =====
        JPanel imagePanel = new JPanel(new GridBagLayout()); // centers image
        imagePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        pictureLabel = new JLabel();
        pictureLabel.setPreferredSize(new Dimension(200, 200));
        pictureLabel.setHorizontalAlignment(SwingConstants.CENTER);
        imagePanel.add(pictureLabel);

        // ===== Panels for Frame =====
        add(radioPanel, BorderLayout.WEST);
        add(imagePanel, BorderLayout.CENTER);

        setLocationRelativeTo(null); // centering the window
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String imageName = "";

        if (e.getSource() == birdButton) {
            imageName = "RadioButton/images/bird.png";
        } else if (e.getSource() == catButton) {
            imageName = "RadioButton/images/cat.png";
        } else if (e.getSource() == dogButton) {
            imageName = "RadioButton/images/dog.png";
        } else if (e.getSource() == rabbitButton) {
            imageName = "RadioButton/images/rabbit.png";
        } else if (e.getSource() == pigButton) {
            imageName = "RadioButton/images/pig.png";
        }

        // Show image
        ImageIcon icon = new ImageIcon(imageName);
        Image image = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        pictureLabel.setIcon(new ImageIcon(image));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RadioButton::new);
    }
}