  /**
  https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-permutations-official/ojquestion */
  

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printPermutations(s, "");

    }
    // asf asnwerSoFar
    // loq is leftOfQuestion
    // roq is RightOfQuestion
    
    public static void printPermutations(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String loq = str.substring(0, i);
            String roq = str.substring(i + 1);
            String leftstr = loq + roq;
            printPermutations(leftstr, asf + ch); //add character in asf 
        }
    }

}