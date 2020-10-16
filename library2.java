import java.util.*;
class LibraryMember
{
   Scanner sc=new Scanner(System.in);
   public int Member_Id;
   public long Phone_No;
   private String Member_Name,Address;
   void read()
    {
       System.out.println("Enter the Member_Id: ");
       Member_Id=sc.nextInt();
       System.out.println("Enter the Member_Name: ");
       Member_Name=sc.next();
       System.out.println("Enter the Address: ");
       Address=sc.next();
       System.out.println("Enter the Phone_No.: ");
       Phone_No=sc.nextLong();
       check();
    }
   void display()
    {
      System.out.println("Member_Id"+Member_Id+"\nMember_Name"+Member_Name+"\nAddress"+Address+"Phone_No."+Phone_No);
    }
   void getname()
    {
      System.out.println("Member_Name"+this.Member_Name);
    }
   void check()
    {
      String str1=String.valueOf(Phone_No);
      if(str1.length()<10||str1.length()>10)
       {
        System.out.println("Wrong Input");
        System.out.println("Enter Again");
        Phone_No=sc.nextLong();
              check();
       }
    }
}

class Student extends LibraryMember
{
   Scanner sc=new Scanner(System.in);
   private int Roll_No;
   private String Stream; 
   void read()
    {
       super.read();
       System.out.println("Enter the Roll_No: ");
       Roll_No=sc.nextInt();
       System.out.println("Enter the Stream: ");
       Stream=sc.next();
    }
   void display()
    {
       super.display();
       System.out.println("Roll_No."+Roll_No+"\nStream"+Stream);
    }
}
class Faculty extends LibraryMember
{
   Scanner sc=new Scanner(System.in);
   private int Faculty_Id;
   private String Designation;
   void read()
    {
       super.read();
       System.out.println("Enter the Faculty_Id: ");
       Faculty_Id=sc.nextInt();
       System.out.println("Enter the Designation: ");
       Designation=sc.next();
    }
   void display()
    {
      super.display();
      System.out.println("Faculty_Id"+Faculty_Id+"\nDesignation"+Designation);
    }
}

class library2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Sizex, count =0;
        System.out.print("No. of Members: ");
        Sizex = in.nextInt();
        LibraryMember[] s = new LibraryMember[Sizex];
        while(true){
            System.out.println("\nEnter\n\t1: Student Data \n\t2: Faculty Data \n\t3: Display All\n\t4: Search\n\t5: Exit");
            int Choice = in.nextInt();
             if(count == Sizex){
                        System.out.println("Data is Full!!");
                        break;
                    }
                    if(Choice == 1)
                    {
                        s[count] = new Student();
                        s[count].read();
                        count++;
                    }
                    else if(Choice == 2){
                        s[count] = new Faculty();
                        s[count].read();
                        count++;
                    }
              else if(Choice == 3){
                if(count == 0){
                    System.out.println("No Data Present");
                    continue;
                }
                for(int i = 0; i < count; i++){
                    s[i].display();
                }
            }
            else if(Choice == 4){
                if(count == 0){
                    System.out.println("No Data Present");
                    continue;
                }
                 System.out.print("Enter the MemberId: ");
                int MemberId = in.nextInt();
                for(int i = 0; i<Sizex; i++){ 
                    if (s[i].Member_Id == MemberId){
                        s[i].display();
                    }
                    else
                    {                   
                    System.out.println("No Member Found! Please Check the MemberId");
                    break;
                    }
                }
            }
            else if(Choice == 5){
                break;
            }
            else
                System.out.println("Invalid Input, Please try Again!");
        
    }
  } 
}     