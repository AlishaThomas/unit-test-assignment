import java.util.Random;
import com.google.common.annotations.VisibleForTesting;

public class TestDemo {
	
	
	public int addPositive(int x, int y) {
		if(x <= 0 || y <= 0) {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}else {
			return x + y;
		}
	}
	
	@VisibleForTesting
	public int randomNumberSquared() {
		return getRandomInt() * getRandomInt();
	}
	@VisibleForTesting
	int getRandomInt() {
		  Random random = new Random();
		  return random.nextInt(10) + 1;
		}

	
}