package za.ac.cput.Repository.Product;

import za.ac.cput.Entity.Product.Supplier;
import za.ac.cput.Repository.IRepository;

import java.util.Set;

/*
 * Author: Robin White - 218034555
 * Test for Supplier Repository
 * 25 July 2021
 */

public interface ISupplierRepository extends IRepository<Supplier, String> {
        public Set<Supplier> getAll();
    }

