package com.adactin.helper;

import java.io.IOException;

public class FileReaderManager {

	public static FileReaderManager getInstance() {
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}
	
	public configurationReader getCrInstance() throws IOException {
		configurationReader cr = new configurationReader();
		return cr;
	}
}
