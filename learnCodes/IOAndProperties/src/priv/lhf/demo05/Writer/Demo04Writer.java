package priv.lhf.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    续写和换行
    FileWriter(String fileName, boolean append)
    FileWriter(File file, boolean append)
 */
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("IOAndProperties\\g.txt", true);
        for (int i = 0; i < 10; i++) {
            fw.write((i+1) + ": Hello World!\r\n");
        }

        fw.flush();
        fw.close();
    }
}
