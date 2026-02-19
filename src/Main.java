//class PartyAffiliation
//	main()
//		String party
//		output “Please select your party [D, R, I]”
//		input party
//		if party == D then
//			output “You get a Democrat Donkey!”
//		else if party == R then
//			output “You get a Republican Elephant!”
//		else if party == I then
//			output “You get an Independent Man!”
//		else
//			output “You have not entered a proper value:” + party
//		endIf
//	return
//endClass

import java.util.Scanner;
public class Main{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        String party = "";
        double trash = 0;

        System.out.println("Please select your party: [D, R, I]");

        if(in.hasNextLine())
        {
            party = in.nextLine();

            if(party.equals("D"))
            {
                System.out.println("You get a Democratic Donkey!");
            }
            else if(party.equals("R"))
            {
                System.out.println("You get a Republican Elephant!");
            }
            else if(party.equals("I"))
            {
                System.out.println("You get an Independent Man!");
            }
            else
            {
                System.out.println("You have not entered a proper value, please choose the mentioned options");
            }
        }
    }
}
