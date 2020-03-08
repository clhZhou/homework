package com.upluis.homework.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luis
 * @date 2020/3/8
 */
public class Top extends Dept {
    private List<Dept> depts;

    private Integer level;

    public Top(String deptName,Integer level) {
        super(deptName);
        this.level = level;
        this.depts = new ArrayList<Dept>();
    }

    @Override
    public void show() {
        System.out.println(this.deptName);
        for (Dept dept : this.depts) {
            //控制显示格式
            if(this.level != null){
                for(int  i = 0; i < this.level; i ++){
                    //打印空格控制格式
                    System.out.print("  ");
                }
                for(int  i = 0; i < this.level; i ++){
                    //每一行开始打印一个+号
                    if(i == 0){ System.out.print("+"); }
                    System.out.print("-");
                }
            }
            //打印名称
            dept.show();
        }
    }

    public boolean add(Dept dept) {
        return this.depts.add(dept);
    }

    public boolean addTop(Dept dept) {
        return this.depts.add(dept);
    }


}
