package Lab7_3;

public interface Cache {
	//shouldn't be static
	public default long timeout() {
		//seconds
		return 1;
	}
}
