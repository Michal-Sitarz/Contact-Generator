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
    
    // global fields
    private String fileName;
    private String fileType;
    private String fileLocation;
    
    /**
     * global variable to control the status of file saving operation
     */
    private boolean fileSaved = false;

    /**
     * default CTOR
     */
    public WebPage() {
        fileName = "";
        fileType = "";
        fileLocation = "";
    }

    /**
     * method to save the file on a local hard disk drive
     *
     * @param fileContent
     * @return
     */
    public boolean saveFile(String fileContent) {
        
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

    /**
     * SETter for:
     *
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * SETter for:
     *
     * @param fileType
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * SETter for:
     *
     * @param fileLocation
     */
    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    // GETters:

    /**
     * GETter for:
     *
     * @return
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * GETter for:
     *
     * @return
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * GETter for:
     *
     * @return
     */
    public String getFileLocation() {
        return fileLocation;
    }

}
