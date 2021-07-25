package za.ac.cput.Repository;


import za.ac.cput.Entity.Product.Supplier;

import java.util.HashSet;
import java.util.Set;

public class SupplierRepository implements ISupplierRepository {

    private static SupplierRepository repository = null;
    private Set<Supplier> supplierDB;

    private SupplierRepository() {
        supplierDB = new HashSet<>();
    }

    public static SupplierRepository getRepository() {
        if(repository == null)
        {
            repository = new SupplierRepository();
        }
        return repository;
    }


    @Override
    public Supplier create(Supplier supplier) {
        this.supplierDB.add(supplier);
        return supplier;
    }



    @Override
    public Supplier read(String supplierID) {
        for (Supplier s : supplierDB)
            if (s.getSupplierID().equals(supplierID))
                {
                    return s;
                }
                return null;
            }



    @Override
    public Supplier update(Supplier supplier) {
        Supplier firstSupplier = read(supplier.getSupplierID());
        if (firstSupplier != null) {
            supplierDB.remove(firstSupplier);
            supplierDB.add(supplier);
            return supplier;
        }
        return null;
    }


    @Override
    public void delete(String supplierID) {
        Supplier delete = read(supplierID);
        if (delete == null)
            System.out.println("Supplier does not exist");

        supplierDB.remove(delete);
        System.out.println("Supplier has been deleted");
    }

    public Set<Supplier> getAll() {
        return supplierDB;
    }
}
