package aero.sita.src.sample;

import org.springframework.integration.file.FileNameGenerator;
import org.springframework.messaging.Message;

/**
 * Generator class handles responsibility of updating file extension.
 * @author puneet.nigam
 *
 */
public class GenerateFiles implements FileNameGenerator {

    /**
     * fileExt
     */
    private String fileExtension;
    
    /**
     * Getter for fileExt.
     * @return fileExt, never null.
     */
    public String getFileExtension() {
        return fileExtension;
    }
    
    /**
     * Setter for fileExt.
     * @param fileExt , not null.
    */
    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }
    
    /**
     * generateFileName.
     * @param message , not null
     * @return the updated file name , never null
     */
    public String generateFileName(Message<?> message) {
        String fileName = message.getHeaders().get("file_name").toString();
        //fileName = fileName.substring(0, fileName.indexOf("."));
        return fileName + "." + fileExtension;
    }
}
