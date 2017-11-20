package testsqlite;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
 

public class TestSqlite extends Application {
 @Override
 public void start(Stage primaryStage) {
  try {
   Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
   Scene scene = new Scene(root);
   primaryStage.setScene(scene);
   primaryStage.show();
  } catch(Exception e) {
   e.printStackTrace();
  }
 }
 
 public static void main(String[] args) {
  launch(args);
 }
}
