public class Main {
    public static void main(String[] args) throws Exception {

        // Create a String
        String testString = "Java";

        // Use equalsIgnoreCase to compare strings ignoring case
    	boolean result1 = testString.equalsIgnoreCase("java"); //true
    	boolean result2 = testString.equalsIgnoreCase("JAVA"); //true

        // Print the results
        System.out.println("testString.equalsIgnoreCase(\"java\") : " + testString.equalsIgnoreCase("java"));
        System.out.println("testString.equalsIgnoreCase(\"JAVA\") : " +  testString.equalsIgnoreCase("JAVA"));
    }
}
