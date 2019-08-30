package app;

import java.io.IOException;

import controller.MainMenuController;
import controller.SceneManager;
import data.mapdata.AssetManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MapManagerApp extends Application{
	
	private SceneManager sceneManager;
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setResizable(false);
        FXMLLoader loader = new FXMLLoader(MapManagerApp.class.getResource("../assets/fxml/MainMenu.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        sceneManager = new SceneManager(stage,scene,loader);
        MainMenuController.sceneManager = this.sceneManager;
        stage.setTitle("DnD Map Manager");
	}

    public static void main(String[] args) throws IOException {
    	AssetManager.initializeManager();
        launch(args);
    }


}