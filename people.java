public class people extends obj{

    String Gender;
    Integer Age;
    Integer Score;
    String Name;

    people(String g,Integer a, Float h,Float w){
        super(h,w);
        this.Gender=g;
        this.Age=a;
    }

    public String whatsGender(){
        return Gender;
    }

    public void setScore(Integer s){
        Score=s;
    }
    
    public Integer myScore(){
        return Score;
    }

    public void setName(String n){
        Name=n;
    }

    public String myName(){
        return Name;
    }
}
