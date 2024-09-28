public class Main {

    // 1. parenthesesCheck
public static boolean parenthesesCheck(String str) {
    int open = 0;
    int closed = 0;

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i)=='(') {
            open++;
        }
        else if (str.charAt(i)==')') {
            closed++;
        }
    }

    return (open == closed);
}

    // 2. reverseInteger
public static String reverseInteger(int a) {
    String output = "";
    String strA = a + "";

    for (int i = 0; i < strA.length(); i++) {
        output = output + a%10;
        a = a/10;
    }

    return output;
}

    // 3. encryptThis
public static String encryptThis(String str) {
    StringBuilder splitStr = new StringBuilder(str);
    String[] words = splitStr.toString().split(" ");

    StringBuilder output = new StringBuilder();

    for (int i = 0; i < words.length; i++) {
        StringBuilder stringi = new StringBuilder(words[i]);

        char secondChar = stringi.charAt(1);
        char lastChar = stringi.charAt(stringi.length() - 1);
        stringi.setCharAt(1, lastChar);
        stringi.setCharAt(stringi.length() - 1, secondChar);

        int charVal = stringi.charAt(0);
        stringi.deleteCharAt(0);
        stringi.insert(0, charVal);

        output.append(stringi);
        if (i < words.length - 1) {
            output.append(" ");
        }
    }
    return output.toString();
}

    // 4. decipherThis
    public static String decipherThis(String str) {
        StringBuilder splitStr = new StringBuilder(str);
        String[] words = splitStr.toString().split(" ");

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder stringi = new StringBuilder(words[i]);

            String charValStr = words[i].replaceAll("\\d+","");
            int charValInt = Integer.parseInt(charValStr);
            char charValChar = (char) charValInt;
            words[i] = words[i].replace(charValStr,""+charValChar);

            char secondChar = stringi.charAt(1);
            char lastChar = stringi.charAt(stringi.length() - 1);
            stringi.setCharAt(1, lastChar);
            stringi.setCharAt(stringi.length() - 1, secondChar);

            output.append(stringi);
            if (i < words.length - 1) {
                output.append(" ");
            }
        }
        return output.toString();
    }
}