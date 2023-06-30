package org.fasttrackit.com;

public class Homework8main {

    public static void main(String[] args) {

        FacebookAdvertise facebookAdCampaing = new FacebookAdvertise();
        MailAdvertise mailAdCampaign = new MailAdvertise();
        PrintAdvertise printAdCampaign = new PrintAdvertise();

        System.out.println("Exercises 1: \n");

        facebookAdCampaing.advertiseSender("Your dream vacation is here!\n");
        mailAdCampaign.advertiseSender("Online shopping is more easy now!\n");
        printAdCampaign.advertiseSender("Change your job right now, come with us and see how!\n");

        INGBank ingBank = new INGBank(6000);
        BTBank btBank = new BTBank(5320);
        BRDBank brdBank = new BRDBank(1325);

        System.out.println("Exercises 2: \n");

        System.out.println("My current balance on ING account is: " + ingBank.getAvailableMoney());
        System.out.println("I want to withdraw 1500 from my ING account, my left balance is: " + ingBank.withdraw(1500));
        System.out.println("My current balance on ING account is: " + ingBank.getAvailableMoney());
        System.out.println("I want to deposit 350 to my ING account, my current balance is: " + ingBank.deposit(350) + "\n");

        System.out.println("My current balance on BT account is: " + btBank.getAvailableMoney());
        System.out.println("I want to withdraw 2630 from my BT account, my left balance is: " + btBank.withdraw(2630));
        System.out.println("My current balance on BT account is: " + btBank.getAvailableMoney());
        System.out.println("I want to deposit 10000 to my BT account, my current balance is: " + btBank.deposit(10000) + "\n");

        System.out.println("My current balance on BRD account is: " + brdBank.getAvailableMoney());
        System.out.println("I want to withdraw 3500 from my BRD account, my left balance is: " + brdBank.withdraw(3500));
        System.out.println("My current balance on BRD account is: " + brdBank.getAvailableMoney());
        System.out.println("I want to deposit 50 to my BRD account, my current balance is: " + brdBank.deposit(50) + "\n");

        System.out.println("Exercises 3: \n");
        Cat cat = new Cat();
        Dog dog = new Dog();
        Mouse mouse = new Mouse();
        Chicken chicken = new Chicken();
        Duck duck = new Duck();

        System.out.println(String.format("Cat have the next attributes: %s, %s, %s.", cat.walk(), cat.talk(), cat.eat()));
        System.out.println(String.format("Dog have the next attributes: %s, %s, %s.", dog.walk(), dog.talk(), dog.eat()));
        System.out.println(String.format("Mouse have the next attributes: %s, %s, %s.", mouse.walk(), mouse.talk(), mouse.eat()));
        System.out.println(String.format("Chicken have the next attributes: %s, %s, %s.", chicken.walk(), chicken.talk(), chicken.eat()));
        System.out.println(String.format("Duck have the next attributes: %s, %s, %s.", duck.walk(), duck.talk(), duck.eat()));

        System.out.println("\n");
        System.out.println("Exercises 4: \n");

        Student one = new Student("Ion", 5);
        Student two = new Student("George", 9);
        Student three = new Student("Alina", 6);
        Student four = new Student("Ioana", 10);

        System.out.println("In our school we have: " + Student.getTotalStudents() + " students! \n ");
        System.out.println("The average grade for all students is: " + Student.average());
    }
}
