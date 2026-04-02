package FileSystem;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    Node root ;

    public FileSystem() {
        this.root = new Node();
    }

    public void mkdir(String path){
        Node root1 = root ;
        String st[] = path.split("/");

        for(int i = 1;i<st.length ;i++){
            root1.hm.putIfAbsent(st[i] , new Node());
            root1 = root1.hm.get(st[i]);
        }


    }
  public  List<String> ls(String path){
        Node root1 = root ;
List<String> al = new ArrayList<>();

        String st[] = path.split("/");
        if(!path.equals("/")){
        for(int i = 1;i<st.length ;i++){
            root1 = root1.hm.get(st[i]);
            }
        if(root1.isFile){
                al.add(st[st.length-1]);
                return al ;
            }
        }
        al.addAll(root1.hm.keySet());
        return al ;

    }
    public   void addContentToFile(String path , String content){
        Node root1 = root ;
        String st[] = path.split("/");
        for(int i = 1;i<st.length ;i++) {
         root1.hm.putIfAbsent(st[i] , new Node());
            root1 = root1.hm.get(st[i]);

        }
        root1.content.append(content);
        root1.isFile = true ;
    }
  public   String readContentToFile(String path){
        Node root1 = root ;
        String st[] = path.split("/");
        for(int i = 1;i<st.length ;i++){
            root1 = root1.hm.get(st[i]);
        }
       return root1.content.toString();
    }

}