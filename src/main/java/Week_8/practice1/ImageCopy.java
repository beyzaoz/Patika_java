package Week_8.practice1;

import java.io.*;

public class ImageCopy {
    public static void main(String[] args) {
        var originalFilePath = new File("D:\\JAVA Project\\Patika_java\\src\\main\\resources\\flowers.webp");
        var copyFilePath = new File("D:\\JAVA Project\\Patika_java\\src\\main\\resources\\flowers_copy.webp");

        try(
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originalFilePath));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(copyFilePath));


        ){
            byte[] buffer = new byte[1024];
            int read;

            while((read = bis.read(buffer)) != -1 ){
                bos.write(buffer,0,read);
            }
            System.out.println("Succesfull!");





        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
