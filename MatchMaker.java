
import java.util.*;
import java.io.*;
public class MatchMaker {

    public static Set<Marriage> generator(Set<Man> men, Set<Woman> women) {
        Set<Marriage> ans = new ArraySet<Marriage>();
        for (int i = 0; i < women.size(); i++) {
            Iterator itr = men.iterator();
            while (itr.hasNext()) {
                Man temp = ((Man) itr.next());
                for (int r = 0; r <= i; r++) {
                    if (temp.equals(temp.getWoman(i).getMan(r))) {
                        ans.add(new Marriage(temp, temp.getWoman(r)));
                    }
                }
            }
        }
        return ans;
    }
    
    public static Woman getWoman(String name, ArrayList<Woman> women){
      for (int i = 0; i < women.size(); i++){
        if (name.equals(women.get(i).getName()))
          return women.get(i);
      }
      System.out.println("error");
    return null;
    }
    
    public static Man getMan(String name, ArrayList<Man> men){
      for (int i = 0; i < men.size(); i++){
        if (name.equals(men.get(i).getName()))
          return men.get(i);
      }
      System.out.println("error");
      return null;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("data.txt"));
        ArrayList<Man> men = new ArrayList<Man>();
        ArrayList<Woman> women = new ArrayList<Woman>();
        int num_people = Integer.parseInt(f.readLine());
        StringTokenizer get_men = new StringTokenizer(f.readLine());
        StringTokenizer get_women = new StringTokenizer(f.readLine());
        while (get_men.hasMoreTokens()){
            men.add(new Man(get_men.nextToken()));
        }
        while (get_women.hasMoreTokens()){
            women.add(new Woman(get_women.nextToken()));
        }
        for (int i = 0; i < men.size(); i++){
            Man my_man = getMan(f.readLine(), men);
            ArrayList<Woman> pref = new ArrayList<Woman>();
            StringTokenizer st = new StringTokenizer(f.readLine());
            for (int q = 0; q < women.size(); q++){
                pref.add(getWoman(st.nextToken(), women));
            }
            my_man.setPartners(pref);
        }
        for (int i = 0; i < men.size(); i++){
            Woman my_woman = getWoman(f.readLine(), women);
            ArrayList<Man> pref = new ArrayList<Man>();
            StringTokenizer st = new StringTokenizer(f.readLine());
            for (int q = 0; q < men.size(); q++){
                pref.add(getMan(st.nextToken(), men));
            }
            my_woman.setPartners(pref);
        }
        ArraySet<Man> menset = new ArraySet<Man>();
        ArraySet<Woman> womenset = new ArraySet<Woman>();
        for (int i = 0; i < men.size(); i++){
          menset.add(men.get(i));
          womenset.add(women.get(i));
        }
        Iterator itr = generator(menset, womenset).iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
