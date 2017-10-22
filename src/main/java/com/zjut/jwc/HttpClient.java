package com.zjut.jwc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class HttpClient {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost:8080/zjutjwc/rest/ws/students/student/sname/1/"+ URLEncoder.encode("测试","utf-8"));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        // 提交模式
        conn.setRequestMethod("PUT");// POST GET PUT DELETE
//        conn.setRequestProperty("Authorization", "Basic YWRtaW46YWRtaW4=");//YWRtaW46YWRtaW4=");
        // 设置访问提交模式，表单提交
        conn.setRequestProperty("Content-Type", "application/json;charset=utf-8");
        conn.setRequestProperty("Accept-Charset", "utf-8");
        conn.setConnectTimeout(15000);// 连接超时 单位毫秒
        conn.setReadTimeout(15000);// 读取超时 单位毫秒

        //读取请求返回值
//        conn.setDoOutput(true);// 是否输入参数

//        byte bytes[]=new byte[1024];
//        InputStream inStream=conn.getInputStream();
//        inStream.read(bytes, 0, inStream.available());
//        System.out.println(new String(bytes, "utf-8"));

        int responseCode = conn.getResponseCode();
        if ( 200 == responseCode ) {//表示服务端响应成功
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    conn.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = br.readLine()) != null) {
                response.append(line + "\n");
                System.out.println(line);
            }
            br.close();
        } else
            System.out.println("fail:responseCode = "+responseCode);
    }
}
