public class Pokemon {

    int level;
    String name;

    Pokemon(int level, String name){

        this.level = level;
        this.name = name;
    }

    void UseMove(){
        System.out.println(name+ ", " + level + ", use tackle");
    }
    
    
}
