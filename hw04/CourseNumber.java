//////////////////////////////////////////////////////////////
//Fritz Isaac
//
//Course Number Program
//program will receive 6-digit number and print year and semester

    import java.util.Scanner; //import Scanner

    public class CourseNumber{
    public static void main (String[] args){
    
    Scanner myScanner; //declare instance of scanner
    myScanner = new Scanner(System.in);
    
    System.out.print("Enter a six digit number giving the course semester-"); //prompt input
    
    int courseN = myScanner.nextInt(); //define input as the course code
    
    if (Integer.toString(courseN).length() > 6) { 
        System.out.println("You did not enter a six-digit number."); //tell user they messed up
    }
    else if (courseN < 186510 || courseN > 201440) {
        System.out.println("You did not enter a valid course code."); //tell user they messed up
    } 
    
    else {
            String courseYear = Integer.toString(courseN).substring(0, 4); //defines first four digits of code as course year
            String courseSemester = Integer.toString(courseN).substring(4, 6); //defines last two digits of code as course semester
            switch (courseSemester) { 
                case "10":
                    System.out.println("The course was offered in the Spring semester of " + courseYear);
                    break;
                case "20":
                    System.out.println("The course was offered in the Summer 1 semster of " + courseYear);
                    break;
                case "30":
                    System.out.println("The course was offered in the Summer 2 semester of " + courseYear);
                    break;
                case "40":
                    System.out.println("The course was offered in the Fall semester of " + courseYear);
                    break;
                default:
                    System.err.println(courseSemester + " is not a legitimate semester.");
    }
    
    }
    
    }
        
    }