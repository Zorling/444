import javafx.util.Pair;

import java.io.*;


public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }


    public static void save(String[] header, int[][] data) {  // метод для записи в csv
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(new File("c:\\java111\\NewData.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < header.length; i++) {
            builder.append(header[i] + ";");
        }
        builder.append('\n');
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                builder.append(data[i][j] + ";");
            }
            builder.append('\n');
        }

        pw.write(builder.toString());
        pw.close();


    }

    public static Pair<String[], int[][]> read() { // мето для чтения из csv

        String csvFile = "c:\\java111\\NewData.csv";
        BufferedReader br = null;
        String line;
        int numb;
        String cvsSplitBy = ";";
        String[] header = new String[0];
        int i = 0;
        int[][] data = new int[4][3];


        try {

            br = new BufferedReader(new FileReader(csvFile));
            header = br.readLine().split(cvsSplitBy);


            while ((line = br.readLine()) != null) {


                String[] header1 = line.split(cvsSplitBy);

                for (int j = 0; j < header1.length; j++) {
                    data[i][j] = Integer.parseInt(header1[j]);
                }
                i = i++;


            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }


        return new Pair<String[], int[][]>(header, data);
    }

}
