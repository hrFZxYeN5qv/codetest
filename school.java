

public class school {


    public static void main(String[] arg){
        boy andy=new boy("bull",12,(float)100.0,(float)35.3);
        andy.getHight();
        andy.setName("andy");

        girl mary=new girl("babi",13,(float)99.3,(float)25);
        mary.setName("mary");

        System.out.println("I like "+ mary.like());
        System.out.print(String.format("What is mary`s gender? %s\n",mary.whatsGender()));
        mary.setScore(80);
        andy.setScore(70);
        System.out.println(String.format("andy's score is %s \n",andy.myScore()));

        dog pipi=new dog(50,10,"yellow");
        cat mimi=new cat();
        Pet p=mimi;
        p=pipi;
        andy.givePet(p);
        p.Name("pipi");

        System.out.println(String.format("Andy`s pet name is %s ",p.Name()));
        System.out.println(String.format("Mimi`s pet name is %s ",mimi.Name()));


    }
}
