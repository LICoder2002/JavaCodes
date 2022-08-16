package priv.lhf.demo03.Filter;

import java.io.File;
import java.io.FileFilter;
import java.util.logging.Filter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        //return true;
        if(pathname.isDirectory())
            return true;
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
