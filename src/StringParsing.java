public class StringParsing {

    public static void main(String[] args) {
        StringParsing practice = new StringParsing();

    }

    public StringParsing() {
        String s = "Good morning! The weather is 65 degrees and sunny. ";
        System.out.println(s.indexOf("degrees"));
        System.out.println(s.indexOf('i',10));
        System.out.println(s.contains("sunny"));
        System.out.println(s.substring(14));
        int start = s.indexOf("The");
        System.out.println(s.substring(start,s.indexOf(" and")));
        String n = s.substring(start, start+10);
        System.out.println(n);


    }
}
