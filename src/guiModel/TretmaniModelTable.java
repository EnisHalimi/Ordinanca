
package guiModel;

import database.Tretmani;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TretmaniModelTable extends AbstractTableModel {
    List<Tretmani>list;
    String[]columns={"Kontrolla id", "Lloji i tretmanit", "Kohezgjatja"};
    
    public String getColumnName(int col){
        return columns[col];
    }
    public Tretmani getTretmani(int row){
        return list.get(row);
    }
    
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tretmani t=getTretmani(rowIndex);
        switch(columnIndex){
            case 0:
                return t.getKontrollaID();
            case 1: 
                return t.getLlojitretmanit();
            case 2:
                return t.getKohezgjatja();
        }
        return null;
    }
    
    public void add(List<Tretmani>data){
        this.list=data;
    }
    
}
