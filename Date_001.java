class test_191009_001{
    public static int arr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int year = 1900;
    public static int odd = 1;
    public static int GetYearNum(int y){
        return (3 - y%4)*2;
    }
    public static int GetMonthNum(int m){
        return m==1 ? 0 : m==2 ? 3 : m==3 ? 3 : m==4 ? 6 : m==5 ? 1 : m==6 ? 4 : m==7 ? 6 : m==8 ? 2 : m==9 ? 5 : m==10 ? 0 : m==11 ? 3 : m==12 ? 5 : 0;
    }

    public static void main (String [] args) {
        System.out.print("請輸入年份: ");
        year = Integer.parseInt(System.console().readLine());
        System.out.print("請輸入月份: ");
        int month = Integer.parseInt(System.console().readLine());
        arr[1] += ((year%4==0 && year%100!=0) || year%400==0 ? 1 : 0);
        int allday = (GetYearNum(year/100) + year%100 + (int)(((year-1)%100)/4) + (month>2 && ((year%4==0 && year%100!=0) || year%400==0) ?  1 : 0) + GetMonthNum(month) + 0)%7;
        //年份對應數字
        //每年365天為 52周 + 1 天
        //該年前所經過的閏年
        //該年該月是否已經過閏年
        //計算該月份第0天與該年第0天的星期差距
        //日期
        System.out.println(" ===========================");
        System.out.println("  日  一  二  三  四  五  六 ");
        System.out.println(" ===========================");
        for(int i=0-(allday == 6 ? -1 : allday),j=0;i<=arr[month-1];++i,++j){
            if(j%7==0 && j!=0)System.out.println();
            if(i>0){
                System.out.printf("%4d", i);
            }else{
                System.out.printf("%4s", ' ');
            }
        }
    }
}