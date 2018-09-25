package b07.labs;



public class Lab3 {


  /**
   * Reverse the characters of a string. For instance if you call the method
   * reverseString with the input Hello, then the output will be olleH.
   * 
   * @param str The input string to be reversed
   * @return result The output string which is reversed str
   */
  public static String reverseString(String str) {
    int length = str.length();
    String result = "";

    for (int i = length - 1; i >= 0; i--) {
      result = result + str.charAt(i);
    }
    return result;
  }


  /**
   * To reverse the order of words in a sentence. For instance if you call the
   * method reverseSentence with the input Hello, then the output will be Hello.
   * If you call on Hello welcome to CSCB07 Lab3, then the output will be Lab3
   * CSCB07 to welcome Hello
   * 
   * @param str The input sentence to be reversed
   * @return result The output string which has reversed order of words in str
   */
  public String reverseSentence(String str) {
    String r, s = "", ret = "";

    r = reverseString(str);
    int length = r.length();
    int startIndex = 0, currentIndex = 0;
    while (currentIndex < length) {
      if (r.charAt(currentIndex) == (' ')) {
        s = reverseString(r.substring(startIndex, currentIndex));
        startIndex = currentIndex + 1;
        ret = ret + s + " ";
      }
      currentIndex++;
    }
    ret = ret + reverseString(r.substring(startIndex, length));
    return ret;
  }

  public static void main(String[] args) {
    /*
     * TestCase1. Input String: Hello welcome to CSCB07 Lab3 Output String: Lab3
     * CSCB07 to welcome Hello
     */
    Lab3 lab3Reference = new Lab3();
    System.out
        .println(lab3Reference.reverseSentence("Hello welcome to CSCB07 Lab3"));


    /*
     * TestCase2. Input String: Hello there, my name is CSCB07 Output String:
     * CSCB07 is name my there, Hello
     */
    System.out.println(
        lab3Reference.reverseSentence("Hello there, my name is CSCB07"));

    /*
     * TestCase3. Input String: Hello Output String: Hello
     */
    System.out.println(lab3Reference.reverseSentence("Hello"));

    /*
     * TestCase4. Input String: Hello Output String: olleH
     */
    System.out.println(Lab3.reverseString("Hello"));

    /*
     * TestCase5. Input String: CSCB07 Output String: 70BCSC
     */
    System.out.println(Lab3.reverseString("CSCB07"));

    /*
     * TestCase6. Input String: Lab3 Output String: 3baL
     */
    System.out.println(Lab3.reverseString("Lab3"));


  }

}
