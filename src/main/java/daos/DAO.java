package daos;

import java.util.List;

public interface DAO<T> {

    public T findById(int id);

    public List<T> findAll();

    public T update(T dataToUpdate);

    public T create(T dataToCreate);

    public void delete(int id);
}