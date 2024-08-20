package com.main.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.main.App;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageUtilities {
	public ImageView loadImage(String imageName) throws FileNotFoundException {
		return new ImageView(
				new Image(new FileInputStream(new File(App.class.getResource(imageName).toString().substring(5)))));
	}

	public String filePath(String fileName) {
		// System.out.println(App.class.getResource(fileName).toString());
		return App.class.getResource(fileName).toString();
	}

	public boolean imageExists(String imageName) {
		File file = new File(App.class.getResource(imageName).toString().substring(5));
		System.out.println(file.getAbsolutePath());
		return file.exists();
	}
}
