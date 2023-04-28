package L29_Greedy_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Imp_T6_Job_Sequencing_Problem {

    public static void jobSequencingProblem(int[] deadline, int[] profit) {
        int[][] job = new int[deadline.length][3];

        // Col1- Index
        // Col2- Profit
        // Col3- Deadline
        for (int i = 0; i < job.length; i++) {
            job[i][0] = i;
            job[i][1] = profit[i];
            job[i][2] = deadline[i];
        }
        Arrays.sort(job, Comparator.comparingDouble(o->o[1]));

        int totalProfit=0;
        int time=1;
        ArrayList <Integer> ans= new ArrayList<>();

        for (int i = job.length-1; i >= 0; i--) {
            int idx= job[i][0];
            if(time<= deadline[idx]){
                ans.add(job[i][0]);
                totalProfit+=job[i][1];
                time++;
            }
        }

        System.out.println("Total Profit that can be Made is "+ totalProfit);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print((char)(ans.get(i)+'A')+ " ");
            
        }

    }

    public static void main(String[] args) {
        // Given an array of jobs where every job has a deadline and profit if the job
        // is finished before the deadline. It is also given that every job takes a
        // single unit of time, so the minimum possible deadline for any job is 1.
        // Maximize the total profit if only one job can be scheduled at a time.

        // int [] deadline= {4,1,1,1};
        // int [] profit= {20,10,40,30};
        int [] deadline= {2,2,1,3,3};
        int [] profit= {20,15,10,5,1};
        // int [] deadline= {3,4,4,2,3,1,2};
        // int [] profit= {35,30,25,20,15,12,5};

        jobSequencingProblem(deadline, profit);


    }

}
