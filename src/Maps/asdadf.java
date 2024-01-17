package Maps;

import java.util.List;
import java.util.Scanner;

public class asdadf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		Dynarr<String>stringArr = new Dynarr<>();
		int n = Integer.parseInt(inp.nextLine());
		String info = inp.nextLine();
		int count = 0;
		while(!info.equals("end")){
			stringArr.add(info);
			if(info.length()==n)count++;
			info = inp.nextLine();
			
		}
		
	    System.out.println(stringArr.delEl()+"\n"+stringArr.toString());
		System.out.println(count);
			
		
	}

}

