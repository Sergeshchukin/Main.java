public class Obstruction {
    public String obstactionName;
    private static final int obstactionTime = 2;


    public Obstruction(String obstactionName){
        this.obstactionName = obstactionName;


    }

    public int overcome(String name){
        return name.length() * obstactionTime;
    }
}