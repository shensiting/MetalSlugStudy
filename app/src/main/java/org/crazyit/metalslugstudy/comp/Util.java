package org.crazyit.metalslugstudy.comp;

import java.util.Random;

/**
 * @Author stshen.
 * @Date 2017/2/10 0010.
 */
public class Util {
    public static Random random=new Random();
    //返回一个0~range的随机数
    public static int rand(int range) {
        // 如果range为0，直接返回0
        if(range==0){
            return 0;
        }
        // 获取一个0～range之间的随机数
        return Math.abs(random.nextInt()%range);
    }

}