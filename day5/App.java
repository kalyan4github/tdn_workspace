import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    Movie movie = new Movie();

    //Input from user
    public void inputUser() {

        int choice;
        boolean flag=true;
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Enter your Choice:");
            System.out.println("1. Movie Id");
            System.out.println("2. Movie Name");
            System.out.println("3. Movie Details");
            System.out.println("4. Exit");

            try {
                choice=Integer.parseInt(bReader.readLine());                

                switch (choice) {
                    case 1:
                        System.out.println("Enter Movie id"); 
                        movie.setId(Integer.parseInt(bReader.readLine()));
                        break;
                    case 2:
                        System.out.println("Enter MOvie Name");
                        movie.setMovieName(bReader.readLine());
                        break;
                    case 3:
                        System.out.println("Enter MOvie Details");
                        movie.setMovieDetails(bReader.readLine());
                        break;
                    case 4:
                        choice=false;
                        break;
                    default:
                        System.out.println("Enter correct option");
                        break;
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
            
        } while (flag);
        
        

    }
    public void displayMovie() {
        //display Movie Details
        System.out.println("Movie ID: "+movie.getId());
        System.out.println("Movie Name: "+movie.getMovieName());
        System.out.println("Movie Details: "+movie.getMovieDetails());
    }

    public static void main(String[] args) {
        
        App app = new App();
        app.inputUser();
        app.displayMovie();
        
        
        
    }
}