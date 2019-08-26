public class testing {
    public static void main(String[] args) {
        singleLinkList list2=new singleLinkList();

        heroNode n1=new heroNode(1,"宋江","及时雨");
        heroNode n2=new heroNode(2,"卢俊义","玉麒麟");
        heroNode n3=new heroNode(3,"张清","没羽箭");
        heroNode n4=new heroNode(4,"林冲","豹子头");
        heroNode n6=new heroNode(6,"林冲6","豹子头6");
        heroNode n8=new heroNode(8,"林冲8","豹子头8");
        list2.addByOrder(n1);
       // list2.addByOrder(n3);
        list2.showLinkList();
    }
}
