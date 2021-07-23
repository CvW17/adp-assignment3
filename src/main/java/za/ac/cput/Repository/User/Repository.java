package za.ac.cput.Repository.User;

public interface Repository<T, ID>
{
    T create(T t);
    T read(ID id);
    T update(T t);
    void delete(ID id);
}
