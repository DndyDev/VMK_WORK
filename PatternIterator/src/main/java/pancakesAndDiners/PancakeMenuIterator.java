package pancakesAndDiners;

import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    private int index = 0;


    public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(index);
        index ++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if(index >= menuItems.size()){
            return false;
        }else {
            return true;
        }
    }
}