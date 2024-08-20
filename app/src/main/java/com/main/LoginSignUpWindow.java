package com.main;

import com.main.utilities.ImageUtilities;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginSignUpWindow extends Stage {

	LoginSignUpWindow() {
		this.setScene(mainGrid());
		this.setTitle("Login");
		this.show();
	}

	private GridPane LoginForm() {
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(10);
		grid.setHgap(10);
		grid.setAlignment(Pos.CENTER);

		Text login_txt = new Text("Login");
		login_txt.setId("login_txt");

		Label username_lbl = new Label("Username ");
		TextField username_field = new TextField();
		Label password_lbl = new Label("Password");
		PasswordField password_field = new PasswordField();

		// set up buttons
		HBox vbox = new HBox();
		vbox.setAlignment(Pos.CENTER_RIGHT);
		vbox.setFillHeight(true);

		Button login_btn = new Button();
		login_btn.setText("Login");
		login_btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("This will be connected to other class' method");
			}
		});

		Button signup_btn = new Button();
		signup_btn.setText("Signup");
		signup_btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("This will be connected to other class' method");
			}
		});

		vbox.getChildren().add(signup_btn);
		vbox.getChildren().add(login_btn);
		signup_btn.setCursor(Cursor.HAND);
		login_btn.setCursor(Cursor.HAND);

		login_txt.setCursor(Cursor.HAND);

		grid.add(login_txt, 1, 0, 2, 1);
		grid.add(username_lbl, 1, 1);
		grid.add(username_field, 2, 1);
		grid.add(password_lbl, 1, 2);
		grid.add(password_field, 2, 2);
		grid.add(vbox, 1, 3, 2, 1);

		return grid;
	}

	private Scene mainGrid() {
		GridPane grid = LoginForm();

		Scene scene = new Scene(grid, 500, 500);
		scene.getStylesheets().add(new ImageUtilities().filePath("/com/main/Login.css"));
		return scene;
	}
}
