package pjpacman;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Pacman extends JFrame {//inheritance

    public Pacman() { //constructor
        
        initUI();
    }
    
    private void initUI() {
        
        add(new PJPacman());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setLocationRelativeTo(null);
        setVisible(true);        
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Pacman ex = new Pacman();
            ex.setVisible(true);
        });
    }
}

