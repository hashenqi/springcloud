import org.omg.PortableInterceptor.INACTIVE;

/**
 * @ClassName Bottle
 * @Description: TODO
 * @Author chenzeyao
 * @Date 2021/1/18
 **/
public class Bottle {

    /**
     * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？
     * ”答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，
     * 这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
     * 如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
     * @param args
     */
//    public static void main(String[] args) {
//        //思路，1、知道初始的汽水总数，2、喝的过程中产生的空瓶子 3、每3个空瓶子可以换一瓶汽水 4、得到实际喝到的汽水总数
//        int init = 10;
//        int initEmpty = 0;
//        Integer actually = 0;
//        Bean bean = new Bean();
//        bean.setInit(83);
//        bean.setInitEmpty(0);
//        bean.setActually(0);
//
////        drink(init,initEmpty,actually);
//        drink(bean);
//        System.out.println(bean.getChange());
//    }
//
//    private static void drink(Bean bean) {
//        if (bean.getInit() == 0 && bean.getInitEmpty() <3) {
//            return;
//        }
//        bean.setInit(bean.getInit()-1);
//        bean.setInitEmpty(bean.getInitEmpty()+1);
//        bean.setActually(bean.getActually()+1);
//
//        if (bean.getInitEmpty() == 3) {
//            bean.setChange(bean.getChange()+1);
//            bean.setInit(bean.getInit()+1);
//            bean.setInitEmpty(0);
//        }
//        drink(bean);
//    }
//
//    private static void drink(int bottle, int emptyBottle,Integer actually) {
//        if (bottle == 0) {
//            return;
//        }
//        if (emptyBottle == 3) {
//            bottle ++ ;
//            emptyBottle = 0;
//        }
//        bottle--;
//        emptyBottle++;
//        actually = actually+1;
//        drink(bottle,emptyBottle,actually);
//    }

    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
        int n;
//        while(sc.hasNext())
//        {
//            n=sc.nextInt();
            System.out.println(Drink(81));
//        }

    }

    public static int Drink(int n)
    {
        if(n<=0)
            return 0;
        else if(n==3)
            return 1;
        else if(n==2)
            return 1;
        else//此时表明对应为3的倍数，递归
        {
            int h=0;
            h=n/3;
            return h+Drink(n-3*h+h);
        }


    }

}

class Bean{
    private Integer init;
    private Integer initEmpty;
    private Integer actually;
    private int change;

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public Integer getInit() {
        return init;
    }

    public void setInit(Integer init) {
        this.init = init;
    }

    public Integer getInitEmpty() {
        return initEmpty;
    }

    public void setInitEmpty(Integer initEmpty) {
        this.initEmpty = initEmpty;
    }

    public Integer getActually() {
        return actually;
    }

    public void setActually(Integer actually) {
        this.actually = actually;
    }
}