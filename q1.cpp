#include <stdio.h>
int main(){
	long balance = 0;    //账户余额，初始值为零
	long amount;         //存取款的数值
	int choice;          //菜单选择
	
	do{                                //do while语句，无限循环 
		printf("-------欢迎-------\n");
		printf("1.存款\n");
		printf("2.取款\n");
		printf("3.查询余额\n");
		printf("4.退出\n") ;
		printf("请输入您的选择：");
		scanf("%d",&choice);          //主菜单      
		
		switch(choice)            //switch判断语句，用于情况较多且明确时 
		{
			case 1:
			printf("请输入您要存款的数值：",amount);
			scanf("%d",&amount);
			if(amount > 0)            //if语句，这里嵌套使用 
			{
				balance = balance + amount;
				printf("存款成功！您当前的余额为：%ld\n",balance);	 
			}else if(amount <= 0){
				printf("存款失败，存款金额必须大于0\n");
			}
			break;                 //存款 
			
			case 2:
			printf("请输入您要取款的数值：",amount);
			scanf("%d",&amount);
			if(amount <= balance && amount > 0)
			{
				balance = balance - amount;
				printf("取款成功！您当前的余额为：%ld\n",balance);
			}else if(amount > balance){
				balance = balance; 
				printf("余额不足，您当前的余额为：%ld\n",balance);
			}else{
				printf("取款失败，取款金额必须大于0\n"); 
			}
			break;                     //取款
			
			case 3:
			printf("您当前的余额为：%d\n",balance);  
			break;                     //余额查询 
			
			case 4:
			printf("谢谢使用！");
			break;             	       //退出 
			default:
            printf("无效的选择，请重新输入。\n");
            break;
		} 
	}while(choice != 4); 	
	return 0;       
 } 