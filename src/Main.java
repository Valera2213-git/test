//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "1234566778912345678912345678";
        String formatted = s.replaceAll("(\\d)(?=(\\d{3})+$)", "$1,");
        System.out.println(formatted);
    }
}