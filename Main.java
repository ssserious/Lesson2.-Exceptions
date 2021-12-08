//* Java Core. Lesson 2
//*@author Sergey Sergeev
//*@version 08.12.2021



public class Main {

    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.x + "x" + e.y);
        }

    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int x = 0; x < arr.length; x++) {
            if (arr[x].length != 4) {
                throw new MyArraySizeException();
            }
            for (int y = 0; y < arr[x].length; y++) {
                try {
                    count = count + Integer.parseInt(arr[x][y]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(x, y);
                }
            }

        }
        return count;
    }

}