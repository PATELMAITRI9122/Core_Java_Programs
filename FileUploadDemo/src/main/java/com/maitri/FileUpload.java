package com.maitri;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.jni.File;

/**
 * Servlet implementation class FileUpload
 */
public class FileUpload extends HttpServlet {
	
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			ServletFileUpload fs = new ServletFileUpload(new DiskFileItemFactory());
			
			List<FileItem> multiFiles = fs.parseRequest(request);
			
			for(FileItem item : multiFiles) {
				item.write(new File("C:\\Users\\Maitri\\OneDrive\\Desktop\\JAVA_COURSE\\JavaFileProgram" + item.getName()));
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
			
		
	}

}
