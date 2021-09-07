package org.onpups.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.onpups.domain.AttachVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;
import net.coobird.thumbnailator.Thumbnailator;

@Controller
@Log4j
public class UploadController {
	@Autowired ServletContext servletContext;
	
	@GetMapping("/uploadForm")
	public void uploadForm() {
		log.info("upload form");
	}
	
	@PostMapping(value="/uploadProfile")
	public ResponseEntity<List<AttachVO>> uploadProfile(MultipartFile[] uploadFile, HttpServletRequest request) {
		List<AttachVO> list = new ArrayList<>();
		log.info("-----------------------");
//		String uploadFolder = "resources/upload/tmp";
//		String uploadFolder = Paths.get(System.getProperty("project.basedir")).resolve("src").resolve("main").resolve("resources").resolve("upload").resolve("temp").toString();
//		String uploadFolder = servletContext.getRealPath("/resources") + "/upload/temp";
//		log.info(servletContext.getRealPath("/resources"));		
//		String uploadFolder = request.getSession().getServletContext().getRealPath("/WEB-INF/resources/upload/temp");
//		String uploadFolder = "/root/resources/upload/temp";
		
		
		String webappRoot = servletContext.getRealPath("/");
		String uploadFolder = webappRoot+"resources/upload/temp";
		log.info(uploadFolder);
		
		
		String uploadFileName ="";
		String fileType ="";
		UUID uuid =null;
		log.info("-uploadFolder---------------------"  + uploadFolder);
		log.info("files : " + uploadFile);
		
		for (MultipartFile multipartFile : uploadFile) {
			log.info("-----------------------");
			log.info("Upload File Name: " + multipartFile.getOriginalFilename());
			log.info("Upload File Size: " + multipartFile.getSize());
			
			uploadFileName = multipartFile.getOriginalFilename();
			// IE filename setting
			uploadFileName = uploadFileName.substring(uploadFileName.lastIndexOf("\\")+1);
			
			AttachVO vo = new AttachVO();
			uuid = UUID.randomUUID();
			uploadFileName = uuid.toString() + "_" +uploadFileName; 
			
			int pos = uploadFileName.lastIndexOf(".");
		    fileType = uploadFileName.substring(pos+1, uploadFileName.length()); 
			
			vo.setUuid(uuid.toString());
			vo.setUploadPath(uploadFolder);
			vo.setFilename(multipartFile.getOriginalFilename());
			vo.setNewfilename(uploadFileName);
			vo.setFileType(fileType);
			log.info("------------AttachVO : "+ vo);
			
			// 파일전송
//			File saveFile = new File(uploadFolder, multipartFile.getOriginalFilename());
			File saveFile = new File(uploadFolder, uploadFileName);
			log.info("------------saveFile : "+ saveFile);
			try {
				log.info("try start");
				multipartFile.transferTo(saveFile);
				log.info("try complete");
			} catch (Exception e) {
				log.error(e.getMessage());
			}
			list.add(vo);
		}
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	
	
	@PostMapping("/deleteFile")
	@ResponseBody
	public ResponseEntity<String> deleteFile(String fileName, String type) {
		log.info("deleteFile: "+ fileName);
		File file;
		try {
			file= new File("/resources/upload/"+ URLDecoder.decode(fileName, "UTF-8"));
			file.delete();
			if (type.equals("image")) {
				String oriImageName = file.getAbsolutePath().replace("s_","");
				log.info("oriImageName: "+oriImageName);
				file = new File(oriImageName);
				file.delete();
			}
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return new ResponseEntity<String>("deleted", HttpStatus.OK);
	}
	
	private String getFolder() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String str = sdf.format(date);
		return str.replace("-", File.separator);
	}
	private Boolean checkImageType(File file) {
		try {
			String contentType= Files.probeContentType(file.toPath());
			return contentType.startsWith("image");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
