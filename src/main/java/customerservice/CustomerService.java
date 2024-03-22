package customerservice;

import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.UUID.randomUUID;

public class CustomerService {
    private static final Faker faker = new Faker(Locale.FRANCE);
     final List<Customer> customers = new ArrayList<>();

    public List<String> getAllCustomerNames() {
        return customers.stream().map(Customer::getName).sorted().collect(Collectors.toList());
    }

    public List<Customer> getCustomersByPhone(String phone) {
        return customers.stream().filter(customer -> phone.equals(customer.getPhone())).collect(Collectors.toList());
    }

    Customer generateCustomer() {
        return new Customer(
                randomUUID(),
                faker.name().nameWithMiddle(),
                faker.phoneNumber().phoneNumberInternational()
        );
    }

    public CustomerService() {
        customers.addAll(IntStream.range(0, 25).mapToObj(i -> generateCustomer()).collect(Collectors.toList()));
    }
}
