import java.util.*;

public class Man {

    private String name;
    private ArrayList<Woman> partners;
    
    public Man(String name){
        this.name = name;
        partners = new ArrayList<Woman>();
    }
    
    public String toString(){
        return name;
    }
    
    public void setPartners(ArrayList<Woman> partners){
        this.partners = partners;
    }
    
    public Man(String name, ArrayList<Woman> list) {
        this.name = name;
        partners = list;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object other) {
        return getName().equals(((Man) other).getName());
    }
    
    public Woman getWoman(int i){
        return partners.get(i);
    }
    
    public int compareTo(Object other){
        return getName().compareTo(((Man)other).getName());
    }
    
    public void addWoman(Woman w){
        partners.add(w);
    }
}