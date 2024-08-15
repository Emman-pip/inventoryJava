package com.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Objects;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginSignUpWindow extends Stage {

	LoginSignUpWindow() throws Exception {
		this.setScene(mainGrid());
		this.setTitle("Login");
		this.show();
	}

	private Scene mainGrid() throws FileNotFoundException {
		GridPane pane = new GridPane();
		Scene scene = new Scene(pane);
		return scene;
	}
}
