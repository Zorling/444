
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        AppData appData = new AppData(new String[]{"Value 1", "Value 2", "Value 3"}, new int[][]{{100, 200, 123}, {300, 400, 500}}); // создали объект
        AppData.save(appData.getHeader(), appData.getData()); //вызвали метод для записи в csv
        System.out.println("Данные записаны!");
        String[] i = Arrays.copyOf(AppData.read().getKey(), AppData.read().getKey().length); // вызвали метод чтения из csv
        int[][] k = AppData.read().getValue(); // вызвали метод чтения из csv


        AppData appData1 = new AppData((i), (k)); // присвоили значения из файла csv новому объекту
        System.out.println("Данные прочитаны!");


    }


}
