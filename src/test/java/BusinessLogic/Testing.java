package BusinessLogic;

import org.junit.Test;


public class Testing {
    @Test
    public void ReverseInt()
    {
        int myInt = 12345;
        int revNum=0;

        while(myInt!=0) {
            int digit = myInt % 10;
            revNum = revNum * 10 + digit;
            myInt /= 10;
        }
        System.out.println(revNum);


    }
}
