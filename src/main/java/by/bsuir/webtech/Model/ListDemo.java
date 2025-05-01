package by.bsuir.webtech.Model;

public class ListDemo {
    private int listItemValue;
    private String ListItemText;

    public int getListItemValue() {
        return listItemValue;
    }

    public void setListItemValue(int listItemValue) {
        this.listItemValue = listItemValue;
    }

    public String getListItemText() {
        return ListItemText;
    }

    public void setListItemText(String listItemText) {
        ListItemText = listItemText;
    }

    public ListDemo(int listItemValue, String listItemText) {
        this.listItemValue = listItemValue;
        ListItemText = listItemText;
    }
}
