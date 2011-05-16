import java.util.*;

public class Woman extends Human{
  
  private final ArraySet<Man> PREF;
  private ArraySet<Man> _proposals;
  private Man partner;
  
  public Woman(String name, ArraySet<Man> pref){
    super(name);
    PREF = pref;
    partner = null;
    _proposals = null;
  }
  public boolean isMarried(){
    return partner != null;
  }
  public void setPartner(Man x){
    partner = x;
  }
  
  public ArraySet<Man> getPref(){
    return PREF;
  }
  
  public ArraySet<Man> getProp(){
    return _proposals;
  }
  
  public void addProp(Man man){
    _proposals.add(man);
  }
  
  public void removeProp(Man man){
    _proposals.remove(getRankOfMan(man));
  }
  
  public int numProp(){
    return _proposals.size();
  }
  
  // Rank "O" is top rank
  // O(n)
  public int getRankofMan(Man man){
    int i = 0;
    Iterator itr = PREF.iterator();
    while (itr.hasNext()){
      if (itr.Next().equals(man))
        return i;
      else
        i++;
    }
    return - 1;
  }
}