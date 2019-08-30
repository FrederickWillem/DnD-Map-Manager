package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import app.ErrorHandler;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

public class ToolkitController {
	
	enum TextureType {
		TILE, PLAYER, ENTITY;
	}
	@FXML
	ImageView imgView;
	@FXML
	Button btnAdd;
	
	TextureType current;
	static FileChooser fc = new FileChooser();
	
	public void initialize() {
		List<FileChooser.ExtensionFilter> extensionFilters = fc.getExtensionFilters();
		extensionFilters.add(new FileChooser.ExtensionFilter("Image files (*.png)", "*.png"));
	}
	
	@FXML
	public void addBtnClicked(ActionEvent e) {
		//TODO: 1. save the image to the images directory. 2. define a new tile/entity/player. 3. add the set properties to that object and 4. save it.
	}
	
	public Image getTexture() throws IOException {
		File file = fc.showOpenDialog(SceneManager.getPrimaryStage());
		if(file != null) {
			fc.setInitialDirectory(new File(file.getParent()));
			return SwingFXUtils.toFXImage(ImageIO.read(file), null);
		} else
			return null;
	}
	
	@FXML
	public void addTile(ActionEvent e) {
		try {
			Image image = getTexture();
			if(image != null) {
				imgView.setImage(image);
				current = TextureType.TILE;
				btnAdd.setDisable(false);
			}
		} catch (IOException ex) {
			ErrorHandler.handle("Could not read image file", ex);
		}
	}
	
	@FXML
	public void addEntity(ActionEvent e) {
		try {
			Image image = getTexture();
			if(image != null) {
				imgView.setImage(image);
				current = TextureType.ENTITY;
				btnAdd.setDisable(false);
			}
		} catch (IOException ex) {
			ErrorHandler.handle("Could not read image file", ex);
		}
	}
	
	@FXML
	public void addPlayer(ActionEvent e) {
		try {
			Image image = getTexture(); 
			if(image != null) {
				imgView.setImage(image);
				current = TextureType.PLAYER;
				btnAdd.setDisable(false);
			}
		} catch (IOException ex) {
			ErrorHandler.handle("Could not read image file", ex);
		}
	}

}
