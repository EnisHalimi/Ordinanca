
package guiModel;

import database.Dhembi;
import database.Pacienti;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class DhembiModelTable extends AbstractTableModel {
    List<Dhembi>list;
    String [] columns ={"Nr dhembit", "Kontrolla id", "Koment", "Lloji i semundjes"};
    
    
     public String getColumnName(int col){
        return columns[col];
    }
    public Dhembi getDhembi(int row){
        return list.get(row);
        }
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
       return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dhembi dh=getDhembi(rowIndex);
        switch(columnIndex){
            case 0:
                return dh.getDhembiid();
            case 1:
                return dh.getKontrollaid().toString();
            case 2:
                return dh.getKoment();
            case 3: 
                return dh.getLlojisemundjes();
                
           
        }
        return null;
    }
    public void add(List<Dhembi> dh){
        this.list=dh;
    }
}
