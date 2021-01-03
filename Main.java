import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose coffee machine:");
        System.out.println("First machine - 1");
        System.out.println("Second machine - 2");
        System.out.println("Third machine - 3");
        byte menu = scanner.nextByte();

        switch (menu)
        {
            case 1:
            {
                FirstMachine first = new FirstMachine(1000, 500, 300);

                do{
                    menu = 1;
                    showMenu(menu);
                    menu = scanner.nextByte();

                    switch (menu)
                    {
                        case 1:
                        {
                            System.out.print("Enter amount of cups: ");
                            first.makeEspresso(scanner.nextInt());
                            System.out.println(first.toString());
                            break;
                        }

                        case 2:
                        {
                            System.out.print("Enter amount of cups: ");
                            first.makeAmericano(scanner.nextInt());
                            System.out.println(first.toString());
                            break;
                        }

                        case 3:
                        {
                            first.clearTank();
                            System.out.println(first.toString());
                            break;
                        }
                    }
                }while(menu!=4);

                break;
            }

            case 2:
            {
                SecondMachine second = new SecondMachine(1000, 500, 500, 300);
                do {
                    menu = 2;
                    showMenu(menu);
                    menu = scanner.nextByte();

                    switch (menu)
                    {
                        case 1:
                        {
                            System.out.print("Enter amount of cups: ");
                            second.makeEspresso(scanner.nextInt());
                            System.out.println(second.toString());
                            break;
                        }

                        case 2:
                        {
                            System.out.print("Enter amount of cups: ");
                            second.makeAmericano(scanner.nextInt());
                            System.out.println(second.toString());
                            break;
                        }

                        case 3:
                        {
                            System.out.print("Enter amount of cups: ");
                            int cups = scanner.nextInt();

                            System.out.print("Enter amount of milk:");
                            int milk = scanner.nextInt();

                            second.makeLatteAndCappuccino(cups, milk, "Latte");
                            System.out.println(second.toString());
                            break;
                        }

                        case 4:
                        {
                            System.out.print("Enter amount of cups: ");
                            int cups = scanner.nextInt();

                            System.out.print("Enter amount of milk:");
                            int milk = scanner.nextInt();

                            second.makeLatteAndCappuccino(cups, milk, "Cappuccino");
                            System.out.println(second.toString());
                            break;
                        }

                        case 5:
                        {
                            second.clearTank();
                            System.out.println(second.toString());
                            break;
                        }
                    }

                }
                while (menu != 6);

                break;
            }

            case 3:
            {
                ThirdMachine third = new ThirdMachine(1000, 500, 600, 400, 200);

                do {
                    menu = 3;
                    showMenu(menu);
                    menu = scanner.nextByte();

                    switch (menu)
                    {
                        case 1:
                        {
                            System.out.print("Enter amount of cups: ");
                            third.makeAmericano(scanner.nextInt());
                            System.out.println(third.toString());
                            break;
                        }

                        case 2:
                        {
                            System.out.print("Enter amlunt of cups: ");
                            int cups = scanner.nextInt();

                            System.out.print("Enter amount of milk:");
                            int milk = scanner.nextInt();

                            third.makeLatteAndCappuccino(cups, milk, "Latte");
                            System.out.println(third.toString());
                            break;
                        }

                        case 3:
                        {
                            third.clearTank();
                            System.out.println(third.toString());
                            break;
                        }
                    }
                }while (menu != 4);
                break;
            }
        }
    }

    public static void showMenu(int menu)
    {
        if(menu == 1)
        {
            System.out.println("Make Espresso - button '1'");
            System.out.println("Make Americano - button '2'");
            System.out.println("Clear tank - button '3'");
            System.out.println("Turn off - button '4'");
        }
        else if(menu == 2)
        {
            System.out.println("Make Espresso - button '1'");
            System.out.println("Make Americano - button '2'");
            System.out.println("Make Latte - button '3'");
            System.out.println("Make Cappuccino - button '4'");
            System.out.println("Clear tank - button '5'");
            System.out.println("Turn off - button '6'");
        }
        else if(menu == 3)
        {
            System.out.println("Make Americano - button '1'");
            System.out.println("Make Latte - button '2'");
            System.out.println("Clear tank - button '3'");
            System.out.println("Turn off - button '4'");
        }
    }
}
