public class IOUMain {
    public static void main(String[] args) {
        IOU iou = new IOU();

        iou.setSum("Byron", 10.0);
        iou.setSum("MyAlias", 20.0);
        iou.setSum("MyNemesis", 30.0);

        System.out.println(iou.howMuchDoIOweTo("Byron") + " owed to Byron");
        System.out.println(iou.howMuchDoIOweTo("MyAlias") + " owed to MyAlias");
        System.out.println(iou.howMuchDoIOweTo("MyNemesis") + " owed MyNemesis");
        System.out.println(iou.howMuchDoIOweTo("Myself") + " Myself");
    }
}
