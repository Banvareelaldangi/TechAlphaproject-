import java.awt.*;
import java.text.*;
import java.util.Calendar;
import javax.swing.*;
class Digitalclock extends JFrame
{
JLabel l1,l2,l3;
SimpleDateFormat dl,d2,d3;
Digitalclock(String s1)
{
super(s1);
}
void setComponents()
{
l1=new JLabel();
l2=new JLabel();
l3=new JLabel();
l1.setFont(new Font("Verdana",Font.BOLD,40));
Color c1=Color.RED;
Color c2=c1.brighter();
l1.setForeground(c2);
l1.setBackground(Color.BLACK);
l1.setOpaque(true);

l2.setFont(new Font("Verdana",Font.BOLD,40));
l2.setForeground(c2);
l2.setBackground(Color.BLACK);
l2.setOpaque(true);

l3.setFont(new Font("Verdana",Font.BOLD,40));
l3.setForeground(c2);
l3.setBackground(Color.BLACK);
l3.setOpaque(true);


setLayout(null);
add(l1);
add(l2);
add(l3);
l1.setBounds(50,50,350,100);
l2.setBounds(50,150,350,100);
l3.setBounds(50,250,350,100);

dl=new SimpleDateFormat("hh:mm:ss a");
d2=new SimpleDateFormat("EEEEE");
d3=new SimpleDateFormat("dd/MM/yyyy");
String time=dl.format(Calendar.getInstance().getTime());
l1.setText(time);

String day=d2.format(Calendar.getInstance().getTime());
l2.setText(day);

String date=d3.format(Calendar.getInstance().getTime());
l3.setText(date);

while(true)
{
time=dl.format(Calendar.getInstance().getTime());
l1.setText(time);
try
{
Thread.sleep(1000);
}
catch(InterruptedException e1)
{

}
}
}
public static void main(String args[])
{
Digitalclock dl=new Digitalclock("Digital clock");
dl.setVisible(true);
dl.setSize(500,500);
dl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
dl.setComponents();
}
}