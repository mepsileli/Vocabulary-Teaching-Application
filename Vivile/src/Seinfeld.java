/**
 * This class open and quit a video automatically by using VLC Java Library 
 *@version 29/04/2017
 * @author YUSUF SAMSUM
 */
import com.sun.jna.Native;
import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;
import com.sun.jna.NativeLibrary;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

public class Seinfeld extends JFrame {

    /**
     * Burada main methodda maalesef böyle bir uygulama barındırmak zorundayız ve bunu gui kısmına ekleyebileceğimize inanıyorum bu class sadece class olacak herhangi bir şey çalıştırmayacak.
     * Fıratın attıklarında integer alıp güzelce Stringe çevirmek gerekiyor onun dışında çalışacak gibi duruyor. 
     * @param args the command line arguments
     */
    public static void main(String[] args){
    SwingUtilities.invokeLater(new Runnable() { 
        @Override
      public void run(){
        new Seinfeld("love");
      }
 
    });
    }
    
    //properties
    private final EmbeddedMediaPlayerComponent mediaPlayerComponent;
    SecondGiver sec;
    
    
    public Seinfeld(String word){
        sec = new SecondGiver( "Seinfeld", word );
        NativeLibrary.addSearchPath(
        RuntimeUtil.getLibVlcLibraryName(), "C:\\Program Files\\VideoLAN\\VLC"
        );
        Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);


        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();

        setContentPane(mediaPlayerComponent);

        setLocation(100, 100);
        setSize(1050, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        System.out.println("Running");
        String start = ":start-time=" + sec.getStartTime();
        String stop  = ":stop-time=" + sec.getStopTime();
        System.out.println(start);
        mediaPlayerComponent.getMediaPlayer().playMedia("C:\\Users\\User\\Downloads\\proje\\Seinfeld S2B1 - Diziay.com.mp4",start, stop);
        Timer t = new Timer(15000, new MyActionListener() );
        t.start();

    }
    class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
         dispose();
        
        }
    }
}
