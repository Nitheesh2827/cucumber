package com.helper.com;

import java.io.IOException;

public class FileReaderManager {
	private FileReaderManager() {
	
	}
	public  FileReaderManager getInstanceFR() {
      FileReaderManager fm = new FileReaderManager();
      return fm;
	}
	
	public static ConfigurationReader getInstanceCR() throws IOException {
     ConfigurationReader cf = new ConfigurationReader();
     return cf;
	
	}
	
	
	}

