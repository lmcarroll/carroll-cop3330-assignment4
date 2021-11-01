/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.List;

public class ItemList {

    //declare List of items attribute

    //constructor: create class parameter: List of items

    //assign parameter to ItemList class attribute

    public void editListTitle() {

        //Scanner input
        //this.listTitle assigned to input

    }

    public void displayItems() {

        //print List this.items into GUI
    }

    public void displayIncomplete() {

        //for 'i = 0' is less than length of List this.items (i++),
        //if indexed item at i within list has a subclass within the Item
        //class Completion where boolean completion is equal to integer value one,
        //print this.item into GUI
    }

    public void displayComplete() {

        //for 'i = 0' is less than length of List this.items (i++),
        //if indexed item at i within list has a subclass within the Item
        //class Completion where boolean completion is equal to integer value zero,
        //print this.item into GUI
    }

    public void saveItemList(String file) {

        //prints this.ItemList items to inputted file
    }

    public List loadItemList(String file) {

        //initialize new List as "loadedItemList"
        //reads inputted file and returns all Items through "loadedItemList"

        return loadedItemList;
    }


}
