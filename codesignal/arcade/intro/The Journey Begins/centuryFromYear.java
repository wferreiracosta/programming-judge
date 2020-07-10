/**
 * centuryFromYear
 */
public class centuryFromYear {

    public static void main(String[] args) {
        
    }

    int centuryFromYearJudge(int year) {
        if (year % 100 == 0)
            return year/100;
        else
            return Math.round(year/100)+1;
    }
}