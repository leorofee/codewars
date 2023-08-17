/* Write a function which takes a number and returns the corresponding ASCII char for that value.
Example:
65 --> 'A'
97 --> 'a'
48 --> '0
For ASCII table, you can refer to http://www.asciitable.com/ */

public class Ascii {
    public static char getChar(int c) {
      if (c > 64 && c < 97){
        return (char) c;
      } else if (c >=97 && c<= 122){
        return (char) c;
      }else{
        return (char) c;
      }
    }
  }
