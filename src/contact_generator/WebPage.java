package contact_generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Student ID: 1507342
 *
 * @author Michal Sitarz
 */
public class WebPage {

    private String fileName;
    private String fileType;
    private String fileLocation;

    private boolean fileSaved = false;

    public WebPage() {
        fileName = "";
        fileType = "";
        fileLocation = "";
    }

    public boolean saveFile(/*String fileContent*/) {
                
        // file content (html code & page content)
        //String pageContent = _pageContent;
        String pageContent = "fafki";
                
        Html h = new Html();
        
        String fileContent = h.generateHtml(pageContent);
        
        // file name, file extension, file location
        String filePath = fileLocation + "\\" + fileName + "." + fileType;
        System.out.println(filePath);
        File f = new File(fileLocation);

        //make sure that folder for output files exists
        if (!f.exists()) {
            //if not, make it
            f.mkdir();
        }
        //double-check if the folder has been created
        if (f.exists()) {
            try {
                PrintStream out = new PrintStream(new FileOutputStream(filePath));
                out.println(fileContent);
                out.close();
                fileSaved = true;

            } catch (FileNotFoundException e) {
                e.getStackTrace();
                fileSaved = false;
            }
        } else {
            fileSaved = false;
        }

        return this.fileSaved;
    }

    // SETters:
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    // GETters:
    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public String getFileLocation() {
        return fileLocation;
    }

}
