package supplier;

/**
 *
 * @author Mega
 */
public class Supplier {
    private String id;
    private String nama;
    private int qty;
    private int harga;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getTotalHarga(){
        return qty*harga;
    }
   }
