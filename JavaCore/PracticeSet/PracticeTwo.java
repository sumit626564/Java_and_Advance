package JavaCore.PracticeSet;

import java.util.Scanner;

class Monopoly{
    private int profitsP, companyA;
    private int profitsQ, companyB;
    private int profitsR, companyC;
    private int profitsS, companyD;

   // private int companyA;
   // private int companyB;
   // private int companyC;
   // private int companyD;

    public void Profits(int profitsA, int profitsB, int profitsC, int profitsD){
        this.profitsP = profitsA;
        this.profitsQ = profitsB;
        this.profitsR = profitsC;
        this.profitsS = profitsD;
    }

    public void ProfitCalculation(){
        companyA = profitsQ + profitsR + profitsS;
        companyB = profitsP + profitsR + profitsS;
        companyC = profitsP + profitsQ + profitsS;
        companyD = profitsP + profitsQ + profitsR;
    }
    public String DataReleased(){
        if (profitsP > companyA || profitsQ > companyB || profitsR > companyC || profitsS > companyD) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

public class PracticeTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter of your A Company Profits: ");
        int profitsA = input.nextInt();
        System.out.print("Enter of your B Company Profits: ");
        int profitsB = input.nextInt();
        System.out.print("Enter of your C Company Profits: ");
        int profitsC = input.nextInt();
        System.out.print("Enter of your D Company Profits: ");
        int profitsD = input.nextInt();
        
        Monopoly mn = new Monopoly();
        mn.Profits(profitsA, profitsB, profitsC, profitsD);
        mn.ProfitCalculation();
        System.out.println(mn.DataReleased());
        input.close();
    }
}
<<<<<<< HEAD
=======

>>>>>>> 6987044 (Initial System Update)
