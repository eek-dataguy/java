import java.util.Scanner;

public class BookMenu {
    private static Book getExpensiveBook(Book book1, Book book2) {
        if (book1.getPrice() > book2.getPrice()) {
            return book1;
        } else if (book1.getPrice() < book2.getPrice()) {
            return book2;
        }else {
            return null;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[10];
        int bookCount = 0;

        while (true) {
            System.out.println("Press 1 to view books, 2 to add books, 3 to find the most expensive book, any other key to exit");
            String userAction = scanner.nextLine();

            if (userAction.equals("1")){
                for (Book book : books) {
                    if (book != null) {
                        System.out.println(book);
                        System.out.println("-------------");
                    }
                }

            }else if (userAction.equals("2")){
                if(bookCount == books.length) {
                    System.out.println("Book storage is full. Cannot add more books.");
                } 

                System.out.println("Enter book title");
				String tmpTitle = scanner.nextLine();
				System.out.println("Enter book author");
				String tmpAuthor = scanner.nextLine();
				System.out.println("Enter book price");
				float tmpPrice = Float.parseFloat(scanner.nextLine());
				Book bkTmp = new Book();
				bkTmp.setTitle(tmpTitle);
				bkTmp.setAuthor(tmpAuthor);
				bkTmp.setPrice(tmpPrice);
				books[bookCount++] = bkTmp;

            } else if (userAction.equals("3")){
                System.out.println("Enter index of first book to compare");
                int book1Idx = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter index of second book to compare");
                int book2Idx = Integer.parseInt(scanner.nextLine());

                if (book1Idx >= 0 && book1Idx < bookCount && book2Idx >= 0 && book2Idx < bookCount) {
                    Book expensiveBook = getExpensiveBook(books[book1Idx], books[book2Idx]);
                    if (expensiveBook != null) {
                        System.out.println("The most expensive book is: " + expensiveBook);
                    } else {
                        System.out.println("Both books have the same price.");
                    }
                } else {
                    System.out.println("Invalid book indices.");
                }
            }
            else {
                break;
            }
        }
    }
}