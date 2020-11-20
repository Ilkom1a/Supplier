package supplier;
import javax.swing.JTable;

/**
 *
 * @author Mega
 */
public interface SupplierInterface {
    public void read (JTable tblsupplier);
    public void create(Supplier sup);
    public void update(Supplier sup);
    public void delete(String id);
    public void search(JTable tblsupplier, String id);
}
