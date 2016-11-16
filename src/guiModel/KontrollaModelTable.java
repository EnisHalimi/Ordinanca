
package guiModel;

import database.Kontrolla;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class KontrollaModelTable extends AbstractTableModel {
    List<Kontrolla>list;
    String columns[]={"Nr Personal", "Data e kontrolles", "Ora e kontrolles", "Lloji i kontrolles"};
    
    public String getColumnName(int col){
        return columns[col];
    }
    public Kontrolla getKontrolla(int row){
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
        Kontrolla k=getKontrolla(rowIndex);
        switch(columnIndex){
            case 0:
                return k.getPacientiid().getNrpersonal();
            case 1:
                return k.getDate();
            case 2:
                return k.getOrakontrolles();
            case 3:
                return k.getLlojikontrolles();
        }
        return null;
    }
    
    public void add(List<Kontrolla>data){
        this.list=data;
    }
}
