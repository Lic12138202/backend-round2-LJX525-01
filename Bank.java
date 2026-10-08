import java.util.Scanner;       //导入一个Scanner类，用于读取控制台的输入

public class Bank{      //运行一个银行管理账户
    public static void main(String[] args) {
        long balance = 0;       //账户余额，初始值为零
        long amount;        //存取款的数值
        int choice;     //菜单选项

        Scanner scanner = new Scanner(System.in);        //创建一个Scanner对象，用于监听键盘输入

        do {
            System.out.println("-------欢迎-------");     //println打印并换行
            System.out.println("1.存款");
            System.out.println("2.取款");
            System.out.println("3.查询余额");
            System.out.println("4.退出");
            System.out.print("请输入您的选择：");       //print打印不换行
            choice = scanner.nextInt();     //读取用户输入的数值并赋值给choice

            switch(choice) {     //  运用Switch-case语句处理用户的选择
                case 1:     //存款
                    System.out.println("请输入您要存款的数值：");      //提示用户输入存款金额
                    amount = scanner.nextLong();        //读取用户输入的数值
                    if (amount > 0) {        //运用if-else语句区别用户输入的数值是否合理
                        balance = balance + amount;
                        System.out.println("存款成功！您当前的余额为：" + balance);      //输入数值大于零时存款成功
                    } else {
                        System.out.println("存款失败！存款金额必须大于零。");
                    }
                break;        //跳出switch，继续做do-while判断

                case 2:     //取款
                    System.out.println("请输入您要取款的数值：");      //提醒用户输入取款数值
                    amount = scanner.nextLong();        //读取
                    if (amount <= balance && amount > 0) {      //if-else判断用户输入的数值是否合理
                        balance = balance - amount;
                        System.out.println("取款成功！您当前的余额为：" + balance);
                    } else if (amount > balance) {
                        balance = balance;
                        System.out.println("余额不足，您当前的余额为：" + balance);
                    } else {
                        System.out.println("取款失败，取款金额必须大于0。");
                    }
                    break;        //跳出switch,继续做do-while判断

                case 3:     //余额查询
                    System.out.println("您当前的余额为：" + balance);
                    break;         //跳出switch,继续做do-while判断

                case 4:     //退出
                    System.out.println("谢谢使用！");
                    break;                       //结束程序
                default:        //用户输入1234之外的选择
                    System.out.println("无效的选择，请重新输入。");
                }
        }while (choice != 4);
    }
    }