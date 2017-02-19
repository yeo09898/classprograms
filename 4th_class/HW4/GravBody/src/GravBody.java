import java.io.*;

public class GravBody {
private String[][] dat=new String[15][10];
	public static String readSmallFile(String path) throws IOException {
        File file = new File(path);
        if (!file.exists() || file.isDirectory()) {
            throw new FileNotFoundException();
        }
 
        BufferedReader br = new BufferedReader(new FileReader(file));
        String temp = null;
        StringBuffer sb = new StringBuffer();
        temp = br.readLine();
        for(int i=0;i<15;i++){
        	for(int j=0;j<=10;j++){
        		
        	}
        }
       // while (temp != null) {
         //   sb.append(temp + " ");
           // temp = br.readLine();
        //}
        br.close();
        return new String(sb.toString().getBytes("ascii"),"utf-8");
    }
	public static void main(String[] args) throws IOException{
		System.out.println(readSmallFile("c:\\solarsystem.dat"));
		
	}
}