import java.util.Scanner;

public abstract class CoffeeMachines {
    private int water;
    private int coffee;
    private int tank;
    private int limitTank;

    CoffeeMachines(int water, int coffee, int limitTank)
    {
        this.water = water;
        this.coffee = coffee;
        this.limitTank = limitTank;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getWater() {
        return water;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public int getTank() {
        return tank;
    }

    public void setlimitTank(int limitTank) {
        this.limitTank = limitTank;
    }

    public int getlimitTank() {
        return limitTank;
    }

    public void makeEspresso(int cup)
    {
        if(this.water < 30 * cup)
        {
            System.out.println("It is not enough water!!!");
            return;
        }
        else if (this.coffee < 22 * cup)
        {
            System.out.println("It is not enough coffee!!!");
            return;
        }

        this.water = this.water - 30 * cup;
        this.coffee = this.coffee - 22 * cup;
        this.tank = this.tank + 22 * cup;
        System.out.println("Success!!! There are " + cup + " cups of Espresso");

        if(this.tank >= this.limitTank)
        {
            System.out.println("Tank is overloaded!!!");
        }
    }

    public void makeAmericano(int cup)
    {
        if(this.water < 100 * cup)
        {
            System.out.println("Not enough water");
            return;
        }
        else if (this.coffee < 22 * cup)
        {
            System.out.println("Not enough coffee");
            return;
        }

        this.water = this.water - 100 * cup;
        this.coffee = this.coffee - 22 * cup;
        this.tank = this.tank + 22 * cup;
        System.out.println("Good! " + cup + " cups of Americano");

        if(this.tank >= this.limitTank)
        {
            System.out.println("Tank is limited now");
        }
    }

    public void clearTank()
    {
        this.tank = 0;
    }
}

class FirstMachine extends CoffeeMachines
{
    public FirstMachine(int water, int coffee, int limitTank)
    {
        super(water, coffee, limitTank);
    }

    @Override
    public String toString() {
        String str = new String();

        str = "Water: " + String.valueOf(getWater()) + " | " + "Coffee: " + String.valueOf(getCoffee()) + " | " + "Tank: " + String.valueOf(getTank()) + " | " + "Tank limit: " + String.valueOf(getlimitTank());

        return str;
    }
}

class SecondMachine extends CoffeeMachines
{
    private int milk;

    SecondMachine(int water, int coffee, int limitTank, int milk)
    {
        super(water, coffee, limitTank);
        this.milk = milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getMilk() {
        return milk;
    }

    public void makeLatteAndCappuccino(int cup, int milk, String coffeeType) {
        if(getMilk() < milk * cup)
        {
            System.out.println("Not enough milk");
            return;
        }

        if(getWater() < 30 * cup)
        {
            System.out.println("Not enough water");
            return;
        }
        else if (getCoffee() < 22 * cup)
        {
            System.out.println("Not enough coffee");
            return;
        }

        setMilk(getMilk() - milk * cup);
        setWater(getWater() - 30 * cup);
        setCoffee(getCoffee() - 22 * cup);
        setTank(getTank() + 22 * cup);
        if(coffeeType == "Latte")
        {
            System.out.println("Great! " + cup + " cups of Latte");
        }
        else
        {
            System.out.println("Great!  " + cup + " cups of Cappuccino");
        }

        if(getTank() >= getlimitTank())
        {
            System.out.println("Tank is limited now");
        }


    }

    @Override
    public String toString() {
        String str = new String();

        str = "Water: " + String.valueOf(getWater()) + " | " + "Coffee: " + String.valueOf(getCoffee()) + " | " + "Milk: " + String.valueOf(getMilk()) + " | " + "Tank: " + String.valueOf(getTank()) + " | " + "Tank: " + String.valueOf(getlimitTank());

        return str;
    }
}

class ThirdMachine extends SecondMachine
{
    private int coffeeBeans;
    ThirdMachine(int water, int coffee, int limitTank, int milk, int coffeeBeans)
    {
        super(water, coffee, limitTank, milk);
        this.coffeeBeans = coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }
}