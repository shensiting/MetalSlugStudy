package org.crazyit.game;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * @Author stshen.
 * @Date 2017/2/10 0010.
 */
public class Graphics {
    // 定义Android翻转参数的常量
    public static final int TRANS_MIRROR = 2;
    public static final int TRANS_MIRROR_ROT180 = 1;
    public static final int TRANS_MIRROR_ROT270 = 4;
    public static final int TRANS_MIRROR_ROT90 = 7;
    public static final int TRANS_NONE = 0;
    public static final int TRANS_ROT180 = 3;
    public static final int TRANS_ROT270 = 6;
    public static final int TRANS_ROT90 = 5;
    // 每次缩放的梯度是0.05，所以这里乘20以后转成整数
    public static final int TIMES_SCALE = 20;

    public static final float INTERVAL_SCALE = 0.05f; // 每次缩放的梯度
    public static void drawBorderString(Canvas c, int borderColor,
                                        int textColor, String text, int x, int y, int borderWidth, Paint mPaint)
    {

    }

    // 用于从源位图中的srcX、srcY点开始、挖取宽width、高height的区域，并对该图片进行trans变换、
    // 缩放scale（当scale为20时表示不缩放）、并旋转degree角度后绘制到Canvas的drawX、drawY处。
    public synchronized static void drawMatrixImage(Canvas canvas, Bitmap src,
            int srcX, int srcY, int width, int height, int trans, int drawX,
            int drawY, int degree, int scale){

    }

}
