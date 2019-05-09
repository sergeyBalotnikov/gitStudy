package ru.mail.sergey_balotnikov.task21;

import java.util.ArrayList;
import java.util.Iterator;

public class CompareTime {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>();
        String temp = "Jack ";
        StringBuffer stringBuffer= new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<String> it = stringArray.iterator();
        long sTstart = 0L, sTend = 0L, result = 0L;
        String string = new String();

        for (int i = 0; i<100000; i++) {
            stringArray.add(temp);
        }

//String time test
        {
            it = stringArray.iterator();
            sTstart = System.currentTimeMillis();//start string concatenate
            while(it.hasNext()){
                string+=it.next();
            }
            sTend = System.currentTimeMillis();//end string concatenate
            result = sTend-sTstart;//result string concatenate
            System.out.println("Time concatenation string from array to string is "+result);
        }

//StringBuilder time test
        {
            it = stringArray.iterator();
            sTstart = System.currentTimeMillis();//start string builder append
            while (it.hasNext()) {
                stringBuilder.append(it.next());
            }
            sTend = System.currentTimeMillis();//end string builder append
            result = sTend - sTstart;//result string builder append
            System.out.println("Time append string from array to string builder is " + result);
        }
//StringBuffer time test
        {
            it = stringArray.iterator();
            sTstart = System.currentTimeMillis();//start string buffer append
            while (it.hasNext()) {
                stringBuffer.append(it.next());
            }
            sTend = System.currentTimeMillis();//end string buffer append
            result = sTend - sTstart;//result string buffer append
            System.out.println("Time append string from array to string buffer is " + result);
        }

    }
}
