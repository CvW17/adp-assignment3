package za.ac.cput.Repository;

import za.ac.cput.Entity.Product.Supplier;

import java.util.Set;

public interface ISupplierRepository extends IRepository<Supplier, String>{
        public Set<Supplier> getAll();
    }

