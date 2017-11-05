package com.baizhi.demo;

/**
 * create by LiangS
 * on 2017/10/24
 */
public class StringTest {

    private static String ss ="abc<def>ghi<ikl>mno";
    private String ss2 ="ikldefabcghimno";

    public static void main(String[] args) {
        String s = getString(ss);
        System.out.println(s);
    }
    public static String getString(String input){
        /*String  output="";
        int  biaoji=0;//0继续  1前面
        int  as = 0;
        for (int i =0;i<input.length();i++){
            char aa = input.charAt(i);
            if (aa=='<'){
                System.out.println("前排 。。");
                biaoji =1;
                continue;
            }else if (aa=='>'){
                System.out.println("后排 。。");
                biaoji=0;
                as = 0;
                continue;
            }
            if (biaoji==1){
                String be = output.substring(0, as);
                String af = output.substring(as,output.length());
                output = be+aa+af;
                as+=1;
            }else {
                output = output+aa;
            }*/
            String out="";
            String ss[]=input.split("<");
            for(String s:ss){
                String[] ss2=s.split(">");
                out=ss2[0]+out;
                for(int i=1;i<ss2.length;i++){
                    out=out+ss2[i];
                }
        }

        return out;
    }
}
