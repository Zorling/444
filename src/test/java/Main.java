import okhttp3.*;

import java.io.IOException;


public class Main {


    public static void main(String[] args) {

        Get test = new Get();



        try {
            String te123 = test.run("http://dataservice.accuweather.com/currentconditions/v1/295212?apikey=n5rQ41Wd2l97Vsqxi5f94HNvKkYgFoEZ&language=ru&metric=true");
            System.out.println("Погода в Санкт-Петербурге");

            String[] splitWord = te123.split(",");
            for (String word : splitWord) {

                System.out.println(word);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("______________________________________");

        try {
            String te123 = test.run("http://dataservice.accuweather.com/forecasts/v1/daily/5day/294021?apikey=n5rQ41Wd2l97Vsqxi5f94HNvKkYgFoEZ&language=ru&metric=true");
            System.out.println("Погода в Москве на 5 дней ");

            String[] splitWord = te123.split(",");
            for (String word : splitWord) {

                System.out.println(word);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("______________________________________");


    }

    public static class Get {
        OkHttpClient client = new OkHttpClient();

        String run(String url) throws IOException {
            okhttp3.Request request = new okhttp3.Request.Builder()
                    .url(url)
                    .build();

            Response response = client.newCall(request).execute();
            return response.body().string();
        }


    }
}
