import java.util.*;
public class CalculateFactrial {
	
	public int extraLongFactorials(int facNumber) {
		
		if (facNumber == 0) {
			return 1;
		} else {
			return (facNumber * extraLongFactorials(facNumber - 1));
		}
	}

   

}
