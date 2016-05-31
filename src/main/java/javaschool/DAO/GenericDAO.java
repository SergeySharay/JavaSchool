package javaschool.DAO;

import java.io.Serializable;

public interface GenericDAO <T,PK extends Serializable> {

    /** —охранить объект newInstance в базе данных */
    T add(T object);

    /** »звлечь объект, предварительно сохраненный в базе данных, использу€
     *   указанный id в качестве первичного ключа
     */
     T get(PK id);

    /** ”далить объект из базы данных */
    void delete(PK id);

    /** —охранить изменени€, сделанные в объекте. */
    void update(T object);

}
