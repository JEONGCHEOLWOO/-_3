import java.awt.event.*;
import javax.swing.*;
/**
 * 여기에 MyHelloPanelListener 클래스 설명을 작성하십시오.
 * 
 * @author (2018315034 정철우, 2018243087 정찬호) 
 * @version (2019/11/11)
 */
public class MyHelloPanelListener extends JPanel implements MouseListener, KeyListener
{
    JLabel ml;
    final int move_fixel=10; //이동 픽셀 고정
    public MyHelloPanelListener(){
        ml=new JLabel("Hello");
        this.add(ml);
    }
    public void mousePressed(MouseEvent e){}
    public void mouseClicked(MouseEvent e){//마우스가 클릭 됐을 때 해당 위치로 
        //레이블 이동
        int x=e.getX();
        int y=e.getY();
        ml.setLocation(x,y);
    }
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void keyPressed(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){//키 입력을 받았을 때 키의 종류에 따라 작동
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){//오른쪽 방향키 입력시
            int x=ml.getX()+move_fixel;
            int y=ml.getY();
            ml.setLocation(x,y);
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT){//왼쪽 방향키 입력시
            int x=ml.getX()-move_fixel;
            int y=ml.getY();
            ml.setLocation(x,y);
        }else if(e.getKeyCode()==KeyEvent.VK_UP){//위쪽 방향키 입력시
            int x=ml.getX();
            int y=ml.getY()-move_fixel;
            ml.setLocation(x,y);
        }else if(e.getKeyCode()==KeyEvent.VK_DOWN){//아래쪽 방향키 입력시
            int x=ml.getX();
            int y=ml.getY()+move_fixel;
            ml.setLocation(x,y);
        }
    }
}
