package org.crazyit.metalslugstudy;

import android.graphics.Bitmap;

/**
 * @Author stshen.
 * @Date 2017/2/10 0010.
 */
public class ViewManager {
    // 保存第一种怪物（炸弹）未爆炸时动画帧的图片
    public static Bitmap[] bombImage=null;
    // 保存第一种怪物（炸弹）爆炸时动画帧的图片
    public static Bitmap[] bomb2Image=null;
    // 保存第二种怪物（飞机）的动画帧的图片
    public static Bitmap[] flyImage = null;
    // 保存第二种怪物（飞机）爆炸的动画帧的图片
    public static Bitmap[] flyDieImage = null;
    // 保存第三种怪物（人）的动画帧的图片
    public static Bitmap[] manImgae = null;
    // 保存第三种怪物（人）的死亡时动画帧的图片
    public static Bitmap[] manDieImage = null;

    // 定义游戏对图片的缩放比例
    public static float scale = 1f;
    public static int SCREEN_WIDTH;
    public static int SCREEN_HEIGHT;
}
