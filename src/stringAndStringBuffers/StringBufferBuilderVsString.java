package stringAndStringBuffers;

public class StringBufferBuilderVsString {

	
	public static void main(String[] args) {
		StringBufferBuilderVsString bc = new StringBufferBuilderVsString();
		bc.stringBuilderExamples();
	}
	
	public void stringBuilderExamples() {
		StringBuilder builder = new StringBuilder();
		builder.append("abc");
		builder.append("cde");
		
		System.out.println(builder.length());
		
		System.out.println(builder);
	}
	

}
