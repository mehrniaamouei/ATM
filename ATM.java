import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ATM extends JFrame {
    static JFrame frame = new JFrame("ATM");
    static JPanel pannel = new JPanel();
    static Font font = new Font("Calibri",Font.BOLD,20);
    public static void main(String[] args){
        frame.setSize(1080,720);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*ImageIcon image = new ImageIcon("img.png");
        frame.setIconImage(image.getImage());*/

        UIManager.put("Button.font",font);
        UIManager.put("Label.font",font);
        languagePannel();

    }
    public static void languagePannel() {

        pannel.removeAll();
        pannel.setSize(1080, 720);
        pannel.setLayout(null);
        pannel.setBackground(Color.cyan);

        JButton button1 = new JButton("English");
        button1.setBounds(10, 330, 200, 120);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordPannelfarsi();
            }
        });
        pannel.add(button1);
        JButton button2 = new JButton("فارسی");
        button2.setBounds(860, 330, 200, 120);
        pannel.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            passwordPannelfarsi();
            }
        });
        JLabel lable1 = new JLabel("زبان خود را وارد نمائید:");
        lable1.setBounds(600, 350, 400, 60);
        pannel.add(lable1);
        JLabel lable2 = new JLabel("Enter your language");
        lable2.setBounds(300, 350, 400, 60);
        pannel.add(lable2);
        pannel.repaint();
        pannel.revalidate();
        frame.add(pannel);
    }
    public static void passwordPannelfarsi(){
        pannel.removeAll();
        pannel.setSize(1080, 720);
        pannel.setLayout(null);
        pannel.setBackground(Color.cyan);

        JButton button = new JButton("ثبت");
        button.setBounds(470, 560, 200, 90);
        pannel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            menuPannel();
            }
        });
        TextField field = new TextField();
        field.setBounds(370, 250, 400, 30);
        pannel.add(field);
        field.setFont(font);
        JLabel lable = new JLabel("رمز خود را وارد نمائید:");
        lable.setBounds(500, 170, 400, 60);
        pannel.add(lable);

        pannel.repaint();
        pannel.revalidate();
        frame.add(pannel);
    }

    public static void menuPannel(){
        pannel.removeAll();
        pannel.setSize(1080, 720);
        pannel.setLayout(null);
        pannel.setBackground(Color.cyan);

        JButton button1 = new JButton("برداشت وجه");
        button1.setBounds(10, 100, 200, 60);
        pannel.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getpropertyPannel();
            }
        });
        JButton button2 = new JButton("تغییر رمز");
        button2.setBounds(860, 560, 200, 60);
        pannel.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changepassPannel();
            }
        });
        JButton button3 = new JButton("کارت به کارت");
        button3.setBounds(10, 560, 200, 60);
        pannel.add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exchangepropertyPannel();
            }
        });
        JButton button4 = new JButton("اعلام موجودی");
        button4.setBounds(860, 100, 200, 60);
        pannel.add(button4);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seepropertyPannel();
            }
        });
        JButton buttonback = new JButton("برگشت");
        buttonback.setBounds(10,10, 90, 60);
        pannel.add(buttonback);
        buttonback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                languagePannel();
            }
        });
        pannel.repaint();
        pannel.revalidate();
        frame.add(pannel);
    }
    public static void changepassPannel(){
        pannel.removeAll();
        pannel.setSize(1080, 720);
        pannel.setLayout(null);
        pannel.setBackground(Color.cyan);

        JButton button = new JButton("تائید");
        button.setBounds(470, 560, 200, 90);
        pannel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            endPannel();
            }
        });
        TextField field = new TextField();
        field.setBounds(400, 250, 400, 30);
        field.setFont(font);
        pannel.add(field);

        JLabel lable = new JLabel("رمز خود را وارد نمائید:");
        lable.setBounds(530, 170, 400, 60);
        pannel.add(lable);

        JButton buttonback = new JButton("برگشت");
        buttonback.setBounds(10,10, 90, 60);
        pannel.add(buttonback);
        buttonback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuPannel();
            }
        });
        pannel.repaint();
        pannel.revalidate();
        frame.add(pannel);
    }
    public static void seepropertyPannel(){
        pannel.removeAll();
        pannel.setSize(1080, 720);
        pannel.setLayout(null);
        pannel.setBackground(Color.cyan);

        Random random = new Random();
        Long property = random.nextLong(1000,100000)*1000;

        JLabel lable1 = new JLabel("موجودی حساب شما:"+property+"ریال");
        lable1.setBounds(400, 170, 400, 60);
        pannel.add(lable1);
        JLabel lable2 = new JLabel("عملیات با موفقیت انجام شد.");
        lable2.setBounds(440, 230, 400, 60);
        pannel.add(lable2);

        JButton buttonback = new JButton("برگشت");
        buttonback.setBounds(10,10, 90, 60);
        pannel.add(buttonback);
        buttonback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuPannel();
            }
        });
        pannel.repaint();
        pannel.revalidate();
        frame.add(pannel);
    }
    public static void getpropertyPannel(){
        pannel.removeAll();
        pannel.setSize(1080, 720);
        pannel.setLayout(null);
        pannel.setBackground(Color.cyan);

        JButton button1 = new JButton("1000000");
        button1.setBounds(10, 100, 200, 60);
        pannel.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endPannel();
            }
        });
        JButton button2 = new JButton("2000000");
        button2.setBounds(860, 560, 200, 60);
        pannel.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endPannel();
            }
        });
        JButton button3 = new JButton("5000000");
        button3.setBounds(10, 560, 200, 60);
        pannel.add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endPannel();
            }
        });
        JButton button4 = new JButton("10000000");
        button4.setBounds(860, 100, 200, 60);
        pannel.add(button4);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endPannel();
            }
        });
        JLabel lable = new JLabel("مبلغ مورد نظر را وارد کنید:");
        lable.setBounds(440, 450, 400, 60);
        pannel.add(lable);

        TextField field1 = new TextField();
        field1.setBounds(370, 510, 400, 30);
        pannel.add(field1);
        field1.setFont(font);

        JButton button = new JButton("ثبت");
        button.setBounds(470, 560, 200, 90);
        pannel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endPannel();
            }
        });

        JButton buttonback = new JButton("برگشت");
        buttonback.setBounds(10,10, 90, 60);
        pannel.add(buttonback);
        buttonback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuPannel();
            }
        });
        pannel.repaint();
        pannel.revalidate();
        frame.add(pannel);
    }
    public static void exchangepropertyPannel(){
        pannel.removeAll();
        JLabel lable1 = new JLabel("مبلغ مورد نظر را وارد کنید:");
        lable1.setBounds(440, 150, 400, 60);
        pannel.add(lable1);
        JLabel lable2 = new JLabel("شماره کارت مقصد را وارد کنید:");
        lable2.setBounds(440, 430, 400, 60);
        pannel.add(lable2);

        TextField field1 = new TextField();
        field1.setBounds(370, 210, 400, 30);
        pannel.add(field1);
        field1.setFont(font);
        TextField field2 = new TextField();
        field2.setBounds(370, 490, 400, 30);
        pannel.add(field2);
        field2.setFont(font);
        JButton button = new JButton("ثبت");
        button.setBounds(470, 560, 200, 90);
        pannel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endPannel();
            }
        });
        JButton buttonback = new JButton("برگشت");
        buttonback.setBounds(10,10, 90, 60);
        pannel.add(buttonback);
        buttonback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuPannel();
            }
        });

        pannel.repaint();
        pannel.revalidate();
        frame.add(pannel);
    }
    public static void endPannel(){
        pannel.removeAll();
        pannel.setSize(1080, 720);
        pannel.setLayout(null);
        pannel.setBackground(Color.cyan);

        JLabel lable = new JLabel("عملیات با موفقیت انجام شد.");
        lable.setBounds(440, 230, 400, 60);
        pannel.add(lable);

        pannel.repaint();
        pannel.revalidate();
        frame.add(pannel);
    }
}