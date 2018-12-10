package com.example.ashwininadagoud.encrypt_decrypt;

public class Message {
    private String msg;
    private int key;

    public Message(String msg, int key)
    {
        //To set msg and key values
        this.msg=msg;
        this.key=key;
    }
    public void setMsg(String msg)
    {
        this.msg=msg;
    }
    public void setKey(int key)
    {
        this.key=key;
    }
    public String getMsg()
    {
        return msg;
    }
    public int getKey()
    {
        return key;
    }
    public String encryption()
    {
        //To create new char array list and send msg to list
        char[] list = msg.toCharArray();

        //To create new char array
        char[] array = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A'
                ,'B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        int i,j,k=0;

        //To check conditions
        for(i=0;i<msg.length();i++)
        {
            for(j=0;j<array.length;j++)
            {
                if(list[i]==array[j]) //if list[i] is equal to array[j]
                {
                    k=(j+key)%52;   //add key value
                    list[i]=array[k];
                    break;
                }

            }
        }
        return String.valueOf(list);
    }

    public String decryption()
    {
        //To create new char array list and send msg to list
        char[] list = msg.toCharArray();

        //To create new char array
        char[] array = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A'
                ,'B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        int i,j,k=0;

        //To check conditions
        for(i=0;i<msg.length();i++)
        {
            for(j=0;j<array.length;j++)
            {
                if(list[i]==array[j])  //if list[i] is equal to array[j]
                {
                    k=(j-key%52+52)%52;  //subtract key value
                    list[i]=array[k];
                    break;
                }

            }
        }

        return String.valueOf(list);

    }
}
