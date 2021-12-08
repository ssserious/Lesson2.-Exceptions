public class MyArrayDataException extends Exception {
    public int x;
    public int y;

    MyArrayDataException(int x, int y) {
        this.x = x;
        this.y = y;
	}

public class MyArraySizeException extends Exception {
//    MyArraySizeException(String msg) {
//        super(msg);
}
}

