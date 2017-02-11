package org.crazyit.metalslugstudy.comp;

/**
 * @Author stshen.
 * @Date 2017/2/10 0010.
 */
public class Player {
    // 定义角色的最高生命值
    public static final int MAX_HP = 500;

    // 控制角色的默认坐标
    public static int X_DEFAULT = 0;
    public static int Y_DEFALUT = 0;
    public static int Y_JUMP_MAX = 0;
    // 定义控制角色动作的常量
    // 此处只控制该角色包含站立、跑、跳等动作
    public static final int ACTION_STAND_RIGHT = 1;
    public static final int ACTION_STAND_LEFT = 2;
    public static final int ACTION_RUN_RIGHT = 3;
    public static final int ACTION_RUN_LEFT = 4;
    public static final int ACTION_JUMP_RIGHT = 5;
    public static final int ACTION_JUMP_LEFT = 6;
    // 保存角色名字的成员变量
    private String name;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // 保存角色生命值的成员变量
    private int hp;
    // 保存角色所使用枪的类型（以后可考虑让角色能更换不同的枪）
    private int gun;
    // 保存角色当前动作的成员变量（默认向右站立）
    private int action = ACTION_STAND_RIGHT;
    // 代表角色X坐标的成员变量
    private int x = -1;
    // 代表角色Y坐标的成员变量
    private int y = -1;
    // 定义角色向右移动的常量
    public static final int DIR_RIGHT = 1;
    // 定义角色向左移动的常量
    public static final int DIR_LEFT = 2;
    public Player(String name, int hp)
    {
        this.name = name;
        this.hp = hp;
    }
    // 判断该角色是否被子弹打中的方法
    public boolean isHurt(int startX, int endX, int startY, int endY){
        return true;
    }
}
