package Week_2;

public class String_Builder {
    public static void main(String[] args) {

        String name = "patika";
        System.out.println(name);
        var name2 = name.replace("p", "P");
        System.out.println(name2);

        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("Patika");

        System.out.println(stringBuilder);


        StringBuilder alphabet = new StringBuilder();

        for (char current = 'a' ;current  <= 'z' ; current++) {
            alphabet.append(current);

        }

        System.out.println(alphabet);

        StringBuilder name3 = new StringBuilder();
        name3.append("Patika ")
                .append("Dev ")
                .append("Education");

        System.out.println(name3);

    }
}
