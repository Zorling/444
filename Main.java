public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] myArray = new String[4][6]; //массив на вход
        myArray[0][1] = "5";
        workArray(myArray);


    }

    //метод, который обрабатывает массив
    public static void workArray(String[][] a) throws MyArraySizeException, MyArrayDataException {

        //Проверка размерности массива
        try {
            int i = a.length;
            new ArrayLength(i);

            for (int j = 0; j < i; j++) {
                new ArrayLength(a[j].length);
            }
        } catch (MyArraySizeException ex) {
            System.err.println(ex);
        }
        //Проверка преобразования и вывод суммы успешно преобразованных чисел в массиве
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                try {
                    sum = sum + DataException.DataException(a[i][j], i, j);
                } catch (MyArrayDataException exp) {
                    System.err.println(exp);
                }


            }
        }
        System.out.println("Сумма чисел в массиве: " + sum);


    }


}
