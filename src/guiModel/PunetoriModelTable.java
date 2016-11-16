
package guiModel;

import database.Pacienti;
import database.Punetori;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PunetoriModelTable extends AbstractTableModel{
    List<Punetori>list;
    String []columns={"Nr Personal", "Emri", "Mbiemri", "Pozita", "Gjinia"};
    public PunetoriModelTable(){}
    public String getColumnName(int col){
        return columns[col];
    }
    public Punetori getPunetori(int row){
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
        Punetori p=getPunetori(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getNrpersonal();
            case 1:
                return p.getEmri();
            case 2:
                return p.getMbiemri();
            case 3:
                return p.getPozite();
            case 4:
                return p.getGjinia();
              default:
                return null;
        }
       
    }
    public void add(List<Punetori>data){
        this.list=data;
    }
    
}
