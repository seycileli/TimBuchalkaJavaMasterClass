package entities;

import java.util.List;

public abstract class ListItem {

    //two variables that hold references to Objects of type rightLink, leftLink
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;

    //each list item Object can hold a link to the previous and next items on the LIST
    //which we'll be ultimately be saving
    public ListItem(Object value) {
        this.value = value;
    }

    //next returns a reference to the next ListItem in the list
    abstract ListItem next();

    /*
    setNext() where we're passing the parameter list items
    sets a reference to the next item to refer to the parameter
     */
    abstract ListItem setNext(ListItem item);

    /*
    * previous() and setPrevious() does the opposite of the above two methods */
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    //compareTo() will compares an Object to the item for whatever has been passed through the parameter
    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
