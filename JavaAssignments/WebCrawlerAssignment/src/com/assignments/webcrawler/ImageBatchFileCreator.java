package com.assignments.webcrawler;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.nio.file.*;

public class ImageBatchFileCreator {

	private static final String BASE_URL = "https://picsum.photos/id/";
	private static final String IMAGES_DIR = "C:\\Users\\natar\\MonigaBalasubramanian\\Programming\\Java\\JavaAssignments\\WebCrawlerAssignment\\OutputFiles\\images";
	private static final String BATCH_DIR = "C:\\Users\\natar\\MonigaBalasubramanian\\Programming\\Java\\JavaAssignments\\WebCrawlerAssignment\\OutputFiles\\Batch_files";
	private static final String TEXT_DIR = "C:\\Users\\natar\\MonigaBalasubramanian\\Programming\\Java\\JavaAssignments\\WebCrawlerAssignment\\OutputFiles\\Text_files";

	public static void main(String[] args) {
		try {
			for (int i = 1; i <= 100; i++) {
				String imageUrl = BASE_URL + i + "/200/300";
				String imageName = "image" + i + ".jpg";
				String textFileName = "image_name_" + i + ".txt";
				String batchFileName = "batch_" + i + ".bat";

				downloadImage(imageUrl, Paths.get(IMAGES_DIR, imageName));
				createTextFile(imageName, Paths.get(TEXT_DIR, textFileName));
				createBatchFile(imageName, textFileName, Paths.get(BATCH_DIR, batchFileName));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void downloadImage(String imageUrl, Path targetPath) throws IOException {
		try (InputStream in = new URL(imageUrl).openStream()) {
			Files.copy(in, targetPath, StandardCopyOption.REPLACE_EXISTING);
		}
	}

	private static void createTextFile(String imageName, Path textFilePath) throws IOException {
		try (BufferedWriter writer = Files.newBufferedWriter(textFilePath)) {
			writer.write(imageName.substring(0, imageName.lastIndexOf('.')));
		}
	}

	private static void createBatchFile(String imageName, String textFileName, Path batchFilePath) throws IOException {
		Path imagePath = Paths.get(IMAGES_DIR, imageName);
		Path textPath = Paths.get(TEXT_DIR, textFileName);

		try (BufferedWriter writer = Files.newBufferedWriter(batchFilePath)) {
			writer.write("@echo off\n");
			writer.write("echo Displaying image: " + imageName + "\n");
			writer.write("start \"\" \"" + imagePath.toAbsolutePath() + "\"\n");
			writer.write("notepad \"" + textPath.toAbsolutePath() + "\"\n");
			writer.write("pause");
		}
	}

}
