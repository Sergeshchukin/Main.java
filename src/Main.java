public class Main {

        public static void main(String[] args) {
            Course c = new Course(); 
            Team team = new Team("Bogatiri"); 
            c.doIt(team); 
            team.showResults(); 
        }

}