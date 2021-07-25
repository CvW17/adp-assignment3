package za.ac.cput.Repository.Product;

import za.ac.cput.Entity.Product.Supplier;
import za.ac.cput.Repository.IRepository;

import java.util.Set;

public interface ISupplierRepository extends IRepository<Supplier, String> {
        public Set<Supplier> getAll();
    }

