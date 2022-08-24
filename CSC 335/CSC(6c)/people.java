/* *
 * @author (Alvis)
 * @version (8/7/'23)
 */

public class people
{
    private int tm;
    private boolean tchr;
    private boolean std;
    //private String tchr;

    /**
     * Constructor for objects of class people
     */ 
    public people(boolean Student, int Time, boolean teacher)
    {
        this.tm = Time;
        this.std = Student;
        this.tchr = teacher;

    }
    public void result(){
        
        
        System.out.println("At the "+this.tm+"min(s) "+this.std+" student arrived");
        
        System.out.println(" ");
        
        System.out.println("At the "+this.tm+"min(s) "+this.tchr+" teacher arrived");
        
        System.out.println(" ");

    }
}
