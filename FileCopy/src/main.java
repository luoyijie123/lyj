import java.io.*;

public class main {
    public static void main(String[] args){
       buffer_single_byte_excute();
       single_byte_excute();
    }

    public static void buffer_single_byte_excute(){
        long startTime=System.currentTimeMillis();
        BufferedInputStream bufis=null;
        BufferedOutputStream bufos=null;

        try{
            bufis=new BufferedInputStream(new FileInputStream("E:\\workplace\\FileCopy\\srcfile.txt"));
            bufos=new BufferedOutputStream(new FileOutputStream("E:\\workplace\\FileCopy\\dest1.txt"));

            int len=0;
            byte[] array=new byte[1024];
            while((len=bufis.read(array,0,array.length))!=-1){
                bufos.write(array,0,len);
            }
        }catch (IOException e){
            throw new RuntimeException("文件拷贝失败");
        }finally {
            try {
                if (bufis!=null)
                    bufis.close();
            }catch (IOException e){
                throw new RuntimeException("读取关闭失败");
            }
            try{
                if(bufos!=null)
                    bufos.close();
            }catch (IOException e){
                throw new RuntimeException("写入关闭失败");
            }
        }
        long endTime=System.currentTimeMillis();
        System.out.println("带缓冲区的字节流复制用了"+(endTime - startTime) + "ms");
    }

    public static void single_byte_excute(){
        long startTime=System.currentTimeMillis();
           FileInputStream fis=null;
           FileOutputStream fos=null;
           try{
               fis=new FileInputStream("E:\\workplace\\FileCopy\\srcfile.txt");
               fos=new FileOutputStream("E:\\workplace\\FileCopy\\dest2.txt");
               int by=0;
               while((by=fis.read())!=-1){
                   fos.write(by);
               }
           }catch (FileNotFoundException e){
               e.printStackTrace();
           }catch (IOException e){
               e.printStackTrace();
           }finally {
               if(fis!=null){
                   try{
                       fis.close();
                   }catch (IOException e){
                       e.printStackTrace();
                   }
               }
               if(fos!=null){
                   try{
                       fos.close();
                   }catch (IOException e){
                       e.printStackTrace();
                   }
               }
           }
        long endTime=System.currentTimeMillis();
        System.out.println("不带缓冲区的字节流复制用了"+(endTime - startTime) + "ms");
    }
}
