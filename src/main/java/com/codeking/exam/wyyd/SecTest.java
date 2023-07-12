package com.codeking.exam.wyyd;

/**
 * @author CodeKing
 * @since 2023/6/6  19:35
 */
// 电梯调度
// 题干：某个大厦有N部电梯，总共L层。需要为电梯实现调度逻辑部分。
// 电梯系统包含两个方法需要你实现。
//A. public int request(int startStage, int targetStage)
// 按照调度规则（说明见后，需要你实现）响应用户请求。startStage为用户当前楼层，
// targetStage为用户想去的楼层。返回值表示电梯下标，没有可选则返回-1。

//B. public void onElevatorPassStage(int index, int stage);
// 位置上报回调。电梯的机械装置装有传感器，检测到第index部电梯刚刚到达了stage这一层，
// 用此方法通知你的系统

// 有一个内部方法不需你实现，供你调用：
//C. private native void sendCommandToElevator(int index,  Command command);
// 你的系统向实际机械传送装置发送动作命令，如上行、下行、停止。一旦收到指令，在下一个指令前会一直保持该动作。

/*
电梯的调度有且仅有以下规则（规则外的行为判定为bu/';
规则一. 顺路&就近优先原则：对于用户请求，优先选择与用户同方向的运行中电梯，如有多个,则选择距离用户最近的。
若找不到顺路的候选者，则从闲置的电梯中选择一部最近的去接用户。如果也没有闲置的候选者，request()返回-1值。
规则二. 被动原则：电梯被调度时才会从静止变为运动；运行的电梯到达最后一个用户目的地后才会从运动变为停止。
*/
public class SecTest {
    public static void main(String[] args) {
        int a = 0;
        int b = a;
        b = 100;
        System.out.println(a + " " + b);
    }
}
