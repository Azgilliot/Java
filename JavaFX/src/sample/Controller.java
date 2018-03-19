package sample;

import javafx.beans.property.DoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.media.Media;

import javax.script.Bindings;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.beans.binding.Bindings.selectDouble;
import static javax.script.Bindings.*;

public class Controller implements Initializable {

    @FXML private MediaView mv;
    private MediaPlayer mp;
    private Media me;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String path = new File("src/media/VID.mp4").getAbsolutePath();
        me = new Media(new File(path).toURI().toString());
        mp = new MediaPlayer(me);
        mv.setMediaPlayer(mp);
        mp.setAutoPlay(true) ;
        DoubleProperty width = mv.fitWidthProperty();
        DoubleProperty height = mv.fitHeightProperty();
        width.bind(selectDouble(mv.sceneProperty(), "width"));
        height.bind(selectDouble(mv.sceneProperty(), "height"));
//
    }
}
