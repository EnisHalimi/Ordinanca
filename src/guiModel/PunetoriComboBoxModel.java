
package guiModel;


import database.Punetori;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;



public class PunetoriComboBoxModel extends AbstractListModel<Punetori> implements ComboBoxModel<Punetori>{
   public Punetori selectedItem;
    public List<Punetori> list;
    public PunetoriComboBoxModel() {}
    public PunetoriComboBoxModel(List<Punetori> list) {
        this.list = list;
    }
    @Override
    public int getSize() {
       return list.size();
    }
    public void setSelectedItem(String anItem) {
        selectedItem=new Punetori(Integer.parseInt(anItem));
    }
    @Override
    public Punetori getElementAt(int index) {
       return list.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=(Punetori)anItem; 
    }

    @Override
    public Object getSelectedItem() {
       return selectedItem;
    }
}