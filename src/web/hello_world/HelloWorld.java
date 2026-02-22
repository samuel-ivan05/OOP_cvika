package web.hello_world;

public class HelloWorld {
    //task_1
    public String sayHello(String name){
        return "Hello, " + name + "!";
    }
    //task_2
    public String sayHelloMultiple(String[] names){
        if (names ==null || names.length == 0)return "";
    StringBuilder sb= new StringBuilder();
    for(int i=0; i<names.length;i++){
        sb.append(sayHello(names[i]));
        if(i<names.length -1)sb.append("\n");//novy riadok medzi pozdravmi
    }
        return sb.toString();
    }
    //task_3
    public int countGreetings(String[] names){
        if(names==null)return 0;
        return names.length;
    }
}
