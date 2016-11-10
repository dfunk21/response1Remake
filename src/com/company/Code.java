package com.company;

/**
 * Created by dawsonfunk on 11/10/16.
 */
public class Code {

    private String myCode;
    public String modCode;

    public Code(String code)
    {
        myCode = code;

        for (int i = 0; i <= myCode.length(); i++)
        {
            modCode = modCode + "X";
        }
    }

    public String getCode()
    {
        return myCode;
    }

    public void hide(int p1 , int p2)
    {
        if (p1 >= 0 && p1 < p2 && p2 <= myCode.length()) {
            
        }
    }

    public void recover(int p1 , int p2)
    {

    }
}
