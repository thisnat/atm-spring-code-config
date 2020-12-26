package atm;

import java.util.Map;

/**
 * A bank contains customers with bank accounts.
 */
public class Bank {

   private String name;
   private Map<Integer,Customer> customers;
   private DataSource dataSource;

   /**
    * Constructs a bank with no customers.
    */
   public Bank(String name, DataSource dataSource) {
      this.name = name;
      this.dataSource = dataSource;
      this.customers = dataSource.readCustomers();
   }

   /**
    * Adds a customer.txt to the bank.
    * @param customer the customer.txt to add
    */
   public void registerCustomer(Customer customer) {
      customers.put(customer.getId(), customer);
   }

   /**
    * Finds a customer.txt in the bank.
    * @param id a customer.txt id
    * @return the matching customer.txt, or null if no customer.txt
    * matches
    */
   public Customer findCustomer(int id) {
      return customers.get(id);
   }
}

