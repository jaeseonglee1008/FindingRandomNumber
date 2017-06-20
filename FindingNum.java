import javax.swing.*;

class FindingNum{
	public static void main(String[] args){
		int answer =(int)(Math.random()*100);
		int input = 0;
		String temp ="";
		int count =0;
		

		do{
			count ++;
			temp =JOptionPane.showInputDialog("input a value between 1 to 100. put -1 to terminate");
			if(temp==null || temp.equals("-1")) break;
			//if input value is null or -1, exit(0);

			System.out.println("your input value : " +temp);
			input =Integer.parseInt(temp);//converting the String type input value to integer

			if(answer>input)
				{System.out.println("Type bigger number");}
			else if(answer<input)
				{System.out.println("Type smaller number");}
			else 
				{System.out.println("You got it!!");
				System.out.println("Your number of attempts :"+count);
				break;
			}

		}
		while(true);//infinit loop til the user get the right val
	}
}
