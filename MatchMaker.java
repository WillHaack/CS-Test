import java.util.*;

public class MatchMaker{
  
  private ArraySet<Man> men;
  private ArraySet<Woman> women;
  private ArraySet<Marriage> propMars;
  private ArraySet<Human> marriages;
  
  public MatchMaker(ArrayList<Man> x, ArraySet<Woman y){
    men = x;
    women = y;
    propMars = new ArraySet<Marraige>();
  }
  
   public void match(){
     int cycle = 0;
     while (! isDone()){
       for (Man m: men){
         if (! hasPartnerM(m)) {
           Woman current = m.getPref().get(cycle);
           propose(m, current);
         }
       }
       for (Woman w: women){
         womanDecision(w);
         if (w.numProp() > 0) {
           Man husband = w.getProp().get(0);
           w.setPartner(husband);
           marriages.add(w);
           marriages.add(husband);
         }
       }
       cycle++;
     }
   }
          
           
       
       
     }
   
   }
  
  
  // if woman has more than one proposals, she rejects all but the best
  private void womanDecision(Woman x){
    if (x.numProp() > 1){
      Man bestMan = x.getProp().get(0);
      int max = x.getRankOfMan(bestMan);
      
      for (Man m: x.getProp()){
        if (x.getRankOfMan(m) < max){
          bestMan = m;
          max = x.getRankOfMan(bestMan);
        }
        else {
          reject(x, m);
        }
      }
    }
  }
  
  // see if match making process is done
  private boolean isDone(){
    boolean ans = true;
    for (Man x: men)
      if (! x.isMarried()) return false;
    
    return ans;
  }
  
  
// Woman x rejects Man y
  private void reject(Woman x, Man y){
    y.setPartner(null);
    x.removeProp(y);
    propMars.remove(getPosOfMarriage(y, x));
  }
  
// gets position of the marriage of man x and woman y in the temp array
  private int getPosOfMarriage(Man x, Woman y){
    int ans = 0;
    for (Marriage mar: temp){
      if (mar.getWife().equals(y) && mar.getHusband().equals(x))
        return ans;
      else ans++;
    }
    return -1;
  }
  
  // Man x proposes to Woman y. 
  private void propose(Man m, Woman w){
    m.setPartner(w);
    w.addProp(m);
    propMars.add(new Marriage(m, w));
  }
  
  // returns true is Man x has a partner
  private boolean hasPartnerM(Man x){
    return x.isMarried();
  }
  
  //returns true if Woman x has a partner
  private boolean hasPartnerF(Woman x){
    return x.isMarried();
  }
  
 
}