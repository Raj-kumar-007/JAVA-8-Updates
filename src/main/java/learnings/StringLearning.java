package learnings;
import java.util.StringTokenizer;

public class StringLearning {

    private void  StringModifications(String SAMPLE_STRING)
    {
        System.out.println(
                "Split using String.split; joined using 1.8 String join \n");
        System.out.println(String.join(", ", SAMPLE_STRING.split(" ")));

        System.out.println(
                "Split using String.split; joined using StringBuilder \n");
        StringBuilder sb1 = new StringBuilder();
        for (String word : SAMPLE_STRING.split(" ")) {
            if (sb1.length() > 0) {
                sb1.append(", ");
            }
            sb1.append(word);
        }
        System.out.println(sb1);

        System.out.println(
                "Split using StringTokenizer; joined using StringBuilder \n");
        StringTokenizer st = new StringTokenizer(SAMPLE_STRING);
        StringBuilder sb2 = new StringBuilder();
        while (st.hasMoreElements()) {
            sb2.append(st.nextToken());
            if (st.hasMoreElements()) {
                sb2.append(", ");
            }
        }
        System.out.println(sb2);
    }

    private void traverseString()
    {
        String a = "A quick bronze fox";
        for (int i=0; i < a.length(); i++) { // no forEach, need the index
            String message = String.format(
                    "charAt is '%c', codePointAt is %3d, casted it's '%c'",
                    a.charAt(i),
                    a.codePointAt(i),
                    (char) a.codePointAt(i));
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello man");
        StringLearning sl = new StringLearning();
        sl.StringModifications("Hello everyone let's have a quick look on String modification.");
        sl.traverseString();
        }
}
