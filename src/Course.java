public class Course {


    private Obstruction[] poolCourse = {new Obstruction("Knyaz"),
            new Obstruction("Solovei-razboinik"), new Obstruction("Wifes")};

    public void doIt(Team team){
        for (Runner courRunner:team.runners){
            int result = 0;
            for (Obstruction courObst:poolCourse){
                result += courObst.overcome(courRunner.getRunnerName());
            }
            courRunner.setTime(result);
        }
    }


}