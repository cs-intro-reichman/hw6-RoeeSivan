import java.awt.Color;
/**
 * Demonstrates the scaling (resizing) operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, and two integers that specify the width and the
 * height of the scaled, output image. For example, to scale/resize ironman.ppm to a width
 * of 100 pixels and a height of 900 pixels, use: java Editor2 ironman.ppm 100 900
 */
public class Editor2 {

	public static void main (String[] args){
		//// Replace this comment with your code.
		//// This function is similar to the main function of Editor1.java			
		String fileName = args[0]; //name of PPM file of a soure image
		Color [][] imageIn = Runigram.read(fileName); //gets in image that should be scaled	
		int width = Integer.parseInt(args[1]); //width of new image
		int height = Integer.parseInt(args[2]); // heigth of new image
		// Reads the input image and creates an empty output image
		Color [][] scaledImage = Runigram.scaled(imageIn, width, height);
		// Creates a canvas in which both images will be displayed, one after the other.
		// Next, displays the input image, and pauses for a few seconds. 
		// Finally, displays the output image.
		// (Notice that both images have the same dimensions).
		Runigram.setCanvas(imageIn);
		Runigram.display(imageIn);
		StdDraw.pause(3000); 
		Runigram.setCanvas(scaledImage);
		Runigram.display(scaledImage);
	}
}
