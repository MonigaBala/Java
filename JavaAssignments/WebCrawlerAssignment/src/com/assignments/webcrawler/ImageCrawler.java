package com.assignments.webcrawler;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ImageCrawler {

	public void downloadImage(String imageUrl, String destinationFilePath) throws IOException {
		@SuppressWarnings("deprecation")
		URL url = new URL(imageUrl);
		try (InputStream in = url.openStream()) {
			java.nio.file.Files.copy(in, java.nio.file.Paths.get(destinationFilePath),
					java.nio.file.StandardCopyOption.REPLACE_EXISTING);
		}
	}
}
