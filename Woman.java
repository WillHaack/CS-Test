import java.util.*;

public class Woman {

    private String name;
    private ArrayList<Man> partners;

    public Woman(String name){
        this.name = name;
        partners = new ArrayList<Man>();
    }
    
    public void addMan(Man man){
            partners.add(man);
    }
    
    public String toString(){
        return name;
    }
    
    public void setPartners(ArrayList<Man> partners){
        this.partners = partners;
    }
    
    public Woman(String name, ArrayList<Man> list) {
        this.name = name;
        partners = list;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object other) {
        return getName().equals(((Woman) other).getName());
    }
    
    public Man getMan(int i){
        return partners.get(i);
    }
    
    public int compareTo(Object other){
        return getName().compareTo(((Woman)other).getName());
    }
    
}