package javaschool.DAO;

import java.io.Serializable;

public interface GenericDAO <T,PK extends Serializable> {

    /** ��������� ������ newInstance � ���� ������ */
    T add(T object);

    /** ������� ������, �������������� ����������� � ���� ������, ���������
     *   ��������� id � �������� ���������� �����
     */
     T get(PK id);

    /** ������� ������ �� ���� ������ */
    void delete(PK id);

    /** ��������� ���������, ��������� � �������. */
    void update(T object);

}
