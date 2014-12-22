package com.godaddy.domains;

import com.godaddy.domains.executableCode.BaseClass;

import java.io.File;
import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Starting the test runs");

        try {

            String current = System.getProperty("user.dir");
            current = current+"\\src\\main\\java\\com\\godaddy\\domains\\executablecode";
            System.out.println("Current working directory in Java : " + current);

              File[] files = new File(current  ).listFiles();
            for(File file : files) {

                String fileNameWithOutExt = file.getName().replaceFirst("[.][^.]+$", "");
                if (!fileNameWithOutExt.equals("BaseClass")) {
                    fileNameWithOutExt = "com.godaddy.domains.executableCode." + fileNameWithOutExt;

                    Class classDefinition = Class.forName(fileNameWithOutExt);
                    BaseClass object = (BaseClass) classDefinition.newInstance();
                    Method m = classDefinition.getDeclaredMethod("runCode", new Class<?>[0]);
                    m.invoke(object);
                }
            }

        }
        catch (Exception ex)
        {
         ex.printStackTrace();
        }

    }


}
