class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }

}

class ArrayLength {
    public ArrayLength(Integer i) throws MyArraySizeException {
        if (i == 4) {
            return;
        } else {
            throw new MyArraySizeException(
                    "Длинна массива должна быть 4, а по факту  " + i);
        }
    }


}

class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(String message) {
        super(message);
    }

}

class DataException {

    public static int DataException(String a, int i, int j) throws MyArrayDataException {
        int num = 0;

        try {
            num = Integer.parseInt(a);


        } catch (NumberFormatException exp) {
            throw new MyArrayDataException("Ошибка преобразования ячейки. Не корректное значение: " + a + " в строке " + i + " столбеце " + j);


        }
        return (num);

    }

}


