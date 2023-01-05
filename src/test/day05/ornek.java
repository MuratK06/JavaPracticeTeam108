package test.day05;

public class ornek {
    public static void main(String[] args) {

        String[] car = {"Mercedes", "AUDI", "BMW", "Volkswagen","Skoda"};
        String[][] model = {{"Maybach", "E200", "GLS", "S500"}, {"A1", "A2", "A3", "A4"}, {"3.20", "5.20", "5.30"},
                {"Passat", "Golf", "Cady"},{"Oktavia","SuperB"},
        };


        for (int i = 0; i < model.length ; i++) {
            System.out.println("====== "+car[i]+ " ======");

            for (int j = 0; j <model[i].length ; j++) {

                System.out.println("> "+model[i][j]);

            }

        }
    }
}


