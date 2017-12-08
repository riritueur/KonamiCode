import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
 
public class Sound extends Thread{
    private URL url;
    private AudioClip sound;
  
    public Sound(){
    	url = this.getClass().getClassLoader().getResource("!.wav");
    	sound = Applet.newAudioClip(url);
    }
     
    public void play(){sound.play();}
}