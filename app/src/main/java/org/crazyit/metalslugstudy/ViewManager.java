package org.crazyit.metalslugstudy;

import android.graphics.Bitmap;
import android.media.SoundPool;

import java.util.HashMap;

/**
 * @Author stshen.
 * @Date 2017/2/10 0010.
 */
public class ViewManager {

    // 定义一个SoundPool
    public static SoundPool soundPool;
    public static HashMap<Integer,Integer> soundMap=new HashMap<>();

    // 地图图片
    public static Bitmap map = null;
    // 保存角色站立时脚部动画帧的图片数组
    public static Bitmap[] legStandImage = null;
    // 保存角色站立时头部动画帧的图片数组
    public static Bitmap[] headStandImage = null;
    // 保存角色跑动时腿部动画帧的图片数组
    public static Bitmap[] legRunImage = null;
    // 保存角色跑动时头部动画帧的图片数组
    public static Bitmap[] headRunImage = null;
    // 保存角色跳动时腿部动画帧的图片数组
    public static Bitmap[] legJumpImage = null;
    // 保存角色跳动时头部动画帧的图片数组
    public static Bitmap[] headJumpImage = null;
    // 保存角色射击时头部动画帧的图片数组
    public static Bitmap[] headShootImage = null;
    // 加载所有子弹的图片
    public static Bitmap[] bulletImage = null;
    // 绘制角色的图片
    public static Bitmap head = null;
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
