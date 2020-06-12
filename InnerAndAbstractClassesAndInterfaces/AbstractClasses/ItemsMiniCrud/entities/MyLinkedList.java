package entities;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            //This list is empty, so this item will be at the head of the list
            this.root = newItem;
            return true;
        }

        //if List isn't empty, start comparing from head of the search
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                //newItem is greater, so therefore move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    //we've reached the end of the list, so therefore we'll now go back
                    currentItem.setNext(newItem);
                    return true;
                }
                //otherwise, if comparison is greater than zero
            } else if (comparison > 0) {
                //newItem is less, so therefore move left if possible
                if (currentItem.previous() != null) {
                    //if currentItem.previous() is not equaled to null, we go to previous entry
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                //equal, so don't add
                System.out.println(newItem.getValue() +
                        " is already present, not added.");
                return false;
            }
        }
        //we're always checking so therefore this statement will never return, but because
        //Java will complain, we have to add a return statement here
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                //this means that we've found a record to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                        //making sure that both pointers are pointed at the correct items
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                //we have an equal to (==) conditional statement, a less than,
                // lastly, this will be greater than so no need to write
                // else if (comparison > 0)
                //so the item is not on the list, because we've passed that point, therefore
                return false;
            }
        }
        //we've reached the end of the list
        //without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
