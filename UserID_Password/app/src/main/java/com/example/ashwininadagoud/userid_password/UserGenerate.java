package com.example.ashwininadagoud.userid_password;

public class UserGenerate {
    private String fNameString;
    private String lNameString;
    private String birthDateString;

    //set method to set the values for First name
    public void setFirstName(String fNameString)

    {
        this.fNameString = fNameString;
    }

    //set method to set the values for Last name
    public void setLastName(String lNameString)

    {
        this.lNameString = lNameString;
    }

    //set method to set the values for Date of Birth
    public void setDateOfBirth(String birthDateString)
    {
        this.birthDateString = birthDateString;
    }

    //return method to return UserId
    public String getUserId()
    {
        String date = birthDateString;
        String birthDate = date.substring(3, 5);

        String firstNameUser = fNameString.toLowerCase();
        String lastNameUser = lNameString.toLowerCase();

        String userId = firstNameUser.substring(0,1)+ lastNameUser + birthDate; //format for userid
        return userId;
    }

    //return method to getPassword
    public String getPassword()
    {
        String date = birthDateString;
        String monthYear = date.substring(0, 2) + date.substring(8, 10);

        String firstName = fNameString;
        String name = firstName.substring(0, 1) + firstName.substring((firstName.length() - 1));
        String fName = name.toLowerCase();

        String lastName = lNameString;
        String lname = lastName.substring(0, 3);
        String lName = lname.toLowerCase();

        int firstNameLength = fNameString.length();
        int lastNamelength = lNameString.length();


        String password = fName + monthYear + lName + firstNameLength + lastNamelength; //format for password
        return password;

    }
}
