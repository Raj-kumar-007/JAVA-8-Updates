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
    public static void main(String[] args) {
        System.out.println("Hello man");
        new StringLearning().StringModifications("Hello everyone let's have a quick look on String modification.");
    }
}
