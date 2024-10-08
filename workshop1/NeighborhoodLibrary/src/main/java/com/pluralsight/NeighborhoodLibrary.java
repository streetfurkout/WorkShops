package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    //our library can have 20 books and we created an array for this.
    private static Book[] books = new Book[20];

    //To can read and adapt user`s input to our system
    private static Scanner scanner = new Scanner(System.in);

    //Our array of books
    public static void main(String[] args) {

        books[0] = new Book(111, "first", "firstbook", true, "Furkan");
        books[1] = new Book(112, "second", "secondebook", true, "Ray");
        books[2] = new Book(113, "third", "thirdbook", true, "Kor");
        books[3] = new Book(114, "4th", "4thtbook", true, "Es");
        books[4] = new Book(115, "5th", "5thbook", true, "Peter");
        books[5] = new Book(116, "6th", "6thbook", true, "Emre");
        books[6] = new Book(117, "7th", "7thbook", true, "Josh");
        books[7] = new Book(118, "8th", "8thbook", true, "Matt");
        books[8] = new Book(119, "9th", "9thbook", true, "Henry");
        books[9] = new Book(121, "10th", "10tbook", true, "Isaac");
        books[10] = new Book(122, "11th", "11thbook", false, " ");
        books[11] = new Book(123, "12th", "12thbook", false, " ");
        books[12] = new Book(124, "13th", "13thbook", false, " ");
        books[13] = new Book(125, "14th", "14thbook", false, " ");
        books[14] = new Book(126, "15th", "15thbook", false, " ");
        books[15] = new Book(127, "16th", "16thbook", false, " ");
        books[16] = new Book(128, "17th", "17thbook", false, " ");
        books[17] = new Book(129, "18th", "18thbook", false, " ");
        books[18] = new Book(130, "19th", "19thbook", false, " ");
        books[19] = new Book(131, "2oth", "20thbook", false, " ");

        //The user have to select one of these options otherwise app will be ended.
        while (true) {
            System.out.println("The Store Home Screen.");
            System.out.println("1- Show Available Books. (Displays a list of all books that are not currently checked out and displays Id, ISBN and Title of the Book)");
            System.out.println("2- Show Checked Out Books. (Displays a list of all the books that are currently checked out. Display the Id, ISBN, Title and Name f person who has the book checked out)");
            System.out.println("3- Exit");
            // Read the user's input command.
            int command = scanner.nextInt();
            // Consume the newline character left in the scanner buffer after reading the command.
            scanner.nextLine();

            switch (command) {
                case 1:
                    showAvailableBooks();


                    break;

                case 2:
                    showCheckedOutBooks();
                    break;

                case 3:

                    System.out.println("Have a good day!");
                    exit();

                    break;

                //if the use will put an another input than our list
                default:
                    System.out.println("invalid command");
                    break;


            }
        }

    }
        //We created a
    public static void showAvailableBooks() {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("List of available books: ");

        // We are checking for each object of our array
        for (Book book : books) {

            if (!book.getIsCheckedOut()) {
                System.out.println(book);

                // String selection = scanner.nextLine();
                // scanner.nextLine();

                }
            }


        System.out.println("1-Would you like to pick up a book from the list?");
        System.out.println("2-Go to home screen.");
        int selection = scanner.nextInt();
        scanner.nextLine();

        if (selection == 1){
            bookCheckingOut();
        }

        }




    public static void bookCheckingOut() {
        //Scanner scanner = new Scanner(System.in);
        //We signed up our customer
        System.out.println("Please enter your name.");
        String nameOfCustomer = scanner.nextLine();

        System.out.println("Please enter the name of the book.");
        String choosedBook = scanner.nextLine();
        //scanner.nextLine(); (actually we don`t need that because while we are working with string we don`t need that)

        // We are checking for each object of our array
        for ( Book abuzer : books) {
            if (abuzer.getTitle().equalsIgnoreCase(choosedBook)) {
                abuzer.setIsCheckedOut(true);

                abuzer.setCheckedOutTo(nameOfCustomer);

            }


        }
        System.out.println(nameOfCustomer + " taken " + choosedBook);



    }
        public static void showCheckedOutBooks () {

            System.out.println("Please enter your name.");
            String nameOfCustomer = scanner.nextLine();

            System.out.println("Please enter the ID of the book.");
            int idOfBook = scanner.nextInt();
            //scanner.nextInt();
            for (Book book : books) {

                if (book.getId() == idOfBook) {
                    book.setIsCheckedOut(false);

                if (book.getIsCheckedOut() == false);
                    book.setCheckedOutTo("");



                }
            }

        }





        public static void exit () {
            return;
        }


    }



