/**
 *
 * @author kunal
 */

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;
import javax.swing.*;
import javax.swing.JTextField;


public class Ip{
    public static void main(String[] args) {
        new Welcome();
    }
}


class Welcome extends JFrame
{
    
    JProgressBar jb;
    int i=0;int num=0;
    
    public Welcome()
    {
        
        
        jb = new JProgressBar(0,2000);
        
        jb.setValue(0);
        jb.setBackground(Color.blue);
        
        getContentPane().add(jb);
       
        setSize(400,400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iterate();
        
    }
    
    public void iterate()
    {
        while(i<=2000)
        {
            jb.setValue(i);
            i=i+20;
            try {
                Thread.sleep(30);
            } catch (Exception e) {
            }
            
        }
        if(i>=1980)
        {
            new AppFrame();
        }
    }
}

class AppFrame extends JFrame implements ActionListener
{
    JTextField t1; JLabel l1; JButton b1;
    JMenu menu;
    JMenuBar mb;
    JMenuItem about,help,contact,setting;
    public AppFrame()
    {
        mb = new JMenuBar();
        mb.add(Box.createHorizontalGlue());
        menu = new JMenu("Options");
        about = new JMenuItem("About");
        help = new JMenuItem("Help");
        contact = new JMenuItem("Contact");
        setting = new JMenuItem("Setting");
        menu.add(about);
        menu.add(contact);
        menu.add(setting);
        menu.add(help);
        
        
        mb.add(menu);
        setJMenuBar(mb);
        
        about.addActionListener(
        ae ->
        {
            // we will write code!!!
            
            new About();
        }
        );
        
        help.addActionListener(
        ae ->
        {
           //we will code...
            new Help();
        }
        );
        
        contact.addActionListener(
        ae ->
        {
            //we will code ...
            new Contact();
        }
        );
        
        setting.addActionListener(
        ae ->
        {
            //we will code
            new Setting();
        }
        );
        
        
        
        
        JLabel l0 = new JLabel("IP Tracker");
        l0.setFont(new Font("serif",Font.BOLD,35));
        l0.setBounds(50, 5, 300, 50);
        add(l0);
        
        t1 = new JTextField();
        t1.setBounds(50,80, 250,30);  
        l1 = new JLabel();
        l1.setBounds(70,130,250,20);
        b1 = new JButton("Press");
        b1.setBounds(50,120,80,30);
        b1.addActionListener(this);
        add(b1);add(t1);add(l1);
        setSize(400,400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        try{
            String host = t1.getText();
            String ip=java.net.InetAddress.getByName(host).getHostAddress();  
            //l1.setText("IP of "+host+" is: "+ip);
            String result ="IP of "+host+" is: "+ip;
            new PopFrame(result);
            
        }catch(UnknownHostException ex){System.out.println(ex);}
    }
}

class PopFrame extends JFrame
{
    JLabel l2;
    public PopFrame(String str)
    {
       l2 = new JLabel(str);
       l2.setBounds(10, 5, 100, 50);
       l2.setFont(new Font("serif",Font.BOLD,15));
       
        add(l2);
        setSize(400,200);
        setVisible(true);
        setLayout(null);

    }
    
}

class About
{
    JDialog jd;
    public About()
    {
        JFrame f= new JFrame();
        jd = new JDialog(f, "About", true);
        jd.setLayout(new FlowLayout());
        
        
        
        String text= "This app will help you to identify the ip adress.Like us on Twitter  and follow us on whatsapp and message us on mobile.";
        
        JTextArea jt = new JTextArea(text);
        jt.setEditable(false);
        jt.setLineWrap(true);
        jt.setColumns(26);
        jt.setRows(20);
                
        jd.add(jt);
        
        
        jd.setSize(300,300);    
        jd.setVisible(true);
        
        
        
    }
}

class Contact
{
    JDialog jd;
    public Contact()
    {
        JFrame f= new JFrame();
        jd = new JDialog(f, "Contact", true);
        jd.setLayout(new FlowLayout());
        
        
        
        String text="Kunal Kumar\nIEM,Kolkata";
        JTextArea jt = new JTextArea(text);
        jt.setEditable(false);
        jt.setLineWrap(true);
        jt.setColumns(26);
        jt.setRows(20);
                
        jd.add(jt);
        
        
        jd.setSize(300,300);    
        jd.setVisible(true);
        
        
        
    }
}

class Help
{
    JDialog jd;
    public Help()
    {
        JFrame f= new JFrame();
        jd = new JDialog(f, "Help", true);
        jd.setLayout(new FlowLayout());
        
        
        
        String text="Coming soon...";
        
        JTextArea jt = new JTextArea(text);
        jt.setEditable(false);
        jt.setLineWrap(true);
        jt.setColumns(26);
        jt.setRows(20);
                
        jd.add(jt);
        
        
        jd.setSize(300,300);    
        jd.setVisible(true);
        
        
        
    }
}

class Setting
{
    JDialog jd;
    public Setting()
    {
        JFrame f= new JFrame();
        jd = new JDialog(f, "About", true);
        jd.setLayout(new FlowLayout());
        
        
        
        String text="Coming soon...";
        
        JTextArea jt = new JTextArea(text);
        jt.setEditable(false);
        jt.setLineWrap(true);
        jt.setColumns(26);
        jt.setRows(20);
                
        jd.add(jt);
        
        
        jd.setSize(300,300);    
        jd.setVisible(true);
        
        
        
    }
}