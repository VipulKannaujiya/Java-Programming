//import java.util.Scanner;

public class VideoViews {
    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("             Video Views & Engagement Analytics              ");
        System.out.println("=============================================================");
        // TASK 1 ===================================================================================
        //Scanner input = new Scanner(System.in);
        int[] dailyViews = {1200, 4500, 3200, 8900, 1500, 6700, 9100};
        for(int i = dailyViews.length; i>0; i--){
            System.out.printf("Day %d : %d views\n", i, dailyViews[i-1]);
        }

        // TASK 2 ===================================================================================

        int viral_day_count = 0;
        int not_viral_day_count = 0;
        for(int i = dailyViews.length; i>0; i--){
            if (dailyViews[i-1] > 5000) {
                //System.out.println("YOUR VIDEO IS HIGH PERFORMING.....");
                viral_day_count += 1;
            }
            else if (dailyViews[i-1] < 5000) {
                //System.out.println("YOUR VIDEO IS LOW PERFORMING......");
                not_viral_day_count += 1;
            }
        }

        System.err.println(viral_day_count + " DAYS VIRAL PERFORMANCE...");
        System.err.println(not_viral_day_count + " DAYS NOT VIRAL PERFORMANCE...");


        // TASK 3 ===================================================================================
        int max_view = dailyViews[0];
        int peakDay = 1;
        for(int i=dailyViews.length; i>0; i--)
        {
            if (dailyViews[i-1] > max_view) {
                max_view = dailyViews[i-1];
                peakDay = i;
            }
        }
        System.out.println("🔥 Peak Views: " + max_view + " on Day " + peakDay);
    }
}
