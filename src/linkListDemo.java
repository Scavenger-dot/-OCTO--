/*
链表的实现
*/
public class linkListDemo {
    public static void main(String[] args) {
        singleLinkList list1=new singleLinkList();
        heroNode n1=new heroNode(1,"宋江","及时雨");
        heroNode n2=new heroNode(2,"卢俊义","玉麒麟");
        heroNode n3=new heroNode(3,"张清","没羽箭");
        heroNode n4=new heroNode(4,"林冲","豹子头");
        heroNode n6=new heroNode(6,"林冲6","豹子头6");
        heroNode n8=new heroNode(8,"林冲8","豹子头8");

        list1.addByOrder(n1);
        list1.addByOrder(n2);
        list1.addByOrder(n3);
        list1.addByOrder(n4);
        list1.addByOrder(n8);
        list1.addByOrder(n6);

        list1.showLinkList();

    }
}
//每一个heroNode对象就是一个节点，用于存储水浒英雄名字及外号
class heroNode{
    public int number;
    public String name;
    public String nickName;
    public heroNode next;//指向下一个节点

    @Override
    public String toString() {
        return "heroNode{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +

                '}';
    }

    //构造器
    public heroNode(int number,String name,String nickName){
        this.number=number;
        this.name=name;
        this.nickName=nickName;


    }

}
//创建单列表管理节点
class singleLinkList{
    //现初始化一个头结点，不存放数据
    private heroNode head=new heroNode(0,"","");
    //向链表中添加节点的方法
    public void add(heroNode node){
        //头结点不能移动，所以需要一个节点指针来遍历链表
        heroNode temp=head;
        while(true) {
            if (temp.next == null) {
                break;

            }
            temp=temp.next;
        }
        temp.next=node;

    }
    public void showLinkList(){
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }
        heroNode temp=head.next;

        while(true){
            if(temp==null)
                break;
            System.out.println(temp);
            temp=temp.next;


        }


    }
    //按照英雄编号，将数据放入指定的位置
    public void addByOrder(heroNode node){
        heroNode temp=head;
        boolean flag=false;
        while(true){
            if(temp.next==null){
                break;//链表已到最后位置
            }
            if(temp.next.number>node.number){
                break;//已找到指定位置
            }
            else if(temp.next.number==node.number){

                flag=true;
                break;
            }
            temp=temp.next;

        }
        if(flag) {
             System.out.println("该编号已存在");
        }
        else{
            node.next=temp.next;
            temp.next=node;
        }
    }
}