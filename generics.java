import java.io.File;
import java.util.*;
import java.util.ArrayList;
public class CreateFile {
    public static void main(String[] args)
    {
        File obj = new File("myfile.txt");
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(54);
        arrayList.add(643);
        
        System.out.println(arrayList);
    }
}
    
