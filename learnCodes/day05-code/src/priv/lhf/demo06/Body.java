package priv.lhf.demo06;

public class Body {

    public /*static*/ class Heart{
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫" + name);
        }
    }

    public void methodBody(){
        System.out.println("外部类方法");
        new Heart().beat();
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Body() {
    }

    public Body(String name) {
        this.name = name;
    }
}
