GroceryList APP - ROUGH DRAFT MD

Main class:

create boolean quit = false;
int choice = 0 << use for scanner class

create a method called print instructions

create a while loop, condition if not quit (false) 
		while loop should work

inside while loop, create a menu;
	for menu, use switch condition, (choice)
		case 1: printInstructins method

		case 2: print grocery list here, if user prompts

		case 3: 
			create a method to add items
		case 4:
			create a method to remove items from grocery list
		case 5:
			create a method to search for items
		case 6:
			create a method so that user can save their grocery list
		case 7: 
			quit = true, exit program
method 0:
	print instructions on case choices from switch
		1 = bring up menu options so user knows what to prompt to bring up options to use the app
		2 = add items
		3 = edit items, for example

method 1:
		addItems() method;
		print message asking users to add items
		call groceryList class, add using scanner class

method 2:
		ask user to enter the item # that they’re searching fro
		int itemNo = scanner

		now ask user to enter a replacement item
		String newItem = scanner
		groceryList.modify(itemNo -1, newItem)

method 3:
		similar to above, except use the remove method from
		groceryList.remove() 

method 4:
		create a function so that the user can search and see if an item exists in their grocery list

method 5:
		create a function so that the user can save their grocery list
method 6:
		give user a choice to exit the application
