import java.util.Scanner;
public class W09_P5{

public static int maxZeros(int n) {
  int maxlength = 0;
  String s = Integer.toBinaryString(n);
  for (int i = 0; i < s.length(); i++) {
    int local_length = 0;
    if (s.charAt(i) == '0'){
      local_length++;
      for (int j = i+1; j < s.length(); j++) {
        if (s.charAt(j) == '0')
          local_length++;
        else {
          i = j - 1;
          break;
        }
      }
    }
    if (local_length > maxlength)
      maxlength = local_length;
  }
  return maxlength;
}

public static void main(String args[]) {
                Scanner in = new Scanner(System.in);

                int n = in.nextInt();
                System.out.print(maxZeros(n));

        }
  
}
