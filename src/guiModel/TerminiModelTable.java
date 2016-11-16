package guiModel;

import database.Termini;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TerminiModelTable extends AbstractTableModel 
{
    List<Termini> list;
    String [] colums= {"Nr Personal","Data","Ora"};
    public String getColumnName(int col)
    {
        return colums[col];
    }
    
    public Termini getTermini(int row )
    {
        return list.get(row);
    }
    
    @Override
    public int getRowCount() {
            return list.size();
    }
    

    @Override
    public int getColumnCount() {
        return colums.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Termini t = getTermini(rowIndex);
        switch(columnIndex)
        {
            case 0:
                return t.getPacientiID().getNrpersonal();
            case 1:
                return t.getDate();
            case 2: 
                return t.getOraterminit();
            default:
                    return null;
        }
    }
    
    public void add(List<Termini> data)
    {
        list=data;
    }
}