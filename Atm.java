import java.sql.SQLOutput;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        // kullanıcının şifre kullanıcı adı, 3 defa yanlış girerse bloke,
        // banka hesabı para yatırma , para çekme, çıkış yapma

        Scanner entry = new Scanner(System.in);
        String m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14;
        int budget = 100,calculator,idNumber,password,user1IdNumber = 123567438, user1Password = 98989599,counter = 0,operator,amount;
        boolean check1;


        m1 = "Welcome to c bank. Please enter your Id Number : ";
        m2 = "Please re-enter your Id Number : ";
        m3 = "Please enter your password : ";
        m4 = "Wrong username.Please try again in 5 minutes.";
        m5 = "Wrong password.Please try again in 5 minutes.";
        m6 = "Please re-enter your password : ";
        m7 = "Login successfull. Which action would you like to perform ?";
        m8 = "1: Query balance.\n2: Withdraw money.\n3: Deposit money.\n4: Log out.\nYour choice : ";
        m9 = "Your balance : ";
        m10 = "How much money you want to do withdraw ?\nAmount : ";
        m11 = "Your withdrawal succesfull.\nYour remaining balance : ";
        m12 = "How much money you want to deposit ?\nAmount : ";
        m13 = "Your deposit successfull.\nYour balance : ";
        m14 = "Successfully logged out.";

        System.out.print(m1);
        do {

            idNumber = entry.nextInt();
            counter ++;

            if (counter == 3){
                System.out.println(m4);
                break;
            }

            if (idNumber != user1IdNumber){
                System.out.print(m2);
            }
        }while (idNumber != user1IdNumber);

        counter = 0;

        // System.out.println();
        System.out.print(m3);
        do {

            password = entry.nextInt();
            counter ++;

            if (counter == 3){
                System.out.println(m5);
                break;
            }

            if (password != user1Password){
                System.out.print(m6);
            }
        }while (password != user1Password);

        if (idNumber == user1IdNumber){
            if (password == user1Password){
                System.out.print(m7 + "\n" + m8);

                operator = entry.nextInt();
                switch (operator){
                    case 1:
                        System.out.print(m9 + budget);
                        break;
                    case 2:
                        System.out.print(m9 + budget + "\n" + m10);
                        amount = entry.nextInt();
                        calculator = budget - amount;
                        System.out.print(m11 + calculator);
                        break;
                    case 3:
                        System.out.println(m9 + budget + "\n" + m12);
                        amount = entry.nextInt();
                        calculator = budget + amount;
                        System.out.print(m13 + calculator );
                        break;
                    case 4:
                        System.out.print(m14 + "\n" + m1);
                        break;
                }
            }
        }



    }


}
