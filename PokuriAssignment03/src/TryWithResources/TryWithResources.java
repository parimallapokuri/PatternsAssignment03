/**
 * 
 */
package TryWithResources;

import java.io.FileOutputStream;

/**
 * @author S546647
 *
 * 
 */
public class TryWithResources {
	public static void main(String[] args)
    {
        try (FileOutputStream newFile = new FileOutputStream("sample.txt")) {
            String text= "Hello World. This is my java program";
            byte arr[] = text.getBytes();
            newFile.write(arr);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Resource are closed and message has been written into the sample.txt");
    }

}
