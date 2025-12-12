public class excep {
    public static void main(String[] args) {
        int a = 13;
        int b = 0;
       try{
        int result = a/b;
        System.out.println(result);
       }catch(Exception Nan){
        System.out.println("Catch Exception: "+ Nan.getMessage());
       }
       
    }
}
