package priv.lhf.demo04.BSTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    创建一个BS版本的TCP服务器
 */
public class TCPServerThread {
    public static void main(String[] args) throws IOException {
        //1. 创建一个服务器ServerSocket的对象和系统要指定1端口号
        ServerSocket server = new ServerSocket(8080);

        /*
            浏览器解析服务器回写的html页面，页面中如果有图片，那么浏览器就会单独开启一个线程，读取服务器的图片
            我们就让服务器一直处于监听状态，客户端请求一次，服务器就开启一次线程
         */

        while (true){
            //2. 使用ServerSocket中的方法accept，获取到请求的客户端Socket对象
            Socket socket = server.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{

                        //3. 使用Socket对象中的方法getInputStream，获取到网络字节输入流InputStream对象
                        InputStream is = socket.getInputStream();
                        //6. 使用网络字节输入流InputStream对象中的read方法，读取客户端的请求信息
//        byte[] bytes = new byte[1024];
//        int len = 0;
//        while ((len = is.read(bytes))!=-1){
//            System.out.println(new String(bytes, 0, len));
//        }

                        //把is网络字节输入流对象，转换为字符缓冲输入流
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        //把客户端请求信息的第一行读取出来   GET /Net/web/index.html HTTP/1.1
                        String line = br.readLine();
                        System.out.println(line);
                        //读取的信息进行切割 只有 /Net/web/index.html HTTP/1.1
                        String[] arr = line.split(" ");
                        String htmlpath = arr[1].substring(1);


                        //创建一个本地字节输入流，构造方法中绑定要读取的html路径
                        FileInputStream fis = new FileInputStream(htmlpath);

                        //8. 使用Socket中的方法getOutputStream，获取到网络字节输出流对象OutputStream对象
                        OutputStream os = socket.getOutputStream();
                        //写入HTTP协议响应头，固定写法
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        //必须写入空行，否则浏览器不解析
                        os.write("\r\n".getBytes());

                        //一读一写复制文件，把服务器读取的html文件回写到客户端
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = fis.read(bytes))!=-1){
                            os.write(bytes, 0, len);
                        }

                        //释放资源
                        fis.close();
                        socket.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();
        }

        //server.close();

    }
}
