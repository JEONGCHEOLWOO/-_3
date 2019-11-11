import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * MyHelloFrame 클래스는 JFrame을 상소받아 GUI 컴포넌트와 리스너를 
 * 추가받는 클래스입니다.
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
