package org.crazyit.metalslugstudy.comp;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author stshen.
 * @Date 2017/2/10 0010.
 */
public class MonsterManager {
    // 保存所有死掉的怪物，保存它们是为了绘制死亡的动画，绘制完后清除这些怪物
    public static final List<Monster> dieMonsterList =new ArrayList<>();
    // 保存所有活着的怪物
    public static final List<Monster> monsterList=new ArrayList<>();

    // 随机生成、并添加怪物的方法
    public static void generateMonster(){
        if(monsterList.size()<3+Util.rand(3)){
            //创建新怪物
            Monster monster=new Monster(1+Util.rand(3));
            monsterList.add(monster);
        }
    }

    // 更新怪物与子弹的坐标的方法
    public static void updatePosition(int shift){
        Monster monster=null;
        // 定义一个集合，保存所有将要被删除的怪物
        List<Monster> delList=new ArrayList<>();


    }
}
