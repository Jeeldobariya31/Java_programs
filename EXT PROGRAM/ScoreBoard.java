import java.util.Scanner;

public class ScoreBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("#->RULES");
        System.out.println("NUMBER I: Enter (-10) for wicket");
        System.out.println("NUMBER II: Enter (-20) for wide ball");
        System.out.println("NUMBER II: Enter (-30) for noball");
        System.out.println("Enter no ball run manually:");
        System.out.println("This code only accepts wicket and wide ball negative codes. Do not enter negative runs; if you do, the loop will break.");

        String[] team = new String[2];
        System.out.println("Enter team 1 Name:");
        team[0] = sc.nextLine();
        System.out.println("Enter team 2 Name:");
        team[1] = sc.nextLine();
        //prin team name 
        System.out.println("team 1 is" + team[0]);
        System.out.println("team 2 is" + team[1]);
        // scan over
        System.out.println("enter total over of match");
        int over = sc.nextInt();
         // make array
        int[][][] score = new int[2][over][]; 
        int i, j, k;
        //scan run

        for (i = 0; i < score.length; i++) {
            for (j = 0; j < score[i].length; j++) {
                System.out.println("Enter number of balls in over " + (j + 1) + " for team " + (i + 1) + ":");
                int balls = sc.nextInt();
                score[i][j] = new int[balls]; // Initialize balls for the over

                for (k = 0; k < balls; k++) {
                    System.out.println("Enter score for over " + (j + 1) + ", ball " + (k + 1) + ":");
                    int input = sc.nextInt();
                    if (input < -30 || input < -20 && input > -30 || input < -10 && input > -20
                            || input < 0 && input > -10) 
                            {// cheak output valid or invalied
                        System.out.println("Invalid input! Exiting...");
                        System.out.println("re-enter  true input ");
                        k--;// give new chance which replace invalied input 
                    }
                    score[i][j][k] = input;
                }
            }
        }

        // Calculate scores for both teams
        int[] total = new int[2];
        int[] wickets = new int[2];
        int[] noball = new int[2];
        int[] extra = new int[2];

        for (i = 0; i < score.length; i++) {
            for (j = 0; j < score[i].length; j++) {
                for (k = 0; k < score[i][j].length; k++) {
                    if (score[i][j][k] >= 0) {
                        total[i] += score[i][j][k];
                    } else if (score[i][j][k] == -10) {
                        wickets[i]++;
                    } else if (score[i][j][k] == -30) {
                        total[i] += 1; // no ball adds 1 run
                        noball[i]++;
                        extra[i]++;
                    }

                    else if (score[i][j][k] == -20) {
                        total[i] += 1; // Wide ball adds 1 run
                        extra[i]++;
                    }

                }
            }
        }

        // Print scores
        System.out.println(team[0] + " score is: " + total[0] + "/" + wickets[0] + "( over=" + over + ")" + "(extra="
                + extra[0] + ")" + "(noball=" + noball[0] + ")");
        System.out.println(team[1] + " score is: " + total[1] + "/" + wickets[1] + "( over=" + over + ")" + "(extra="
                + extra[1] + ")" + "(noball=" + noball[1] + ")");
         //winner team cheaking
        if (total[0] > total[1]) {
            int wr = total[0] - total[1];
            if(wr==1){
            int wonwicket=10-wickets[0];
            System.out.println(team[0] + " IS WON THE MATCH BY " + wonwicket + "WICKET");
            }
            else{
            System.out.println(team[0] + " IS WON THE MATCH BY " + wr + "RUN");
            }
        }
         else if (total[0] < total[1]) {
            int wr=total[1] - total[0];
            if(wr==1){
                int wonwicket=10-wickets[1];
                System.out.println(team[0] + " IS WON THE MATCH BY " + wonwicket + "WICKET");
                }
                else{
                System.out.println(team[0] + " IS WON THE MATCH BY " + wr + "RUN");
                }
            } 
        else {
            System.out.println("MATCH IS DRAWN");
        }

    }
}
