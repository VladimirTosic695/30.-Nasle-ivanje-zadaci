package Stack;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		
		Krug k = new Krug(1);
		Pravougaonik p = new Pravougaonik(4, 5);
		
		Stack stack = new Stack();
		
		stack.push(k);
		stack.push(p);
		
		while(!stack.isEmpty())
		{
			Oblik o = (Oblik)stack.pop();
			System.out.println("Povrsina je " + o.uzmiPovrsinu());
		}
				

	}

}
