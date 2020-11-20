package supplier;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mega
 */
public class SupplierImp implements SupplierInterface{
private String[] kolom = {"ID","NAMA","QTY","HARGA","TOTAL HARGA"};
private List<Supplier> list = new ArrayList<>();

    @Override
    public void read(JTable tblsupplier) {
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (int i = 0; i < list.size(); i++) {
           Object[] os = new Object[5];
           os[0] = list.get(i).getId();
           os[1] = list.get(i).getNama();
           os[2] = list.get(i).getQty();
           os[3] = list.get(i).getHarga();
           os[4] = list.get(i).getTotalHarga();
            dtm.addRow(os);
        }
        tblsupplier.setModel(dtm);
    }

    @Override
    public void create(Supplier sup) {
        list.add(sup);
        JOptionPane.showMessageDialog(null, "BERHASIL DISIMPAN!!!");
    }

    @Override
    public void update(Supplier sup) {
        for (int i = 0; i < list.size(); i++) {
            if(sup.getId().equals(list.get(i).getId())){
                list.set(i, sup);
            }
        }
        JOptionPane.showMessageDialog(null, "BERHASIL DIUBAH!!!");
    }

    @Override
    public void delete(String id) {
        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getId())){
            list.remove(i);
            }
        }
        JOptionPane.showMessageDialog(null, "BERHASIL DIHAPUS!!!");
    }

    @Override
    public void search(JTable tblsupplier, String id) {
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (int i = 0; i < list.size(); i++) {
            if(id.equalsIgnoreCase(list.get(i).getId())){
           Object[] os = new Object[5];
           os[0] = list.get(i).getId();
           os[1] = list.get(i).getNama();
           os[2] = list.get(i).getQty();
           os[3] = list.get(i).getHarga();
           os[4] = list.get(i).getTotalHarga();
            dtm.addRow(os);
        }
        }
        tblsupplier.setModel(dtm);
    }
}
