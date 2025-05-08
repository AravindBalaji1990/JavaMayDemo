package encapsulationdemo;

public class EncapsualtionDemo1 {

    public void samplePrint(){
        System.out.println("sample print data");
    }
    private String getName() {
        return name;
    }

    private void setName(String name) {
       this.name = name.replace("print" , "xxxxx");

        StringBuilder sb = new StringBuilder(this.name);
        sb.setCharAt(4,'x');

        this.name = sb.toString();
        this.name = String.valueOf(sb.replace(0,2, "test"));

    }

    private String name ;

    public static void main(String[] args) {

        EncapsualtionDemo1 obj = new EncapsualtionDemo1();
        obj.setName("sample print name");

        System.out.println("the name : " +obj.getName());

    }
}
