import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class FileMenu {

    public ArrayDeque <String> words;
    public ArrayList <String> line;
    public static void newFile() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter New File Name : ");
        String name = sc.next();
        File f1 = new File(name);
        
        if(f1.exists()) {
            System.out.println("\n**File Already Exists!!**");
            while(true) {
                System.out.println("\n[1] Open Existing File \n[2] Create New File");
                System.out.print("Enter Choice : ");
                int ch = sc.nextInt();
                System.out.println();
                if(ch == 1) {
                    openFile(name);
                    return;
                } else if(ch == 2) {
                    newFile();
                    break;
                } else {
                    System.out.println("Enter Valid Option...");
                }
            }
        }
        else {
            f1.createNewFile();
            openFile(name);
            System.out.println("File Created Successfully");
        }
    }

    public static void openFile(String name) throws Exception{
        ArrayDeque <String> words=new ArrayDeque<>();
        ArrayList <String> line=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        File f2 = new File(name);
        BufferedReader br = new BufferedReader(new FileReader(f2));
        if(f2.exists()) {
            String s;
            System.out.println();
            while((s = br.readLine()) != null){
                String[] str=s.split(" ");
                for (String st : str) {
                    if(st.endsWith(".")){
                        words.add(st.substring(0, st.length()-1));
                        words.add(".");
                    }
                    else{
                        words.add(st);
                    }
                }
                line.add(s);
                System.out.println(s);
            }
            br.close();
            boolean flag=true;
            while (flag) {
                String newText = sc.nextLine();
                if(!newText.equals("!!!")){
                    line.add(newText);
                    String[] str1=newText.split(" ");
                    for (String st : str1) {
                        if(st.endsWith(".")){
                            words.add(st.substring(0, st.length()-1));
                            words.add(".");
                        }
                        else{
                            words.add(st);
                        }
                    }
                }
                else
                    flag=false;
            }
        }
        else{
            System.out.println("File not exist!\n[1] new file?\t[2] open existing file");
            int num=sc.nextInt();
            if(num==1){
                newFile();
            }
            else if(num==2){
                System.out.println("Enter file name: ");
                sc.nextLine();
                String nm=sc.next();
                openFile(nm);
            }
            else{
                System.out.println("Enter correct option!");
            }
        }
    }

    public ArrayDeque<String> getWords() {
        return words;
    }

    
}
