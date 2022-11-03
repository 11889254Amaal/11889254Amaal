
public class CalculateFibonaci {
	int i;
	int n1=1;
	int n2=2;
    int n3;
	public int calFibonaci(int count) {
		System.out.print(n1+"  " + n2);
	for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
	{

	     n3 = n1 + n2;
		if (n3 <= 100) {
			System.out.print(" " + n3+"  ");
			n1 = n2;
			n2 = n3;
		}
	}
	return count;
	}
	
}
