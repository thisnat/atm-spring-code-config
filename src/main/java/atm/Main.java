package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ATMConfig.class);
        ATM atm = context.getBean(ATM.class);
        String name = atm.validateCustomer(3,7899);
        int thb = 5000;
        System.out.println(name + " has " + atm.getBalance() + " THB");
        atm.withdraw(thb);
        System.out.println(name + " withdraw " + thb + " THB");
        System.out.println(name + " has " + atm.getBalance() + " THB left");
    }
}
