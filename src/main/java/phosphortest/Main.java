package phosphortest;

public class Main {
	
	public static void main(String[] args) {
		Class<?>[] context = new SecurityManager() {
            @Override
            public Class<?>[] getClassContext() {
                return super.getClassContext();
            }
        }.getClassContext();
        for (Class<?> class1 : context) {
        	System.out.println(class1.getName());
		}
	}
}
