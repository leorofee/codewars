/*Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array. */

public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
      int count = 0;
      int sumNegatives = 0;
      
      if ( input == null || input.length == 0){
        return new int[]{};
      }
      
      for (int i = 0; i < input.length; i++){
          if (input[i] > 0){
            count ++;
          }else if (input[i] < 0){
            sumNegatives += input[i];
          }
      }
      return new int[]{count, sumNegatives} ;
             
    }
     
    
}