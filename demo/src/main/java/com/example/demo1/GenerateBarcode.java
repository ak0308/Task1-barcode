package com.example.demo1;

import java.nio.file.Paths;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;

public class GenerateBarcode {

	public static void main(String[] args) throws Exception {
		try {
			String text = "http://www.Redmi7.com";
			//String path = "F:\\Barcode\\barcode.jpg";
			String path = "F:\\Anilkumar\\barcode.jpg";
			Code128Writer writer=new Code128Writer();
			BitMatrix matrix= writer.encode(text, BarcodeFormat.CODE_128,500,300);
			 MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));
			 System.out.println("Barcode created...");
		} 
		catch(Exception e) {
			System.out.println("Error while creating barcode");
		}

	}

}
