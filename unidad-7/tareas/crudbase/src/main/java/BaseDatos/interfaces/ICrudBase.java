package BaseDatos.interfaces;

import java.sql.Connection;
import java.util.Set;

import impl.Perro;

public interface ICrudBase {
    public boolean update(String sql);
    public boolean insert(String sql);
    public boolean delete(String sql);
    public Set<Perro> select(String sql);

}
