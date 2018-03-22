import java.util.Scanner;
public class problem2 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        reader.close();
        int kEEp = n;
        int counter=0;/*the value that keeps track of how many times number runs through the loop*/
        for(int i=0; n!=1;i ++ ){
            if (n%2==0){
                int w=n/2;        //can be n=n/2
                int count= counter +1;
                counter=count;
                n=w;
            }
            else {
                    int x=3*n;
                    int y=x+1;
                    int coUnt= counter +1;
                    counter=coUnt;
                    n=y;
            }
        }
            System.out.println("The number" +" " +kEEp + " is ran through"+" "+counter +" "+ "times!");
        }
}

