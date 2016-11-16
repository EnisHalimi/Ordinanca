package guiModel;


import database.Kontakti;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class KontaktiModelTable extends AbstractTableModel
{
    List<Kontakti> list;
    String [] columns = {"Tel 1 ","Tel 2", "E-Mail"};
    public KontaktiModelTable()
    {
    }
    
    public String getColumnName(int col)
    {
        return columns[col];
    }
    
    public Kontakti getKontakti(int row)
    {
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
            Kontakti k = list.get(rowIndex);
            switch(columnIndex)
            {
                case 0:
                    return k.getNrtel1();
                case 1:
                    return k.getNrtel2();
                case 2:
                    return k.getEmail();
                default:
                    return null;
            }
            
    }
    
    public  void add(List<Kontakti> data)
    {
        list=data;
    }
    
}