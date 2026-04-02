package FileSystem;

import java.util.HashMap;
public class Node {
    boolean isFile;
    StringBuilder content;
    HashMap<String , Node> hm ;
    public Node(boolean isFile, StringBuilder content, HashMap<String, Node> hm) {
        this.isFile = isFile;
        this.content = content;
        this.hm = hm;
    }

    public Node() {
        this.isFile = false;
        this.content = new StringBuilder();
        this.hm = new HashMap<String, Node>();
    }


}
