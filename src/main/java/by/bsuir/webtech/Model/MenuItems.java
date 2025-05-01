package by.bsuir.webtech.Model;

public class MenuItems {

    private boolean isPage;
    private String area;
    private String action;
    private String controller;
    private String page;
    private String active;
    private String Text;

    public MenuItems(boolean isPage, String area, String action, String controller, String page, String active, String text) {
        this.isPage = isPage;
        this.area = area;
        this.action = action;
        this.controller = controller;
        this.page = page;
        this.active = active;
        Text = text;
    }

    public boolean isPage() {
        return isPage;
    }

    public void setPage(boolean page) {
        isPage = page;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
