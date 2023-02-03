public class GetterandSetter {

    public static void main(String[] args) {
        
        Pens pen = new Pens();

        pen.setColor("blue");
        System.out.println(pen.getColor());

        pen.setTip(5);
        System.out.println(pen.getTip());

        pen.setColor("Yellow");
        System.out.println(pen.getColor());

    }

    static class Pens {
        private String color;
        private int tip;

        String getColor() {
            return this.color;
        }

        int getTip(){
            return this.tip;
        }
    
        void setColor(String newColor)
        {
            this.color = newColor;
        }
    
        void setTip(int newtip)
        {
            this.tip = newtip;
        }
    }
    
}
