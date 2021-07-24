package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Product.Supplier;
import za.ac.cput.Factory.Product.SupplierFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SupplierRepositoryTest {
    private static SupplierRepository repo = SupplierRepository.getRepository();
    private static Supplier supplier = SupplierFactory.build("Carlos Bakery","Cake@yahoo",
            "0219874521");
    @Order(1)
    @Test
    void create() {
        Supplier create = repo.create(supplier);
        assertEquals(supplier.getSupplierID(), create.getSupplierID());
        System.out.println("Create: " + create);
    }

    @Order(2)
    @Test
    void read() {
        Supplier read = repo.read(supplier.getSupplierID());
        System.out.println("Read: " + read);
    }
    @Order(3)
    @Test
    void update() {
        Supplier update = new Supplier.Builder().copy(supplier).setSupplierName("Buddy").build();
        System.out.println("Update: " + update);
    }
    @Order(4)
    @Test
    void delete() {
        repo.delete(supplier.getSupplierID());
        System.out.println("Deleted: " + supplier.getSupplierID());
    }
}