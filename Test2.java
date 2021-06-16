class GStack<T>	{
	int tos;
	Object[] st;
	public GStack() {
		tos = 0;
		st = new Object[5];
	}
	public void push(T item) {
		if(tos == 5)
			return;
		st[tos] = item;
		tos++;
	}
	public T pop() {
		if(tos == 0)
			return null;
		tos--;
		return (T)st[tos];
	}
	public boolean isEmpty() {
		if(tos == 0)
			return true;
		else
			return false;
	}
}
public class Test2 {

	public static void main(String[] args) {
		String city;
		GStack<String> stringStack = new GStack<>();
		stringStack.push("ulsan");
		stringStack.push("busan");
		stringStack.push("seoul");
		do {
			city = stringStack.pop();
			if(city == null) break;
			System.out.print(city + " ");
		}
		while(true);
		System.out.print("\n");
	
		GStack<Integer> iStack = new GStack<>();
		iStack.push(100);
		iStack.push(200);
		iStack.push(150);
		int i;
		while(!iStack.isEmpty()) {
			i = iStack.pop();
			System.out.print(i+ " 	");
		}
		System.out.print("\n");
	}
}