
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }
     
      @Override
    public void start(Stage stage) throws Exception {
        var view_main = getClass().getResource("View.fxml");

        var loader = new FXMLLoader();
        loader.setLocation(view_main);
        var scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.show();

    }                    
  

    
}
