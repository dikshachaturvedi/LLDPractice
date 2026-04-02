package FileSystem;

import java.util.HashMap;

public class File extends Node{


    String content ;
    public File(boolean isFile, StringBuilder content, HashMap<String, Node> hm) {
        super(isFile, content, hm);
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
