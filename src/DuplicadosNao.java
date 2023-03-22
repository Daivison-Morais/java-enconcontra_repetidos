public class DuplicadosNao {
    public static void main(String[] args) {

        String[] arr1 = new String[]{"uva","manga","laranja","jambo"};
        String[] arr2 = new String[]{"uvas","manga","banana","jambo", "jaca"};

        for (int i = 0; i < arr1.length; i++) {
           
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    System.out.println("Palavra repetida: " + arr2[j]);
                }
                    
                
            }
            
        }

    }
}