public class TestList {
    public static void main(String[] args) {
        SList<String> list = new SList<>();
        list.appendEnd("Linked list");
        list.appendEnd("is");
        list.appendEnd("easy");
        list.display(); 
        
        System.out.println(list.removeInitial()); 
        list.display(); 
        
        
        list.clear();
        list.display(); 
    }
    
}
