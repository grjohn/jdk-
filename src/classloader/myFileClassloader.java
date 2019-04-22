package classloader;

import java.io.*;

/**
 * @Classname myFileClassloader
 * @Description 自定义文件类加载器，输入也可以为网络等。也可以通过类加载器实现.class的加密
 * @Author John
 * @Date 2019/4/22 12:29
 * @Version 1.0
 */
public class myFileClassloader extends ClassLoader{

    private String rootdir;
    public myFileClassloader(String rootdir){
        this.rootdir = rootdir;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> loadedClass = findLoadedClass(name);//查找有没有被加载

        if(loadedClass!=null){
            return loadedClass;
        }
        else{
            ClassLoader parent = this.getParent();
            try {
                loadedClass = parent.loadClass(name);   //委托给父类加载
            }
            catch (Exception e) {
              //  e.printStackTrace();
            }
            if(loadedClass!=null){
                return loadedClass;
            }
            else {  //父类不行，则自己加载
                byte[]  classData = new byte[0];
                try {
                    classData = getclassData(name);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if(classData==null){
                    throw new ClassNotFoundException();
                }
                else{
                    loadedClass = defineClass(name, classData, 0, classData.length);
                }
            }
        }
        //
        return loadedClass;
    }
    //获取类的字节码
    private byte[] getclassData(String classname) {
        String path = rootdir+"/"+classname.replace('.', '/')+".class";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        InputStream is = null;
        try {
            is = new FileInputStream(path);
            byte[] buffer = new byte[1024];
            int temp=0;
            while((temp=is.read(buffer))!=-1){
                baos.write(buffer, 0, temp);
            }
            return baos.toByteArray();
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
        finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(baos!=null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public static void main(String[] args) throws ClassNotFoundException {
//        System.out.println(ClassLoader.getSystemClassLoader());
//        System.out.println(ClassLoader.getSystemClassLoader().getParent());
//        System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent()); //源生代码实现，获取不到
//
//        System.out.println(System.getProperty("java.class.path"));

        myFileClassloader loader = new myFileClassloader("D:\\idea_workspace");
        myFileClassloader loader1 = new myFileClassloader("D:\\idea_workspace");

        Class<?> aClass = loader.loadClass("com.ss.hello");
        Class<?> aClass1 = loader.loadClass("com.ss.hello");
        Class<?> aClass2 = loader1.loadClass("com.ss.hello");
        Class<?> aClass3 = loader1.loadClass("java.lang.String");
        Class<?> aClass4 = loader1.loadClass("annotationStudy.student");

        //不同加载器加载同一个字节码，类不同
        System.out.println(aClass+"  "+aClass.hashCode()+" "+aClass.getClassLoader());
        System.out.println(aClass1+"  "+aClass1.hashCode()+" "+aClass1.getClassLoader());
        System.out.println(aClass2+"  "+aClass2.hashCode()+" "+aClass2.getClassLoader());

        System.out.println(aClass3.getClassLoader());   //顶级加载器
        System.out.println(aClass4.getClassLoader());   //系统默认加载器

    }
}
