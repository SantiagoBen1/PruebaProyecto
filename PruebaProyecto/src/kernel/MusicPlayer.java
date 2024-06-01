package kernel;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.InputStream;
import java.io.BufferedInputStream;

public class MusicPlayer {
	//Declaramos la variable Clip para reproducir audio
    private Clip clip;

    public void playMusic(String musicFilePath) {
        try {
        	//Obtiene el archivo de audio como un InputStream
            InputStream audioSrc = getClass().getResourceAsStream(musicFilePath);
            //Usa BufferedInputStream para soportar mark/reset
            InputStream bufferedIn = new BufferedInputStream(audioSrc);
            //Obtiene un audio AudioInputStream del archivo de audio
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(bufferedIn);
            //Obtiene un clip para reproducir el audio
            clip = AudioSystem.getClip();
            //Abre el clip de audioInputStream
            clip.open(audioInput);
            //Comienza a reproducir el Clip
            clip.start();
            //Configuramos el clip para que se repita de manera continua
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
        	//Imprime la traza del error en caso de que ocurra una excepción 
            e.printStackTrace();
        }
    }

    public void stopMusic() {
    	//Verifica si el clip es nulo y lo detiene 
        if (clip != null) {
            clip.stop();
        }
    }
}
