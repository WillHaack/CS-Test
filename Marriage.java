import java.util.*;
public class Marriage implements Comparable {
    private Man guy;
    private Woman girl;
    
    public Marriage(Man dude, Woman chick){
        guy = dude;
        girl = chick;
    }
    
    public String toString(){
        return guy.getName() + " " + girl.getName();
    }
    
    public int compareTo(Object other){
        if (getMan().equals(((Marriage)other).getMan()) || getWoman().equals(((Marriage)other).getWoman()))
            return 0;
        return 1;
    }
    
    public Man getMan(){
        return guy;
    }
    
    public Woman getWoman(){
        return girl;
    }
    
    public boolean equals(Object other){
        return getMan().equals(((Marriage)other).getMan()) || getWoman().equals(((Marriage)other).getWoman());
    }
    
    
    
}
