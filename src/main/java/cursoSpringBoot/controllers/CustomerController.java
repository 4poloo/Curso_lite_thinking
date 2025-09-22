package cursoSpringBoot.controllers;

import cursoSpringBoot.domain.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {

    private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer(123,"Gabriel Olave","golave","1234"),
            new Customer(456,"Daniela Lopez","dlopez","5678"),
            new Customer(789,"Christopher Olave","colave","9012")
    ));

      @GetMapping("/clientes")
      public List<Customer> getCustomers() {
            return customers;
      }

      @GetMapping("/clientes/{username}")
      public Customer getCliente(@PathVariable String username){
          for (Customer c: customers) {
           if (c.getUsername().equalsIgnoreCase(username)){
               return c;
           }
          }
          return null;
      }

      @PostMapping("/clientes")
      public Customer postCliente(@RequestBody Customer customer){
          customers.add(customer);
          return customer;

      }
}
