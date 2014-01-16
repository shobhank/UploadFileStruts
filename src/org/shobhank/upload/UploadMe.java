package org.shobhank.upload;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class UploadMe {
	private String myfileUploadFileName; //[name of file tag in index.jsp]FileName
	private String myfileUploadContentType; //[name of file tag in index.jsp]ContentType
	private File myfileUpload; // same name as in index.jsp
	private String destFilePath;
	
	
	public String execute() throws IOException{
		File destFile = new File(myfileUploadFileName);
		myfileUpload.renameTo(destFile);
		setDestFilePath(destFile.getAbsolutePath());
		return "success";
	}



	public File getMyfileUpload() {
		return myfileUpload;
	}

	public void setMyfileUpload(File myfileUpload) {
		this.myfileUpload = myfileUpload;
	}



	public String getMyfileUploadFileName() {
		return myfileUploadFileName;
	}



	public void setMyfileUploadFileName(String myfileUploadFileName) {
		this.myfileUploadFileName = myfileUploadFileName;
	}



	public String getMyfileUploadContentType() {
		return myfileUploadContentType;
	}



	public void setMyfileUploadContentType(String myfileUploadContentType) {
		this.myfileUploadContentType = myfileUploadContentType;
	}



	public String getDestFilePath() {
		return destFilePath;
	}



	public void setDestFilePath(String destFilePath) {
		this.destFilePath = destFilePath;
	}



	
}
