package net.teslaworks.reactor;

import java.io.InputStream;
import java.io.FileInputStream;
import java.nio.file.FileSystems;
import java.io.IOException; //thrown by toRealPath()
import java.nio.file.NoSuchFileException; //thrown by toRealPath()
import java.io.FileNotFoundException; //thrown by FileInputStream obj creation
import java.nio.file.Path;

public class MinimObject {
    /*
    Generate an absolute path from the file name provided
    */
    public String sketchPath(String fileName) {
        
        Path real_path = null;
        Path path = FileSystems.getDefault().getPath(fileName);
        
        try {
            real_path = path.toRealPath();
        } 
        catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory\n", path);
            // Logic for case when file doesn't exist.
        } 
        catch (IOException x) {
            System.err.format("%s\n", x);
            // Logic for other sort of file error.
        }
        
        return real_path.toString();
    }
    
    /*
    Get an input stream for a given file name (not necessarily an absolute path)
    */
    public InputStream createInput(String fileName) {
        InputStream inputstream = null;
        String full_name = sketchPath(fileName);
        
        try {
            inputstream = new FileInputStream(full_name);
        }
        catch (FileNotFoundException x) {
            System.err.format("%s\n", x);
        }
        return inputstream;
    }
}
