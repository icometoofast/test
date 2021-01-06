package bianyiyuanli;

import java.io.*;

public class lianxi21 {
    public static void main(String[] args) throws IOException {
        yuchuli();
    }
    public static void yuchuli() throws IOException {

        File file = new File("src/bianyiyuanli/21"); //path是文件所在位置
        Reader reader = new FileReader(file);
        int len = reader.read();
        boolean zs = false;
        while(len != -1){
            char c = (char)len;
            if (c == '{'){
                zs = true; //是注释，不打印
            }
            if(c ==0x9||c ==0xa){
                c = 0x20;
            }
            if(c == '}'){
                zs = false;
                len = reader.read();
                c = (char)len;
            }
            print(zs,c);
            len = reader.read();

        }
    }
    public static void print(boolean zs, char c){
        if(zs != true){
            System.out.print(c);
        }
    }
}
