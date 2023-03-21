class you{
    public void maa(){
        int i=0;
        for(i=0;i<4;i++){
            System.out.println(i);
        }
    }
}
class mine extends you{
    public void foo(){
        int j=0;
        while(j<5){
            System.out.println(j);
            j=j+1;
        }
    }
}
public class iiiiii {
    public static void main(String[]args){
        mine sc=new mine();
        sc.foo();
        sc.maa();
    }
    
}
