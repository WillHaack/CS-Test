import java.util.*;
import java.lang.Object.*;

public class Man extends Human{
  
  private final ArraySet<Woman> PREF;
  private Woman partner;
  
  public Man(String name, ArraySet<Woman> pref){
    super(name);
    PREF = pref;
    partner = null;
  }
  
  public boolean isMarried(){
    return partner != null;
  }
  
  public ArraySet<Woman> getPref(){
    return PREF;
  }
  
  public Woman getPartner(){
    return partner;
  }
  
  public void setPartner(Woman x){
    partner = x;
  }
  
  
  // Rank "O" is top rank
  // O(n)
  public int getRankof(Woman woman){
    int i = 0;
    Iterator itr = PREF.iterator();
    while (itr.hasNext()){
      if (itr.Next().equals(woman))
        return i;
      else
        i++;
    }
    return - 1;
  }
}

/*   
 Round 1
 Bob, MaryAnn   X     you set the man to their first pref. 
 Jack, MaryAnn        MaryAnn refects Bob
 Ping, Ginger  X
 
 Round 2
 Bob, Ginger          Bob goes to his 2nd choice
 
 Round 3
 Ping MaryAnn X          Ginger rejects Ping
 
 Roudn 4                   Ping goes to his 2nd choice
 Ping, Sarah  
 
 end: marriage is stable
 
 Names: 1,2,3....n
 */  