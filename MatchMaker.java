import java.util.*;
import java.io.*;

public class MatchMaker {
    private ArrayList<Man> men;
    private ArrayList<Woman> women;
    
    public MatchMaker(){
        men = new ArrayList<Man>();
        women = new ArrayList<women>();
    }
    
    
    
    public static void main(String[] args) throws IOExceptoin{
        BufferedReader f = new BufferedReader(new FileReader("data.txt"));
        int num_people = Integer.parseInt(f.readLine());
        for (int i = 0; i < num_people; i++){
            String name = f.readLine();
            String[] suitorArray = f.readLine().split(" ");
	    ArrayList<String> suitorArrayList =  new ArrayList(Arrays.asList(suitorArray));
            
        }
    }
}
