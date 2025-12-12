public class excep {
    public static void main(String[] args) {
        /*Arithmetic Exception: When you perform illegal arithmetic operations like division by zero. */
        int a = 13;
        int b = 0;
       try{
        int result = a/b;
        System.out.println(result);
       }catch(Exception Nan){
        System.out.println("Catch Exception: "+ Nan.getMessage());
       }
        /*Nullpointer Exception: When you try to access a method or property of a null object.*/
       String text = null;
        
        try {
            int length = text.length();  // This will throw NullPointerException
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot call method on null object!");
            System.out.println("Message: " + e.getMessage());
        }
        /*ArrayIndexOutOfBoundsException : When you try to access an array index that doesn't exist.*/
        int[] numbers = {10, 20, 30, 40, 50};
        
        try {
            System.out.println("Element at index 10: " + numbers[10]);  // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
            System.out.println("Array length: " + numbers.length);
            System.out.println("Valid indices: 0 to " + (numbers.length - 1));
        }
        /*NumberFormatException : When you try to convert a string to a number, but the string doesn't contain a valid number. */
         String[] inputs = {"100", "two", "3.14", "400"};
        
        for (String input : inputs) {
            try {
                int value = Integer.parseInt(input);
                System.out.println("Successfully parsed: " + value);
            } catch (NumberFormatException e) {
                System.out.println("Failed to parse '" + input + "' as integer");
            }
            /*IOException: when an input or output operation fails or is interrupted. */
            try {
            FileReader fr = new FileReader("data.txt"); // may throw IOException
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            System.out.println(line);

            br.close();
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
       
    }
}

