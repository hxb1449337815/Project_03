package com.xb.action;

import com.opensymphony.xwork2.ActionSupport;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

public class TestAction extends ActionSupport {

    static int targetLength=55;//小图长
    static int targetWidth=45;//小图宽
    static int circleR=6;//半径
    static int r1=3;//距离点



    public void test(){
        System.out.println("ok");
    }


    private static int[][] getBlockData() {

        int[][] data = new int[targetLength][targetWidth];
        double x2 = targetLength-circleR;

        //随机生成圆的位置
        double h1 = circleR + Math.random() * (targetWidth-3*circleR-r1);
        double po = circleR*circleR;

        double xbegin = targetLength-circleR-r1;
        double ybegin = targetWidth-circleR-r1;

        for (int i = 0; i < targetLength; i++) {
            for (int j = 0; j < targetWidth; j++) {
                double d3 = Math.pow(i - x2,2) + Math.pow(j - h1,2);
                double d2 = Math.pow(j-2,2) + Math.pow(i - h1,2);
                if ((j <= ybegin && d2 <= po)||(i >= xbegin && d3 >= po)) {
                    data[i][j] = 0;
                }  else {
                    data[i][j] = 1;
                }

            }
        }
        return data;
    }

    private static void cutByTemplate(BufferedImage oriImage, BufferedImage targetImage, int[][] templateImage, int x, int y){
        for (int i = 0; i < targetLength; i++) {
            for (int j = 0; j < targetWidth; j++) {
                int rgb = templateImage[i][j];
                // 原图中对应位置变色处理
                int rgb_ori = oriImage.getRGB(x + i, y + j);

                if (rgb == 1) {
                    //抠图上复制对应颜色值
                    targetImage.setRGB(i, j, rgb_ori);
                    //原图对应位置颜色变化
                    oriImage.setRGB(x + i, y + j, rgb_ori & 0x363636 );
                }else{
                    //这里把背景设为透明
                    targetImage.setRGB(i, j, rgb_ori & 0x00ffffff);
                }
            }
        }
    }


    public static Map<String,String> createImage(String url, int L, int W, Map<String,String> resultMap){
        try {
            BufferedImage bufferedImage = ImageIO.read(new FileInputStream(url));
            BufferedImage target= new BufferedImage(targetLength, targetWidth, BufferedImage.TYPE_4BYTE_ABGR);
            cutByTemplate(bufferedImage,target,getBlockData(),L,W);
            resultMap.put("b", getImageBASE64(bufferedImage));//大图
            resultMap.put("s", getImageBASE64(target));//小图
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            return resultMap;
        }
    }



    public static String getImageBASE64(BufferedImage image) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ImageIO.write(image,"png",out);
        byte[] b = out.toByteArray();//转成byte数组
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(b);//生成base64编码
    }







}
