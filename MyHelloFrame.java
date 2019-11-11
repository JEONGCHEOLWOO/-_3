import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 여기에 MyHelloFrame 클래스 설명을 작성하십시오.
 * 
 * @author (2018315034 정철우, 2018243087 정찬호) 
 * @version (2019/11/11)
 */
public class MyHelloFrame extends JFrame
{
   public MyHelloPanelListener mp;
   public MyHelloFrame(){
       this.setTitle("실습_3(2018315034 정철우, 2018243087 정찬호");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       mp = new MyHelloPanelListener();
       this.add(mp); // Panel 추가
       this.addKeyListener(mp); // KeyListener 추가
       this.addMouseListener(mp); // MouseListener 추가
       
       this.setSize(400,300);
       this.setVisible(true);
   }
}
