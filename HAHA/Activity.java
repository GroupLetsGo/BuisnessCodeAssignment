/*
* Date: 2021 Feburary 18th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Ask the user for a serious of questions and have the ability to display the answers. 
* Can also test the true or false birht year, date and month, if false, the program will tell the user to enter the info again
**/


package HAHA ;

import java.util.* ;

class Activity {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in) ;
        Scanner reader = new Scanner(System.in) ;
        Scanner myObj = new Scanner(System.in) ;
        
        System.out.println("请输入您的生年") ;

        int year = 0;
        int month = 0;
        int day = 0;

        boolean passYear = false ;
        boolean passMonth = false ;
        boolean passDay = false ;
        boolean passOk = false ;

        while(passYear == false) {
            year = scan.nextInt()  ;
            scan.nextLine() ;
            if(year >2021) {
                System.out.println(year + ".....? 您的时光机坏了吗") ;
                System.out.println("请您从新输入您的正确生年") ;
            }
            else if (year <1900) {
                    System.out.println("如果您的生年是" + year + "的话就请你从哪来回哪去吧。 ") ;
                    System.out.println("请您输入您的真正生年") ;
            }
            else {
                passYear = true ;
            }
        }
        System.out.println("请输入您的生月") ;
        while(passMonth == false) {
            month = scan.nextInt() ;
            scan.nextLine() ;
            if (month > 12) {
                System.out.println("您不可能在大于十二月份出生，请真实点") ;
            }
            else {
                passMonth = true ;
            }
        }
        System.out.println("请输入您的生日");
        while(passDay == false) {
            day = scan.nextInt() ;
            scan.nextLine() ;
            if(day > 31) {
                System.out.println("从您的生日可以看出您不是地球人，还请地球人输入地球生日") ;
            }
            else {
                passDay = true ;
            }
        }
        System.out.println("请输入您的姓名") ;
        while(passOk == false) {
            String ok = myObj.nextLine() ;
            if (ok.contains("a" ) || ok.contains ("b") || ok.contains ("c") ||ok.contains ("d") ||ok.contains ("e") ||ok.contains ("f") ||ok.contains ("g") ||ok.contains ("h") ||ok.contains ("i") ||ok.contains ("j") ||ok.contains ("k") ||ok.contains ("l") ||ok.contains ("m") ||ok.contains ("n") ||ok.contains ("o") ||ok.contains ("p") ||ok.contains ("q") ||ok.contains ("r") ||ok.contains ("s") ||ok.contains ("t") ||ok.contains ("u") ||ok.contains ("v") ||ok.contains ("w") ||ok.contains ("x") ||ok.contains ("y") ||ok.contains ("z")){
                System.out.println("俺是看不懂english滴，中文谢谢") ;
            }
            else {
                passOk = true ;
            System.out.println("请输入您的爱好") ;
            String hobbie = reader.nextLine() ;
            System.out.println("请输入您可爱的小宝贝的名字") ;
            String yiyi = reader.nextLine() ;
            System.out.println("请输入您可爱的小宝贝的品行") ;
            String personality = reader.nextLine() ;
            System.out.println("您叫 " + ok + ", 生日是" + month + "/" + day + "/" + year + "爱好是" + hobbie + "。 客人还有一个可爱的小宝贝叫" + yiyi + ", " + yiyi + personality + "!!!") ;
            }
        }    
    }
}
