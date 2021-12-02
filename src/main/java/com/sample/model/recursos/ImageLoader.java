package com.sample.model.recursos;

import java.util.HashMap;
import javafx.scene.image.Image;

public class ImageLoader {
	static HashMap<String, Image> tabImgs;

    static {
        tabImgs = new HashMap<>();
    }

    public static Image getImage(String name) {
        Image img = tabImgs.get(name);
        if (img == null) {
            return loadImage(name);
        }
        return img;
    }

    public static Image loadImage(String name) {
        try {
            Image img = new Image(ImageLoader.class.getResourceAsStream("imagens/" + name));
            if (img != null) {
                tabImgs.put(name, img);
                return img;
            }
        } catch (Exception e) {
        }
        return null;
    }	
}
