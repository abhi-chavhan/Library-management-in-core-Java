import java.util.Scanner;

public class LibraryManagemeny {
    public static void main(String[] args) 
    {
        char r;
        
        System.out.println("library management System");
        System.out.println("Press 1 to add Book");
        System.out.println("Press 2 to issue book");
        System.out.println("Press 3 to return book");
        System.out.println("Press 4 to print complete issue details");
        System.out.println("Press 5 to exit");

        Scanner ac =new Scanner(System.in);
        System.out.println("Enter any number");
        int a=ac.nextInt();
        switch(a)
        {
            case 1:
            library aa=new library();
            aa.add();
            break;
            case 2:
            library bb=new library();
            bb.iss();
            break;
            case 3:
            library cc=new library();
            cc.ret();
            break;
            case 4:
            library dd=new library();
            dd.detail();
            break;
            case 5:
            library ee=new library();
            ee.exit();
            break;
            default:
            System.out.println("Invalid number");
        }

        System.out.println("You want to select next option Y/N");
        r=ac.next().charAt(0);
        while(r=='y'||r=='y');
        if(r=='n' ||r=='n');
        {
            library z= new library();
            z.exit();
        }

    
    }
}


class library
{
    static String str, b, date;
    static int a, c;
    void add()
    {
        System.out.println("Enter the book name, price and book_no");
        Scanner ac= new Scanner(System.in);
        String str= ac.nextLine();
        float price= ac.nextInt();
        int book_no= ac.nextInt();
        System.out.println("Your detail is "+ str + price + book_no); 
    }
    void iss()
    {
        Scanner ac1= new Scanner(System.in);
        System.out.println("Book Name");
        str=ac1.nextLine();
        System.out.println("Book_id");
        a=ac1.nextInt();
        ac1.nextLine();
        System.out.println("Issue date");
        b=ac1.nextLine();
        System.out.println("Total number of book issue");
        c=ac1.nextInt();
        ac1.nextLine();
        System.out.println("Return book date");
        date=ac1.nextLine();
    }

    int getid()
    {
        return a;
    }
    
    void ret()
    {
        System.out.println("Enter Student_name & book_id");
        Scanner ac2=new Scanner(System.in);
        String name=ac2.nextLine();
        int bookid=ac2.nextInt();
        if(a==bookid)
        {
            System.out.println("Total details");
            System.out.println("Book name::" +library.str);
            System.out.println("Book id::" + library.a);
            System.out.println("Issue date::" +b);
            System.out.println("Total number of book issue::" +library.c);
            System.out.println("Book retuen date::"+library.date);
        }
        else
        {
            System.out.println("Worng id, please enter the correct id");
        }
    }
    void detail()
    {
        System.out.println("Book name::" +library.str);
            System.out.println("Book id::" + library.a);
            System.out.println("Issue date::" +library.b);
            System.out.println("Total number of book issue::" +library.c);
            System.out.println("Book retuen date::" +library.date);
    }
    void exit()
    {
        System.exit(0);
    }

}