package net.teslaworks.reactor;

import java.io.InputStream;
import java.nio.file.FileSystems;
import java.io.IOException; //thrown by toRealPath()
import java.nio.file.NoSuchFileException; //thrown by toRealPath()
import java.nio.file.Path;

public class MinimObject {
    /*
    Generate an absolute path from the file name provided
    */
    public String sketchPath(String fileName) {
        
        String absolute_path;
        Path real_path = null;
        Path path = FileSystems.getDefault().getPath(fileName);
        
        try {
            real_path = path.toRealPath();
        } 
        catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", path);
            // Logic for case when file doesn't exist.
        } 
        catch (IOException x) {
            System.err.format("%s%n", x);
            // Logic for other sort of file error.
        }
        absolute_path = real_path.toString();
        
        return absolute_path;
    }
    
    /*
    Get an input stream for a given file name (not necessarily an absolute path)
    */
    public InputStream createInput(String fileName) {
        return null;
    }
}
