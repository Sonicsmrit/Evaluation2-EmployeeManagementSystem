import Models.Contractor;
import Models.FullTimeEmployee;
import Models.PartTimeEmployee;

import java.util.Scanner;

/*create a program that demonstrates the following concepts:
* OOP
* inheritence
* should have 5 classes
* inheritance in atleast 2 classes
* Getter/Setter/constructor in each class
* 3 custom methods
* Should be based on real world example*/
public class Main {
    public static void main(String[] args) {
        FullTimeEmployee f1 = new FullTimeEmployee(25001,"ram","Doe","Ramdoe@gmail.com",987654349,1200,20000);
        FullTimeEmployee f2 = new FullTimeEmployee(25002,"rami","Doeee","Ramdoeee@gmail.com",987654343,12000,30000);
        FullTimeEmployee f3 = new FullTimeEmployee(25003,"ramin","Doei","Ramindoei@gmail.com",987654324,0,25000);
        FullTimeEmployee f4 = new FullTimeEmployee(25004,"rammk","Doek","Rammkdoek@gmail.com",984121314,5000,20000);
        FullTimeEmployee f5 = new FullTimeEmployee(25005,"rammu","Doeu","Rammudoeu@gmail.com",987654343,1200,50000);



        PartTimeEmployee p1 = new PartTimeEmployee(12314,"Elon","Musk","Muskiboy@yahoo.com",984129311,7,3000);
        PartTimeEmployee p2 = new PartTimeEmployee(12315,"Eloni","Mustui","Muskiboy@yahoo.com",984129313,7,3000);
        PartTimeEmployee p3 = new PartTimeEmployee(12316,"Elonik","Must","Muskiboy@yahoo.com",984129312,6,3000);

        Contractor c1 = new Contractor(12001,"Willium","Emmily","Emilia@gmail.com",984130236,100000);
        Contractor c2 = new Contractor(12002,"Will","Emm","Em@gmail.com",984132212,200000);

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to see the employee details?(true/false): ");
        boolean answer = sc.nextBoolean();
        if (answer) {
            System.out.println("Do you want to see the full time employee names?(true/false): ");
            boolean answer1 = sc.nextBoolean();

            if (answer1) {

                    System.out.println("The first employee details:");
                    System.out.println(f1.empName);
                    System.out.println(f1.empSurname);
                    System.out.println(f1.empEmail);
                    System.out.println(f1.empPhone);
                    System.out.println(f1.empID);
                    System.out.println(f1.getBonus());
                    System.out.println(f1.getSalary());

                System.out.println("The second employee details:");
                System.out.println(f2.empName);
                System.out.println(f2.empSurname);
                System.out.println(f2.empEmail);
                System.out.println(f2.empPhone);
                System.out.println(f2.empID);
                System.out.println(f2.getBonus());
                System.out.println(f2.getSalary());

                System.out.println("The third employee details:");
                System.out.println(f3.empName);
                System.out.println(f3.empSurname);
                System.out.println(f3.empEmail);
                System.out.println(f3.empPhone);
                System.out.println(f3.empID);
                System.out.println(f3.getBonus());
                System.out.println(f3.getSalary());

                System.out.println("The fourth employee details:");
                System.out.println(f4.empName);
                System.out.println(f4.empSurname);
                System.out.println(f4.empEmail);
                System.out.println(f4.empPhone);
                System.out.println(f4.empID);
                System.out.println(f4.getBonus());
                System.out.println(f4.getSalary());

                System.out.println("The fifth employee details:");
                System.out.println(f5.empName);
                System.out.println(f5.empSurname);
                System.out.println(f5.empEmail);
                System.out.println(f5.empPhone);
                System.out.println(f5.empID);
                System.out.println(f5.getBonus());
                System.out.println(f5.getSalary());

            }else {
                System.out.println("Task ended");
                answer1 = false;
            }
            System.out.println("Do you want to see the part time employee names?(true/false):");
            boolean answer2 = sc.nextBoolean();
            if (answer2) {
                System.out.println("The first part time employee details:");
                System.out.println(p1.empName);
                System.out.println(p1.empSurname);
                System.out.println(p1.empEmail);
                System.out.println(p1.empPhone);
                System.out.println(p1.empID);
                System.out.println(p1.hours);
                System.out.println(p1.moneyPerhour);

                System.out.println("The second part time employee details:");
                System.out.println(p2.empName);
                System.out.println(p2.empSurname);
                System.out.println(p2.empEmail);
                System.out.println(p2.empPhone);
                System.out.println(p2.empID);
                System.out.println(p2.hours);
                System.out.println(p2.moneyPerhour);

                System.out.println("The third part time employee details:");
                System.out.println(p3.empName);
                System.out.println(p3.empSurname);
                System.out.println(p3.empEmail);
                System.out.println(p3.empPhone);
                System.out.println(p3.empID);
                System.out.println(p3.hours);
                System.out.println(p3.moneyPerhour);

            }else{
                System.out.println("Task ended");
                answer2 = false;
            }
            System.out.println("Do you want to see the contractor names?(true/false): ");
            boolean answer3 = sc.nextBoolean();
            if (answer3) {
                System.out.println("The first contractor details:");
                System.out.println(c1.empName);
                System.out.println(c1.empSurname);
                System.out.println(c1.empEmail);
                System.out.println(c1.empPhone);
                System.out.println(c1.empID);
                System.out.println(c1.getContractAmount());

                System.out.println("The second contractor details:");
                System.out.println(c2.empName);
                System.out.println(c2.empSurname);
                System.out.println(c2.empEmail);
                System.out.println(c2.empPhone);
                System.out.println(c2.empID);
                System.out.println(c2.getContractAmount());

            }else {
                System.out.println("Task ended");
                answer3 = false;
            }




        }else {
            System.out.println("Task ended");
        }
        }







    }

