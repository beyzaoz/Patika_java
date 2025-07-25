package Week_2;

public class Scope_Method_Kapsami {
    public static void main(String[] args) {
        int degisken = 100;
        int degisken2 = 200;
        {
            System.out.println(degisken);
            //We can access all codes above this {} body.Not bottom!!!

            {
                int degisken3=400;
                System.out.println(degisken2);
            }
            int degisken5 = 500;
        }
        int degisken6 = 600;
    }
}
