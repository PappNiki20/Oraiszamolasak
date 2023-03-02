package Ciklusok;

import java.util.Scanner;

public class Szamok {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ismétléssel, vagy ismétlés nélkül kéri? (igen, nem)");
        String valasz = sc.nextLine();
       String eredmeny = valasz;
        if (eredmeny == "igen") {
            for (int i = 2; i < 4; i++) {
                for (int a = 2; a < 4; a++) {
                    for (int j = 2; j < 4; j++) {
                        System.out.println(i + "" + a + "" + j);

                    }
                }
            }

        } else if(eredmeny == "nem"){
            for (int i = 2; i < 4; i++) {
                for (int a = 2; a < 4; a++) {
                    for (int j = 2; j < 4; j++) {
                        if(i!=a && i!=j || a!=i && a!=j || j!=i && j !=a){
                            System.out.println(i + "" + a + "" + j);
                        }
                        

                    }
                }
            }
        }

    }
}
