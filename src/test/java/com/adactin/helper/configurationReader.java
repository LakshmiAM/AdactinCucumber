package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configurationReader {

	public static Properties ps;
	
	public configurationReader() throws IOException {

		File f = new File("src\\test\\java\\com\\adactin\\property\\Adactin.property");
		FileInputStream fis = new FileInputStream(f);
		ps = new Properties();
		ps.load(fis);
		
	}
	
	public String getBrowserName() {
		String Browsername = ps.getProperty("BrowserName");
		System.out.println(Browsername);
		return Browsername;
	}
	
	public String getUrl() {
		String url = ps.getProperty("url");
		System.out.println(url);
		return url;
	}
	
//	public static void main(String[] args) throws IOException {
//		configurationReader cr = new configurationReader();
//		cr.getBrowserName();
//		cr.getUrl();
//	}
}
