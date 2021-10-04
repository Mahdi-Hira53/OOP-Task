package hira;

/*
 *     Name = Md. Mahdi Hossain Hira
 *     Id = 2012020106
 *     Section = C
 *     Email = cse_2012020106@lus.ac.bd
 *     Date = 14-07-2021
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner my_sec = new Scanner(System.in);
        String section;
        System.out.print("Enter your section: ");
        section = my_sec.nextLine();

        System.out.printf("My section is %s\n",section);

        Info my_info = new Info();
        System.out.println("My name is "+my_info.name);
        System.out.println("My id is "+my_info.id);

        Hobby my_hobby = new Hobby();
        System.out.println("My hobby is "+my_hobby.hobbyName);

    }
}
