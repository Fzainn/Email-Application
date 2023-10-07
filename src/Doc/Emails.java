package Doc;

import java.util.Locale;
import java.util.Scanner;

public class Emails
{
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String email;
    private String companySuffix = "MaxBlank.com";




    // constructor to receive the first and lastname


    public Emails(String firstname, String lastname) { // create constructor which is the first execution code since the Obj is created
        this.firstname = firstname;
        this.lastname = lastname;

        //System.out.println("Email is created successfully!" + this.firstname + " "+ this.lastname); // for testing

        this.department = setDepartment();// this line of code means the department variable/ attribute created in this class = setDepartment() method
        //System.out.println("Department is : " + this.department); // for testing

        this.password = setRandomPassword(10); // here we pass int length for the method
        System.out.println("Your Password is : " + this.password);

        email = firstname.toLowerCase()+ "." +lastname.toLowerCase()+" @ "+department+"."+ companySuffix; // for combine all email elements
        System.out.println("Your Email is :" + email);



    }

    // method for Asking user for his department

    private String setDepartment()
    {
        System.out.print(" Hey New Scientist Farha , Please Enter Your department : \n 1- Genomics \n 2- Proteomics \n 3- Evolutionary Genomics \n 4- none of them");
        Scanner in = new Scanner(System.in); // take obj from scanner class for receiving the input
        int deChoice = in.nextInt(); // create int variable called "deChoice to store the input
        if (deChoice == 1 ){
            return "GENOMICS";
        }else if(deChoice == 2 ){
            return "PROTEOMICS";
        }else if (deChoice == 3 ){
            return "EVOLUTIONARY GENOMICS";
        } else if (deChoice == 4) {
            return " ";

        }
        return null;
    }



    private String setRandomPassword(int length) // method to create random pass
    {
     String PasswordSet = "ABCDEFGHIJKLMNOP0123456$#@"; // set of Nums and chars to make random pass from it
     char [] password = new char[length]; // create Array for storing the pass
     for ( int i = 0 ; i<length; i++){ // for loop for looping into the set of Nums and chars
         int rand = (int) (Math.random() * password.length); // use Math.random built in method to create random pass
         // by multiplying a random double between 0 and 1 (from Math.random()) with the length of the PasswordSet string.
         // This index determines which character from PasswordSet will be used in the password
         password[i] = PasswordSet.charAt(rand); // This line retrieves the character at the random index rand from the PasswordSet string and assigns it
         // to the i-th position in the password array. This step builds the password character by character
     }
     return new String (password); // this code converts the char array "password" into a string  using new string after creating the password


    }







}
