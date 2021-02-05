

public class Main {




    public static void main(String[] args) {
        Actions[] actions = new Actions[3];
        actions[0] = new  Cat("Вася", 1000,10);
        actions[1] = new Robot("Федор", 30, 5);
        actions[2] = new Human("Шварц", 10000, 500);
        Prep[] preps1 = new  Prep[2];
        preps1[0] = new Road("Дорожка 1", 100);
        preps1[1] = new Jump("Стена 1", 10);


        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < preps1.length; j++) {


                result = preps1[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Прошел в следующий тур");
            } else {
                System.out.println("Позорно проиграл");
            }
        }







    }
    public interface Actions {
        void run();

        void jump();

        int getRunDistance();

        int getJumpHeight();
    }



}



